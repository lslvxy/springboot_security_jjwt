package com.jk.fish.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jk.fish.entity.UserInfo;
import com.jk.fish.mapper.UserMapper;
import com.jk.fish.service.IUserService;
import com.jk.fish.util.JwtUtil;
import com.jk.fish.util.PasswordUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * @author lise
 * @date 2018/8/15
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, UserInfo> implements IUserService, UserDetailsService {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private JwtUtil jwtUtil;

    @Override
    public UserInfo getUserInfo(Long userId) {
        UserInfo user = baseMapper.selectOne(new QueryWrapper<UserInfo>().lambda().eq(UserInfo::getId, userId));
        return user;
    }

    @Override
    public Set<String> getPermissionUrlsByUserId(Long userId) {
        return null;
    }

    @Override
    public UserInfo getUserByUsername(String username) {
        return baseMapper.selectOne(new QueryWrapper<UserInfo>().lambda().eq(UserInfo::getUsername, username));
    }

    @Override
    public String login(String username, String password) {
        UsernamePasswordAuthenticationToken upToken = new UsernamePasswordAuthenticationToken(username, password);
        Authentication authentication = authenticationManager.authenticate(upToken);
        SecurityContextHolder.getContext().setAuthentication(authentication);
        UserDetails userDetails = this.loadUserByUsername(username);
        return jwtUtil.generateToken(userDetails);
    }

    @Override
    public String register(UserInfo user) {
        String username = user.getUsername();
        if (this.loadUserByUsername(username) != null) {
            return "用户已存在";
        }
        String rawPassword = user.getPassword();
        user.setPassword(PasswordUtil.encode(rawPassword));
        List<String> roles = new ArrayList<>();
        roles.add("ROLE_USER");
        baseMapper.insert(user);
        return "success";
    }

    @Override
    public String refreshToken(String oldToken) {
        String token = oldToken.substring("Bearer ".length());
        if (!jwtUtil.isTokenExpired(token)) {
            return jwtUtil.refreshToken(token);
        }
        return "error";
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserInfo userInfo = baseMapper.selectOne(new QueryWrapper<UserInfo>().lambda().eq(UserInfo::getUsername, username));
        if (userInfo == null) {
            throw new UsernameNotFoundException("用户名不存在");
        }
        return userInfo;
    }
}

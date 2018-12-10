package com.jk.fish.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.jk.fish.entity.UserInfo;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;
import java.util.Set;

/**
 * com.jk.fish.service
 *
 * @author lise
 * @comment
 * @date 2018/10/24 3:55 PM
 */
public interface IUserService extends IService<UserInfo>, UserDetailsService {


    /**
     * 根据用户id获取用户信息
     */
    UserInfo getUserInfo(Long userId);

    /**
     * 根据用户id获取拥有的权限
     */
    Set<String> getPermissionUrlsByUserId(Long userId);

    /**
     * 根据用户账号查询用户
     *
     * @param username
     * @return
     */
    UserInfo getUserByUsername(String username);

    /**
     * 用户登录
     *
     * @param username 用户名
     * @param password 密码
     * @return 操作结果
     */
    String login(String username, String password);

    /**
     * 注册
     *
     * @param userInfo
     * @return
     */
    String register(UserInfo userInfo);

    /**
     * 刷新密钥
     *
     * @param oldToken 原密钥
     * @return 新密钥
     */
    String refreshToken(String oldToken);

}


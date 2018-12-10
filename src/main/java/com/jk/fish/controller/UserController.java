package com.jk.fish.controller;

import com.google.common.collect.Maps;
import com.jk.fish.common.ResultJson;
import com.jk.fish.entity.UserInfo;
import com.jk.fish.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * com.jk.fish.controller
 *
 * @author lise
 * @comment
 * @date 2018/10/24 4:00 PM
 */
@RestController
@RequestMapping("/user")
public class UserController extends BaseController {

    @Autowired
    private IUserService userService;

    @RequestMapping("info")
    public ResultJson getUserInfo() {
        UserInfo userInfo = userService.getUserInfo(1L);
        return ResultJson.success(userInfo);
    }

    @PostMapping("/login")
    public ResultJson getToken(String username, String password) {
        String token = userService.login(username, password);
        Map<String, Object> map = Maps.newHashMap();
        map.put("token", token);
        return ResultJson.success(map);
    }


}

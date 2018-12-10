package com.jk.fish.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * com.jk.fish.controller
 *
 * @author lise
 * @comment
 * @date 2018-12-10 13:07
 */
@RestController
public class BaseController {

    @RequestMapping("ok")
    public String ok() {
        return "ok";
    }
}

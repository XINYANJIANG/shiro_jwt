package com.fivebull.shiro_jwt.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 一个屌丝码农
 * Created by 五头牛.
 */
@RestController
@RequestMapping(value = "user")
public class UserController {

    @PostMapping(value = "login")
    public String login(){
        return "Ad";
    }

}

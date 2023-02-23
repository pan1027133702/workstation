package com.hangzhou.controller;

import com.hangzhou.entity.User;
import com.hangzhou.service.UserService;

public class UserController {
    private UserService userService;


    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public void findUser() {
        User user = userService.findById(1001);
        System.out.println(user);
    }
}

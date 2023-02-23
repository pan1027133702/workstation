package com.hangzhou.service.impl;

import com.hangzhou.entity.User;
import com.hangzhou.service.UserService;

public class UserServiceImpl implements UserService {

    @Override
    public User findById(int id) {
        System.out.println("UserServiceImpl.findById");

        User user = new User();
        user.setId(id);
        user.setUsername("xian");
        user.setPassword("123");

        return user;
    }
}

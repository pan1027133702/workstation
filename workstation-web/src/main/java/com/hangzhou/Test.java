package com.hangzhou;

import com.hangzhou.controller.UserController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:consumer.xml");
        UserController userController = ac.getBean(UserController.class);
        userController.findUser();

        new Scanner(System.in).next();
    }
}

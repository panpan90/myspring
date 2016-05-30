package com.bucket.myspring.aop.advice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AdviceTest {

    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");

        UserService userService = (UserService) ac.getBean("userService");
        userService.setUserName("llll");
    }
}

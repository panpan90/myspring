package com.bucket.myspring.aop.advice;

public class UserServiceImpl implements UserService {

    @Override
    public void setUserName(String name) {
        System.out.println(".....setUserName...");
    }

}

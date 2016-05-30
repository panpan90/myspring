package com.bucket.myspring.aop.advice;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class MyBeforeAdvise implements MethodBeforeAdvice {

    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        for (Object arg : args) {
            System.out.println("----" + arg);
        }
        System.out.println("....MyBeforeAdvise.before.." + method.getName());
        // method.invoke(target, args);
    }

}

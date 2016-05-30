package com.bucket.myspring.aop.advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class MyAdvice implements MethodInterceptor {

    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        System.out.println("MyAdvice....MethodInterceptor.." + invocation.getMethod().getName());
        return invocation.proceed();
    }
}

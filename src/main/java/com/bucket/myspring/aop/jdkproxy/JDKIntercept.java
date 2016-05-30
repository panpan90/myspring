package com.bucket.myspring.aop.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class JDKIntercept implements InvocationHandler {

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("...JDKIntercept.invoke ... ");
        return method.invoke(proxy, args);
    }

}

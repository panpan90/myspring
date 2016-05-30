package com.bucket.myspring.aop.cglibproxy;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class CglibInterceptor implements MethodInterceptor {

    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy)
                                                                                        throws Throwable {
        System.out.println("....CglibInterceptor intercept.....");
        return null;
    }

}

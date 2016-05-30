package com.bucket.myspring.aop;

import org.aspectj.lang.ProceedingJoinPoint;

public class AopAspect {

    public void myAspect(ProceedingJoinPoint call) throws Throwable {
        System.out.println(" hahaha i am myAspect .....");
        call.proceed();
    }

    public void myAspect2(ProceedingJoinPoint call) throws Throwable {
        System.out.println(" befor ...hahaha i am myAspect222 .....");
        call.proceed();
    }

}

package com.bucket.myspring.aop.aspj;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class MyAspect {

	@Before(value="pointcunt()")
	public void before() {
		System.out.println("...before....");
	}
	
	@After(value="pointcunt()")
	public void after() {
		System.out.println("...after....");
	}
	
	@Around("execution(* com.bucket.myspring.aop.aspj.PersonService.*(..))")
	public void around(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("...around....");
		pjp.proceed();
	}
	
	@Pointcut("@within(com.bucket.myspring.aop.aspj.MyAnn02)")
	public void pointcunt() throws Throwable {
	}
}

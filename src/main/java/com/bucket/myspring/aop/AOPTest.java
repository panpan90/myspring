package com.bucket.myspring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bucket.myspring.aop.springdemo.FooService;

public class AOPTest {

    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
        SpringAopTest test = (SpringAopTest) ac.getBean("springAopTest");
        test.execute();

        FooService fooService = (FooService) ac.getBean("fooService");
        //fooService.getFoo("chengcanming", 12);
    }
}

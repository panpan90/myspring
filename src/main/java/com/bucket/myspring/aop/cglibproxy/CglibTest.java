package com.bucket.myspring.aop.cglibproxy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CglibTest {

    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");

        CglibProxy proxy = (CglibProxy) ac.getBean("cglib");
        proxy.proxy();
    }
}

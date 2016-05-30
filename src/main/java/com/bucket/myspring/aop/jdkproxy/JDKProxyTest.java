package com.bucket.myspring.aop.jdkproxy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JDKProxyTest {

    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
        JDKProxyService test = (JDKProxyService) ac.getBean("jdkProxyService");
        test.jdkProxy();

    }
}

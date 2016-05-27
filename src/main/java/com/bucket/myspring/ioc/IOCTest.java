package com.bucket.myspring.ioc;

import java.io.IOException;

import org.springframework.context.annotation.Configuration;

@Configuration(value = "classpath:beans.xml")
public class IOCTest {

    public static void main(String[] args) throws IOException {
        //ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
        //Person person = (Person) ac.getBean("person");

        //Student st = (Student) ac.getBean("student");
        //st.printBean("person");

        System.out.println(System.getProperty("java.home"));

    }
}

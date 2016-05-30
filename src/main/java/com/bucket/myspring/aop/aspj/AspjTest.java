package com.bucket.myspring.aop.aspj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AspjTest {

	public static void main(String[] args) {
		 ApplicationContext ac = new ClassPathXmlApplicationContext("beans2.xml");
		 PersonService ps = (PersonService) ac.getBean("personService");
		 ps.eat();
		 
	}
}

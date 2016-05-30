package com.bucket.myspring.aop.springdemo;

public class DefaultFooService implements FooService {

    public Foo getFoo(String name, int age) {
        System.out.println("....getFoo..");
        return new Foo(name, age);
    }
}
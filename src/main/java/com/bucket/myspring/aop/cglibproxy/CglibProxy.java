package com.bucket.myspring.aop.cglibproxy;

public class CglibProxy {

    private String name;

    public CglibProxy() {

    }

    public CglibProxy(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CglibProxy proxy() {
        System.out.println("...proxy execute...");
        return this;
    }

}

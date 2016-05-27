package com.bucket.myspring.model;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.SmartLifecycle;

public class Person implements SmartLifecycle, InitializingBean, BeanNameAware, BeanFactoryAware,
                   BeanPostProcessor {

    private String name;

    private String password;

    public Person() {
        System.out.println("person init");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", password=" + password + "]";
    }

    @Override
    public void start() {
        System.out.println("contain start");

    }

    @Override
    public void stop() {
        System.out.println("contain stop");

    }

    @Override
    public boolean isRunning() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("person afterPropertiesSet execute");

    }

    /**
     * @see org.springframework.context.Phased#getPhase()
     */
    @Override
    public int getPhase() {
        // TODO Auto-generated method stub
        return 0;
    }

    /**
     * @see org.springframework.context.SmartLifecycle#isAutoStartup()
     */
    @Override
    public boolean isAutoStartup() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void stop(Runnable callback) {
        // TODO Auto-generated method stub

    }

    @Override
    public void setBeanName(String name) {
        // TODO Auto-generated method stub

    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        // TODO Auto-generated method stub

    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName)
                                                                               throws BeansException {
        System.out.println(" postProcessBeforeInitialization " + beanName);
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName)
                                                                              throws BeansException {
        System.out.println(" postProcessAfterInitialization " + beanName);
        return bean;
    }

}

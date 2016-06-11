/**
 * qccr.com Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.bucket.test;

import java.lang.reflect.Method;

/**
 * 
 * @author chengcanming
 * @version $Id: BeansUtilTest.java, v 0.1 2016年6月3日 上午2:20:49 chengcanming Exp
 *          $
 */
public class BeansUtilTest {
    public static void main(String[] args) {
        Class clazz = Student.class;
        Method[] m = clazz.getDeclaredMethods();

        for (Method mm : m) {
            System.out.println(mm.getName());
        }
    }
}

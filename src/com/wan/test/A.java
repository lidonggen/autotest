package com.wan.test;

/**
 * Created by lidonggen on 2018/3/1.
 */
public class A {

    //事件源
    private B b;

    public void setB(B b) {
        this.b = b;
    }

    public void testMethod() {
        b.doSomething();
        System.out.println("事件源");
    }

    public static void testA() {
        System.out.println("事件源");
    }

}


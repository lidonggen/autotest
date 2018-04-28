package com.wan.test;

/**
 * Created by lidonggen on 2018/3/1.
 */
public class AAA {

    public static void main(String[] args) {
        A a = new A();
        a.setB(new B() {
            @Override
            public void doSomething() {

            }
        });
    }

}

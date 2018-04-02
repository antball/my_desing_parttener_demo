package com.design.demo.single_单例;

import com.design.demo.facade_门面外观.Facade;
import com.design.demo.single_单例.ehan.Singleton;
import com.design.demo.single_单例.ehan.Singleton;

public class Client {

    //https://blog.csdn.net/goodlixueyong/article/details/51935526


    public static void main(String[] args) {
        m();
    }


    public static void m() {
        System.out.println("*********************");
        System.out.println("*   单例模式调用");
        System.out.println("*********************");

        Singleton singleton1 =  com.design.demo.single_单例.ehan.Singleton.getInstance();
        singleton1.doSomething();

        System.out.println();

        com.design.demo.single_单例.lanhan.Singleton singleton2 =  com.design.demo.single_单例.lanhan.Singleton.getInstance();
        singleton2.doSomething();

        System.out.println();

        com.design.demo.single_单例.innerclass.Singleton singleton3 =  com.design.demo.single_单例.innerclass.Singleton.getInstance();
        singleton3.doSomething();

        System.out.println();

    }
}

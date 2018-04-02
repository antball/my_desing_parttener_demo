package com.design.demo.single_单例.ehan;

public class Singleton {

    private static Singleton instance = new Singleton();

    private Singleton() {
    }

    public static Singleton getInstance() {
        return instance;
    }

    public void doSomething(){
        System.out.println("hello singleton");
    }
}

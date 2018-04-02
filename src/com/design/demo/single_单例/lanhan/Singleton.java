package com.design.demo.single_单例.lanhan;

/**
 * 双重校验锁
 */
public class Singleton {

    private static volatile Singleton instance = null;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }



    public void doSomething(){
        System.out.println("hello singleton");
    }
}

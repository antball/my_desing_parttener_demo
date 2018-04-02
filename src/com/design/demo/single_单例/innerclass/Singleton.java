package com.design.demo.single_单例.innerclass;

public class Singleton {
    private Singleton(){}

    public static Singleton getInstance(){
        return SingletonHolder.instance;
    }



    public void doSomething(){
        System.out.println("hello singleton");
    }







    public static class SingletonHolder {
        public static Singleton instance = new Singleton();
    }
}

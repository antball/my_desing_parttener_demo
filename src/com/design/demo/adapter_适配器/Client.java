package com.design.demo.adapter_适配器;

import com.design.demo.bridge_桥接.*;

public class Client {
    public static void main(String[] args) {
        m();
    }


    public static void m(){
        System.out.println("*********************");
        System.out.println("*   适配器模式调用  将源adaptee的方法包装成可供使用的类方法");
        System.out.println("*********************");

        Target target = new Adapter();
        target.request();

//        target = new ConcreteTarget();
//        target.request();

        System.out.println();
    }
}

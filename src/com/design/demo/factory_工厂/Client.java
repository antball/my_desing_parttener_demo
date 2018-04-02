package com.design.demo.factory_工厂;

import com.design.demo.facade_门面外观.Facade;

public class Client {

    public static void main(String[] args) {
        m();
    }


    public static void m() {
        System.out.println("*********************");
        System.out.println("*   工厂模式调用");
        System.out.println("*********************");

        Creator creator = new ConcreteCreator();
        Product p1 = creator.createProduct(ConcreteProduct1.class);
        p1.method1();
        p1.method2();

        System.out.println();

        p1 = creator.createProduct(ConcreteProduct2.class);
        p1.method1();
        p1.method2();


        System.out.println();

    }
}

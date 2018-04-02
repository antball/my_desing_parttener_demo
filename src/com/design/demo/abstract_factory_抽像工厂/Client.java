package com.design.demo.abstract_factory_抽像工厂;

public class Client {

    public static void main(String[] args) {
        m();
    }


    public static void m() {
        System.out.println("*********************");
        System.out.println("*   抽像工厂模式调用");
        System.out.println("*********************");

        AbstractFactory factory = new ConcreteFactory1();
        AbstractProductA productA = factory.createProductA();
        productA.shareMethod();
        productA.method2();

        System.out.println();

        factory = new ConcreteFactory2();
        AbstractProductA product1 = factory.createProductA();
        product1.shareMethod();
        product1.method2();


        System.out.println();

    }
}

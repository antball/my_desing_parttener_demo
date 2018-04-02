package com.design.demo.builder_建造;

public class Client {

    public static void main(String[] args) {
        m();
    }


    public static void m() {
        System.out.println("*********************");
        System.out.println("*   建造者模式调用");
        System.out.println("*********************");


        Director director =new Director();
        Product p = director.getProduct();
        p.doSomething();

        System.out.println();

    }
}

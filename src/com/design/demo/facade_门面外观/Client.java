package com.design.demo.facade_门面外观;

public class Client {

    public static void main(String[] args) {
        m();
    }


    public static void m() {
        System.out.println("*********************");
        System.out.println("*   外观模式调用");
        System.out.println("*********************");

        Facade facade = new Facade();
        facade.method1();
        System.out.println();

        facade.method2();
        System.out.println();

        facade.method3();
        System.out.println();

    }

}

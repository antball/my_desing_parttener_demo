package com.design.demo.bridge_桥接;

public class Client {

    public static void main(String[] args) {
        m();
    }


    public static void m(){
        System.out.println("*********************");
        System.out.println("*   桥接模式调用  将两个不相关的类融合到一起 Abstraction拥有Implementor中的方法 ");
        System.out.println("*********************");

        Implementor implementor = new ContreteImplementor1();

        Abstraction abstraction = new RefinedAbstraction(implementor);
        abstraction.execute();
        System.out.println();

        implementor = new ContreteImplementor2();
        abstraction = new RefinedAbstraction(implementor);
        abstraction.execute();

        System.out.println();
    }
}

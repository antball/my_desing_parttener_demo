package com.design.demo.strategy_策略;

public class Client {

    public static void main(String[] args) {
        m();
    }


    public static void m(){

        System.out.println("*********************");
        System.out.println("*   策略模式调用");
        System.out.println("*********************");
        IStrategy strategy = new ConcreteStrategy1();
        strategy.doThings();
        strategy= new ConcreteStrategy2();
        strategy.doThings();


        System.out.println();
    }
}

package com.design.demo.strategy_策略;

public class ConcreteStrategy1 implements IStrategy {

    @Override
    public void doThings() {
        System.out.println("用第一种方法做。。。。");
    }
}

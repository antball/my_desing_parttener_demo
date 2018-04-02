package com.design.demo.adapter_适配器;

public class ConcreteTarget implements Target {
    @Override
    public void request() {
        System.out.println("ConcreteTarget 方法");
    }
}

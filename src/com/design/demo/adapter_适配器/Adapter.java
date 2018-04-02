package com.design.demo.adapter_适配器;

public class Adapter extends Adaptee implements Target {


    @Override
    public void request() {
        super.doSomething();
    }
}

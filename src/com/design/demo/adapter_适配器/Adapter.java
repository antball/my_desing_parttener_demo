package com.design.demo.adapter_适配器;

//java单继承的缘故，Destination类必须是接口，以便于Adapter去继承Source并实现Destination
public class Adapter extends Adaptee implements Target {


    @Override
    public void request() {
        super.doSomething();
    }
}

package com.design.demo.bridge_桥接;

public abstract class Abstraction {

    protected Implementor implementor;

    public Abstraction(Implementor implementor) {
        this.implementor = implementor;
    }

    public void execute(){
        doThings1();
        implementor.method1();
    }

    public void doThings1(){
        System.out.println("Abstraction 正常方法");
    }


}

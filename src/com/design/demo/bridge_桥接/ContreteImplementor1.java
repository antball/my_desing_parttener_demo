package com.design.demo.bridge_桥接;

public class ContreteImplementor1 implements Implementor {
    @Override
    public void method1() {
        System.out.println("接口实现1  method 1");
    }

    @Override
    public void method2() {
        System.out.println("接口实现1  method 2");
    }
}

package com.design.demo.template_模板;

public class ConcreteClass1 extends Template {

    @Override
    protected void doSomething() {
        System.out.println("具体实现1 模板方法1");
    }

    @Override
    protected void doAnotherthing() {
        System.out.println("具体实现1 模板方法2");
    }
}

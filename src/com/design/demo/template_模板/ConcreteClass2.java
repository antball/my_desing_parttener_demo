package com.design.demo.template_模板;

public class ConcreteClass2 extends Template {


    @Override
    protected void doSomething() {
        System.out.println("具体实现2 模板方法1");
    }

    @Override
    protected void doAnotherthing() {
        System.out.println("具体实现2 模板方法2");
    }
}

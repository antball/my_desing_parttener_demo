package com.design.demo.decorator_装饰;

public class ConcreteDecorator1 extends Decorator {

    public ConcreteDecorator1(IComponent component){
        super(component);
    }

    @Override
    public void operate() {
        addOperate1();
        super.operate();

    }

    public void addOperate1(){
        System.out.println("add operate before");
    }
}

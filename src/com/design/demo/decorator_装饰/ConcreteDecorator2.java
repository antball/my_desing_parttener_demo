package com.design.demo.decorator_装饰;

public class ConcreteDecorator2 extends Decorator {

    public ConcreteDecorator2(IComponent component){
        super(component);
    }

    @Override
    public void operate() {
        super.operate();
        addOperate2();
    }

    public void addOperate2(){
        System.out.println("add operate after");
    }
}

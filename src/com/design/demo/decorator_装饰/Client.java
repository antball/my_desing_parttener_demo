package com.design.demo.decorator_装饰;

public class Client {

    public static void main(String[] args) {
        m();
    }


    public static void m(){
        System.out.println("*********************");
        System.out.println("*   装饰模式调用");
        System.out.println("*********************");
        IComponent IComponent = new ConcreteComponent();
        IComponent = new ConcreteDecorator1(IComponent);
        IComponent = new ConcreteDecorator2(IComponent);
        IComponent.operate();

        System.out.println();
    }

}

package com.design.demo.abstract_factory_抽像工厂;

public class ConcreteFactory1 implements AbstractFactory {
    @Override
    public AbstractProductA createProductA() {
        return new ConcreteProduct1();
    }
}

package com.design.demo.decorator_装饰;

public class ConcreteComponent implements IComponent {

    @Override
    public void operate() {
        System.out.println("原方法执行内容。");
    }
}

package com.design.demo.decorator_装饰;

public class Decorator implements IComponent {

    private IComponent component;

    public Decorator(IComponent component) {
        this.component = component;
    }

    @Override
    public void operate() {
        component.operate();
    }
}

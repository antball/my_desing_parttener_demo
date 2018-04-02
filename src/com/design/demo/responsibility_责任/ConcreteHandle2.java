package com.design.demo.responsibility_责任;

public class ConcreteHandle2 extends Handle {
    @Override
    public String getHandleLevel() {
        return Level.level2;
    }

    @Override
    public String response() {
        return "ConcreteHandle2 response";
    }
}

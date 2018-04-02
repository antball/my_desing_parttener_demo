package com.design.demo.responsibility_责任;

public class ConcreteHandle1 extends Handle {
    @Override
    public String getHandleLevel() {
        return Level.level1;
    }

    @Override
    public String response() {
        return "ConcreteHandle1 response";
    }
}

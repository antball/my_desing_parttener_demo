package com.design.demo.responsibility_责任;

public class ConcreteHandle3 extends Handle {
    @Override
    public String getHandleLevel() {
        return Level.level3;
    }

    @Override
    public String response() {
        return "ConcreteHandle3 response";
    }
}
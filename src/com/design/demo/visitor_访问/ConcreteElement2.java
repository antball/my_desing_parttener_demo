package com.design.demo.visitor_访问;

public class ConcreteElement2 implements Element {


    protected int money=2;

    protected String info="ConcreteElement2Info";

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}

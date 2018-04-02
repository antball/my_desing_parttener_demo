package com.design.demo.visitor_访问;

public class ConcreteElement1 implements Element {

    protected int money=1;

    protected String info="ConcreteElement1Info";


    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }

}

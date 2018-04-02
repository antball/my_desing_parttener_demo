package com.design.demo.visitor_访问;

public class TotalVisitor implements ITotalVisitor {

    private int total=0;

    @Override
    public void visit(ConcreteElement1 element1) {
        total += element1.money;
    }

    @Override
    public void visit(ConcreteElement2 element2) {
        total += element2.money;
    }

    @Override
    public int getTotal() {
        return total;
    }
}

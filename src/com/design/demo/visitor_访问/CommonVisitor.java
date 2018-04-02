package com.design.demo.visitor_访问;

public class CommonVisitor implements IVisitor {


    @Override
    public void visit(ConcreteElement1 element1) {
        System.out.println("显示ConcreteElement1 基本信息 和 特有的信息"+element1.info);
    }

    @Override
    public void visit(ConcreteElement2 element2) {
        System.out.println("显示ConcreteElement2 基本信息 和 特有的信息"+element2.info);
    }
}

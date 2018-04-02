package com.design.demo.visitor_访问;

public class ShowVisitor implements IShowVisitor {

    private String infos="";

    @Override
    public void report() {
        System.out.println();
        System.out.println(infos);
        System.out.println();
    }

    @Override
    public void visit(ConcreteElement1 element1) {
        infos+= "   element1---->"+ element1.info + "  \r\n";
    }

    @Override
    public void visit(ConcreteElement2 element2) {
        infos+= "   element2---->"+ element2.info + "  \r\n";
    }
}

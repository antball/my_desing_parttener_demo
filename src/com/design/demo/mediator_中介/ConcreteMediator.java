package com.design.demo.mediator_中介;

public class ConcreteMediator extends Mediator {


    @Override
    public void execute1() {
        super.colleague1.doThings1();
        doThings();
        super.colleague3.doThings3();
    }

    @Override
    public void execute2() {
        super.colleague2.doThings2();
        doThings();
        super.colleague3.doThings3();
    }

    @Override
    public void execute(String commond, String... args) {
        if (commond.equals("buy")) {
            execute1();
        } else if (commond.equals("sell")) {
            execute2();
        }
    }

    public void doThings() {
        System.out.println("do thing...");
    }
}

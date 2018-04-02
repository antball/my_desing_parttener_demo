package com.design.demo.mediator_中介;

public class ConcreteColleague1 extends Colleague  {


    public ConcreteColleague1(Mediator mediator) {
        super(mediator);
    }

    public void doThings1(){
        System.out.println("do things 1 买东西");
    }

    public void buy(){
        super.mediator.execute("buy","5个");
    }
}

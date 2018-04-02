package com.design.demo.mediator_中介;

public class ConcreteColleague2 extends Colleague  {

    public ConcreteColleague2(Mediator mediator) {
        super(mediator);
    }


    public void doThings2(){
        System.out.println("do things 2 卖东西");
    }

    public void sell(){
        super.mediator.execute("sell","2个");
    }
}

package com.design.demo.mediator_中介;

public class ConcreteColleague3 extends Colleague {

    public ConcreteColleague3(Mediator mediator) {
        super(mediator);
    }


    public void doThings3(){
        System.out.println("do things 3 库存变化");
    }
}

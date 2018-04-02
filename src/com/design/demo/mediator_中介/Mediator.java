package com.design.demo.mediator_中介;

public abstract class Mediator {

    /**
     * 这里变量只能是具体的同事类，如果是父类，则中介实现类不能调用各个子类特有的方法
     */
    protected ConcreteColleague1 colleague1;
    protected ConcreteColleague2 colleague2;
    protected ConcreteColleague3 colleague3;

    public Mediator(){
        colleague1 = new ConcreteColleague1(this);
        colleague2 = new ConcreteColleague2(this);
        colleague3 = new ConcreteColleague3(this);
    }

    public abstract void execute1();


    public abstract void execute2();


    /**
     * 所有同事类都要调用这个中介类的方法，由它来决定调用哪个方法
     */
    public abstract void execute(String commond,String... args);

}

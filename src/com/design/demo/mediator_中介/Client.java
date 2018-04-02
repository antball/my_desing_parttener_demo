package com.design.demo.mediator_中介;

public class Client {

    public static void main(String[] args) {
        m();
    }


    /**
     * 如果同事类没有和中介类有交互，则和外观模式很像，
     * 这里和外观模式主要的区别是同事类会和中介类也有交互，中介类会再调用同事类的一些方法
     */
    public static void m(){

        System.out.println("*********************");
        System.out.println("*   中介模式普通调用（和外观模式相近）");
        System.out.println("*********************");

        Mediator mediator = new ConcreteMediator();

        mediator.execute1();
        System.out.println();

        mediator.execute2();
        System.out.println();

        System.out.println("*********************");
        System.out.println("*   中介模式同事类调用方法，通过中介类间接调用其它相关同事类的方法");
        System.out.println("*   这是正常的用法");
        System.out.println("*********************");
        ConcreteColleague1 colleague1 = new ConcreteColleague1(mediator);
        colleague1.buy();
        System.out.println();

        ConcreteColleague2 colleague2 = new ConcreteColleague2(mediator);
        colleague2.sell();
        System.out.println();

    }
}

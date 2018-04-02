package com.design.demo.observer_观察者;

import com.design.demo.observer_观察者.old.ConcreteSubject;
import com.design.demo.observer_观察者.old.ISubject;
import com.design.demo.observer_观察者.old.Observer1;
import com.design.demo.observer_观察者.old.Observer2;
import com.design.demo.observer_观察者.old.ConcreteSubject;
import com.design.demo.observer_观察者.old.ISubject;
import com.design.demo.observer_观察者.old.Observer2;

public class Client {

    public static void main(String[] args) {
        m();
    }


    public static void m() {
        System.out.println("*********************");
        System.out.println("*   观察者模式调用");
        System.out.println("*********************");


        ISubjectClass subjectClass1 = new ConcreteSubjectClass();//这样不行，因为接口没有ObservableClass 里面相关的方法
        ConcreteSubjectClass subjectClass = new ConcreteSubjectClass();
        subjectClass.addObserver(new NotifyClass1());
        subjectClass.addObserver(new NotifyClass2());

        subjectClass.doThings1();

        System.out.println();

        subjectClass.doThings2();

        System.out.println();



        System.out.println("*********************");
        System.out.println("**  老方式");
        System.out.println("*********************");

        ISubject subject1 = new ConcreteSubject();// 这样不行，因为接口没有ObservableClass 里面相关的方法
        ConcreteSubject subject = new ConcreteSubject();
        subject.addObserver(new Observer1());
        subject.addObserver(new Observer2());
        subject.doThings();

        System.out.println();

    }
}

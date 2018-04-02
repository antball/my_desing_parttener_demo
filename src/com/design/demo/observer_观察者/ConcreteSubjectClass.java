package com.design.demo.observer_观察者;


import java.util.Observable;

public class ConcreteSubjectClass extends Observable implements ISubjectClass {

    @Override
    public void doThings1() {
        System.out.println("被监控的第一件事件发生了。。。。");
        setChanged();
        notifyObservers("things 1 happen...");
    }

    @Override
    public void doThings2() {

        System.out.println("被监控的第二件事件发生了。。。。");
        setChanged();
        notifyObservers("things 2 happen...");
    }
}

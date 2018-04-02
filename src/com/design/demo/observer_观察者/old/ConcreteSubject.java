package com.design.demo.observer_观察者.old;

public class ConcreteSubject extends ObservableClass implements ISubject {

    @Override
    public void doThings(){
        System.out.println("监控活动发生了。。。。");
        notifyObservers("发现外星人了。");
    }
}

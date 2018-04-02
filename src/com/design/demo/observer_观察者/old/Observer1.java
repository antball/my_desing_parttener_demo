package com.design.demo.observer_观察者.old;

public class Observer1 implements IObserver {
    @Override
    public void update(String msg) {
        System.out.println("Observer1收到情报"+msg);
    }
}

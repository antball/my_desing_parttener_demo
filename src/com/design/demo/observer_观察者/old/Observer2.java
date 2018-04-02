package com.design.demo.observer_观察者.old;

public class Observer2 implements IObserver {
    @Override
    public void update(String msg) {
        System.out.println("Observer2收到情报"+msg);
    }
}

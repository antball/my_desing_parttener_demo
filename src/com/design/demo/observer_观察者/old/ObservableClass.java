package com.design.demo.observer_观察者.old;

import java.util.Vector;

public abstract class ObservableClass {

    private Vector<IObserver> observers= new Vector<IObserver>();

    public void addObserver(IObserver observer){
        observers.add(observer);
    }

    public void delObserver(IObserver observer){
        if(observers.contains(observer)){
            observers.remove(observer);
        }
    }

    public void notifyObservers(String msg){
        for(IObserver observer: observers){
            observer.update(msg);
        }
    }

}

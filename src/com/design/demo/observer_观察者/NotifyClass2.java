package com.design.demo.observer_观察者;

import java.util.Observable;
import java.util.Observer;

public class NotifyClass2  implements Observer {

    @Override
    public void update(Observable o, Object arg) {

        System.out.println("NotifyClass2 收到情报"+ arg);
    }
}

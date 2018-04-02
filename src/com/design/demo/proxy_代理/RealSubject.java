package com.design.demo.proxy_代理;

public class RealSubject implements  Subject {

    @Override
    public void request() {
        System.out.println("RealSubject  真正做事情的。。。");
    }
}

package com.design.demo.proxy_代理;

public class ProxySubject implements Subject {

    private Subject subject;

    public ProxySubject(Subject subject){
        this.subject = subject;
    }

    @Override
    public void request() {
        before();
        subject.request();
        after();
    }

    private void before(){
        System.out.println("before request");
    }


    private void after(){
        System.out.println("after request");
    }
}

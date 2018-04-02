package com.design.demo.proxy_代理;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Client {


    public static void main(String[] args) {
        m();
    }


    public static void m() {

        System.out.println("*********************");
        System.out.println("*   代理模式调用");
        System.out.println("*********************");

        Subject subject = new RealSubject();

        Subject proxySubject = new ProxySubject(subject);
        proxySubject.request();

        System.out.println();

        MyInvocationHandler handler = new MyInvocationHandler(subject);

//        Subject dynamicProxySubject = DynamicProxySubject.newProxyInstance(
//                subject.getClass().getClassLoader(),
//                subject.getClass().getInterfaces(),handler);
//        dynamicProxySubject.request();

        Subject dynamicProxySubject = (Subject) Proxy.newProxyInstance(
                subject.getClass().getClassLoader(),
                subject.getClass().getInterfaces(),
                handler);
        dynamicProxySubject.request();

        System.out.println();

        dynamicProxySubject = (Subject) handler.getProxyInstance();
        dynamicProxySubject.request();

        System.out.println();
    }
}

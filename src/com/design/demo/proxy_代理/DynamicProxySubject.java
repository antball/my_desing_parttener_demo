package com.design.demo.proxy_代理;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class DynamicProxySubject<T> {

    public static <T> T newProxyInstance(ClassLoader loader, Class<?> [] interfaces, InvocationHandler handler){

        //寻找joinpoint连接点，可以用元数据定义
//        boolean flag =true;
//        if(flag){
//            System.out.println("before advice");//前置通知
//        }

        Object obj =  Proxy.newProxyInstance(loader, interfaces, handler);

        return (T) obj;
    }
}

package com.design.demo.proxy_代理;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MyInvocationHandler implements InvocationHandler {

    private Object target;

    public MyInvocationHandler(Object obj){
        this.target = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        //寻找joinpoint连接点，可以用元数据定义
        boolean flag ="request".equals(method.getName());

        if(flag){
            System.out.println("before advice");//前置通知
        }

        Object result = method.invoke(this.target,args);

        if(flag){
            System.out.println("after advice");//后置通知
        }

        return result;

    }


    public Object getProxyInstance(){
       return Proxy.newProxyInstance(
               target.getClass().getClassLoader(),
               target.getClass().getInterfaces(),
               this);
    }
}

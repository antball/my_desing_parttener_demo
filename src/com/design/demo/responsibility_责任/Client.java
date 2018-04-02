package com.design.demo.responsibility_责任;

import com.design.demo.state_状态.Context;

public class Client{

        public static void main(String[] args) {
            m();
        }


        public static void m() {

            System.out.println("*********************");
            System.out.println("*   责任链模式调用");
            System.out.println("*********************");

            Handle rootHandle = new ConcreteHandle1();
            Handle handle2 = new ConcreteHandle2();
            Handle handle3 = new ConcreteHandle3();
            rootHandle.setNextHandler(handle2);
            handle2.setNextHandler(handle3);

            System.out.println(rootHandle.handleRequest(Level.level1));
            System.out.println(rootHandle.handleRequest(Level.level3));

            System.out.println();
        }
}

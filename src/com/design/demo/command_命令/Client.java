package com.design.demo.command_命令;

public class Client {

    public static void main(String[] args) {
        m();
    }


    public static void m() {
        System.out.println("*********************");
        System.out.println("*   命令模式调用  将两个不相关的类融合到一起 Abstraction拥有Implementor中的方法 ");
        System.out.println("*********************");

        Receiver receiver = new ConcreteReceiver1();
        Command command = new ConcreteCommand1(receiver);//具体的接收者可以放在命令里面
        Invoker invoker = new Invoker(command);
        invoker.action();

        System.out.println();

        Receiver receiver1 = new ConcreteReceiver2();
        Command command1 = new ConcreteCommand2(receiver1);
        invoker = new Invoker(command1);
        invoker.action();

        System.out.println();
    }
}

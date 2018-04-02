package com.design.demo.state_状态;

public class Client {

    public static void main(String[] args) {
        m();
    }


    public static void m() {

        System.out.println("*********************");
        System.out.println("*   状态模式调用");
        System.out.println("*********************");

        Context context = new Context();
        context.setCurrentState(Context.CLOSE_STATE);
        context.open();
        context.close();
        context.open();
        context.close();

        System.out.println();
    }
}

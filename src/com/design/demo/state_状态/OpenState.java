package com.design.demo.state_状态;

public class OpenState extends State {
    @Override
    public void close() {
        context.setCurrentState(Context.CLOSE_STATE);
        context.close();
    }

    @Override
    public void open() {
        System.out.println("OpenState  open");
    }
}

package com.design.demo.state_状态;

public class CloseState extends State {
    @Override
    public void close() {
        System.out.println("CloseState  close");
    }

    @Override
    public void open() {
        context.setCurrentState(Context.OPEN_STATE);
        context.open();
    }
}

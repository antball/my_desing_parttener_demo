package com.design.demo.command_命令;

import com.sun.webkit.dom.RectImpl;

public class ConcreteCommand1 implements Command {

    Receiver receiver;

    public ConcreteCommand1(Receiver receiver){
        this.receiver = receiver;
    }


    @Override
    public void execute() {
        receiver.doThings1();
    }
}

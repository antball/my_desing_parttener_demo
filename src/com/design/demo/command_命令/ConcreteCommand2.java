package com.design.demo.command_命令;

public class ConcreteCommand2 implements Command {

    Receiver receiver;

    public ConcreteCommand2(Receiver receiver) {
        this.receiver = receiver;
    }


    @Override
    public void execute() {
        receiver.doThings2();
    }
}

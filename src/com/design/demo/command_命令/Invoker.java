package com.design.demo.command_命令;

import com.design.demo.visitor_访问.CommonVisitor;

public class Invoker {

    private Command command;

    public Invoker(Command command){
        this.command = command;
    }

    public void action(){
        command.execute();
    }
}

package com.design.demo.state_状态;

import com.design.demo.command_命令.ConcreteCommand1;

public abstract class State {

    protected Context context;

    public void setContext(Context context){
        this.context = context;
    }

    public abstract void close();


    public abstract void open();
}

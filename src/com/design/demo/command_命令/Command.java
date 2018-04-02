package com.design.demo.command_命令;

public interface Command {

    //这里也可以是个抽象对象，里面放一些接受者对象，它们之里可以联合完成一些操作命令

    public void execute();


}

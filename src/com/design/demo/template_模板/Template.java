package com.design.demo.template_模板;

public abstract class Template {

    protected abstract void doSomething();

    protected abstract void doAnotherthing();


    public void templateMethod(){
        doSomething();
        doAnotherthing();
    }
}

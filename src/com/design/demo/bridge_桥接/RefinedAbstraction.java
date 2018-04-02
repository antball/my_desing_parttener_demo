package com.design.demo.bridge_桥接;

public class RefinedAbstraction extends Abstraction {

    public RefinedAbstraction(Implementor implementor) {
        super(implementor);
    }

    public void execute() {
        super.execute();

        super.implementor.method2();

        doThings2();
    }

    public void doThings2(){
        System.out.println("Abstraction extends 正常方法");
    }


}

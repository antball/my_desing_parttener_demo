package com.design.demo.facade_门面外观;

public class Facade {

    private SubSysClass1 class1;
    private SubSysClass2 class2;

    public Facade(){
        class1 = new SubSysClass1();
        class2 = new SubSysClass2();
    }

    public void method1(){
        class1.doThings1();
    }

    public void method2(){
        class2.doThings2();
    }

    public void method3(){
        class1.doThings1();
        class2.doThings2();
    }
}

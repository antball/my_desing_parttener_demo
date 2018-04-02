package com.design.demo.template_模板;

public class Client {

    public static void main(String[] args) {
        m();
    }


    public static void m() {
        System.out.println("*********************");
        System.out.println("*   模板方法模式调用");
        System.out.println("*********************");

        Template template = new ConcreteClass1();
        template.templateMethod();
        System.out.println();

        template = new ConcreteClass2();
        template.templateMethod();
        System.out.println();
    }
}

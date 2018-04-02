package com.design.demo.visitor_访问;

import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[] args) {
        m();
    }


    public static void m() {
        System.out.println("*********************");
        System.out.println("*   访问者方法模式调用");
        System.out.println("*********************");

        List<Element> elements = new ArrayList<>();
        Element element = new ConcreteElement1();
        elements.add(element);
         element = new ConcreteElement1();
        elements.add(element);
         element = new ConcreteElement2();
        elements.add(element);

        ShowVisitor show = new ShowVisitor();
        TotalVisitor total =  new TotalVisitor();

        System.out.println("访问类一一输出");
        for(Element ele:elements){
            ele.accept(new CommonVisitor());
            ele.accept(show);
            ele.accept(total);
        }

        System.out.println("访问类总和输出");
        show.report();

        System.out.println("访问类总计");
        System.out.println("总计："+total.getTotal());


        System.out.println();
    }
}

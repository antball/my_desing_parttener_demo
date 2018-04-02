package com.design.demo.composite_组合;

public class Leaf extends Crop {


    public Leaf(String name, String position) {
        super(name, position);
    }


    /**
     * 可以覆写父类方法
     */
    @Override
    public void doSomething() {
//        super.doSomething();
        System.out.println("Leaf方法 name:"+ super.name + "   position:"+super.position);

    }
}

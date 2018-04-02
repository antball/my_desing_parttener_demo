package com.design.demo.builder_建造;

public class Product {

    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void doSomething(){
        System.out.println("Product doSomething age:"+age + "   name:"+name);
    }
}

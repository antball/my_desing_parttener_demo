package com.design.demo.builder_建造;

public class Director {

    private Builder builder = new ConcreteBuilder();

    public Product getProduct(){
        builder.setPart(10,"张三");
        return  builder.builderProduct();
    }
}

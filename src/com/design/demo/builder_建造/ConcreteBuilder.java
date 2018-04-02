package com.design.demo.builder_建造;

public class ConcreteBuilder extends Builder {

    private Product product = new Product();

    @Override
    public void setPart(int age,String name) {
        product.setAge(age);
        product.setName(name);
    }

    @Override
    public Product builderProduct() {
        return product;
    }
}

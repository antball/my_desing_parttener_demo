package com.design.demo.factory_工厂;

public class ConcreteCreator implements Creator {
    @Override
    public <T extends Product> T createProduct(Class<T> c) {

        Product product = null;
        try {
            product = (Product) Class.forName(c.getName())
                    .newInstance();
        } catch (Exception e) {
            System.out.println("出现异常：" + e.getMessage());
        }
        return (T) product;
    }
}

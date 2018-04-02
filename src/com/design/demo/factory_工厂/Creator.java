package com.design.demo.factory_工厂;

public interface Creator {

    public <T extends Product> T createProduct(Class<T> c);

}

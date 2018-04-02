package com.design.demo.composite_组合;

public abstract class Crop {

    protected String name;
    protected String position;

    protected Crop parent=null;

    public Crop(String name,String position){
        this.name = name;
        this.position=position;
    }

    public void doSomething(){
        System.out.println("crop构件方法 name:"+name+"   position:"+position);
    }

    public Crop getParent() {
        return parent;
    }

    public void setParent(Crop parent) {
        this.parent = parent;
    }
}

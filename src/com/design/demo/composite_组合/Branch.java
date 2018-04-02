package com.design.demo.composite_组合;

import java.util.ArrayList;

public class Branch extends Crop {

    private ArrayList<Crop> crops = new ArrayList<Crop>();

    public Branch(String name, String position) {
        super(name, position);
    }

    public void add(Crop crop){
        crop.setParent(this);
        crops.add(crop);
    }

    public void remove(Crop crop){
        if(crops.contains(crop)){
            crops.remove(crop);
        }
    }

    public ArrayList<Crop> getChilden() {
        return crops;
    }
}

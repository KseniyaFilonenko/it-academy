package com.itacademy;

public class Bus extends Transport {
    public Bus (String modelName) {
        super(modelName);
    }
    @Override
    public void move(){
        System.out.println("Move bus");
    }
}

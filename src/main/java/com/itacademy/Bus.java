package com.itacademy;

public class Bus extends Transport implements Interface1, Interface3{
    public Bus (String modelName) {
        super(modelName);
    }
    @Override
    public void move(Transport car3){
        System.out.println("Move bus");
    }

    @Override
    public void calculatePassengers() {

    }

    @Override
    public void calculateStops() {

    }

    @Override
    public void quantityOfDoors() {
        
    }

    @Override
    public void methodForCarBus() {

    }
}

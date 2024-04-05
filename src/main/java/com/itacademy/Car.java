package com.itacademy;

public final class Car extends Transport implements Interface2, Interface3 {
    final int speed = 200;
    public final void drive() {
        System.out.println("Car is ok");
    }
    public Car (String modelName) {
        super(modelName);
    }
    @Override
    public void move(Transport car3){
        System.out.println("Move car");
    }
    @Override
    public void move2() {
        System.out.println("Car is moving");
    }
    public Car (Engine engine, Battery radiator, Radiator battery){
        super(engine, radiator, battery);
    }

    @Override
    public void uniqueCarMethod() {

    }

    @Override
    public void quantityOfDoors() {

    }
}

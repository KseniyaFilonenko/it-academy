package com.itacademy.hometask6;

public interface Interface3 {
    public void quantityOfDoors();
    public default void methodForCarBus() {
        System.out.println("method for both: Car and Bus");
    }
}

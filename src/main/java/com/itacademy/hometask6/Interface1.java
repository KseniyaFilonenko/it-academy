package com.itacademy.hometask6;

public interface Interface1 {
    public void calculatePassengers();

    public default void uniqueMethod() {
        System.out.println("unique default method");
    }
}

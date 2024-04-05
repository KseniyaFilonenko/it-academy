package com.itacademy;

public interface Interface1 {
    public void calculatePassengers();

    public default void uniqueMethod() {
        System.out.println("unique default method");
    }
}

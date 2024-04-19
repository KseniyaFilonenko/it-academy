package com.itacademy.hometask6;

public interface Interface2 {
    public void uniqueCarMethod();
    public default void uniqueCarMethod2() {
        System.out.println("unique car method");
    }
}

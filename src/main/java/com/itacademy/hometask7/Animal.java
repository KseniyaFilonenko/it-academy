package com.itacademy.hometask7;

import java.util.Objects;

public class Animal extends Object {
    String animal;
    int weight;
    static String description = "some description";

    public static void setDescription() {
        System.out.println(description);
    }
    public Animal(String animal, int weight) {
        this.animal = animal;
        this.weight = weight;
    }
    @Override
    public String toString() {
        return "Animal{" +
                "animal='" + animal + '\'' +
                ", weight=" + weight +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal1 = (Animal) o;
        return weight == animal1.weight && Objects.equals(animal, animal1.animal);
    }
    @Override
    public int hashCode() {
        return Objects.hash(animal, weight);
    }
}

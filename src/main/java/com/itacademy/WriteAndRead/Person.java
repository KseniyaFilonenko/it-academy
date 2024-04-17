package com.itacademy.WriteAndRead;

import java.io.Serializable;

public class Person implements Serializable {
    int age;
    String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return age + " : " + name;
    }
}

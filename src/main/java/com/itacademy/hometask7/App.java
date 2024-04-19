package com.itacademy.hometask7;

public class App {
    public static void main(String[] args) {
    Animal animal = new Animal("Dog", 100);
    Animal animal2 = new Animal("Dog", 100);

    Serial charmed = new Serial("drama",8,20);
    Serial house = new Serial("medicine", 22, 20);

    Calendar march = Calendar.MARCH;
    Animal.setDescription();
        System.out.println(animal.toString());
        System.out.println("animal.equals(animal2)? = " + animal.equals(animal2));
        System.out.println("animal code = " + animal.hashCode());
        System.out.println("animal2 code = " + animal2.hashCode());
        System.out.println(march);
        System.out.println("Эти сериалы равны друг другу?");
        System.out.println(charmed.equals(house));
        System.out.println("Какие хэшкоды сериалов?");
        System.out.println(charmed.hashCode());
        System.out.println(house.hashCode());
    }
}

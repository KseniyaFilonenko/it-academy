package com.itacademy.WriteAndRead;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ReadObject {
    public static void main(String[] args) throws Exception {
        FileInputStream fileInputStream = new FileInputStream("test");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        Person person1 = (Person) objectInputStream.readObject();
        System.out.println(person1);

        fileInputStream.close();
    }
}

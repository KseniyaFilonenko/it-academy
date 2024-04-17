package com.itacademy.WriteAndRead;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class WriteObject {
    public static void main(String[] args) throws Exception {
        Person person1 = new Person(18, "A");

        FileOutputStream fileOutputStream = new FileOutputStream("test");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        objectOutputStream.writeObject(person1);

        fileOutputStream.close();
    }
}

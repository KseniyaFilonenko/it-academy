package com.itacademy.Hometask10;

import java.lang.reflect.*;
import java.util.Arrays;

public class App {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException,
            IllegalAccessException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {
        // 1 task
        MyThread myThread = new MyThread();
        myThread.start();
        System.out.println(Thread.currentThread().getName());

        Thread thread = new Thread(new MyRunnable());
        thread.start();

        // 3 task
        Class studentClass = Student.class;

        Student student = new Student(18, "Name");
        Class studentClass2 = student.getClass();
        Class studentClass3 = Class.forName("com.itacademy.Hometask10.Student");

        Student student2 = (Student) studentClass.newInstance();

        Constructor constructor = studentClass.getDeclaredConstructor(int.class, String.class);
        Student student3 = (Student) constructor.newInstance(20, "Name2");
        System.out.println(student3.getName().toUpperCase());

        Parameter[] parameters = constructor.getParameters();
        Arrays.stream(parameters).forEach(System.out::println);
        System.out.println(constructor.getName().toLowerCase());

        Field field = studentClass.getDeclaredField("name");
        field.set(student2, "Olya");
        System.out.println(student2.getName());

        Method[] methods = studentClass.getMethods();
        System.out.println("----Methods to use:----");
        Arrays.stream(methods).forEach(System.out::println);
    }
}

package com.itacademy.hometask8.Task4;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // ArrayList
        Student student1 = new Student("Smirnov");
        Student student2 = new Student("Sidorov");
        Student student3 = new Student("Petrov");

        ArrayList<Student> arrayList = new ArrayList<Student>();
        arrayList.add(student1);
        arrayList.add(student2);
        arrayList.add(student3);

        System.out.println("ArrayList:");
        for (Student student : arrayList) {
            System.out.println(student);
        }

        arrayList.remove(2);

        System.out.println("1st student is: " + arrayList.get(1));
        System.out.println("Students are: " + arrayList);

        // LinkedList
        LinkedList<Student> linkedList = new LinkedList<Student>();
        linkedList.add(new Student("ABC"));
        linkedList.add(new Student("CDE"));

        linkedList.remove(1);

        System.out.println("LinkedList:");
        System.out.println("Students are: " + linkedList);

        // HashSet
        HashSet<Student> hashSet = new HashSet<>();
        hashSet.add(new Student("A", 19));
        hashSet.add(new Student("B", 19));
        hashSet.add(new Student("C", 19));

        hashSet.remove(0);

        System.out.println("HashSet:");
        System.out.println("Students are: " + hashSet);

        // LinkedHashSet
        LinkedHashSet<Student> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(student1);
        linkedHashSet.add(student3);
        
        linkedHashSet.remove(1);

        System.out.println(linkedHashSet);

        // TreeSet
        Comparator<Student> studentComparator = new StudentComparator();
        TreeSet<Student> treeSet = new TreeSet<>(studentComparator);

        System.out.println("TreeSet:");
        for (int i = 0; i < 5; i++)
            treeSet.add(new Student("S" + i, i));

        for (Student student : treeSet) {
            System.out.println(student);
        }

        // HashMap
        HashMap<Integer, Student> hashMap = new HashMap<>();
        hashMap.put(student1.age, student1);
        hashMap.put(student2.age, student2);
        hashMap.put(student3.age, student3);
        System.out.println("HashMap:");
        for (Map.Entry<Integer, Student> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        System.out.println();
    }
}

package com.itacademy.hometask10;

import lombok.*;

@MyAnnotation()
@Setter
@Getter
@AllArgsConstructor
@ToString
@Builder
public class Student {
    // 2 task
    int age;
    @MyAnnotation(name = "Kseniya")
    String name;

//    public Student(int age, String name) {
//        this.age = age;
//        this.name = name;
//    }

    public Student() {
    }
}

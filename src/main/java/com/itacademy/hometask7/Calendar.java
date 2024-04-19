package com.itacademy.hometask7;

public enum Calendar {
    JANUARY("первый месяц года", 31, 2024),
    FEBRUARY("последний месяц зимы", 29, 2024),
    MARCH("первый месяц весны", 31, 2024);
    String name;
    int days;
    int year;

    Calendar(String name, int days, int year) {
        this.name = name;
        this.days = days;
        this.year = year;
    }
    public String getName() {
        return name;
    }
    public int getDays() {
        return days;
    }
    public int getYear() {
        return year;
    }
    @Override
    public String toString() {
        return "Calendar{" +
                "name='" + name + '\'' +
                ", days=" + days +
                ", year=" + year +
                '}';
    }
}

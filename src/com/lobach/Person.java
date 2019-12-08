package com.lobach;

public class Person {
    String name;
    int age;
    int passport;

    public Person(String name, int age, int passport) {
        this.name = name;
        this.age = age;
        this.passport = passport;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getPassport() {
        return passport;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", passport=" + passport +
                '}';
    }
}

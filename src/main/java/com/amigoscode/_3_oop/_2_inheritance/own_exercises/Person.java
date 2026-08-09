package com.amigoscode._3_oop._2_inheritance.own_exercises;

public class Person {
    private String name;
    private String lastName;
    private int age;
    private String email;

    {
        System.out.println("Person constructor invoked");
    }

    public Person(String name, String lastName, int age, String email) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
    }

    public void introduction() {
        System.out.println("HELLO WORLD!");
    }
}

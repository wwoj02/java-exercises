package com.amigoscode._3_oop._2_inheritance.own_exercises;

public class Programmer extends Person{
    private String[] stack;

    {
        System.out.println("Programmer constructor invoked");
    }

    public Programmer(String name, String lastName, int age, String email, String[] stack) {
        super(name, lastName, age, email);
        this.stack = stack;
    }

    public void code() {
        System.out.println("programing...");
    }

    public void sayHi() {
        introduction();
    }


    public void introduction() {
        System.out.println("override");
    }
}
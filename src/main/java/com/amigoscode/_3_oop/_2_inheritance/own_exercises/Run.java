package com.amigoscode._3_oop._2_inheritance.own_exercises;

public class Run {
    public static void main() {
        Programmer p = new Programmer(
                "Wojtek",
                "WW",
                24,
                "123@123",
                new String[]{"Java", "PSQL"});

        p.sayHi();
    }
}

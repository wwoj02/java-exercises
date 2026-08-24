package com.amigoscode._7_streams._6_transformations;

import java.util.List;

/**
 * Exercise: Map Transformations
 *
 * Practice using map(), mapToInt(), and mapToDouble() to transform
 * stream elements. Learn to chain map operations and use method references.
 */
public class MapExercise {

    record Person(String name, int age, String email) {}

    record PersonDTO(String name, String email) {}

    record Product(String name, double price, int quantity) {}

    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Alice", 30, "alice@example.com"),
                new Person("Bob", 25, "bob@example.com"),
                new Person("Charlie", 35, "charlie@example.com"),
                new Person("Diana", 28, "diana@example.com")
        );

        List<Product> products = List.of(
                new Product("Laptop", 999.99, 2),
                new Product("Mouse", 29.99, 10),
                new Product("Keyboard", 79.99, 5),
                new Product("Monitor", 449.99, 3)
        );

        List<String> sentences = List.of(
                "Hello World",
                "Java Streams",
                "Functional Programming"
        );

        // TODO: 1 - Map 'people' to extract just their names
        //           Collect to a list and print it
        List<String> names = people.stream().map(Person::name).toList();
        System.out.println(names);


        // TODO: 2 - Map Person objects to PersonDTO objects (dropping the age field)
        //           Collect to a list and print each DTO
        List<PersonDTO> personDTOS = people.stream().map(p -> new PersonDTO(p.name, p.email)).toList();
        personDTOS.forEach(System.out::println);


        // TODO: 3 - Use mapToInt to get the ages of all people
        //           Calculate and print the sum of ages
        int sumOfAges = people.stream().mapToInt(p -> p.age()).sum();
        System.out.println(sumOfAges);


        // TODO: 4 - Use mapToDouble to get all product prices
        //           Calculate and print the sum of prices
        double sumOfPrices = products.stream().mapToDouble(p -> p.price).sum();
        System.out.println(sumOfPrices);



        // TODO: 5 - Chain map operations on 'sentences':
        //           First map to lowercase, then map to the first word only (split by space)
        //           Print each result
        sentences.stream()
                .map(String::toLowerCase)
                .map(s -> s.split(" ")[0])
                .forEach(System.out::println);


        // TODO: 6 - Use map with a method reference: map 'sentences' to uppercase
        //           using String::toUpperCase
        //           Collect to a list and print it
        List<String> list = sentences.stream().map(String::toUpperCase).toList();
        System.out.println(list);

    }
}

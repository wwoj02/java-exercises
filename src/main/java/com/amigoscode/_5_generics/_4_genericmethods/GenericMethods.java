package com.amigoscode._5_generics._4_genericmethods;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * Exercise: Generic Methods
 * <p>
 * This exercise focuses on writing static generic methods.
 * Generic methods declare their own type parameters independently
 * of any generic class. The type parameter appears before the return type.
 * <p>
 * Complete the TODOs below.
 */
public class GenericMethods {

    // TODO: 1 - Create a static generic method: <T> void printArray(T[] array)
    //  It should print each element of the array on the same line separated
    //  by spaces, then print a newline at the end.
    static <T> void printArray(T[] array) {
        for (T t : array) System.out.print(t + " ");
        System.out.println();
    }


    // TODO: 2 - Create a static generic method: <T> T getFirst(List<T> list)
    //  It should return the first element of the list.
    //  If the list is empty, return null.
    static <T> T getFirst(List<T> list) {
        return list.isEmpty() ? null : list.getFirst();
    }


    // TODO: 3 - Create a static generic method: <T> T getLast(List<T> list)
    //  It should return the last element of the list.
    //  If the list is empty, return null.
    static <T> T getLast(List<T> list) {
        return list.isEmpty() ? null : list.getLast();
    }


    // TODO: 4 - Create a static generic method: <T> List<T> filterNulls(List<T> list)
    //  It should return a new list containing only the non-null elements
    //  from the original list. Do not modify the original list.
    static <T> List<T> filterNulls(List<T> list) {
        return list.stream()
                .filter(Objects::nonNull)
                .collect(Collectors.toList());
    }


    // TODO: 5 - Create a static generic method: <T> boolean contains(T[] array, T target)
    //  It should return true if the target is found in the array.
    //  Use the equals() method for comparison (handle null target).
    static <T> boolean contains(T[] array, T target) {
        for (T t : array) {
            if (Objects.equals(t, target)) return true;
        }

        return false;
    }


    public static void main(String[] args) {

        // TODO: 6 - Call all five methods above:
        //  (a) printArray with a String[] and an Integer[]
        //  (b) getFirst and getLast with a List<String> of names
        //  (c) filterNulls with a list that contains some null values
        //  (d) contains to search for an element in an array
        String[] a = {"Wojtek", "Jacob", "Michael"};
        Integer[] b = {1, 2, 3, 4, 5};
        List<String> names = new ArrayList<>(List.of("Wojtek", "Jacob", "Michael"));
        List<String> namesWithNulls = new ArrayList<>();
        namesWithNulls.add("Jacob");
        namesWithNulls.add(null);
        namesWithNulls.add("Vladimir");
        namesWithNulls.add("Michael");
        namesWithNulls.add(null);
        namesWithNulls.add("Jeremy");



        printArray(a);
        printArray(b);
        System.out.println(getFirst(names));
        System.out.println(getLast(names));
        System.out.println(filterNulls(namesWithNulls));
        System.out.println(contains(a, "Wojtek"));

        // TODO: 7 - Demonstrate type inference: call printArray and contains
        //  WITHOUT explicitly specifying the type parameter (i.e., just call
        //  printArray(myArray) instead of GenericMethods.<String>printArray(myArray)).
        //  Add a comment explaining that the compiler infers T from the arguments.

//        based on the passed argument the compiler will infer T
        printArray(a);
        System.out.println(contains(a, "Wojtek"));
    }
}

package com.amigoscode._4_datastructures._5_linkedlists;

// Exercise: LinkedList vs ArrayList Performance Comparison
// Understand when to use LinkedList vs ArrayList by measuring operation times.

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListVsArrayList {

    public static void main(String[] args) {

        // TODO: 1 - Create both an ArrayList<Integer> and a LinkedList<Integer>
        //           Fill each with 10000 elements (0 to 9999) using a for loop
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < 10000; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }

        // TODO: 2 - Measure time to add an element at the beginning (index 0) for both lists
        //           Use System.nanoTime() before and after the operation
        //           Perform the add(0, value) operation 1000 times for each list
        //           Print the time taken for each in milliseconds
        //           (divide nanoseconds by 1_000_000 to get milliseconds)
        long start1 = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            arrayList.add(0, 5);
        }
        long end1 = System.nanoTime();

        long start2 = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            linkedList.add(0, 5);
        }
        long end2 = System.nanoTime();

        long result1 = end1 - start1;

        long result2 = end2 - start2;

        System.out.println(result1 / 1_000_000);
        System.out.println(result2 / 1_000_000);

        // TODO: 3 - Measure time to add an element at the end for both lists
        //           Perform the add(value) operation 1000 times for each list
        //           Print the time taken for each
        start1 = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            arrayList.add(5);
        }
        end1 = System.nanoTime();
        result1 = end1 - start1;

        start2 = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            linkedList.add(5);
        }
        end2 = System.nanoTime();
        result2 = end2 - start2;

        System.out.println(result1 / 1_000_000);
        System.out.println(result2 / 1_000_000);

        // TODO: 4 - Measure time to get an element at the middle index for both lists
        //           Perform get(list.size() / 2) operation 1000 times for each list
        //           Print the time taken for each
        start1 = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            arrayList.get(arrayList.size() / 2);
        }
        end1 = System.nanoTime();
        result1 = end1 - start1;

        start2 = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            linkedList.get(linkedList.size() / 2);
        }
        end2 = System.nanoTime();
        result2 = end2 - start2;

        System.out.println(result1 / 1_000_000);
        System.out.println(result2 / 1_000_000);


        // TODO: 5 - Print a summary explaining the differences
        //           Use System.out.println() to explain:
        //           - Why LinkedList is faster for insertions at the beginning
        //           - Why ArrayList is faster for random access (get by index)
        //           - When you would choose one over the other
        System.out.println("" +
                "- LinkedList is faster for insertion at the beginning cause linkedlist basically sets a new node at the beginning" +
                " when arraylist gotta move all objects that currently contain one place ahead to make space for a new object at the beginning");
        System.out.println("" +
                "- we can access what arraylist stores with the index, linkedlist gotta iterate to demanded index (no direct access with index)");
        System.out.println("i'd choose arraylist when its important for direct access through the index, on another hand" +
                "i'd choose linkedlist when access to middle objects isn't that important as access to the object at the end and the beginning");

    }
}

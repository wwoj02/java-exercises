package com.amigoscode._4_datastructures._2_arraylist;

// Exercise: ArrayList Operations
// Learn advanced ArrayList operations including sorting, reversing, and converting.

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListOperations {

    public static void main(String[] args) {

        // TODO: 1 - Create an ArrayList of Integers called 'numbers'
        //           Add these 10 numbers: 45, 12, 78, 34, 56, 23, 89, 67, 11, 90
        List<Integer> numbers = new ArrayList<>(List.of(
                45, 12, 78, 34, 56, 23, 89, 67, 11, 90
        ));

        // TODO: 2 - Sort the list in ascending order using Collections.sort()
        //           Print the sorted list
        Collections.sort(numbers);
        System.out.println(numbers);

        // TODO: 3 - Reverse the list using Collections.reverse()
        //           Print the reversed list
        Collections.reverse(numbers);
        System.out.println(numbers);

        // TODO: 4 - Find and print the maximum value using Collections.max()
        System.out.println(Collections.max(numbers));

        // TODO: 5 - Create a subList containing the first 5 elements (indices 0 to 4)
        //           Print the subList
        //           Note: subList returns a view, not a copy
        List<Integer> subList = numbers.subList(0, 5);
        System.out.println(subList);

        // TODO: 6 - Convert the ArrayList to an Integer array using toArray()
        //           Print the array length to verify
        Integer[] arr = numbers.toArray(new Integer[0]);
        System.out.println(arr.length);

        // TODO: 7 - Clear the list using clear() and verify it's empty
        //           Print the size and the result of isEmpty()
        numbers.clear();
        System.out.println(numbers.isEmpty());
        System.out.println(numbers.size());
    }
}

package com.amigoscode._5_generics._6_wildcards;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Exercise: Lower Bounded Wildcards (? super T)
 *
 * A lower bounded wildcard <? super Integer> accepts Integer and all its
 * supertypes (Number, Object). This is useful when you want to WRITE to
 * a generic structure.
 *
 * PECS principle: Producer Extends, Consumer Super.
 * When a list CONSUMES values (you write to it), use "super".
 *
 * Complete the TODOs below.
 */
public class LowerBoundedWildcard {

    // TODO: 1 - Create a static method: void addNumbers(List<? super Integer> list)
    //  It should add the integers 1, 2, and 3 to the list.
    //  This works because any list that holds Integer or a supertype of Integer
    //  can safely accept Integer values.
    public static void addNumbers(List<? super Integer> list) {
        list.add(1);
        list.add(2);
        list.add(3);
    }

    // TODO: 2 - Create a static method:
    //  <T> void moveElements(List<? extends T> source, List<? super T> destination)
    //  It should read each element from source and add it to destination.
    //  This is the PECS principle in action:
    //    source uses "extends" because it PRODUCES elements (we read from it)
    //    destination uses "super" because it CONSUMES elements (we write to it)
    static <T> void moveElements(List<? extends T> source, List<? super T> destination) {
        for (T t : source) destination.add(t);
    }

    public static void main(String[] args) {

        // TODO: 3 - Call addNumbers() with three different list types:
        //  (a) List<Integer>   - Integer is Integer (exact match)
        //  (b) List<Number>    - Number is a supertype of Integer
        //  (c) List<Object>    - Object is a supertype of Integer
        //  Print each list after calling addNumbers().
        List<Integer> list1 = new ArrayList<>();
        List<Number> list2 = new ArrayList<>();
        List<Object> list3 = new ArrayList<>();

        addNumbers(list1);
        addNumbers(list2);
        addNumbers(list3);

        System.out.println(list1);
        System.out.println(list2);
        System.out.println(list3);

        // TODO: 4 - Demonstrate that you CAN add Integer to List<? super Integer>.
        //  Create a List<? super Integer> variable, assign a new ArrayList<Number>()
        //  to it, and add several Integer values. Print the list.
        //  Then try adding a Double and observe/explain the compile error (commented out).
        List<? super Integer> variables = new ArrayList<Number>();

        variables.add(1);
        variables.add(5);
        variables.add(12);

        //
        // list.add(3.14);  // Why doesn't this compile even though list holds Numbers?
//        -> well it's not gonna work - yes we assign a new ArrayList that accepts Numbers but the 'variables'
//        reference restrict the type that we can add to the list only to Integer and its superclasses


        // TODO: 5 - Use moveElements() to move elements from a List<Integer> source
        //  to a List<Number> destination. Print the destination list to verify.
        List<Integer> source = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> destination = new ArrayList<>();

        moveElements(source, destination);
        System.out.println(destination);



        // TODO: 6 - Add a comment below explaining the PECS principle
        //  (Producer Extends, Consumer Super) as it applies to this exercise.
        //  Why is "super" appropriate when the list is a CONSUMER (we write to it)?
        //  How does this complement the "extends" wildcard?

//        well super is appropriate cause we can add a value without worrying about its type but can't
//        but can't read it safely

//        extends
    }
}

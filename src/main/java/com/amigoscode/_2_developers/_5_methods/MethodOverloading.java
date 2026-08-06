package com.amigoscode._2_developers._5_methods;

/**
 * Method Overloading Exercises
 * <p>
 * Practice creating overloaded methods — multiple methods with the same name
 * but different parameter lists. Java determines which version to call based
 * on the arguments you pass.
 */
public class MethodOverloading {

    // TODO: 1 - Create a method: int add(int a, int b)
    //  Returns the sum of two integers.
    int add(int a, int b) {
        return a + b;
    }


    // TODO: 2 - Create an overloaded method: int add(int a, int b, int c)
    //  Returns the sum of three integers.
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // TODO: 3 - Create an overloaded method: double add(double a, double b)
    //  Returns the sum of two doubles.
    double add(double a, double b) {
        return a + b;
    }

    // TODO: 4 - Create a method: String format(String value)
    //  Returns the string wrapped in square brackets, e.g., "[hello]".
    String format(String value) {
        return String.format("[%s]", value);
    }

    // TODO: 5 - Create an overloaded method: String format(int value)
    //  Returns the integer formatted with leading zeros to 5 digits.
    //  Example: format(42) returns "00042".
    //  Hint: use String.format("%05d", value)
    String format(int value) {
        return String.format("%05d", value);
    }

    // TODO: 6 - Create an overloaded method: String format(String label, int value)
    //  Returns "label: value", e.g., format("Score", 95) returns "Score: 95".
    String format(String label, int value) {
        return String.format("%s: %d", label, value);
    }

    public static void main(String[] args) {
        MethodOverloading mo = new MethodOverloading();

        // TODO: 7 - Call each overloaded method and print the results:
        //  - add(2, 3)
        System.out.println("add(2, 3)");
        System.out.println(mo.add(2, 3) + "\n");
        //  - add(1, 2, 3)
        System.out.println("add(1, 2, 3)");
        System.out.println(mo.add(1, 2, 3) + "\n");
        //  - add(1.5, 2.5)
        System.out.println("add(1.5, 2.5)");
        System.out.println(mo.add(1.5, 2.5) + "\n");
        //  - format("hello")
        System.out.println("format(\"hello\")");
        System.out.println(mo.format("hello") + "\n");
        //  - format(42)
        System.out.println("format(42)");
        System.out.println(mo.format(42) + "\n");
        //  - format("Score", 95)
        System.out.println("format(\"Score\", 95)");
        System.out.println(mo.format("Score", 95) + "\n");
        //  Print each result with a descriptive label.


    }
}

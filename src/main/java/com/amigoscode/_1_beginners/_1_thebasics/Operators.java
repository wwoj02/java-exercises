package com.amigoscode._1_beginners._1_thebasics;

/**
 * Exercise: Operators
 *
 * Learn how to use arithmetic, comparison, logical, and other operators in Java.
 * Operators allow you to perform operations on variables and values.
 */
public class Operators {

    public static void main(String[] args) {

        // TODO: 1 - Use arithmetic operators (+, -, *, /) on two int variables and print the results
        // Declare two int variables (e.g., a = 10, b = 3)
        // Print the result of a + b, a - b, a * b, and a / b
        int a = 10;
        int b = 3;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);

        // TODO: 2 - Use the modulus operator (%) to check if a number is even
        // Declare an int variable called number with any value.
        // Print the result of number % 2
        // Print whether the number is even (result is 0) or odd (result is 1)
        int number = 7;
        System.out.println(number % 2);

        // TODO: 3 - Use increment (++) and decrement (--) operators
        // Declare an int variable called counter, set it to 5
        // Use counter++ and print the result, then use counter-- and print the result
        int counter = 5;
        counter++;
        System.out.println(counter);
        counter--;
        System.out.println(counter);

        // TODO: 4 - Use compound assignment operators (+=, -=, *=)
        // Declare an int variable called score, set it to 10
        // Use +=, -=, and *= on score, printing after each operation
        int score = 10;
        score += 2;
        System.out.println(score);
        score -= 4;
        System.out.println(score);
        score *= 2;
        System.out.println(score);

        // TODO: 5 - Use comparison operators (==, !=, >, <, >=, <=) and print the boolean results
        // Declare two int variables (e.g., x = 5, y = 10)
        // Print the result of each comparison, e.g.: System.out.println("x == y: " + (x == y));
        int x = 5;
        int y = 10;
        System.out.println(x == y);
        System.out.println(x > y);
        System.out.println(x >= y);
        System.out.println(x < y);
        System.out.println(x <= y);
        System.out.println(x != y);

        // TODO: 6 - Use logical operators (&&, ||, !) to combine conditions
        // Declare two boolean variables (e.g., hasLicense = true, hasInsurance = false)
        // Print the result of: hasLicense && hasInsurance
        // Print the result of: hasLicense || hasInsurance
        // Print the result of: !hasLicense
        boolean hasLicense = true;
        boolean hasInsurance = false;
        System.out.println(hasInsurance || hasLicense);
        System.out.println(hasLicense && hasInsurance);
        System.out.println(!hasLicense);


        // TODO: 7 - Use the ternary operator to assign "adult" or "minor" based on age
        // Declare an int variable called age with any value
        // Use the ternary operator: String status = (condition) ? "adult" : "minor";
        // Print the status
        int age = 24;
        String status = age >= 18 ? "adult" : "minor";
        System.out.println(status);
    }
}

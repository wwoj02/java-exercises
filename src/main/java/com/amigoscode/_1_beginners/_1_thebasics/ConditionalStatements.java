package com.amigoscode._1_beginners._1_thebasics;

/**
 * Exercise: Conditional Statements
 *
 * Learn how to control the flow of your program using if/else and switch statements.
 * Conditional statements allow your program to make decisions based on conditions.
 */
public class ConditionalStatements {

    public static void main(String[] args) {

        // TODO: 1 - Write an if statement that prints "Positive" if a number is greater than 0
        // Declare an int variable called number and assign it a positive value.

        int number = -2;
        if(number > 0) System.out.println("Positive");
        else System.out.println("Not Positive");
        // TODO: 2 - Add an else clause to the above that prints "Not positive"
        // Change the value of number to a negative value or 0 to test both branches.


        // TODO: 3 - Write an if/else if/else chain for grade classification
        // Declare an int variable called score and assign it a value (0-100).
        // If score >= 90, print "Grade: A"
        // Else if score >= 80, print "Grade: B"
        // Else if score >= 70, print "Grade: C"
        // Else print "Grade: F"
        int score = 85;

        if(score >= 90) System.out.println("A");
        else if (score >= 80) System.out.println("B");
        else if (score >= 70) System.out.println("C");
        else System.out.println("F");

        // TODO: 4 - Write a switch statement for day of the week
        // Declare an int variable called day (1-7).
        // Use a switch statement to print the day name:
        //   1 -> "Monday", 2 -> "Tuesday", ... 7 -> "Sunday"
        // Include a default case for invalid values.

        int day = 3;
        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Invalid value");
        }

        // TODO: 5 - Use a switch statement with a String
        // Declare a String variable called month (e.g., "February").
        // Use a switch statement to print the number of days in that month.
        // Handle at least 3-4 months plus a default case.

        String month = "February";
        switch (month) {
            case "January" -> System.out.println(31);
            case "February" -> System.out.println(28);
            case "March" -> System.out.println(31);
            case "April" -> System.out.println(30);
            default -> System.out.println("Invalid");
        }

        // TODO: 6 - Use a switch expression (Java 14+) to return a value
        // Using the 'day' variable from above, assign the day name to a String
        // using a switch expression with arrow syntax:
        //   String dayName = switch (day) {
        //       case 1 -> "Monday";
        //       ...
        //   };
        // Print the result.
        String dayName = switch (day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Invalid";
        };
        System.out.println(dayName);

        // TODO: 7 - Write a nested if statement to check if a number is positive AND even
        // Declare an int variable called value.
        // First check if it is positive (> 0).
        //   If positive, check if it is even (value % 2 == 0).
        //     If even, print "Positive and even"
        //     Else print "Positive and odd"
        //   Else print "Not positive"
        int value = 8;
        if(value > 0) {
            if (value % 2 == 0) System.out.println("Positive and even");
            else System.out.println("Positive and odd");
        }
        else System.out.println("Not positive");

    }
}

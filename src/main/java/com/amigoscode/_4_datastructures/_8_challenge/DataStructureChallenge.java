package com.amigoscode._4_datastructures._8_challenge;

// Exercise: Data Structure Challenge
// Combine multiple data structures to solve a real-world problem.
// Manage a collection of students, group them, track recently viewed, and generate reports.

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

public class DataStructureChallenge {

    // TODO: 1 - Create a Student record (or class) with three fields:
    //           String name, int grade, String subject
    //           If using a record: record Student(String name, int grade, String subject) {}
    //           If using a class: include constructor, getters, and a toString() method
    record Student(String name, int grade, String subject) {}

    public static void main(String[] args) {

        // TODO: 2 - Create a List of 10 students with various names, grades, and subjects
        //           Use at least 3 different subjects (e.g., "Math", "Science", "English")
        //           Example: new Student("Alice", 92, "Math")
        List<Student> studentList = new ArrayList<>(List.of(
                new Student("Wojtek", 21, "Math"),
                new Student("Ali", 13, "Science"),
                new Student("Ahmed", 45, "Math"),
                new Student("Juliet", 98, "Science"),
                new Student("Olivia", 5, "Math"),
                new Student("Eve", 65, "Biology"),
                new Student("Thomas", 11, "Math"),
                new Student("Olivier", 55, "English"),
                new Student("Bastian", 33, "English"),
                new Student("Sebastian", 17, "English")
        ));

        // TODO: 3 - Use a Map<String, List<Student>> to group students by subject
        //           Iterate through the student list
        //           For each student, use computeIfAbsent() to get or create the list for their subject
        //           Then add the student to that list
        //           Print each subject and its students
        Map<String, List<Student>> studentsBySubject = new HashMap<>();

        for (Student student : studentList) {
            studentsBySubject
                    .computeIfAbsent(student.subject, subject -> new ArrayList<>())
                    .add(student);
        }
        for (Map.Entry<String, List<Student>> listEntry : studentsBySubject.entrySet()) {
            System.out.println(listEntry.getKey());
            for (Student student : listEntry.getValue()) {
                System.out.println(student);
            }
        }




        // TODO: 4 - Use a Set<String> to find all unique subjects
        //           Iterate through the students and add each subject to the set
        //           Print the unique subjects
        Set<String> uniqueSubject = new HashSet<>();
        for (Student student : studentList) {
            uniqueSubject.add(student.subject);
        }

        System.out.println(uniqueSubject);


        // TODO: 5 - Use a Stack<Student> to track the last 3 students "viewed"
        //           Push any 3 students from the list onto the stack
        //           Then pop and print them to show the viewing history (most recent first)
        Stack<Student> viewed = new Stack<>();
        viewed.push(studentList.get(0));
        viewed.push(studentList.get(1));
        viewed.push(studentList.get(2));
        for (int i = 0; i < 3; i++) {
            System.out.println(viewed.pop());
        }

        // TODO: 6 - Sort the student list by grade in descending order using a Comparator
        //           Use list.sort() with Comparator.comparingInt() and .reversed()
        //           Print the sorted list
        studentList.sort(Comparator.comparingInt((Student::grade)).reversed());

        System.out.println(studentList);
        // TODO: 7 - Print a summary report:
        //           - Total number of students
        //           - Number of unique subjects (from the Set)
        //           - Highest grade student (first in sorted list)
        //           - Number of students per subject (from the Map)

        System.out.println("Number of students: " + studentList.size());
        System.out.println("Number of unique subjects: " + uniqueSubject.size());
        System.out.println("Highest grade student: " + studentList.getFirst());
        for (Map.Entry<String, List<Student>> s : studentsBySubject.entrySet()) {
            System.out.printf("Subject: %s, number of students: %d \n", s.getKey(), s.getValue().size());
        }

    }
}

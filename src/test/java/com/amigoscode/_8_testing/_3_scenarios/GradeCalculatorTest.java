package com.amigoscode._8_testing._3_scenarios;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Exercise: Testing Multiple Scenarios
 *
 * Practice testing a class with many different input/output combinations.
 * Focus on testing normal cases, boundary values, and error conditions.
 */
@DisplayName("Grade Calculator Tests")
class GradeCalculatorTest {

    private GradeCalculator gradeCalculator;

    @BeforeEach
    void setUp() {
        gradeCalculator = new GradeCalculator();
    }

    // TODO: 1 - Test that a score of 95 returns grade "A".
    //  Use assertEquals to verify gradeCalculator.calculateGrade(95) returns "A".

    @Test
    void TODO1() {
        int score = 95;
        var actual = gradeCalculator.calculateGrade(score);
        var expected = "A";
        assertEquals(expected, actual);
    }


    // TODO: 2 - Test that a score of 85 returns grade "B".
    //  Use assertEquals to verify gradeCalculator.calculateGrade(85) returns "B".
    @Test
    void TODO2() {
        int score = 85;
        var actual = gradeCalculator.calculateGrade(score);
        var expected = "B";
        assertEquals(expected, actual);
    }


    // TODO: 3 - Test that a score of 75 returns grade "C".
    //  Use assertEquals to verify gradeCalculator.calculateGrade(75) returns "C".
    @Test
    void TODO3() {
        int score = 75;
        var actual = gradeCalculator.calculateGrade(score);
        var expected = "C";
        assertEquals(expected, actual);
    }

    // TODO: 4 - Test that a score of 65 returns grade "D".
    //  Use assertEquals to verify gradeCalculator.calculateGrade(65) returns "D".
    @Test
    void TODO4() {
        int score = 65;
        var actual = gradeCalculator.calculateGrade(score);
        var expected = "D";
        assertEquals(expected, actual);
    }

    // TODO: 5 - Test that a score of 50 returns grade "F".
    //  Use assertEquals to verify gradeCalculator.calculateGrade(50) returns "F".
    @Test
    void TODO5() {
        int score = 50;
        var actual = gradeCalculator.calculateGrade(score);
        var expected = "F";
        assertEquals(expected, actual);
    }

    // TODO: 6 - Test boundary values using assertAll.
    //  Test the exact boundary scores where grades change:
    //  Score 90 -> "A", Score 89 -> "B"
    //  Score 80 -> "B", Score 79 -> "C"
    //  Score 70 -> "C", Score 69 -> "D"
    //  Score 60 -> "D", Score 59 -> "F"
    //  Group all assertions in a single assertAll block.

    @Test
    void TODO6() {
        assertAll(
                () -> assertEquals("A", gradeCalculator.calculateGrade(90)),
                () -> assertEquals("B", gradeCalculator.calculateGrade(89)),
                () -> assertEquals("B", gradeCalculator.calculateGrade(80)),
                () -> assertEquals("C", gradeCalculator.calculateGrade(79)),
                () -> assertEquals("C", gradeCalculator.calculateGrade(70)),
                () -> assertEquals("D", gradeCalculator.calculateGrade(69)),
                () -> assertEquals("D", gradeCalculator.calculateGrade(60)),
                () -> assertEquals("F", gradeCalculator.calculateGrade(59)));
    }


    // TODO: 7 - Test that a negative score throws IllegalArgumentException.
    //  Use assertThrows to verify calculateGrade(-1) throws IllegalArgumentException.
    //  Optionally verify the exception message mentions the negative score.

    @Test
    void TODO7() {
        assertThrows(
                IllegalArgumentException.class, () -> gradeCalculator.calculateGrade(-5)
        );
    }


    // TODO: 8 - Test that a score greater than 100 throws IllegalArgumentException.
    //  Use assertThrows to verify calculateGrade(101) throws IllegalArgumentException.
    //  Also test calculateGrade(150) to be thorough.


    @Test
    void TODO8() {
        assertAll(
                () -> assertThrows(
                        IllegalArgumentException.class,
                        () -> gradeCalculator.calculateGrade(101)),
                () -> assertThrows(
                        IllegalArgumentException.class,
                        () -> gradeCalculator.calculateGrade(150)));
    }
}

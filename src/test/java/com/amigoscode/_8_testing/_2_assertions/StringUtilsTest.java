package com.amigoscode._8_testing._2_assertions;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Exercise: JUnit 5 Assertions
 *
 * Practice using different JUnit 5 assertion methods to test the StringUtils class.
 * Each TODO requires a different assertion type.
 */
@DisplayName("StringUtils Tests")
class StringUtilsTest {

    private StringUtils stringUtils;

    @BeforeEach
    void setUp() {
        stringUtils = new StringUtils();
    }

    // TODO: 1 - Test isPalindrome using assertTrue and assertFalse.
    //  Assert that "racecar" is a palindrome (assertTrue).
    //  Assert that "hello" is NOT a palindrome (assertFalse).
    //  Assert that "A man a plan a canal Panama" is a palindrome (assertTrue).

    @Test
    void racecarIsAPalindrome() {
        var actual = stringUtils.isPalindrome("racecar");
        assertTrue(actual);
    }

    @Test
    void helloIsNotAPalindrome() {
        var actual = stringUtils.isPalindrome("hello");
        assertFalse(actual);
    }

    @Test
    void stringIsAPalindromeTrue() {
        var actual = stringUtils.isPalindrome("A man a plan a canal Panama");
        assertTrue(actual);
    }


    // TODO: 2 - Test reverse using assertEquals.
    //  Assert that reversing "hello" returns "olleh".
    //  Assert that reversing "Java" returns "avaJ".
    //  Assert that reversing "" (empty string) returns "".'

    @Test
    void reverseHelloShouldReturnOlleh() {
        var actual = stringUtils.reverse("hello");
        var expected = "olleh";
        assertEquals(expected, actual);
    }

    @Test
    void reverseJavaShouldReturnAvaj() {
        var actual = stringUtils.reverse("Java");
        var expected = "avaJ";
        assertEquals(expected, actual);
    }

    @Test
    void anEmptyStringShouldReturnAnEmptyString() {
        var actual = stringUtils.reverse("");
        var expected = "";
        assertEquals(expected, actual);
    }


    // TODO: 3 - Test capitalize using assertEquals.
    //  Assert that capitalizing "hello" returns "Hello".
    //  Assert that capitalizing "java" returns "Java".
    //  Assert that capitalizing "" (empty string) returns "".

    @Test
    void capitalizingHelloShouldReturnHelloCapitalized() {
        var actual = stringUtils.capitalize("hello");
        var expected = "Hello";
        assertEquals(expected, actual);
    }

    @Test
    void capitalizingJavaShouldReturnJavaCapitalized() {
        var actual = stringUtils.capitalize("java");
        var expected = "Java";
        assertEquals(expected, actual);
    }

    @Test
    void capitalizingAnEmptyStringShouldReturnAnEmptyString() {
        var actual = stringUtils.capitalize("");
        var expected = "";
        assertEquals(expected, actual);
    }

    // TODO: 4 - Test isEmpty with various inputs including a null check.
    //  Assert that isEmpty(null) returns true (assertTrue).
    //  Assert that isEmpty("") returns true.
    //  Assert that isEmpty("   ") returns true (whitespace only).
    //  Assert that isEmpty("hello") returns false (assertFalse).

    @Test
    void TODO4_1() {
        var actual = stringUtils.isEmpty(null);
        assertTrue(actual);
    }

    @Test
    void TODO4_2() {
        var actual = stringUtils.isEmpty("");
        assertTrue(actual);
    }

    @Test
    void TODO4_3() {
        var actual = stringUtils.isEmpty("   ");
        assertTrue(actual);
    }

    @Test
    void TODO4_4() {
        var actual = stringUtils.isEmpty("hello");
        assertFalse(actual);
    }

    // TODO: 5 - Test countVowels using assertEquals.
    //  Assert that countVowels("hello") returns 2.
    //  Assert that countVowels("AEIOU") returns 5.
    //  Assert that countVowels("xyz") returns 0.

    @Test
    void TODO5_1() {
        var actual = stringUtils.countVowels("hello");
        var expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    void TODO5_2() {
        var actual = stringUtils.countVowels("AEIOU");
        var expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    void TODO5_3() {
        var actual = stringUtils.countVowels("xyz");
        var expected = 0;
        assertEquals(expected, actual);
    }


    // TODO: 6 - Use assertAll to group multiple related assertions together.
    //  Group at least 3 assertions about the reverse method into a single assertAll call.
    //  Example: assertAll(
    //      () -> assertEquals("olleh", stringUtils.reverse("hello")),
    //      () -> assertEquals("avaJ", stringUtils.reverse("Java")),
    //      () -> assertEquals("", stringUtils.reverse(""))
    //  );

    @Test
    void TODO6() {
        assertAll(
                      () -> assertEquals("olleh", stringUtils.reverse("hello")),
                      () -> assertEquals("avaJ", stringUtils.reverse("Java")),
                      () -> assertEquals("", stringUtils.reverse(""))
                  );
    }


    // TODO: 7 - Test that passing null input to methods throws IllegalArgumentException.
    //  Use assertThrows to verify that isPalindrome(null) throws IllegalArgumentException.
    //  Use assertThrows to verify that reverse(null) throws IllegalArgumentException.
    //  Use assertThrows to verify that countVowels(null) throws IllegalArgumentException.


    @Test
    void TODO7() {
        assertAll(
                () -> assertThrows(IllegalArgumentException.class, () -> stringUtils.isPalindrome(null)),
                () -> assertThrows(IllegalArgumentException.class, () -> stringUtils.reverse(null)),
                () -> assertThrows(IllegalArgumentException.class, () -> stringUtils.countVowels(null))
        );
    }
}

package com.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EvenNumbersTest {

    private EvenNumbers analyzer;

    @BeforeEach
    void setUp() {
        analyzer = new EvenNumbers();
    }

    @Test
    void testMixedEvenAndOdd() {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        assertEquals(3, analyzer.nrOfEvenNumbers(list), "Should find 3 even numbers (2, 4, 6)");
    }

    @Test
    void testEmptyArray() {
        ArrayList<Integer> list = new ArrayList<>();
        assertEquals(0, analyzer.nrOfEvenNumbers(list), "Empty list should return 0");
    }

    @Test
    void testOnlyEvenNumbers() {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2, 4, 10, 100));
        assertEquals(4, analyzer.nrOfEvenNumbers(list), "Should count all 4 numbers as even");
    }

    @Test
    void testOnlyOddNumbers() {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 3, 7, 11));
        assertEquals(0, analyzer.nrOfEvenNumbers(list), "Should find 0 even numbers");
    }

    @Test
    void testNegativeNumbers() {
        // -2 and -4 are even, -3 is odd
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(-2, -3, -4));
        assertEquals(2, analyzer.nrOfEvenNumbers(list), "Should correctly identify negative even numbers");
    }
}

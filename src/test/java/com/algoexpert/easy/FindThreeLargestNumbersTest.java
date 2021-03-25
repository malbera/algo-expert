package com.algoexpert.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindThreeLargestNumbersTest {

    @Test
    void findThreeLargestNumbers() {
        int [] arr = new int[] {141, 1, 17, -7, -17, -27, 18, 541, 8, 7, 7};

        int[] result = FindThreeLargestNumbers.findThreeLargestNumbers(arr);

        assertArrayEquals(new int[] {18, 141, 541}, result);
    }
}
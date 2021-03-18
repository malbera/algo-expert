package com.algoexpert.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class TwoNumberSumTest {

    @Test
    void twoNumberSum() {
        int[] array = new int[]{3, 5, -4, 8, 11, 1, -1, 6};
        int targetSum = 10;

        int[] result = TwoNumberSum.twoNumberSum(array, targetSum);

        assertArrayEquals(new int[]{-1, 11}, result);
    }
}
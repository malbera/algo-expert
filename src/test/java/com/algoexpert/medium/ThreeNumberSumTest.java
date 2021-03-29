package com.algoexpert.medium;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ThreeNumberSumTest {

    @Test
    void threeNumberSum() {
        int [] arr = new int[] {12, 3, 1, 2, -6, 5, -8, 6};

        List<Integer[]> result = ThreeNumberSum.threeNumberSum(arr, 0);

        assertArrayEquals(new Integer[] {-8, 2, 6}, result.get(0));
        assertArrayEquals(new Integer[] {-8, 3, 5}, result.get(1));
        assertArrayEquals(new Integer[] {-6, 1, 5}, result.get(2));
    }
}
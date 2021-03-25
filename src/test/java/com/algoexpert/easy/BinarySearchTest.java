package com.algoexpert.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {

    @Test
    void binarySearch() {
        int [] arr = new int[] {0, 1, 21, 33, 45, 45, 61, 71, 72, 73};

        int result = BinarySearch.binarySearch(arr, 33);

        assertEquals(3, result);
    }

    @Test
    void binarySearch_1() {
        int [] arr = new int[] {1, 5, 23, 111};

        int result = BinarySearch.binarySearch(arr, 35);

        assertEquals(3, result);
    }
}
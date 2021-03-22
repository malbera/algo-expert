package com.algoexpert.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortedSquaredArrayTest {

    @Test
    void sortedSquaredArray() {
        int [] array = {1, 2, 3, 4 ,5};
        int [] expected = {1, 4, 9, 16, 25};

        int[] result = new SortedSquaredArray().sortedSquaredArray(array);

        assertArrayEquals(expected, result);
    }
}
package com.algoexpert.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {

    @Test
    void bubbleSort() {
        int [] arr = new int[] {8, 5, 2, 9, 5, 6, 3};

        int[] result = BubbleSort.bubbleSort(arr);

        assertArrayEquals(new int[] {2, 3, 5, 5, 6, 8, 9}, result);
    }
}
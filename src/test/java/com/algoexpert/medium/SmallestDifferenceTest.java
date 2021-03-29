package com.algoexpert.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SmallestDifferenceTest {

    @Test
    void smallestDifference() {
        int [] arrOne = new int[] {-1, 5, 10, 20, 28, 3};
        int [] arrTwo = new int[] {26, 134, 135, 15, 17};

        int[] result = SmallestDifference.smallestDifference(arrOne, arrTwo);

        assertArrayEquals(new int[] {28, 26}, result);
    }
}
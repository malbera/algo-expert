package com.algoexpert.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MonotonicArrayTest {

    @Test
    void isMonotonic() {
        int [] arr = new int[] {-1, -5, -10, -1100, -1100, -1101, -1102, -9001};

        boolean result = MonotonicArray.isMonotonic(arr);

        assertTrue(result);
    }
}
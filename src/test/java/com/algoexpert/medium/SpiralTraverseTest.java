package com.algoexpert.medium;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SpiralTraverseTest {

    @Test
    void spiralTraverse() {
        int [][] arr = new int[][] {
                {1, 2, 3, 4},
                {12, 13, 14, 5},
                {11, 16, 15, 6},
                {10, 9, 8, 7},
        };

        List<Integer> result = SpiralTraverse.spiralTraverse(arr);

        assertEquals(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16), result);
    }
}
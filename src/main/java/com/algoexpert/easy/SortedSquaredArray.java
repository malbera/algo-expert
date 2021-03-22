package com.algoexpert.easy;

import java.util.Arrays;

public class SortedSquaredArray {

    public int[] sortedSquaredArray(int[] array) {
        int [] result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = array[i] * array[i];
        }
        Arrays.sort(result);
        return result;
    }
}

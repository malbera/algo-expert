package com.algoexpert.easy;

import java.util.Arrays;

public class TwoNumberSum {

    public static int[] twoNumberSum(int[] array, int targetSum) {
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            int key = Arrays.binarySearch(array, targetSum - array[i]);
            if (key > -1 && key != i) {
                return new int[] {array[i], array[key]};
            }
        }
        return new int[0];
    }

}

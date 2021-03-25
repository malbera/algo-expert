package com.algoexpert.easy;

import java.util.Arrays;

public class FindThreeLargestNumbers {

    public static int[] findThreeLargestNumbers(int[] array) {
        int [] result = new int[] {Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE};
        for (int i : array) {
            if (result[0] < i) {
                result[0] = i;
                Arrays.sort(result);
            }
        }
        return result;
    }
}

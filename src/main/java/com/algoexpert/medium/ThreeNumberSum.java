package com.algoexpert.medium;

import java.util.*;

public class ThreeNumberSum {

    public static List<Integer[]> threeNumberSum(int[] array, int targetSum) {
        Arrays.sort(array);
        List<Integer[]> result = new ArrayList<>();
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                int value = targetSum - array[i] - array[j];
                int search = Arrays.binarySearch(array, value);
                if (search > 0 && array[i] < array[j] && array[j] < array[search]) {
                    result.add(new Integer[]{array[i], array[j], array[search]});
                }
            }
        }
        return result;
    }
}

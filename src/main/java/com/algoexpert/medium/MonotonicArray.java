package com.algoexpert.medium;

public class MonotonicArray {

    public static boolean isMonotonic(int[] array) {
        boolean isDecrease = false;
        boolean isIncrease = false;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] < array[i + 1]) {
                isIncrease = true;
            } else if (array[i] > array[i + 1]) {
                isDecrease = true;
            }
            if (isDecrease && isIncrease) {
                return false;
            }
        }
        return true;
    }

}

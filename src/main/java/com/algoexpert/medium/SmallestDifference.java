package com.algoexpert.medium;

import java.util.Arrays;

public class SmallestDifference {

    public static int[] smallestDifference(int[] arrayOne, int[] arrayTwo) {
        Arrays.sort(arrayOne);
        Arrays.sort(arrayTwo);
        int diff = Integer.MAX_VALUE;
        int x = -1;
        int y = -1;
        for (int i = 0, j = 0; i < arrayOne.length && j < arrayTwo.length;) {
            if (arrayOne[i] == arrayTwo[j]) {
                return new int[] {arrayOne[i], arrayTwo[j]};
            }
            int tempDiff = Math.abs(arrayOne[i] - arrayTwo[j]);
            if (diff > tempDiff) {
                diff = tempDiff;
                x = arrayOne[i];
                y = arrayTwo[j];
            }
            if (arrayOne[i] < arrayTwo[j]) {
                i++;
            } else {
                j++;
            }
        }
        return new int[] {x, y};
    }

}

package com.algoexpert.easy;

public class BinarySearch {

    public static int binarySearch(int[] array, int target) {
        int right = array.length - 1;
        int left = 0;
        while (right >= left) {
            int mid = (right + left) >>> 1;
            if (array[mid] > target) {
                right = mid - 1;
            } else if (array[mid] < target) {
                left = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}

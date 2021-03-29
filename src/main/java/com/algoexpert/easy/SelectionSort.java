package com.algoexpert.easy;

public class SelectionSort {

    public static int[] selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int temp = array[i];
            int idx = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < temp) {
                    temp = array[j];
                    idx = j;
                }
            }
            swap(array, i, idx);
        }
        return array;
    }

    private static void swap(int [] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

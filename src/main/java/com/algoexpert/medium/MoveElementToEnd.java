package com.algoexpert.medium;

import java.util.List;

public class MoveElementToEnd {

    public static List<Integer> moveElementToEnd(List<Integer> array, int toMove) {
        int last = array.size() - 1;
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i).equals(toMove)) {
                last = shiftToEnd(array, i, last, toMove);
            }
        }
        return array;
    }

    private static int shiftToEnd(List<Integer> arr, int left, int right, int toMove) {
        for (int i = right; i > left; i--) {
            if (!arr.get(i).equals(toMove)) {
                swap(arr, left, i);
                return --i;
            }
        }
        return right;
    }

    private static void swap(List<Integer> array, int i, int j) {
        int temp = array.get(i);
        array.set(i, array.get(j));
        array.set(j, temp);
    }

}

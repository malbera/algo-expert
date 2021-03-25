package com.algoexpert.easy;

import java.util.List;

public class ProductSum {

    public static int productSum(List<Object> array) {
        return productSum_(array, 1);
    }

    private static int productSum_(List<Object> array, int level) {
        int sum = 0;
        for (Object o : array) {
            if (o instanceof List) {
                sum += productSum_((List<Object>) o, level + 1);
            } else {
                sum += ((Integer) o);
            }
        }
        return sum * level;
    }
}

package com.algoexpert.easy;

import java.util.Arrays;

public class MinimumWaitingTime {

    public int minimumWaitingTime(int[] queries) {
        Arrays.sort(queries);
        int sum = 0;
        int step = 0;
        for (int i = 0; i < queries.length - 1; i++) {
            step += queries[i];
            sum += step;
        }
        return sum;
    }

}

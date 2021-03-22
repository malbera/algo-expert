package com.algoexpert.easy;

import java.util.Arrays;

public class NonConstructibleChange {

    public int nonConstructibleChange(int[] coins) {
        Arrays.sort(coins);
        int result = 0;
        for (int coin : coins) {
            if (result + 1 < coin) {
                return result + 1;
            } else {
                result += coin;
            }
        }
        return result + 1;
    }

}

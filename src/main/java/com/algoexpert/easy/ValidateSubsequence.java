package com.algoexpert.easy;

import java.util.List;

public class ValidateSubsequence {

    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
        int seq = 0;
        for (Integer a : array) {
            if (seq == sequence.size()) {
                break;
            }
            if (sequence.get(seq).equals(a)) {
                seq++;
            }
        }
        return seq == sequence.size();
    }

}

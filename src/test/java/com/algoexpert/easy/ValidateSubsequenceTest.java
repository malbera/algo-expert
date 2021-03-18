package com.algoexpert.easy;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ValidateSubsequenceTest {

    @Test
    void isValidSubsequence() {
        List<Integer> array = List.of(5, 1, 22, 25, 6, -1, 8, -1);
        List<Integer> sequence = List.of(1, 6, -1, -1);

        boolean result = ValidateSubsequence.isValidSubsequence(array, sequence);

        assertTrue(result);
    }
}
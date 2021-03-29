package com.algoexpert.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeCheckTest {

    @Test
    void isPalindrome() {
        String str = "abcdcba";

        boolean result = PalindromeCheck.isPalindrome(str);

        assertTrue(result);
    }
}
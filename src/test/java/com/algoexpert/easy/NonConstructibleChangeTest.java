package com.algoexpert.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NonConstructibleChangeTest {

    @Test
    void nonConstructibleChange() {
        int [] array = {5, 7, 1, 1, 2, 3, 22};

        int result = new NonConstructibleChange().nonConstructibleChange(array);

        assertEquals(20, result);
    }
}
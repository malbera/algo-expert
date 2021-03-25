package com.algoexpert.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NthFibonacciTest {

    @Test
    void getNthFib_two() {
        int result = NthFibonacci.getNthFib(2);

        assertEquals(1, result);
    }

    @Test
    void getNthFib_six() {
        int result = NthFibonacci.getNthFib(6);

        assertEquals(5, result);
    }

    @Test
    void getNthFib_seven() {
        int result = NthFibonacci.getNthFib(7);

        assertEquals(8, result);
    }

    @Test
    void getNthFib_three() {
        int result = NthFibonacci.getNthFib(3);

        assertEquals(1, result);
    }
}
package com.algoexpert.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumWaitingTimeTest {

    @Test
    void minimumWaitingTime() {
        MinimumWaitingTime minWaitTime = new MinimumWaitingTime();

        int result = minWaitTime.minimumWaitingTime(new int[]{3, 2, 1, 2, 6});

        assertEquals(17, result);
    }
}
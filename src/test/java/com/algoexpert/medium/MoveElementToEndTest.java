package com.algoexpert.medium;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MoveElementToEndTest {

    @Test
    void moveElementToEnd() {
        List<Integer> integers = Arrays.asList(2, 1, 2, 2, 2, 3, 4, 2);

        List<Integer> result = MoveElementToEnd.moveElementToEnd(integers, 2);

        assertEquals(Arrays.asList(4, 3, 1, 2, 2, 2, 2, 2), result);
    }

    @Test
    void moveElementToEnd_() {
        List<Integer> integers = Arrays.asList(5, 1, 2, 5, 5, 3, 4, 6, 7, 5, 8, 9, 10, 11, 5, 5, 12);

        List<Integer> result = MoveElementToEnd.moveElementToEnd(integers, 5);

        assertEquals(Arrays.asList(12, 1, 2, 11, 10, 3, 4, 6, 7, 9, 8, 5, 5, 5, 5, 5, 5), result);
    }

}
package com.algoexpert.easy;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ClassPhotosTest {

    @Test
    void classPhotos() {
        ArrayList<Integer> reds = new ArrayList<>(Arrays.asList(5, 8, 1, 3, 4));
        ArrayList<Integer> blues = new ArrayList<>(Arrays.asList(6, 9, 2, 4, 5));

        boolean result = new ClassPhotos().classPhotos(reds, blues);

        assertTrue(result);
    }
}
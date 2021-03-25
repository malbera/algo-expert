package com.algoexpert.easy;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ProductSumTest {

    @Test
    void productSum() {
        List<Object> products = prepareTest();

        int result = ProductSum.productSum(products);

        assertEquals(12, result);
    }

    private List<Object> prepareTest() {
        return Arrays.asList(5, 2, Arrays.asList(7, -1), 3, Arrays.asList(6, Arrays.asList(-13, 8), 4));
    }
}
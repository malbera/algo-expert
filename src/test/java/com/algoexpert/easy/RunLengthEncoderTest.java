package com.algoexpert.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RunLengthEncoderTest {

    @Test
    void runLengthEncoding() {
        String str = "AAAAAAAAAAAAABBCCCCDD";

        String result = new RunLengthEncoder().runLengthEncoding(str);

        assertEquals("9A4A2B4C2D", result);
    }
}
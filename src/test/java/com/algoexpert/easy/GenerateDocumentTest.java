package com.algoexpert.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GenerateDocumentTest {

    @Test
    void generateDocument() {
        String chars = "Bste!hetsi ogEAxpelrt x ";
        String doc = "AlgoExpert is the Best!";

        boolean result = new GenerateDocument().generateDocument(chars, doc);

        assertTrue(result);
    }
}
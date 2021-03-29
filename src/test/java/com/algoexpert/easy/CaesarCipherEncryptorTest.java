package com.algoexpert.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CaesarCipherEncryptorTest {

    @Test
    void caesarCypherEncryptor() {
        String str = "xyz";

        String result = CaesarCipherEncryptor.caesarCypherEncryptor(str, 2);

        assertEquals("zab", result);
    }
}
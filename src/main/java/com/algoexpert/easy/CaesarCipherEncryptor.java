package com.algoexpert.easy;

public class CaesarCipherEncryptor {

    public static String caesarCypherEncryptor(String str, int key) {
        int temp = key % 26;
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            char next;
            if (c + temp > 122) {
                next = (char) (c + temp - 26);
            } else {
                next = (char) (c + temp);
            }
            sb.append(next);
        }
        return sb.toString();
    }

}

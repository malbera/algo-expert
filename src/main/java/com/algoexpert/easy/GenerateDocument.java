package com.algoexpert.easy;

public class GenerateDocument {

    public boolean generateDocument(String characters, String document) {
        int [] charCount = new int[65535];
        for (char c : characters.toCharArray()) {
            charCount[c]++;
        }
        for (char c : document.toCharArray()) {
            if (--charCount[c] < 0) {
                return false;
            }
        }
        return true;
    }
}

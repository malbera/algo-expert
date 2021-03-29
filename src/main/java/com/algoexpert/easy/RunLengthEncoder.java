package com.algoexpert.easy;

public class RunLengthEncoder {

    public String runLengthEncoding(String string) {
        int count = 1;
        int length = string.length() - 1;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            if (string.charAt(i) == string.charAt(i + 1) && count < 9) {
                count++;
            } else {
                sb.append(count)
                  .append(string.charAt(i));
                count = 1;
            }
        }
        sb.append(count)
                .append(string.charAt(length));
        return sb.toString();
    }
}

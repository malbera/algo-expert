package com.algoexpert.medium;

import java.util.ArrayList;
import java.util.List;

public class SpiralTraverse {

    public static List<Integer> spiralTraverse(int[][] array) {
        List<Integer> result = new ArrayList<>();
        int rowe = array.length - 1;
        int rows = 0;
        int cole = array[0].length - 1;
        int cols = 0;
        while (rows <= rowe && cols <= cole) {
            for (int x = cols; x <= cole; x++) {
                result.add(array[rows][x]);
            }
            for (int y = rows + 1; y <= rowe; y++) {
                result.add(array[y][cole]);
            }
            for (int x = cole - 1; x >= cols; x--) {
                if (rowe == rows ) break;
                result.add(array[rowe][x]);
            }
            for (int y = rowe - 1; y > rows; y--) {
                if (cols == cole) break;
                result.add(array[y][cols]);
            }
            rowe--;
            rows++;
            cole--;
            cols++;
        }
        return result;
    }


}

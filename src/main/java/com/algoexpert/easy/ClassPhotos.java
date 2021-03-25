package com.algoexpert.easy;

import java.util.ArrayList;
import java.util.Collections;

public class ClassPhotos {

    public boolean classPhotos(ArrayList<Integer> redShirtHeights,
                               ArrayList<Integer> blueShirtHeights) {
        Collections.sort(redShirtHeights);
        Collections.sort(blueShirtHeights);
        int size = blueShirtHeights.size() - 1;
        boolean isBlueOnBack = blueShirtHeights.get(size).compareTo(redShirtHeights.get(size)) >= 0;
        for (int i = 0; i < blueShirtHeights.size(); i++) {
            boolean isBlueHigher = blueShirtHeights.get(i).compareTo(redShirtHeights.get(i)) > 0;
            if (isBlueOnBack && !isBlueHigher || !isBlueOnBack && isBlueHigher) {
                return false;
            }
        }
        return true;
    }
}

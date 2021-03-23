package com.algoexpert.easy;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DepthFirstSearchTest {

    @Test
    void depthFirstSearch() {
        DepthFirstSearch.Node root = prepareTest();
        List<String> result = new ArrayList<>();
        List<String> expected = Arrays.asList("A", "B", "E", "F", "I", "J", "C", "D", "G", "K", "H");

        root.depthFirstSearch(result);

        assertEquals(expected, result);
    }

    private DepthFirstSearch.Node prepareTest() {
        DepthFirstSearch.Node root = new DepthFirstSearch.Node("A");
        root.addChild("B");
        DepthFirstSearch.Node b = root.children.get(0);
        b.addChild("E");
        b.addChild("F");
        DepthFirstSearch.Node f = b.children.get(1);
        f.addChild("I");
        f.addChild("J");
        root.addChild("C");
        root.addChild("D");
        DepthFirstSearch.Node d = root.children.get(2);
        d.addChild("G");
        DepthFirstSearch.Node g = d.children.get(0);
        g.addChild("K");
        d.addChild("H");
        return root;
    }

}
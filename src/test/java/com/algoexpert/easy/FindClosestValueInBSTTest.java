package com.algoexpert.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindClosestValueInBSTTest {

    @Test
    void findClosestValueInBst() {
        FindClosestValueInBST.BST tree = prepareTree();
        int target = 12;

        int result = FindClosestValueInBST.findClosestValueInBst(tree, target);

        assertEquals(13, result);
    }

    private FindClosestValueInBST.BST prepareTree() {
        FindClosestValueInBST.BST bst = prepareTree_(10);
        bst.left = prepareTree_(5);
        bst.right = prepareTree_(15);
        bst.right.right = prepareTree_(22);
        bst.right.left = prepareTree_(13);
        bst.right.left.right = prepareTree_(14);
        return bst;
    }

    private FindClosestValueInBST.BST prepareTree_(int val) {
        return new FindClosestValueInBST.BST(val);
    }

}
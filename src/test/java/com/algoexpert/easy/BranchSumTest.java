package com.algoexpert.easy;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BranchSumTest {

    @Test
    void branchSums() {
        BranchSum.BinaryTree tree = prepareTree();

        List<Integer> result = BranchSum.branchSums(tree);

        assertEquals(Arrays.asList(15, 16, 18, 10, 11), result);
    }

    private BranchSum.BinaryTree prepareTree() {
        BranchSum.BinaryTree tree = prepareTree_(1);
        tree.left = prepareTree_(2);
        tree.right = prepareTree_(3);
        tree.left.left = prepareTree_(4);
        tree.left.right = prepareTree_(5);
        tree.left.left.left = prepareTree_(8);
        tree.left.left.right = prepareTree_(9);
        tree.left.right.left = prepareTree_(10);
        tree.right.left = prepareTree_(6);
        tree.right.right = prepareTree_(7);
        return tree;
    }

    private BranchSum.BinaryTree prepareTree_(int val) {
        return new BranchSum.BinaryTree(val);
    }
}
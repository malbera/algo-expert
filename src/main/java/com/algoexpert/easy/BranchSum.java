package com.algoexpert.easy;

import java.util.ArrayList;
import java.util.List;

public class BranchSum {

    public static List<Integer> branchSums(BinaryTree root) {
        List<Integer> result = new ArrayList<>();
        branchSums_(root, result, root.value);
        return result;
    }

    private static void branchSums_(BinaryTree tree, List<Integer> result, int sum) {
        if (tree.left == null && tree.right == null) {
            result.add(sum);
            return;
        }
        if (tree.left != null) {
            branchSums_(tree.left, result, sum + tree.left.value);
        }
        if (tree.right != null) {
            branchSums_(tree.right, result, sum + tree.right.value);
        }
    }

    public static class BinaryTree {
        int value;
        BinaryTree left;
        BinaryTree right;

        BinaryTree(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }
}

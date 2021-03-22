package com.algoexpert.easy;

public class FindClosestValueInBST {

    public static int findClosestValueInBst(BST tree, int target) {
        return findClosestValueInBst_(tree, target, tree.value);
    }

    private static int findClosestValueInBst_(BST tree, int target, int result) {
        if (Math.abs(result - target) > Math.abs(tree.value - target)) {
            result = tree.value;
        }
        if (tree.value < target && tree.right != null) {
            return findClosestValueInBst_(tree.right, target, result);
        } else if (tree.value > target && tree.left != null) {
            return findClosestValueInBst_(tree.left, target, result);
        } else {
            return result;
        }
    }

    static class BST {
        public int value;
        public BST left;
        public BST right;

        public BST(int value) {
            this.value = value;
        }
    }


}

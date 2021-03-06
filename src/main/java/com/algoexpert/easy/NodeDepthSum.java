package com.algoexpert.easy;

public class NodeDepthSum {

    public static int nodeDepths(BinaryTree root) {
        return nodeDepths_(root, 0);
    }

    private static int nodeDepths_(BinaryTree node, int depth) {
        if (node == null) {
            return 0;
        }
        return depth + nodeDepths_(node.left, depth + 1) + nodeDepths_(node.right, depth + 1);
    }

    static class BinaryTree {
        int value;
        BinaryTree left;
        BinaryTree right;

        public BinaryTree(int value) {
            this.value = value;
            left = null;
            right = null;
        }
    }


}

package com.algoexpert.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NodeDepthSumTest {

    @Test
    void nodeDepths() {
        NodeDepthSum.BinaryTree tree = prepareTree();

        int result = NodeDepthSum.nodeDepths(tree);

        assertEquals(16, result);
    }

    private NodeDepthSum.BinaryTree prepareTree() {
        NodeDepthSum.BinaryTree tree = prepareTree_(1);
        tree.left = prepareTree_(2);
        tree.right = prepareTree_(3);
        tree.left.left = prepareTree_(4);
        tree.left.right = prepareTree_(5);
        tree.left.left.left = prepareTree_(8);
        tree.left.left.right = prepareTree_(9);
        tree.right.left = prepareTree_(6);
        tree.right.right = prepareTree_(7);
        return tree;
    }

    private NodeDepthSum.BinaryTree prepareTree_(int val) {
        return new NodeDepthSum.BinaryTree(val);
    }
}
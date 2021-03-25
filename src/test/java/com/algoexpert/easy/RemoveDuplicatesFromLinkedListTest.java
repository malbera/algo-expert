package com.algoexpert.easy;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicatesFromLinkedListTest {

    @Test
    void removeDuplicatesFromLinkedList() {
        RemoveDuplicatesFromLinkedList.LinkedList root = prepareTest();
        List<Integer> expected = Arrays.asList(1, 3, 4, 5, 6);

        RemoveDuplicatesFromLinkedList.LinkedList result = new RemoveDuplicatesFromLinkedList().removeDuplicatesFromLinkedList(root);

        assertEquals(expected, toIntArray(result));
    }

    private RemoveDuplicatesFromLinkedList.LinkedList prepareTest() {
        RemoveDuplicatesFromLinkedList.LinkedList root = new RemoveDuplicatesFromLinkedList.LinkedList(1);
        RemoveDuplicatesFromLinkedList.LinkedList node1 = prepareNode(root, 1);
        RemoveDuplicatesFromLinkedList.LinkedList node2 = prepareNode(node1, 3);
        RemoveDuplicatesFromLinkedList.LinkedList node3 = prepareNode(node2, 4);
        RemoveDuplicatesFromLinkedList.LinkedList node4 = prepareNode(node3, 4);
        RemoveDuplicatesFromLinkedList.LinkedList node5 = prepareNode(node4, 4);
        RemoveDuplicatesFromLinkedList.LinkedList node6 = prepareNode(node5, 5);
        RemoveDuplicatesFromLinkedList.LinkedList node7 = prepareNode(node6, 6);
        RemoveDuplicatesFromLinkedList.LinkedList node8 = prepareNode(node7, 6);
        return root;
    }

    private RemoveDuplicatesFromLinkedList.LinkedList prepareNode(RemoveDuplicatesFromLinkedList.LinkedList node, int val) {
        RemoveDuplicatesFromLinkedList.LinkedList next = new RemoveDuplicatesFromLinkedList.LinkedList(val);
        node.next = next;
        return next;
    }

    private List<Integer> toIntArray(RemoveDuplicatesFromLinkedList.LinkedList list) {
        List<Integer> result = new ArrayList<>();
        while (list != null) {
            result.add(list.value);
            list = list.next;
        }
        return result;
    }
}
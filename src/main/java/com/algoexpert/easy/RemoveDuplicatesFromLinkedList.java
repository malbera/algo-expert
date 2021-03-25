package com.algoexpert.easy;

public class RemoveDuplicatesFromLinkedList {

    public static class LinkedList {
        public int value;
        public LinkedList next;

        public LinkedList(int value) {
            this.value = value;
            this.next = null;
        }
    }

    public LinkedList removeDuplicatesFromLinkedList(LinkedList linkedList) {
        LinkedList current = linkedList;
        LinkedList next = current.next;
        while (next != null) {
            current.next = null;
            if (current.value != next.value) {
                current.next = next;
                current = next;
            }
            next = next.next;
        }
        return linkedList;
    }


}

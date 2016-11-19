package com.rafalsladek.linkedlists;

import java.util.HashSet;

class RemoveDuplicates {

    static SingleWayLinkedList removeDuplicatesWithBuffer(SingleWayLinkedList inputList) {
        HashSet<Integer> uniqueElements = new HashSet<>();
        Node current = inputList.head;

        while (current.next != null) {
            if (uniqueElements.contains(current.data)) {
                current = inputList.remove(current);
            } else {
                uniqueElements.add(current.data);
            }
        }
        return inputList;
    }
}

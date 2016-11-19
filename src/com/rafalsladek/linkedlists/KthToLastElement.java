package com.rafalsladek.linkedlists;

public class KthToLastElement {

    /***
     * Big O(n)
     * @param inputList
     * @param kOffsetToLastNode
     * @return
     */
    static Node getKthToLastElement(SingleWayLinkedList inputList, int kOffsetToLastNode) {
        // find last element by iterating to the end
        // iterating k elements behind the first index.
        // return K-th Node or null if Node not in the list

        int startIndexForK = 0 - kOffsetToLastNode;
        boolean foundLastElement = false;
        Node current = inputList.head;
        if (current == null) {
            return null;
        }
        Node kthNode = inputList.head;

        while (!foundLastElement) {
            if (startIndexForK > 0) {
                kthNode = kthNode.next;
            }

            foundLastElement = current.next == null;
            if (!foundLastElement) {
                current = current.next;
                startIndexForK++;
            }
        }
        return kthNode;
    }
}

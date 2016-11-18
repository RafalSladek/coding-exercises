package com.rafalsladek.linkedlists;

public class SingleWayLinkedList {

    public Node head;

    public SingleWayLinkedList() {
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void add(Node succesorNode) {
        if (isEmpty()) {
            head = succesorNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = succesorNode;
        }
    }

    public void remove(Node nodeToRemove) {
        if (nodeToRemove.next != null) {
            nodeToRemove.data = nodeToRemove.next.data;
            nodeToRemove.next = nodeToRemove.next.next;
        } else {
            head = null;
        }
    }
}


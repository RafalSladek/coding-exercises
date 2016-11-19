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

    @Override
    public boolean equals(Object obj) {
        SingleWayLinkedList that = (SingleWayLinkedList) obj;

        Node currentThis = this.head;
        Node currentThat = that.head;

        boolean result = true;

        // itetate over both lists till first node pair is not equal.
        while (result) {
            if (currentThis == null && currentThat == null) {
                return true;
            } else if (currentThis != null && currentThat != null && currentThis.equals(currentThat)) {
                currentThis = currentThis.next;
                currentThat = currentThat.next;
            } else {
                result = false;
            }
        }

        return result;
    }

    /**
     * @param nodeToRemove
     * @return Next node to the given or the given if last null
     */
    public Node remove(Node nodeToRemove) {
        if (nodeToRemove.next != null) {
            nodeToRemove.data = nodeToRemove.next.data;
            nodeToRemove.next = nodeToRemove.next.next;
        } else {
            nodeToRemove = null;
            head = nodeToRemove;
        }
        return nodeToRemove;
    }
}


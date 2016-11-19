package com.rafalsladek.linkedlists;

class Node {
    Node next;
    int data;

    Node(int data) {
        this.data = data;
        this.next = null;
    }

    @Override
    public boolean equals(Object obj) {
        return this.data == ((Node) obj).data;
    }

    @Override
    public String toString() {
        return String.valueOf(data);
    }
}

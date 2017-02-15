package com.rafalsladek.others;

public class RainDropLinkedList {

    RainDropNode top;

    public RainDropLinkedList() {

    }

    public void add(RainDropNode node) {
        if (top == null) {
            top = node;
        }


        RainDropNode current = top;

        while (current.data.start < node.data.start) {
            if (current.next == null) {
                current.next = node;
            } else {
                current = current.next;
            }
        }

        if (current.data.equals(node.data)) return;

        RainDropNode temp = current.next;
        current.next = node;
        node.next = temp;
    }

    @Override
    public String toString() {
        RainDropNode current = top;
        StringBuilder sb = new StringBuilder();
        while (current.next != null) {
            sb.append(current.toString());
        }
        return sb.toString();
    }
}

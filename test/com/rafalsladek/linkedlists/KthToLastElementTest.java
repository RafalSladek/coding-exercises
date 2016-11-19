package com.rafalsladek.linkedlists;

import org.junit.Test;

import static org.junit.Assert.*;

public class KthToLastElementTest {
    @Test
    public void getKthToLastElement() throws Exception {

        SingleWayLinkedList list = new SingleWayLinkedList();
        list.add(new Node(1));
        list.add(new Node(2));
        list.add(new Node(3));
        list.add(new Node(4));
        list.add(new Node(5));
        list.add(new Node(6));

        Node kth = KthToLastElement.getKthToLastElement(list, 3);
        assertTrue(kth.equals(new Node(3)));
    }

}
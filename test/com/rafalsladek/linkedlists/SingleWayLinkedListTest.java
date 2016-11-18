package com.rafalsladek.linkedlists;

import org.junit.Test;

import static org.junit.Assert.*;

public class SingleWayLinkedListTest {
    @Test
    public void isEmpty() throws Exception {
        SingleWayLinkedList list = new SingleWayLinkedList();
        assertTrue(list.isEmpty());
        Node node1 = new Node(1);
        list.add(node1);
        list.remove(node1);
        assertTrue(list.isEmpty());
    }

    @Test
    public void add() throws Exception {
        SingleWayLinkedList input = new SingleWayLinkedList();
        Node first = new Node(1);
        Node second = new Node(2);
        input.add(first);
        input.add(second);

        assertEquals(input.head, first);
        assertEquals(input.head.next, second);
    }

    @Test
    public void remove() throws Exception {
        SingleWayLinkedList input = new SingleWayLinkedList();
        Node first = new Node(1);
        Node second = new Node(2);
        input.add(first);
        input.add(second);

        input.remove(first);
        assertEquals(input.head.data, second.data);
        input.remove(second);
        assertEquals(input.head, null);

    }

}
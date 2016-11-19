package com.rafalsladek.linkedlists;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class RemoveDuplicatesTest {
    @Test
    public void removeDuplicatesWithBuffer() throws Exception {
        SingleWayLinkedList list = new SingleWayLinkedList();
        list.add(new Node(2));
        list.add(new Node(2));
        SingleWayLinkedList actually = RemoveDuplicates.removeDuplicatesWithBuffer(list);
        SingleWayLinkedList expected = new SingleWayLinkedList();
        expected.add(new Node(2));
        assertTrue(expected.equals(actually));
    }
}
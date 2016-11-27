package com.rafalsladek.sortingAndSearching;

import org.junit.Test;

import static org.junit.Assert.*;

public class BinarySearchTest {
    @Test
    public void binarySearchRecursively() throws Exception {

        int[] input = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int x = 9;

        assertTrue(BinarySearch.binarySearchRecursively(input, x));
    }

}
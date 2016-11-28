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

    @Test
    public void binarySearchIterative() throws Exception {

        int[] input = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int x = 9;

        assertTrue(BinarySearch.binarySearchIterative(input, x));
    }

    @Test(timeout = 50)
    public void binarySearchRecursivelyBig() throws Exception {
        int k = 1000000;
        int[] input = new int[k];

        for (int i = 0; i < k; i++) {
            input[i] = i + 1;
        }
        int x = 1;

        assertTrue(BinarySearch.binarySearchRecursively(input, x));
    }

    @Test(timeout = 50)
    public void binarySearchIterativeBig() throws Exception {
        int k = 1000000;
        int[] input = new int[k];

        for (int i = 0; i < k; i++) {
            input[i] = i + 1;
        }
        int x = 1;

        assertTrue(BinarySearch.binarySearchIterative(input, x));
    }

}
package com.rafalsladek.sortingAndSearching;

import org.junit.Test;

import static org.junit.Assert.*;

public class BubbleSortTest {
    @Test
    public void bubbleSort() throws Exception {
        int[] input = {4, 2, 6, 7, 3};
        int[] expected = {2, 3, 4, 6, 7};
        BubbleSort.bubbleSort(input);
        assertArrayEquals(expected, input);
    }


    @Test(timeout = 5000)
    public void bubbleSortBig() {
        int k = 100000;
        int[] input = new int[k];

        for (int i = 0; i < k; i++) {
            input[i] = k - 1 - i;
        }

        int[] expected = new int[k];
        for (int i = 0; i < k; i++) {
            expected[i] = i;
        }
        BubbleSort.bubbleSort(input);
        assertArrayEquals(expected, input);
    }

}
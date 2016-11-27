package com.rafalsladek.sortingAndSearching;

import org.junit.Test;

import static org.junit.Assert.*;

public class QuickSortTest {

    @Test
    public void quickSort3Ele() throws Exception {
        int[] input = {3, 2, 1};
        int[] expected = {1, 2, 3};
        QuickSort.quickSort(input, 0, input.length - 1);
        assertArrayEquals(expected, input);
    }


    @Test
    public void quickSort2Ele() throws Exception {
        int[] input = {2, 1};
        int[] expected = {1, 2};
        QuickSort.quickSort(input, 0, input.length - 1);
        assertArrayEquals(expected, input);
    }

}
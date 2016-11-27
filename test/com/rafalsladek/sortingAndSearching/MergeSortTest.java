package com.rafalsladek.sortingAndSearching;

import org.junit.Test;

import static org.junit.Assert.*;

public class MergeSortTest {

    @Test
    public void mergeSort2Numbers() throws Exception {
        int[] inputArray = {4, 3,};
        int[] expectedArray = {3, 4};
        int[] actuallyArray = MergeSort.solution(inputArray);
        assertArrayEquals(expectedArray, actuallyArray);
    }

    @Test
    public void mergeSort3Numbers() throws Exception {
        int[] inputArray = {4, 2, 3,};
        int[] expectedArray = {2, 3, 4};
        int[] actuallyArray = MergeSort.solution(inputArray);
        assertArrayEquals(expectedArray, actuallyArray);
    }

    @Test
    public void mergeSort100kNumbers() throws Exception {
        int k = 100000;
        int[] inputArray = new int[k];

        for (int i = 0; i < k; i++) {
            inputArray[i] = k - 1 - i;
        }

        int[] expectedArray = new int[k];
        for (int i = 0; i < k; i++) {
            expectedArray[i] = i;
        }

        int[] actuallyArray = MergeSort.solution(inputArray);
        assertArrayEquals(expectedArray, actuallyArray);
    }
}
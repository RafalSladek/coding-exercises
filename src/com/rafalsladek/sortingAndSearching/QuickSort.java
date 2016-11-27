package com.rafalsladek.sortingAndSearching;

import com.rafalsladek.arraysAndStrings.Tools;

public class QuickSort {
    /***
     * Quicksort O(N logN) avarage - O(n^2) if pivot is always the very left element.
     * 1. choose pivot. median is quite good choice.
     * 2. sort the partition
     * 3. run recursively for left side and for the right side of the array
     * @param array
     * @param left
     * @param right
     */
    public static void quickSort(int[] array, int left, int right) {
        if (left < right) {
            int pivot = array[(left + right) / 2];
            int index = partition(array, left, right, pivot);
            quickSort(array, left, index - 1);
            quickSort(array, index, right);
        }

    }

    private static int partition(int[] array, int left, int right, int pivot) {

        while (left <= right) {
            while (array[left] < pivot) {
                left++;
            }
            while (array[right] > pivot) {
                right--;
            }

            if (left <= right) {
                Tools.swap(array, left, right);
                left++;
                right--;
            }
        }
        return left;
    }
}

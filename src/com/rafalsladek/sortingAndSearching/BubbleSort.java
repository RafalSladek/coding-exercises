package com.rafalsladek.sortingAndSearching;


import com.rafalsladek.arraysAndStrings.Tools;

public class BubbleSort {

    /***
     * BubbleSort is naive sorting algorithm. It can not distinguish between sorted and not sorted input.
     * Time : O(n^2)
     * Space: O(1)
     * Link - https://www.youtube.com/watch?v=6Gv8vg0kcHc
     * @param array
     */
    public static void bubbleSort(int[] array) {
        boolean isSorted = false;

        // optimization, after each iteration of the while loop,
        // the very right element is sorted. To skip it we reduce the limit of the for loop.
        int lastUnsorted = array.length - 1;

        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < lastUnsorted; i++) {
                if (array[i] > array[i + 1]) {
                    Tools.swap(array, i, i + 1);
                    isSorted = false;
                }
            }
            lastUnsorted--;
        }
    }
}

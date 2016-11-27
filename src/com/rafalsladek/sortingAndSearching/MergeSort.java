package com.rafalsladek.sortingAndSearching;

public class MergeSort {

    public static int[] solution(int[] array) {
        int[] result = new int[array.length];
        mergeSort(array, result, 0, array.length - 1);
        return array;
    }

    /***
     * MergeSort is splitting recursively array into two halves and then he merge
     * Time : O(N logN)
     * Space : O(N)
     * link - https://www.youtube.com/watch?v=KF2j-9iSf4Q
     * @param array
     * @param temp
     * @param leftStart
     * @param rightEnd
     */
    private static void mergeSort(int[] array, int[] temp, int leftStart, int rightEnd) {
        if (leftStart < rightEnd) {
            int middle = (leftStart + rightEnd) / 2;
            mergeSort(array, temp, leftStart, middle);
            mergeSort(array, temp, middle + 1, rightEnd);
            mergeHalves(array, temp, leftStart, middle, rightEnd);
        }
    }

    private static void mergeHalves(int[] array, int[] temp, int leftStart, int middle, int rightEnd) {
        int leftEnd = middle;
        int rightStart = middle + 1;

        int left = leftStart;
        int right = rightStart;
        int index = leftStart;

        while (left <= leftEnd && right <= rightEnd) {
            if (array[left] <= array[right]) {
                temp[index] = array[left];
                left++;
            } else {
                temp[index] = array[right];
                right++;
            }
            index++;
        }

        // copy remaining left side array items
        int remaining = middle - left;
        for (int i = 0; i <= remaining; i++) {
            temp[index + i] = array[left + i];
        }

        // copy remaining right side array items
        remaining = rightEnd - right;
        for (int i = 0; i <= remaining; i++) {
            temp[index + i] = array[right + i];
        }


        // copy temp into array
        for (int i = leftStart; i <= rightEnd; i++) {
            array[i] = temp[i];
        }
    }
}

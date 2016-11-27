package com.rafalsladek.sortingAndSearching;

public class BinarySearch {

    /***
     * BinarySearch
     * Time: O(logN)
     * Space: O(1)
     * @param array
     * @param x
     * @return
     */
    public static boolean binarySearchRecursively(int[] array, int x) {
        return binarySearchRecursively(array, x, 0, array.length - 1);
    }

    private static boolean binarySearchRecursively(int[] array, int x, int left, int right) {
        if (left > right) {
            return false;
        }

        // Optimization : it helps to avoid overflow on integer
        int mid = left + ((right - left) / 2);

        // normal mid value
        int mid2 = (right + left) / 2;

        if (array[mid] == x) {
            return true;
        } else if (x < array[mid]) {
            return binarySearchRecursively(array, x, left, mid - 1);
        } else {
            return binarySearchRecursively(array, x, mid + 1, right);
        }
    }
}

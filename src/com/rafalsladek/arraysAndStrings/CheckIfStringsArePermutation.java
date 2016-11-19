package com.rafalsladek.arraysAndStrings;

import java.util.HashSet;


class CheckIfStringsArePermutation {

    /**
     * Big O(n*m)
     * @param first
     * @param second
     * @return
     */
    static boolean checkIfTwoStringsArePermutation(String first, String second) {
        if (first.length() != second.length()) {
            return false;
        }

        char[] firstArray = first.toCharArray();
        char[] secondArray = second.toCharArray();
        HashSet<String> firstMap = new HashSet<String>();

        for (int i = 0; i < firstArray.length; i++) {
            firstMap.add(String.valueOf(firstArray[i]));
        }
        for (int i = 0; i < secondArray.length; i++) {
            if (!firstMap.remove(String.valueOf(secondArray[i]))) {
                return false;
            }
        }
        return firstMap.isEmpty();
    }
}

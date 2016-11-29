package com.rafalsladek.arraysAndStrings;

import java.util.HashSet;


public class CheckIfStringsArePermutation {

    /**
     * Big O(n*m)
     * @param first
     * @param second
     * @return
     */
    public static boolean checkIfTwoStringsArePermutation(String first, String second) {
        if (first.length() != second.length()) {
            return false;
        }

        char[] firstArray = first.toCharArray();
        char[] secondArray = second.toCharArray();
        HashSet<String> firstMap = new HashSet<String>();

        for (char aFirstArray : firstArray) {
            firstMap.add(String.valueOf(aFirstArray));
        }
        for (char aSecondArray : secondArray) {
            if (!firstMap.remove(String.valueOf(aSecondArray))) {
                return false;
            }
        }
        return firstMap.isEmpty();
    }
}

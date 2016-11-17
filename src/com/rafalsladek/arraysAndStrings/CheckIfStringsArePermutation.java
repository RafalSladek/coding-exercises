package com.rafalsladek.arraysAndStrings;

import java.util.HashSet;


public class CheckIfStringsArePermutation {

    public static boolean checkIfTwoStringsArePermutation(String first, String second){
        if (first.length() != second.length()){
            return false;
        }

        char[] firstArray = first.toCharArray();
        char[] secondArray = second.toCharArray();
        HashSet<String> firstMap = new HashSet<String>();

        for (int i = 0; i < firstArray.length; i++) {
            firstMap.add(String.valueOf(firstArray[i]));
        }
        for (int i = 0; i < secondArray.length; i++) {
            if (!firstMap.remove(String.valueOf(secondArray[i]))){
                return false;
            }
        }
        return firstMap.isEmpty();
    }


}

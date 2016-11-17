package com.rafalsladek.arraysAndStrings;

import java.util.Arrays;

public class HasStringUniqueChars {

    public static boolean hasAllUniqueCharacters(final String input) {

        char[] inputArray = input.toCharArray();
        int[] numArray = new int[inputArray.length];
        for (int i = 0; i < inputArray.length; i++) {
            numArray[i] = (int) inputArray[i];
        }
        Arrays.sort(numArray);
        int xorComperator = 0;

        for (int i = 0; i < numArray.length; i++) {
            xorComperator = xorComperator ^ numArray[i];
            System.out.println(xorComperator);
            if(xorComperator == 0){
                return true;
            }else{
                xorComperator = numArray[i];
            }
        }
        return xorComperator == 0;
    }
}

package com.rafalsladek.arraysAndStrings;

import java.util.Arrays;
import java.util.HashSet;

public class HasStringUniqueChars {

    /**
     * Using xor operator we proof if there is any duplicate character in string.
     * 0 ^ a = a
     * a ^ a = 1
     *
     * @param input
     * @return true if all characters are unique, otherwise false.
     */
    public static boolean hasAllUniqueCharactersXOR(final String input) {

        char[] inputArray = input.toCharArray();
        int[] numArray = new int[inputArray.length];
        for (int i = 0; i < inputArray.length; i++) {
            numArray[i] = (int) inputArray[i];
        }
        Arrays.sort(numArray);
        int xorComperator = 0;

        for (int aNumArray : numArray) {
            xorComperator = xorComperator ^ aNumArray;
            if (xorComperator == 0) {
                return false;
            } else {
                xorComperator = aNumArray;
            }
        }
        return xorComperator != 0;
    }

    public static boolean hasAllUniqueCharactesStream(final String input) {
        String distinctInput = input
                .codePoints()
                .distinct()
                .collect(
                        StringBuilder::new,
                        StringBuilder::appendCodePoint,
                        StringBuilder::append)
                .toString();
        return distinctInput.equals(input);
    }

    public static boolean hasAllUniqueCharactersHashMap(final String input) {
        HashSet<String> set = new HashSet<>();

        char[] chars = input.toCharArray();
        for (char aChar : chars) {
            String s = String.valueOf(aChar);
            if (set.contains(s)) {
                return false;
            } else {
                set.add(s);
            }
        }
        return true;
    }
}

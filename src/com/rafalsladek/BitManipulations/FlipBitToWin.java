package com.rafalsladek.BitManipulations;

public class FlipBitToWin {


    /***
     * You can flip only one 0 to 1 to get the longest sequence of 1s.
     * @param num
     * @return
     */
    public static int flipBitToWin(int num) {
        String stringRepresentation = Integer.toBinaryString(num);

        int prevCounter = 0;
        int nextCounter = 0;
        int max = 0;

        for (int i = 0; i < stringRepresentation.toCharArray().length; i++) {
            char currentChar = stringRepresentation.charAt(i);
            if (currentChar == '0') {
                if (max < prevCounter + nextCounter + 1) {
                    max = prevCounter + nextCounter + 1;
                }
                prevCounter = nextCounter;
                nextCounter = 0;
            } else {
                nextCounter++;
            }
        }
        int lastCounting = prevCounter + nextCounter + 1;
        return Math.max(lastCounting, max);
    }
}

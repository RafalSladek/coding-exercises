package com.rafalsladek.arraysAndStrings;

public class RotateMatrix {

    private static char[][] input = {{'a', 'b', 'c'}, {'d', 'e', 'f'}, {'g', 'h', 'i'}};

    public static void main(String[] args) {
        char[][] out = rotateMatrix(input);
        printMatrix(out);
    }

    /**
     * Big O(n^2)
     * Rotates input matrix clockwise 90°.
     * Here how it can be transform to array
     * row  0     1    2    n
     * abcd efgh ijkl mnop
     * miea njfb okgc plhd
     * we shit element (row+1)* (n - col) to the left
     * @param inputMatrix
     * @return
     */
    public static char[][] rotateMatrix(char[][] inputMatrix) {
        int n = inputMatrix.length;
        int lastIndex = n - 1;
        char[][] output = new char[n][n];
        for (int col = 0; col < n; col++) {
            for (int row = lastIndex; row >= 0; row--) {
                // switching col with row
                output[col][lastIndex - row] = inputMatrix[row][col];
            }
        }
        return output;
    }

    public static void printMatrix(char[][] inputMatrix) {
        for (char[] rowItems : inputMatrix) {
            StringBuilder row = new StringBuilder();
            for (int j = 0; j < rowItems.length; j++) {
                row.append(rowItems[j]);
            }
            System.out.println(row.toString());
        }
    }
}

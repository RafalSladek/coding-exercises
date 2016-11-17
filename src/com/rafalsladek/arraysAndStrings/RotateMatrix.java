package com.rafalsladek.arraysAndStrings;

public class RotateMatrix {

    private static char[][] input = {{'a', 'b', 'c'}, {'d', 'e', 'f'}, {'g', 'h', 'i'}};

    public static void main(String[] args) {
        printMatrix(input);
    }

    public static char[][] rotateMatrix(char[][] inputMatrix) {

        return inputMatrix;

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

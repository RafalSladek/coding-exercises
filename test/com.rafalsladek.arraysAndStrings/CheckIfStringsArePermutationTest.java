package com.rafalsladek.arraysAndStrings;

import org.junit.Test;

import static org.junit.Assert.*;

public class CheckIfStringsArePermutationTest {
    @Test
    public void testPermutationOfabcd() throws Exception {
            CheckIfStringsArePermutation.checkIfTwoStringsArePermutation("abcd", "abdc");
    }

    @Test
    public void testNoPermutationWithMoreCharatersInSecondeString() throws Exception {
        CheckIfStringsArePermutation.checkIfTwoStringsArePermutation("abcd", "abdcd");
    }

    @Test
    public void testNoPermutationWithMoreCharactersInFirsString() throws Exception {
        CheckIfStringsArePermutation.checkIfTwoStringsArePermutation("abcdef", "abcd");
    }
}
package com.rafalsladek.arrayAndStrings;

import com.rafalsladek.arraysAndStrings.RotateMatrix;
import org.junit.Test;

import static org.junit.Assert.*;

public class RotateMatrixTest {
    @Test
    public void testrotateMatrix() throws Exception {
        char[][] input = {{'a', 'b', 'c'}, {'d', 'e', 'f'}, {'g', 'h', 'i'}};
        char[][] expected = {{'g', 'd', 'a'}, {'h', 'e', 'b'}, {'i', 'f', 'c'}};
        char[][] actually = RotateMatrix.rotateMatrix(input);
        assertEquals(expected, actually);
    }

}
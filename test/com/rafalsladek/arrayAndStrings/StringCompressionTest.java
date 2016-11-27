package com.rafalsladek.arrayAndStrings;

import com.rafalsladek.arraysAndStrings.StringCompression;
import org.junit.Test;

import static org.junit.Assert.*;


public class StringCompressionTest {
    @Test
    public void testLongString() {
        String input = "aabcccccaaa";
        String actually = StringCompression.stringCompression(input);
        assertEquals("a2b1c5a3", actually);
    }

    @Test
    public void testShortString() {
        String input = "abca";
        String actually = StringCompression.stringCompression(input);
        assertEquals("abca", actually);
    }
}
package com.rafalsladek.arraysAndStrings;

import org.junit.Test;
import static org.junit.Assert.*;

public class HasStringUniqueCharsTest {

    @Test
    public void testingStringWithAA()  {
        String input = "aa";
        assertTrue(HasStringUniqueChars.hasAllUniqueCharacters(input));
    }

    @Test
    public void testingStringWithAAA()  {
        String input = "aaa";
        assertTrue(HasStringUniqueChars.hasAllUniqueCharacters(input));
    }

    @Test
    public void testingStringWithoutDuplicatedChars()  {
        String input = "abcdefghijk";
        assertTrue(!HasStringUniqueChars.hasAllUniqueCharacters(input));
    }


    @Test
    public void testingStringWithDuplicatedChars()  {
        String input = "abcdefffgh";
        assertTrue(HasStringUniqueChars.hasAllUniqueCharacters(input));
    }
}
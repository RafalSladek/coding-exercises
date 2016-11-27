package com.rafalsladek.arrayAndStrings;

import com.rafalsladek.arraysAndStrings.HasStringUniqueChars;
import org.junit.Test;
import static org.junit.Assert.*;

public class HasStringUniqueCharsTest {

    @Test
    public void testingStringWithAA()  {
        String input = "aa";
        assertTrue(!HasStringUniqueChars.hasAllUniqueCharactersXOR(input));
        assertTrue(!HasStringUniqueChars.hasAllUniqueCharactesStream(input));
        assertTrue(!HasStringUniqueChars.hasAllUniqueCharactersHashMap(input));
    }

    @Test
    public void testingStringWithAAA()  {
        String input = "aaa";
        assertTrue(!HasStringUniqueChars.hasAllUniqueCharactersXOR(input));
        assertTrue(!HasStringUniqueChars.hasAllUniqueCharactesStream(input));
        assertTrue(!HasStringUniqueChars.hasAllUniqueCharactersHashMap(input));
    }

    @Test
    public void testingStringWithoutDuplicatedChars()  {
        String input = "abcdefghijk";
        assertTrue(HasStringUniqueChars.hasAllUniqueCharactesStream(input));
        assertTrue(HasStringUniqueChars.hasAllUniqueCharactersXOR(input));
        assertTrue(HasStringUniqueChars.hasAllUniqueCharactersHashMap(input));
    }


    @Test
    public void testingStringWithDuplicatedChars()  {
        String input = "abcdefffgh";
        assertTrue(!HasStringUniqueChars.hasAllUniqueCharactersXOR(input));
        assertTrue(!HasStringUniqueChars.hasAllUniqueCharactesStream(input));
        assertTrue(!HasStringUniqueChars.hasAllUniqueCharactersHashMap(input));
    }
}
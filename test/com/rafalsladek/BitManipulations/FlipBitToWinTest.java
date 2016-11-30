package com.rafalsladek.BitManipulations;

import org.junit.Test;

import static org.junit.Assert.*;

public class FlipBitToWinTest {
    @Test
    public void flipBitToWin() throws Exception {
        int num = 0b110100111;
        int actually = FlipBitToWin.flipBitToWin(num);
        int expected = 4;
        assertEquals(expected, actually);
    }
}
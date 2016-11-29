package com.rafalsladek.BitManipulations;

import org.junit.Test;
import scala.Int;

import static java.lang.System.in;
import static java.lang.System.out;
import static org.junit.Assert.*;

public class CommonTricksTest {

    @Test
    public void repeatedArithmeticShift() throws Exception {
        int input = -93242;
        int count = 40;
        int actually = CommonTricks.repeatedArithmeticShift(input, count);
        int expected = ~0b0;
        assertEquals(expected, actually);
    }

    @Test
    public void repeatedLogicalShift() throws Exception {
        int input = -93242;
        int count = 40;
        int actually = CommonTricks.repeatedLogicalShift(input, count);
        int expected = 0b0;
        assertEquals(expected, actually);
    }

    @Test
    public void getBitInShell() {
        int num = 0b1110;
        int mask = 0b1;
        int bitIndex = 2;
        int shiftedMask = mask << bitIndex; // 0b0100
        int result = num & shiftedMask; // 0100, bit and operator is 0 if at least one bit is 0

        out.println(Integer.toBinaryString(result));
        assertEquals(0b0100, result);
    }

    @Test
    public void getBit() throws Exception {
        int num = 0b10101;
        assertEquals(1, CommonTricks.getBit(num, 0));
        assertEquals(0, CommonTricks.getBit(num, 1));
        assertEquals(1, CommonTricks.getBit(num, 2));
        assertEquals(1, CommonTricks.getBit(num, 4));
    }

    @Test
    public void setBitInShell() {
        int num = 0b1110;
        int mask = 0b1;
        int bitIndex = 2;
        int shiftedMask = mask << bitIndex; // 0b0100
        int result = num | shiftedMask; // 1110, bit or = 1 if at least one bit is 1

        out.println(Integer.toBinaryString(result));
        assertEquals(0b1110, result);
    }

    @Test
    public void setBit() throws Exception {
        int num = 0b10101;
        assertEquals(0b10101, CommonTricks.setBit(num, 0));
        assertEquals(0b10111, CommonTricks.setBit(num, 1));
        assertEquals(0b10101, CommonTricks.setBit(num, 2));
        assertEquals(0b11101, CommonTricks.setBit(num, 3));
    }


    @Test
    public void clearBit() throws Exception {
        int num = 0b11101;
        assertEquals(0b11100, CommonTricks.clearBit(num, 0));
        assertEquals(0b11101, CommonTricks.clearBit(num, 1));
        assertEquals(0b11001, CommonTricks.clearBit(num, 2));
        assertEquals(0b10101, CommonTricks.clearBit(num, 3));
    }


    @Test
    public void updateBit() throws Exception {
        int num = 0b11101;
        assertEquals(0b11100, CommonTricks.updateBit(num, 0, false));
        assertEquals(0b11111, CommonTricks.updateBit(num, 1, true));
        assertEquals(0b11101, CommonTricks.updateBit(num, 2, true));
        assertEquals(0b11101, CommonTricks.updateBit(num, 3, true));
    }
}
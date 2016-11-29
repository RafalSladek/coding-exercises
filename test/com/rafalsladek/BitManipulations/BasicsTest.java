package com.rafalsladek.BitManipulations;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BasicsTest {

    @Test
    public void logicalRightShift() {
        int input = ~0b0; /// 0 inverted to 32 1s
        int actually = input >>> 16; // shift 16 bits to right with filling with zeros.
        int excepted = 0b1111111111111111;
        assertEquals(excepted, actually);
    }

    @Test
    public void arithmeticShiftRightAsDivision() {
        int a = 0b1010; // 10
        int b = a >> 2; // divide by 2 power 2 = 4, 10 / 4 = 2
        assertEquals(0b0010, b);
    }

    @Test
    public void arithmeticShiftLeftAsMultiplication() {
        int a = 0b001010; // 10
        int b = a << 2; // multiply by 2 power 2 = 4, 10 * 4 = 40
        assertEquals(0b101000, b);
    }

    @Test
    public void invertAndShift() {
        int a = ~0b0; // 11111111111111111111111111111111
        //out.println(Integer.toBinaryString(a));

        int b = a << 2; //  11111111111111111111111111111100
        //out.println(Integer.toBinaryString(b));

        int c = 0b1011; // 1011
        //out.println(Integer.toBinaryString(c));

        int d = c & b; // 1000
        //out.println(Integer.toBinaryString(d));

        assertEquals(0b1000, d);
    }


    @Test
    public void invertOperator() throws Exception {
        int a = 0; // 0
        int actually = ~a; // 32 1s = 11111111111111111111111111111111
        int expected = 0b11111111111111111111111111111111;
        assertEquals(expected, actually);
    }

    @Test
    public void xorOperator() throws Exception {
        int a = 0b1010; // 10
        int b = 0b0101; // 5

        //out.println(Integer.toBinaryString(b));
        int actually = a ^ b; // 1 if two bits are different, otherwise 0;
        int expected = 0b1111; // 15
        assertEquals(expected, actually);
    }

    @Test
    public void xorOperatorDuplicate() throws Exception {
        int a = 0b1010; // 10
        int b = 0b1010; // 10

        //out.println(Integer.toBinaryString(b));
        int actually = a ^ b; // 1 if two bits are different, otherwise 0;
        int expected = 0b0000; // 0
        assertEquals(expected, actually);
    }

    @Test
    public void xorOperatorNeutral() throws Exception {
        int a = 0b1010; // 10
        int b = 0b0; // 0

        //out.println(Integer.toBinaryString(b));
        int actually = a ^ b; // 1 if two bits are different, otherwise 0;
        int expected = a; // 1010
        assertEquals(expected, actually);
    }

    @Test
    public void xorOperatorInverting() throws Exception {
        int a = 0b1010; // 10
        int b = 0b1111; // 1

        //out.println(Integer.toBinaryString(b));
        int actually = a ^ b; // 1 if two bits are different, otherwise 0;
        int expected = 0b0101; //
        assertEquals(expected, actually);
    }
}
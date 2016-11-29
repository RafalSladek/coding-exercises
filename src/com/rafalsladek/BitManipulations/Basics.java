package com.rafalsladek.BitManipulations;


public class Basics {

    public static byte invert(int input) {
        return (byte) ~input;
    }

    public static byte xor(byte a, byte b) {
        return (byte) (a ^ b);
    }

}




package com.rafalsladek.BitManipulations;

public class CommonTricks {

    /***
     * Arithmetic shift shift 1 into the most significant bit. So at the end we have count-th 1s in the result started from left.
     * @param num
     * @param count
     * @return
     */
    public static int repeatedArithmeticShift(int num, int count) {
        for (int i = 0; i < count; i++) {
            num >>= 1;
        }
        return num;
    }

    /***
     * Shifting 0 from the most significant bit to the right. If count is more then 32 or 64 it will still shift the 0 to the right.
     * @param num
     * @param count
     * @return
     */
    public static int repeatedLogicalShift(int num, int count) {
        for (int i = 0; i < count; i++) {
            num >>>= 1;
        }
        return num;
    }

    /***
     * Get bit create a mask with 1.
     * Shifts left 1 i-th bits
     * Shifted mask ands with the given num. If the result is not 0 than the bit was 1 otherwise 0.
     * @param num
     * @param bitPosition
     * @return
     */
    public static int getBit(int num, int bitPosition) {
        int mask = (1 << bitPosition);
        return (num & mask) != 0 ? 1 : 0;
    }

    /***
     * Set bit create mask with 1
     * shifts left 1 i-th bits
     * shifted mask and the num with bit OR operator.
     * @param num
     * @param bitPosition
     * @return
     */
    public static int setBit(int num, int bitPosition) {
        int mask = (1 << bitPosition);
        return num | mask;
    }

    /***
     * clear bit is similar to getBit but it is using inverted mask like 1111101 by bitIndex 1
     * @param num
     * @param bitPosition
     * @return
     */
    public static int clearBit(int num, int bitPosition) {
        int mask = ~(1 << bitPosition);
        return num & mask;
    }

    /***
     * Update given bit at the given bit position in the num.
     * Convert boolean to 1 or 0
     * create clearing mask, to remove the old bit at the given position
     * create value mask, to add given bit to the num with bit OR operator
     * @param num
     * @param bitPosition
     * @param isBit1
     * @return
     */
    public static int updateBit(int num, int bitPosition, boolean isBit1) {
        int bitValue = isBit1 ? 1 : 0;
        int clearingMask = ~(1 << bitPosition);
        int valueMask = (bitValue << bitPosition);
        return (num & clearingMask) | valueMask;

    }
}

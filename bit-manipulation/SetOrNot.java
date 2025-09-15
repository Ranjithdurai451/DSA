public class SetOrNot {

    /**
     * Checks if the i-th bit of a number n is set (1) or not (0).
     * Uses bitwise AND operation to isolate the i-th bit and determine if it's non-zero.
     * Time Complexity: O(1) - constant time bitwise operation
     * Space Complexity: O(1) - no extra space used
     * @param n The integer to check.
     * @param index The index of the bit to check (0-based).
     * @return True if the i-th bit is set, false otherwise.
     */
    public static boolean checkithBitIsSetOrNot(int n, int index) {
        // Left shift 1 by 'index' bits and perform bitwise AND with 'n' to isolate the bit.
        return (n & (1 << index)) != 0;
    }
}

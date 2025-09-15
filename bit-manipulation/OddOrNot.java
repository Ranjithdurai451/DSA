public class Main {

    /**
     * Checks if a given integer is odd using bitwise AND operation.
     * The bitwise AND with 1 isolates the least significant bit, which is 1 for odd numbers and 0 for even numbers.
     * Time Complexity: O(1) - constant time operation
     * Space Complexity: O(1) - no extra space used
     * @param n The integer to check.
     * @return True if the integer is odd, false otherwise.
     */
    public static boolean checkOddOrNot(int n) {
        // Bitwise AND with 1 to check if the least significant bit is set (odd number)
        return ( n & 1) == 1;
    }
}
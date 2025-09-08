import java.util.*;

public class BinaryToDecimal {
    /**
     * Converts a binary number represented as a string to its decimal equivalent.
     * The algorithm iterates through the binary string from right to left,
     * calculating the decimal value by summing the powers of 2 corresponding to each '1' bit.
     * Time Complexity: O(n), where n is the length of the binary string.
     * Space Complexity: O(1), constant space is used.
     * @param n The binary number as a string.
     * @return The decimal equivalent of the binary number.
     */
    public static int binaryToDecimal(String n) {
        int result = 0;
        int index = 0;
        // Iterate through the binary string from right to left
        for (int i = n.length() - 1; i >= 0; i--) {
            index = (n.length() - 1)-i;
            // Calculate the decimal value by adding the power of 2 if the bit is '1'
            result += (n.charAt(i)-'0') * Math.pow(2, index);
        }
        return result;
    }
}
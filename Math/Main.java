import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(reverseANumber(123));
    }

    /**
     * Reverses the digits of an integer.
     * Uses StringBuilder for string manipulation to achieve reversal.
     * Time Complexity: O(n), where n is the number of digits in the integer.
     * Space Complexity: O(n), due to the StringBuilder.
     * @param n The integer to be reversed.
     * @return The reversed integer.
     */
    public static int reverseANumber(int n) {
        // Convert the absolute value of the integer to a string and reverse it using StringBuilder.
        return Integer.parseInt((new StringBuilder(Math.abs(n) + "")).reverse().toString());
    }
}
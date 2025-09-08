import java.util.*;
public class DecimalToBinary {
    public static void main(String[] args) {
        System.out.println(decimalToBinary(13));
    }
    /**
     * Converts a decimal integer to its binary string representation using repeated division.
     * Time Complexity: O(log n), where n is the input decimal number.
     * Space Complexity: O(log n), due to the StringBuilder potentially storing log n bits.
     * @param n The decimal integer to convert.
     * @return The binary string representation of the input integer.
     */
    public static String decimalToBinary(int n){
        if (n==0) return "0"; // Handle the base case of zero.
        StringBuilder result=new StringBuilder();
        while(n>0){
            result.append(n%2); // Append the remainder (0 or 1) to the result.
            n/=2; // Integer division by 2 to get the next quotient.
        }
        return result.reverse().toString(); // Reverse the string to get the correct binary representation.
    }
}
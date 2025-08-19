package SlidingWindowAndTwoPointer;

public class LongestUniqueSubstring {

    public static void main(String[] args) {

    }

    /**
     * Finds the length of the longest substring without repeating characters using sliding window technique.
     * The algorithm expands the window (j) and shrinks it (i) when a repeating character is found.
     * Time Complexity: O(n^2) - nested while loop and IsUnique method
     * Space Complexity: O(1) - constant space for variables
     * @param s The input string.
     * @return The length of the longest unique substring.
     */
    public static int longestUniqueSubstring(String s) {

        int i = 0;
        int j = 0;
        int max = 0;
        // Iterate through the string using the sliding window approach
        while (i <= j && j < s.length()) {

            // Shrink the window from the left until the substring is unique
            while (!IsUnique(s.substring(i, j + 1))) {
                i++;
            }
            // Update the maximum length of the unique substring
            max = Math.max(max, (j - i + 1));

            j++;
        }
        return max;
    }

    /**
     * Checks if a string contains only unique characters.
     * Time Complexity: O(n) - iterates through the string once
     * Space Complexity: O(1) - fixed size boolean array
     * @param s The input string.
     * @return True if the string contains only unique characters, false otherwise.
     */
    public static boolean IsUnique(String s) {

        boolean[] isCharacterAvailable = new boolean[256];
        for (char c : s.toCharArray()) {

            // If the character is already present, the string is not unique
            if (isCharacterAvailable[c])
                return false;
            isCharacterAvailable[c] = true;
        }
        return true;
    }
}k
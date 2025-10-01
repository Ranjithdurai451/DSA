import java.util.Set;
import java.util.TreeSet;
import java.util.Iterator;

public class LongestConsecutiveSequenceInAnArray {
    public static void main(String[] args) {
        // Example usage:
        // int[] arr = {100, 4, 200, 1, 3, 2};
        // System.out.println(longestConsecutiveSequenceInAnArray(arr)); // Output: 4
    }

    /**
     * Finds the length of the longest consecutive sequence in an array of integers.
     * The algorithm uses a TreeSet to efficiently store unique elements and iterate through them in sorted order.
     * Time Complexity: O(n log n) - due to adding elements to the TreeSet
     * Space Complexity: O(n) - to store the unique elements in the TreeSet
     * @param arr The input array of integers.
     * @return The length of the longest consecutive sequence.
     */
    public static int longestConsecutiveSequenceInAnArray(int[] arr) {
        if (arr == null || arr.length == 0)
            return 0;

        // Use a TreeSet to store unique elements in sorted order.
        Set<Integer> sortedUniqueSet = new TreeSet<>();
        for (int element : arr) {
            sortedUniqueSet.add(element);
        }

        int longestStreak = 0;
        int currentStreak = 0;
        int prev = Integer.MIN_VALUE;

        // Iterate through the sorted unique elements to find consecutive sequences.
        for (int num : sortedUniqueSet) {
            // If the current number is consecutive to the previous number, increment the current streak.
            if (prev == Integer.MIN_VALUE || num == prev + 1) {
                currentStreak++;
            } else {
                // If the current number is not consecutive, reset the current streak to 1.
                currentStreak = 1;
            }
            // Update the longest streak if the current streak is longer.
            longestStreak = Math.max(longestStreak, currentStreak);
            prev = num;
        }

        return longestStreak;
    }
}
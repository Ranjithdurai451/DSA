import java.util.Set;
import java.util.TreeSet;
import java.util.Iterator;

public class LongestConsecutiveSequenceInAnArray {
    public static void main(String[] args) {
        // Example usage:
        // int[] arr = {100, 4, 200, 1, 3, 2};
        // System.out.println(longestConsecutiveSequenceInAnArray(arr)); // Output: 4
    }

    public static int longestConsecutiveSequenceInAnArray(int[] arr) {
        if (arr == null || arr.length == 0)
            return 0;

        Set<Integer> sortedUniqueSet = new TreeSet<>();
        for (int element : arr) {
            sortedUniqueSet.add(element);
        }

        int longestStreak = 0;
        int currentStreak = 0;
        int prev = Integer.MIN_VALUE;

        for (int num : sortedUniqueSet) {
            if (prev == Integer.MIN_VALUE || num == prev + 1) {
                currentStreak++;
            } else {
                currentStreak = 1;
            }
            longestStreak = Math.max(longestStreak, currentStreak);
            prev = num;
        }

        return longestStreak;
    }
}
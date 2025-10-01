import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class LeadersInAnArray {

    public static void main(String[] args) {

    }

    /**
     * Finds the leaders in an array. An element is a leader if it is greater than
     * all the elements to its right.
     * The rightmost element is always a leader.
     * This approach iterates from right to left, keeping track of the maximum
     * element seen so far.
     *
     * Time Complexity: O(N) - single pass through the array
     * Space Complexity: O(N) - to store the leaders in the ArrayList
     * @param arr The input array of integers.
     */
    public static void leadersInAnArray(int[] arr) {
        List<Integer> leaders = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        // Iterate from right to left to efficiently find leaders
        for (int i = arr.length - 1; i >= 0; i--) {
            // If current element is greater than the maximum seen so far, it's a leader
            if (arr[i] > max) {
                leaders.add(arr[i]);
                // Update the maximum seen so far
                max = Math.max(max, arr[i]);
            }

        }
        System.out.println(leaders.toString());
    }
}
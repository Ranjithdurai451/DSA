public class MaximumSubarraySum {
    public static void main(String[] args) {

    }

    /**
     * Finds the maximum sum of a contiguous subarray within a given array using Kadane's Algorithm.
     * Time Complexity: O(n) - Single pass through the array.
     * Space Complexity: O(1) - Constant extra space.
     * @param arr The input array of integers.
     * @return The maximum subarray sum.
     */
    public static int maximumSubarraySum(int[] arr) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            max = Math.max(sum, max);
            // If the current sum is negative, reset it to 0, as it won't contribute to a larger sum.
            if (sum < 0)
                sum = 0;
        }
        return max;
    }
}
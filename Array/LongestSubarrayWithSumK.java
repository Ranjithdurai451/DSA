import java.util.HashMap;
import java.util.Map;

public class LongestSubarrayWithSumK {
    public static void main(String[] args) {

    }

    /**
     * Finds the longest subarray with a sum equal to k using a HashMap to store prefix sums.
     * This approach optimizes the search for subarrays by storing and reusing previously calculated sums.
     * Time Complexity: O(N) - Iterates through the array once.
     * Space Complexity: O(N) - HashMap can store up to N prefix sums.
     * @param arr The input array of integers.
     * @param k The target sum.
     * @return The length of the longest subarray with sum k.
     */
    public static int LongestSubarrayWithSumK(int[] arr, int k) {

        Map<Integer, Integer> hash = new HashMap<>();

        int max = 0;
        int prefixSum = 0;
        for (int i = 0; i < arr.length; i++) {
            prefixSum += arr[i];
            // Check if the current prefix sum equals k, updating max length if needed.
            if (prefixSum == k) {
                max = Math.max(max, i + 1);
            }
            // Calculate the 'excluding' value needed to reach k from the current prefix sum.
            int excluding = prefixSum - k;
            // If the 'excluding' value exists in the hashmap, a subarray with sum k is found.
            if (hash.containsKey(excluding)) {
                max = Math.max(max, i - hash.get(excluding));
            }
            // Store the prefix sum and its index if it's not already in the hashmap.
            // This ensures that we keep the leftmost index for the prefix sum.
            if (!hash.containsKey(prefixSum))
                hash.put(prefixSum, i);

        }
        return max;

    }

}
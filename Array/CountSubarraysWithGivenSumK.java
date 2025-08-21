import java.util.*;

public class CountSubarraysWithGivenSumK {
    public static void main(String[] args) {

    }

    /**
     * Counts the number of subarrays with sum equal to k using a HashMap to store prefix sums.
     * The algorithm iterates through the array, calculating the prefix sum at each index.
     * It checks if the current prefix sum equals k, incrementing the count if it does.
     * It also checks if a prefix sum exists such that prefixSum - k exists, indicating a subarray with sum k.
     * Time Complexity: O(n) - single pass through the array
     * Space Complexity: O(n) - HashMap can store up to n prefix sums
     * @param arr The input array of integers.
     * @param k The target sum.
     * @return The number of subarrays with sum equal to k.
     */
    public static int countSubarraysWithGivenSumK(int[] arr, int k) {
        int count = 0;
        // Store prefix sums and their frequencies
        Map<Integer, Integer> hash = new HashMap<>();
        int prefixSum = 0;

        for (int i = 0; i < arr.length; i++) {
            prefixSum += arr[i];
            // Check if the current prefix sum equals k
            if (prefixSum == k)
                count++;
            // Calculate the prefix sum needed to reach k
            int excluding = prefixSum - k;
            // If the required prefix sum exists, increment the count
            if (hash.containsKey(excluding)) {
                count += hash.get(excluding);
            }
            // Update the frequency of the current prefix sum
            hash.put(prefixSum, hash.getOrDefault(prefixSum, 0) + 1);
        }
        return count;
    }
    
}
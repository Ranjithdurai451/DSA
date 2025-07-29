import java.util.*;

public class CountSubarraysWithGivenSumK {
    public static void main(String[] args) {

    }

    public static int countSubarraysWithGivenSumK(int[] arr, int k) {
        // Extreme brute Force we can check all subarrays TC O(N)
        // Optimal
        int count = 0;
        Map<Integer, Integer> hash = new HashMap<>();
        int prefixSum = 0;

        for (int i = 0; i < arr.length; i++) {
            prefixSum += arr[i];
            if (prefixSum == k)
                count++;
            int excluding = prefixSum - k;
            if (hash.containsKey(excluding)) {
                count += hash.get(excluding);
            }
            hash.put(prefixSum, hash.getOrDefault(prefixSum, 0) + 1);
        }
        return count;
    }
}

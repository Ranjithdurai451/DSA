import java.util.*;

public class Main {

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = TwoSum.twoSum(nums, target);
        System.out.println(Arrays.toString(result));
    }
}

class TwoSum {
   
    /**
     * Finds two numbers in the array that add up to the target value.
     * Uses a hash map to store each number and its index, then checks if the complement exists in the map.
     * Time Complexity: O(n) - iterates through the array once
     * Space Complexity: O(n) - stores each number and its index in the hash map
     * @param nums The input array of integers.
     * @param target The target sum.
     * @return An array containing the indices of the two numbers that add up to the target, or {-1, -1} if no such pair exists.
     */
    public static int[] twoSum(int[] nums, int target) {
        // Use a hash map to store each number and its index for quick lookup
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            // Calculate the complement needed to reach the target
            int complement = target - nums[i];

            // Check if the complement exists in the map
            if (map.containsKey(complement)) {
                // If the complement exists, return the indices of the two numbers
                return new int[] { map.get(complement), i };
            }

            // Store the current number and its index in the map
            map.put(nums[i], i);
        }
        // If no such pair exists, return {-1, -1}
        return new int[] { -1, -1 };
    }
}
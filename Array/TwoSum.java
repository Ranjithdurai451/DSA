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
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            // If the complement exists in the map, return the indices of the two numbers.
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }

            map.put(nums[i], i);
        }
        // If no such pair exists, return {-1, -1}.
        return new int[] { -1, -1 };
    }
}
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
     * Finds two numbers in the input array that add up to the target value.
     * Uses a hash map to store each number and its index, allowing for O(1) lookup of the complement.
     * Time Complexity: O(n) - Iterates through the array once.
     * Space Complexity: O(n) - Stores each number and its index in a hash map.
     * @param nums The input array of integers.
     * @param target The target sum.
     * @return An array containing the indices of the two numbers that add up to the target, or {-1, -1} if no such pair exists.
     */
    public static int[] twoSum(int[] nums, int target) {
        // Map to store number and its index
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            // If complement exists in the map, we found the pair
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }

            map.put(nums[i], i);
        }
        // No solution found
        return new int[] { -1, -1 };
    }
}
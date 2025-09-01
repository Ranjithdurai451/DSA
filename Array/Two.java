import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    /**
     * Finds two numbers in an array that add up to a specific target value.
     * Uses a hash map to store each number and its index, allowing for O(1) lookup.
     * Time Complexity: O(n) - Iterates through the array once.
     * Space Complexity: O(n) - Stores each number and its index in a hash map.
     * @param nums The input array of integers.
     * @param target The target sum.
     * @return An array containing the indices of the two numbers that add up to the target, or {-1, -1} if no such pair exists.
     */
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            // If the complement exists in the map, we have found the pair
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }

            map.put(nums[i], i); // Store the number and its index in the map
        }
        return new int[] { -1, -1 }; // No solution found
    }

    public static void main(String[] args) {
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;
        int[] result = twoSum(nums, target);
        System.out.println(Arrays.toString(result));
    }
}
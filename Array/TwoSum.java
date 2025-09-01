import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    /**
     * Finds two numbers in an array that add up to a target value.
     * Uses a HashMap to store each number and its index, allowing for O(1) lookup.
     * Time Complexity: O(n) - iterates through the array once.
     * Space Complexity: O(n) - stores each number and its index in a HashMap.
     * @param nums The input array of integers.
     * @param target The target sum.
     * @return An array containing the indices of the two numbers that add up to the target, or {-1, -1} if no such pair exists.
     */
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            // Check if the complement exists in the map
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }

            map.put(nums[i], i); // Store the number and its index in the map
        }
        return new int[] { -1, -1 }; // Return default if no solution is found
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum(nums, target);
        System.out.println(Arrays.toString(result));
    }
}
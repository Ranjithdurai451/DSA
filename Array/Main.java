import java.util.Arrays;

public class TwoSum {

    /**
     * Finds two numbers in a sorted array that add up to a target value.
     * Uses the two-pointer approach after sorting the array.
     * Time Complexity: O(n log n) due to sorting, O(n) for two-pointer search.
     * Space Complexity: O(1).
     * @param arr The input array of integers.
     * @param k The target sum.
     * @return An array containing the two numbers that sum to k, or {-1, -1} if no such pair exists.
     */
    public static int[] twoSum(int arr[], int k) {
        Arrays.sort(arr); // Sort the array to use the two-pointer approach
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == k) return new int[] { arr[left], arr[right] }; // Found the pair
            else if (sum > k) {
                right--; // Sum is too large, move the right pointer to decrease the sum
            } else {
                left++; // Sum is too small, move the left pointer to increase the sum
            }
        }
        return new int[] { -1, -1 }; // No such pair exists
    }

    public static void main(String[] args) {
        int[] arr = { 2, 7, 11, 15 };
        int target = 9;
        int[] result = twoSum(arr, target);
        System.out.println(Arrays.toString(result));
    }
}
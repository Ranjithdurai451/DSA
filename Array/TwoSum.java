import java.util.Arrays;

public class TwoSum {
    /**
     * Finds two numbers in a sorted array that add up to a target value using the Two Pointer approach.
     * Time Complexity: O(n log n) due to sorting, O(n) for the two-pointer search.
     * Space Complexity: O(1) - constant extra space.
     * @param arr The input array of integers.
     * @param k The target sum.
     * @return An array containing the two numbers that add up to k, or {-1, -1} if no such pair exists.
     */
    public static int[] twoSum(int arr[], int k) {
        Arrays.sort(arr); // Sort the array to use the two-pointer approach
        int left = 0;
        int right = arr.length - 1;
        while (left < right) { // Iterate until the two pointers meet
            int sum = arr[left] + arr[right];
            if (sum == k)
                return new int[] { arr[left], arr[right] }; // Return the pair if the sum equals the target
            else if (sum > k) {
                right--; // Decrement the right pointer if the sum is greater than the target
            } else {
                left++; // Increment the left pointer if the sum is less than the target
            }
        }
      return new int[]{-1,-1}; // Return {-1, -1} if no such pair is found
    }

    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum(arr, target);
        System.out.println(Arrays.toString(result));
    }
}
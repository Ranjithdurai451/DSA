import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
    }

    /**
     * Finds two numbers in a sorted array that add up to a target value k.
     * Uses the Two Pointers approach after sorting the array.
     * Time Complexity: O(n log n) due to sorting, O(n) for two-pointer search.
     * Space Complexity: O(1).
     * @param arr The input array of integers.
     * @param k The target sum.
     * @return An array containing the two numbers that sum to k, or {-1, 1} if no such pair exists.
     */
    public static int[] twoSum(int arr[], int k) {
        Arrays.sort(arr); // Sort the array to apply the two-pointer technique
        int left = 0;
        int right = arr.length - 1;
        while (left < right) { // Iterate until the two pointers meet
            int sum = arr[left] + arr[right];
            if (sum == k)
                return new int[] { arr[left], arr[right] }; // Return the pair if the sum matches the target
            else if (sum > k) {
                right--; // Decrement right pointer if the sum is greater than the target
            } else {
                left++; // Increment left pointer if the sum is less than the target
            }
        }
        return new int[] { -1, 1 }; // Return {-1, 1} if no such pair is found
    }

}
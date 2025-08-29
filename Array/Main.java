import java.util.Arrays;

public class TwoSum {

    /**
     * Finds two numbers in a sorted array that add up to a target value using the Two Pointers approach.
     * Time Complexity: O(n log n) due to sorting, O(n) for the two-pointer search.
     * Space Complexity: O(1) - constant extra space.
     * @param arr The input array of integers.
     * @param k The target sum.
     * @return An array containing the two numbers that add up to k, or {-1, -1} if no such pair exists.
     */
    public static int[] twoSum(int arr[], int k) {
        // Sort the array to apply the two-pointer technique.
        Arrays.sort(arr);
        int left = 0;
        int right = arr.length - 1;
        // Iterate until the left and right pointers meet.
        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == k)
                return new int[] { arr[left], arr[right] };
            // If the sum is greater than the target, move the right pointer to the left.
            else if (sum > k) {
                right--;
            } else {
                // If the sum is less than the target, move the left pointer to the right.
                left++;
            }
        }
        // If no such pair is found, return {-1, -1}.
        return new int[]{-1,-1};
        
    }

    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum(arr, target);
        System.out.println(Arrays.toString(result));
    }
}
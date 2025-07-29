import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        // Test case 1: Normal case
        int[] arr1 = { 2, 7, 11, 15 };
        int k1 = 9;
        System.out.println("Test 1: " + Arrays.toString(twoSum(arr1, k1))); // Expected: [2, 7]

        // Test case 2: No solution
        int[] arr2 = { 1, 2, 3, 4 };
        int k2 = 8;
        System.out.println("Test 2: " + Arrays.toString(twoSum(arr2, k2))); // Expected: [-1, 1]

        // Test case 3: Negative numbers
        int[] arr3 = { -3, 4, 3, 90 };
        int k3 = 0;
        System.out.println("Test 3: " + Arrays.toString(twoSum(arr3, k3))); // Expected: [-3, 3]

        // Test case 4: Duplicates
        int[] arr4 = { 3, 3, 4, 5 };
        int k4 = 6;
        System.out.println("Test 4: " + Arrays.toString(twoSum(arr4, k4))); // Expected: [3, 3]

        // Test case 5: Single element
        int[] arr5 = { 5 };
        int k5 = 10;
        System.out.println("Test 5: " + Arrays.toString(twoSum(arr5, k5))); // Expected: [-1, 1]

        // Test case 6: Empty array
        int[] arr6 = {};
        int k6 = 0;
        System.out.println("Test 6: " + Arrays.toString(twoSum(arr6, k6))); // Expected: [-1, 1]
    }

    public static int[] twoSum(int arr[], int k) {
        Arrays.sort(arr);
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == k)
                return new int[] { arr[left], arr[right] };
            else if (sum > k) {
                right--;
            } else {
                left++;
            }
        }
        return new int[] { -1, 1 };
    }

}

public class MaximumSubarraySum {
    public static void main(String[] args) {

    }

    public static int maximumSubarraySum(int[] arr) {
        // Brute Try all subarrays sum
        // Optimal
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            max = Math.max(sum, max);
            if (sum < 0)
                sum = 0;
        }
        return max;
    }
}

import java.util.HashMap;
import java.util.Map;

public class LongestSubarrayWithSumK {
    public static void main(String[] args) {

    }

    public static int LongestSubarrayWithSumK(int[] arr, int k) {
        // Brute Force
        // Time complexity O(N2)
        // int max=0;
        // int sum=0;

        // for (int i = 0; i < arr.length; i++) {
        // sum=0;
        // for (int j = i; j < arr.length; j++) {
        // sum+=arr[j];
        // if(sum==k){
        // max=Math.max(max,(j-i+1));
        // }
        // }
        // }
        // Better
        // Time Complexity O(N)
        // But works for only postivies
        // int max=0;
        // int sum=0;
        // int left=0;
        // int right=0;
        // while(right<arr.length){
        // sum+=arr[right];
        // while(left<=right && sum>k){
        // sum-=arr[left++];
        // }
        // if(sum==k){
        // max=Math.max(max,right-left+1);
        // }
        // right++;

        // }

        // Time Complexity O(N)
        // Space Complexity O(N)

        Map<Integer, Integer> hash = new HashMap<>();

        int max = 0;
        int prefixSum = 0;
        for (int i = 0; i < arr.length; i++) {
            prefixSum += arr[i];
            if (prefixSum == k) {
                max = Math.max(max, i + 1);
            }
            int excluding = prefixSum - k;
            if (hash.containsKey(excluding)) {
                max = Math.max(max, i - hash.get(excluding));
            }
            if (!hash.containsKey(prefixSum))
                hash.put(prefixSum, i);

        }
        return max;

    }

}
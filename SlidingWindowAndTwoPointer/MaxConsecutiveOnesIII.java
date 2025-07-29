package SlidingWindowAndTwoPointer;

public class MaxConsecutiveOnesIII {
    public static void main(String[] args) {

    }

    public static int maxConsecutiveOnesIII(int[] arr, int k) {
        int zerosCount = 0;
        int maxLen = 0;
        int i = 0;
        int j = 0;
        while (i <= j && j < arr.length) {
            if (arr[j] == 0)
                zerosCount++;
            while (zerosCount > k) {
                if (arr[i] == 0)
                    zerosCount--;
                i++;

            }
            maxLen = Math.max(maxLen, (j - i + 1));
            j++;
        }
        return maxLen;
    }
}

public class MaxConsecutiveOnes {
  public static void main(String[] args) {

    maxConsecutiveOnes(new int[] { 1, 1, 1, 2, 3, 4, 1, 1, 2, 1, 1, 1, 1, 1, 1 });
  }

  /**
   * Finds the maximum number of consecutive 1s in an array.
   * This method iterates through the array, tracking the current count of consecutive 1s
   * and updating the maximum count encountered so far.
   * Time Complexity: O(n) - single pass through the array
   * Space Complexity: O(1) - constant extra space
   * @param arr The input array of integers.
   * @return The maximum number of consecutive 1s in the array.
   */
  public static int maxConsecutiveOnes(int[] arr) {
    int count = 0;
    int maxCount = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == 1)
        count++;
      else
        count = 0; // Reset count when a non-1 is encountered
      maxCount = Math.max(maxCount, count); // Update maxCount with the larger value
    }
    return maxCount;

  }

}
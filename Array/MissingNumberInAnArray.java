public class MissingNumberInAnArray {
  public static void main(String[] args) {

  }

  /**
   * Finds the missing number in an array of consecutive integers from 0 to n, where n is the array length.
   * Utilizes XOR operation to find the missing number. XORing all numbers in the array with all numbers from 0 to n cancels out the present numbers, leaving the missing number.
   * Time Complexity: O(n) - single pass through the array
   * Space Complexity: O(1) - constant extra space
   * @param arr The input array of integers.
   * @return The missing number in the array.
   */
  public static int missingNumberInAnArray(int[] arr) {
    // Brute Force
    // int numberOfElements = arr.length ;
    // int originalSum = (numberOfElements * (numberOfElements + 1)) / 2;
    // int missingSum = 0;
    // for (int i = 0; i < arr.length; i++) {
    // missingSum += arr[i];
    // }
    // return originalSum - missingSum;
    //
    int xorSum = 0;
    int i;
    // XOR all elements of the array with their indices
    for (i = 0; i < arr.length; i++) {
      xorSum = xorSum ^ arr[i];
      xorSum = xorSum ^ i;
    }
    // XOR with the last index to include the missing number's expected value
    xorSum = xorSum ^ i;
    return xorSum;

  }
}
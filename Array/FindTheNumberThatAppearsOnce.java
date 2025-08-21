public class FindTheNumberThatAppearsOnce {
  public static void main(String[] args) {
    System.out.println(findTheNumberThatAppearsOnce(new int[] { 1, 1, 2, 2, 3, 3, 4, 5, 5 }));
  }

  /**
   * Finds the number that appears only once in an array where other numbers appear twice.
   * Uses XOR operation to find the unique number. XORing a number with itself results in 0,
   * and XORing with 0 returns the number itself.
   * Time Complexity: O(n) - Iterates through the array once.
   * Space Complexity: O(1) - Constant space is used.
   * @param arr The input array of integers.
   * @return The integer that appears only once.
   */
  public static int findTheNumberThatAppearsOnce(int[] arr) {
    // Initialize XOR sum to 0
    int xorSum = 0;
    // Iterate through the array and XOR each element with the current XOR sum
    for (int i = 0; i < arr.length; i++) {
      xorSum = xorSum ^ arr[i];
    }
    // The final XOR sum will be the number that appears only once
    return xorSum;
  }

}
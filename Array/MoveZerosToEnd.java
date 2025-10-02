import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MoveZerosToEnd {
  public static void main(String[] args) {
    System.out.println(Arrays.toString(moveZerosToEnd(new int[] { 1, 0, 2, 3, 0, 0, 4, 5, 0 })));
  }

  /**
   * Moves all zeros to the end of the array while maintaining the relative order
   * of the non-zero elements using an in-place algorithm.
   * Time Complexity: O(N) - single pass through the array
   * Space Complexity: O(1) - in-place operation
   * @param arr The input array of integers.
   * @return The modified array with zeros moved to the end.
   */
  public static int[] moveZerosToEnd(int arr[]) {
    // Optimal
    // Time Complexity O(N)
    int temp;
    int currentIndex = 0;
    for (int i = 0; i < arr.length; i++) {
      // If the current element is not zero, swap it with the element at currentIndex
      if (arr[i] != 0) {
        temp = arr[i];
        arr[i] = arr[currentIndex];
        arr[currentIndex++] = temp; // Increment currentIndex to point to the next position for a non-zero element
      }
    }
    return arr;
  }
}
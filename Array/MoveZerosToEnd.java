import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MoveZerosToEnd {
  public static void main(String[] args) {
    System.out.println(Arrays.toString(moveZerosToEnd(new int[] { 1, 0, 2, 3, 0, 0, 4, 5, 0 })));
  }

  public static int[] moveZerosToEnd(int arr[]) {
    // Brute Force
    // Time Complexity O(N)
    // Space Complexity O(N)
    // List<Integer> list = new ArrayList<>();
    // for (int i : arr) {
    // if (i != 0)
    // list.add(i);
    // }
    // int[] newArr = new int[arr.length];
    // int index = 0;
    // for (int i : list) {
    // newArr[index++] = i;
    //
    // }
    // return newArr;
    // Optimal
    // Time Complexity O(N)
    int temp;
    int currentIndex = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] != 0) {
        temp = arr[i];
        arr[i] = arr[currentIndex];
        arr[currentIndex++] = temp;
      }
    }
    return arr;
  }
}

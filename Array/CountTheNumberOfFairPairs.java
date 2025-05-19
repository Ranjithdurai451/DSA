import java.util.*;

public class CountTheNumberOfFairPairs {
  public static void main(String[] args) {

  }

  public static int countTheNumberOfFairPairs(int arr[], int lower, int higher) {

    Arrays.sort(arr);
    int low = 0;
    int high = arr.length - 1;
    int count = 0;

    while (low < high) {

      int sum = arr[low] + arr[high];
      if (sum >= lower && sum <= higher) {
        count++;
        high--;

      }
    }
  }

}

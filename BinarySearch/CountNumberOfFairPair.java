import java.util.Arrays;

public class CountNumberOfFairPair {
  public static void main(String[] args) {
    System.out.println(countNumberOfFairPair(new int[] { 0, 1, 7, 4, 4, 5 }, 3, 6));
  }

  public static int countNumberOfFairPair(int arr[], int lower, int higher) {
    int count = 0;
    Arrays.sort(arr);
    for (int i = 0; i < arr.length; i++) {
      int possible_lower = lower - arr[i];
      int possible_higher = higher - arr[i];
      int startIndex = lowerBound(arr, i + 1, arr.length - 1, possible_lower);
      int endIndex = upperBound(arr, i + 1, arr.length - 1, possible_higher);
      if (startIndex != -1 && endIndex != -1) {
        count += (endIndex - startIndex + 1);
      }
    }
    return count;
  }

  public static int lowerBound(int[] arr, int low, int high, int target) {
    int result = -1;
    while (low <= high) {
      int mid = low + (high - low) / 2;
      if (arr[mid] >= target) {
        result = mid;
        high = mid - 1;
      } else {
        low = mid + 1;
      }
    }
    return result;
  }

  public static int upperBound(int[] arr, int low, int high, int target) {
    int result = -1;
    while (low <= high) {
      int mid = low + (high - low) / 2;
      if (arr[mid] <= target) {
        result = mid;
        low = mid + 1;
      } else {
        high = mid - 1;
      }
    }
    return result;
  }

}

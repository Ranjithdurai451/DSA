public class MinAndMaxNumberInRotatedSortedArray {
  public static void main(String[] args) {
    System.out.println(minNumberInRotatedSortedArray(new int[] { 4, 5, 1, 2, 3 }));
    System.out.println(maxNumberInRotatedSortedArray(new int[] { 4, 5, 1, 2, 3 }));
  }

  public static int minNumberInRotatedSortedArray(int arr[]) {
    int low = 0;
    int high = arr.length - 1;
    int min = Integer.MAX_VALUE;
    while (low <= high) {
      int mid = low + (high - low) / 2;
      if (arr[low] <= arr[mid]) {
        min = Math.min(min, arr[low]);
        low = mid + 1;
      } else {
        min = Math.min(min, arr[mid]);
        high = mid - 1;
      }
    }
    return min;
  }

  public static int maxNumberInRotatedSortedArray(int arr[]) {
    int low = 0;
    int high = arr.length - 1;
    int max = Integer.MIN_VALUE;
    while (low <= high) {
      int mid = low + (high - low) / 2;
      if (arr[low] <= arr[mid]) {
        max = Math.max(max, arr[mid]);
        low = mid + 1;
      } else {
        max = Math.max(max, arr[high]);
        high = mid - 1;
      }
    }
    return max;
  }

}

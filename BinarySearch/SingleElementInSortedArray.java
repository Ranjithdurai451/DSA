public class SingleElementInSortedArray {
  public static void main(String[] args) {
    System.out.println(singleElementInSortedArray(new int[] { 1, 1, 2, 2, 3, 3, 4, 5, 5, 6, 6 }));
  }

  public static int singleElementInSortedArray(int arr[]) {
    int n = arr.length;
    if (n == 1)
      return arr[0];
    if (arr[0] != arr[1])
      return arr[0];
    if (arr[n - 1] != arr[n - 2])
      return arr[n - 1];
    int low = 1;
    int high = n - 2;
    while (low <= high) {
      int mid = low + (high - low) / 2;

      if (arr[mid] != arr[mid - 1] && arr[mid] != arr[mid + 1])
        return arr[mid];
      else if (arr[mid] == arr[mid - 1]) {
        if (mid % 2 != 0) {
          low = mid + 1;
        } else {
          high = mid - 1;
        }
      } else {

        if (mid % 2 == 0) {
          low = mid + 1;
        } else {
          high = mid - 1;
        }

      }

    }
    return -1;
  }

}

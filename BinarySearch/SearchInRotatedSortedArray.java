public class SearchInRotatedSortedArray {
  public static void main(String[] args) {
    System.out.println(searchInRotatedSortedArrayWithUniqueElements(new int[] {
        3, 1, 2, 3, 3
    }, 3));

  }

  public static int searchInRotatedSortedArrayWithUniqueElements(int[] arr, int target) {
    int result = -1;
    int low = 0;
    int high = arr.length - 1;

    while (low <= high) {
      int mid = low + (high - low) / 2;
      System.out.println(low + "  " + high);
      if (arr[mid] == target) {
        return mid;
      } else if (arr[low] == arr[mid] && arr[mid] == arr[high]) {
        low++;
        high--;
        continue;
      } else if (arr[low] <= arr[mid]) {

        if (target >= arr[low] && target <= arr[mid]) {
          high = mid - 1;

        } else {
          low = mid + 1;
        }
      } else {
        if (target >= arr[mid] && target <= arr[high]) {
          low = mid + 1;
        } else {
          high = mid - 1;
        }
      }
    }
    return result;
  }
}

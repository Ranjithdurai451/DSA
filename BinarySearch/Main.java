
public class Main {
  public static void main(String[] args) {
    // lowerBound(new int[] { 1, 2, 3, 4, 5 }, 3);
    // System.out.println(upperBound(new int[] { 1, 2, 4, 6, 6 }, 9));
    // System.out.println(searchInsertPosition(new int[] { 1, 3, 4, 5, 6 }, 2));
    // System.out.println(lowerBound(new int[] { 1, 2, 3, 4, 5 }, 2));
    // System.out.println(Arrays.toString(floorAndCeil(new int[] { 1, 2, 4, 5 },
    // 3)));
    // System.out.println(Arrays.toString(firstAndLastIndex(new int[] { 1, 2, 3, 3,
    // 3, 4, 5 }, 2)));
    // System.out.println(lowerBound(new int[] { 1, 2, 3, 3, 3, 4, 5 }, 2));
    // System.out.println(Arrays.toString(firstAndLastIndex(new int[] { 1, 2, 3, 3,
    // 3, 4 }, 4)));
    // System.out.println(binarySearch(new int[] {}, 4));

  }

  public static int binarySearch(int arr[], int target) {
    int low = 0;
    int high = arr.length - 1;
    int mid;
    while (low <= high) {
      // mid=(low+high)/2; Normal way to find mid value
      // Consider if we get an array with larger size which can't be hold in int type,
      // then we either convert it into int type or we use approach which equivalent
      // to (low+high)/2
      mid = low + (high - low) / 2;
      if (target == arr[mid])
        return mid;
      else if (target < arr[mid])
        high = mid - 1;
      else
        low = mid + 1;
    }
    return -1;
  }

  public static int binarySearch(int arr[], int low, int high, int target) {
    if (low > high)
      return -1;
    int mid = low + (high - low) / 2;
    if (arr[mid] == target)
      return mid;
    else if (target < arr[mid])
      return binarySearch(arr, low, mid - 1, target);
    else
      return binarySearch(arr, mid + 1, high, target);

  }

  public static int lowerBound(int arr[], int target) {
    int result = -1;
    int low = 0;
    int high = arr.length - 1;
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

  public static int upperBound(int arr[], int target) {
    int result = -1;
    int low = 0;
    int high = arr.length - 1;
    while (low <= high) {

      int mid = low + (high - low) / 2;

      if (arr[mid] > target) {

        result = mid;
        high = mid - 1;

      } else {
        low = mid + 1;
      }
    }

    // return low;
    return result;
  }

  public static int searchInsertPosition(int arr[], int target) {
    return lowerBound(arr, target);
  }

  public static int[] floorAndCeil(int arr[], int target) {
    // ceil is the largest value less than target
    // floor is minimum value greater than the target
    return new int[] { getFloorIndex(arr, target), getCeilIndex(arr, target) };
  }

  public static int getFloorIndex(int arr[], int target) {
    int low = 0;
    int high = arr.length - 1;
    int floor = -1;
    while (low <= high) {
      int mid = low + (high - low) / 2;
      if (arr[mid] >= target) {

        floor = arr[mid];
        high = mid - 1;
      } else {
        low = mid + 1;
      }
    }
    return floor;
  }

  public static int getCeilIndex(int arr[], int target) {
    int low = 0;
    int high = arr.length - 1;
    int ceil = -1;
    while (low <= high) {
      int mid = low + (high - low) / 2;
      if (arr[mid] <= target) {

        ceil = arr[mid];
        low = mid + 1;
      } else {
        high = mid - 1;
      }
    }
    return ceil;
  }

  public static int[] firstAndLastIndex(int arr[], int target) {
    int firstIndex = lowerBound(arr, target);
    if (firstIndex == -1 || arr[firstIndex] != target)
      return new int[] { -1, -1 };
    int lastIndex = upperBound(arr, target) != -1 ? upperBound(arr, target) + 1 : firstIndex;
    return new int[] { firstIndex, lastIndex };
  }
}

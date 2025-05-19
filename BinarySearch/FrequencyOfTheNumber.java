
public class FrequencyOfTheNumber {
  public static void main(String[] args) {
    System.out.println(firstIndex(new int[] { 1, 2, 3, 3, 3, 5 }, 3));
    System.out.println(lastIndex(new int[] { 1, 2, 3, 3, 3, 5 }, 3));

    System.out.println(frequencyOfTheNumber(new int[] {
        1, 2, 3, 3, 3, 5
    }, 3));
  }

  public static int firstIndex(int arr[], int target) {

    int low = 0;
    int high = arr.length - 1;
    int result = -1;
    while (low <= high) {
      int mid = low + (high - low) / 2;
      if (arr[mid] == target) {
        result = mid;
        high = mid - 1;
      } else if (arr[mid] > target) {
        high = mid - 1;
      } else {
        low = mid + 1;
      }
    }
    return result;
  }

  public static int lastIndex(int arr[], int target) {

    int low = 0;
    int high = arr.length - 1;
    int result = -1;
    while (low <= high) {
      int mid = low + (high - low) / 2;
      if (arr[mid] == target) {
        result = mid;
        low = mid + 1;
      } else if (arr[mid] > target) {
        high = mid - 1;
      } else {
        low = mid + 1;
      }
    }
    return result;
  }

  public static int frequencyOfTheNumber(int arr[], int target) {

    if (firstIndex(arr, target) == -1)
      return 0;
    else
      return lastIndex(arr, target) - firstIndex(arr, target) + 1;
  }
}

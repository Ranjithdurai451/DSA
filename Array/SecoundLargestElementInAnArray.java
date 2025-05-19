public class SecoundLargestElementInAnArray {
  public static void main(String[] args) {
    System.out.println(secoundLargestElementInAnArray(new int[] {1, 2, 4, 536, 4435, 4435}));
  }

  public static int secoundLargestElementInAnArray(int arr[]) {
    int first_largest = arr[0];
    int secound_largest = Integer.MIN_VALUE;
    for (int i = 1; i < arr.length; i++) {
      if (arr[i] > first_largest) {
        secound_largest = first_largest;
        first_largest = arr[i];
      } else if (arr[i] > secound_largest && arr[i] != first_largest) {
        secound_largest = arr[i];
      }
    }
    return secound_largest;
  }
}

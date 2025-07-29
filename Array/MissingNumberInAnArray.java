public class MissingNumberInAnArray {
  public static void main(String[] args) {

  }

  public static int missingNumberInAnArray(int[] arr) {
    // Brute Force
    // int numberOfElements = arr.length ;
    // int originalSum = (numberOfElements * (numberOfElements + 1)) / 2;
    // int missingSum = 0;
    // for (int i = 0; i < arr.length; i++) {
    // missingSum += arr[i];
    // }
    // return originalSum - missingSum;
    //
    int xorSum = 0;
    int i;
    for (i = 0; i < arr.length; i++) {
      xorSum = xorSum ^ arr[i];
      xorSum = xorSum ^ i;
    }
    xorSum = xorSum ^ i;
    return xorSum;

  }
}

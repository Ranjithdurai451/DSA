public class MaxConsecutiveOnes {
  public static void main(String[] args) {

    maxConsecutiveOnes(new int[] { 1, 1, 1, 2, 3, 4, 1, 1, 2, 1, 1, 1, 1, 1, 1 });
  }

  public static int maxConsecutiveOnes(int[] arr) {
    int count = 0;
    int maxCount = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == 1)
        count++;
      else
        count = 0;
      maxCount = Math.max(maxCount, count);
    }
    return maxCount;

  }

}

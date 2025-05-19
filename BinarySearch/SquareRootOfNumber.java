
public class SquareRootOfNumber {
  public static void main(String[] args) {
    System.out.println(nThRootOfNumber(4, 69));
  }

  public static int squareRootOfNumber(int n) {
    if (n == 0)
      return 0;
    int low = 1;
    int high = n;
    int result = -1;
    while (low <= high) {
      int mid = low + (high - low) / 2;
      if ((mid * mid) <= n) {
        result = mid;
        low = mid + 1;
      } else {
        high = mid - 1;
      }
    }
    return result;
  }

  public static int nThRootOfNumber(int n, int m) {
    int low = 1;
    int high = n;
    while (low <= high) {
      int mid = low + (high - low) / 2;
      if (Math.pow(mid, n) == m) {
        return mid;
      } else if (Math.pow(mid, n) > m) {
        high = mid - 1;
      } else {
        low = mid + 1;
      }
    }
    return -1;
  }
}

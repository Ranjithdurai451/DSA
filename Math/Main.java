public class Main {
  public static void main(String[] args) {
    System.out.println(length(4457));
    System.out.println(reverse(4457));
    System.out.println();
  }

  public static int length(int n) {
    // if (n == 0) return 0;
    // return 1 + length(n / 10);

    // Without Recursion
    int count = 0;
    while (n > 0) {
      count++;
      n /= 10;
    }
    return count;
  }

  public static int reverse(int n) {
    // if (n < 9) return n;
    // return ((n % 10) * ((int) Math.pow(10, length(n / 10)))) + reverse(n / 10);

    // Without Recursion
    int num = 0;
    while (n > 0) {
      num = (num * 10) + (n % 10);
      n /= 10;
    }
    return num;
  }
}

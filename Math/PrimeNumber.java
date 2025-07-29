
public class PrimeNumber {

  public static void main(String[] args) {
    System.out.println(isPrime(5));
    // divisors(32);
  }

  public static void divisors(int n) {
    // for (int i = 1; i <= n; i++) {
    // if (n % i == 0)
    // System.out.print(i + " ");
    // }
    // Time Complexity O(n)

    for (int i = 1; i * i <= n; i++) {
      if (n % i == 0) {
        System.out.print(i + " ");
        if (n / i != i)
          System.out.print((n / i) + " ");
      }
    }
    System.out.println();
    // Time Complexity O(sqrt(n))
  }

  public static boolean isPrime(int n) {
    // if (n == 0 || n == 1)
    // return false;
    // if (n == 2)
    // return true;

    // if (n % 2 == 0)
    // return false;
    // for (int i = 3; i <= n / 2; i = i + 2) {
    // if (n % i == 0)
    // return false;
    // }
    // return true;
    if (n == 0 || n == 1)
      return false;
    if (n == 2)
      return true;
    if (n % 2 == 0)
      return false;

    int count = 0;
    for (int i = 1; i * i <= n; i = i + 2) {
      if (n % i == 0) {
        count++;
        if (n / i != i)
          count++;
      }
      if (count > 2)
        return false;
    }

    return true;
  }
}

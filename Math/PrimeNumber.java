public class PrimeNumber {

  public static void main(String[] args) {
    System.out.println(isPrime(5));
    // divisors(32);
  }

  /**
   * Prints all divisors of a given number n.
   * Optimizes divisor finding by iterating only up to the square root of n.
   * Time Complexity: O(sqrt(n))
   * Space Complexity: O(1)
   * @param n The number for which to find divisors.
   */
  public static void divisors(int n) {
    // Iterate up to the square root of n to find divisor pairs
    for (int i = 1; i * i <= n; i++) {
      if (n % i == 0) {
        System.out.print(i + " ");
        // Avoid printing the same divisor twice when n is a perfect square
        if (n / i != i)
          System.out.print((n / i) + " ");
      }
    }
    System.out.println();
  }

  /**
   * Checks if a given number n is prime.
   * Optimizes primality test by checking divisibility only up to the square root of n and skipping even numbers.
   * Time Complexity: O(sqrt(n))
   * Space Complexity: O(1)
   * @param n The number to check for primality.
   * @return true if n is prime, false otherwise.
   */
  public static boolean isPrime(int n) {
    // Handle base cases for 0, 1, and 2
    if (n == 0 || n == 1)
      return false;
    if (n == 2)
      return true;
    // Optimization: Even numbers greater than 2 are not prime
    if (n % 2 == 0)
      return false;

    int count = 0;
    // Iterate through odd numbers up to the square root of n
    for (int i = 1; i * i <= n; i = i + 2) {
      if (n % i == 0) {
        count++;
        // Increment count for the divisor pair
        if (n / i != i)
          count++;
      }
      // If more than two divisors are found, the number is not prime
      if (count > 2)
        return false;
    }

    return true;
  }
}
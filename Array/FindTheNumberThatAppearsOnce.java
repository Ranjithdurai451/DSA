public class FindTheNumberThatAppearsOnce {
  public static void main(String[] args) {
    System.out.println(findTheNumberThatAppearsOnce(new int[] { 1, 1, 2, 2, 3, 3, 4, 5, 5 }));
  }

  public static int findTheNumberThatAppearsOnce(int[] arr) {
    // Brute Focrce
    // We can count frequencies and check for count ==1 ;
    int xorSum = 0;
    for (int i = 0; i < arr.length; i++) {
      xorSum = xorSum ^ arr[i];
    }
    return xorSum;
  }

}

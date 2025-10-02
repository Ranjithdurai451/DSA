public class FindFirstUniqueCharacter {
  public static void main(String[] args) {
  }

  /**
   * Finds the index of the first unique character in a string using an array to store character frequencies.
   * The algorithm iterates through the string to count character occurrences, then iterates again to find the first character with a frequency of 1.
   * Time Complexity : O(n)
   * Space Complexity :O(1)
   * @param s The input string.
   * @return The index of the first unique character, or -1 if no unique character exists.
   */
  public static int findFirstUniqueCharacterUsingArray(String s) {
    // Method 3:Using Array
    int[] frequencyArray = new int[256];
    // Count the frequency of each character in the string
    for (char c : s.toCharArray()) {
      frequencyArray[c]++;
    }
    // Find the first character with a frequency of 1
    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      if (frequencyArray[c] == 1)
        return i;
    }
    return -1;
  }

}
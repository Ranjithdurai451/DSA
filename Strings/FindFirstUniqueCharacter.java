public class FindFirstUniqueCharacter {
  public static void main(String[] args) {
  }

  public static int findFirstUniqueCharacterUsingArray(String s) {
    // Method 1: Using Builtin Methods
    // for (int i = 0; i < s.length(); i++) {
    // char c = s.charAt(i);
    // if (s.indexOf(c) == s.lastIndexOf(c))
    // return i;
    // }
    // return -1;
    // Time Complexity: O(n^2)
    // Space Complexity: O(1)

    // Method 2:Using Hashmap
    // Map<Character, Integer> frequencyMap = new HashMap<>();
    // for (char c : s.toCharArray()) {
    // frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
    // }
    // for (int i = 0; i < s.length(); i++) {
    // char c = s.charAt(i);
    // if (frequencyMap.get(c) == 1)
    // return i;
    // }
    // return -1;
    // Time Complexity: O(n)
    // Space Complexity: O(n)

    // Method 3:Using Array
    int[] frequencyArray = new int[256];
    for (char c : s.toCharArray()) {
      frequencyArray[c]++;
    }
    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      if (frequencyArray[c] == 1)
        return i;
    }
    return -1;
    // Time Complexity : O(n)
    // Space Complexity :O(1)
  }

}

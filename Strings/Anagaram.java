import java.util.*;
public class Anagaram {
  public static void main(String[] args) {
    System.out.println(isAnagram("hello","lloel"));
  }
  /**
   * Checks if two strings are anagrams of each other.
   * Algorithm: Uses a frequency hashmap to count character occurrences.
   * Time Complexity: O(n), where n is the length of the strings.
   * Space Complexity: O(1), because the hashmap size is fixed (256).
   * @param s1 The first string.
   * @param s2 The second string.
   * @return True if the strings are anagrams, false otherwise.
   */
  public static boolean isAnagram(String s1,String s2){
    if(s1.length()!=s2.length()) return false;
    //Method :1 coverting the strings to char arrays and then sorting and comparing each char
    // char[] s1_arr=s1.toCharArray();
    // char[] s2_arr=s2.toCharArray();
    // Arrays.sort(s1_arr);
    // Arrays.sort(s2_arr);
    // for(int i=0;i<s1_arr.length;i++){
    //   if(s1_arr[i]!=s2_arr[i]) return false;
    // }
    int[] hash=new int[255];
    //Populate the hash array by incrementing for s1 and decrementing for s2
    for(int i=0;i<s1.length();i++){
      hash[s1.charAt(i)]++;
      hash[s2.charAt(i)]--;
    }
    //If it is an anagram all the values in the hash array should be zero
    for(int n:hash){
      if(n!=0) return false;
    }
     return true;
  }
}
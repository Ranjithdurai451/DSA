import java.util.*;
public class FrequencyOfCharactersInAString {
  

    public static void main(String[] args) {
        frequencyOfCharactersInAString("hello");
    }

    /**
     * Calculates and prints the frequency of each character in a given string.
     * Uses a HashMap to store character frequencies.
     * Time Complexity: O(n) - iterates through the string once.
     * Space Complexity: O(k) - where k is the number of unique characters in the string.
     * @param str The input string.
     */
    public static void frequencyOfCharactersInAString(String str) {
        //Use a hashmap to store the frequency of each character
        Map<Character, Integer> freq = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            //Increment the frequency of the character in the hashmap
            freq.put(c, freq.getOrDefault(c, 0)+1);
        }
        //Iterate through the hashmap and print the frequency of each character
        for(Map.Entry<Character,Integer> item:freq.entrySet()){
          System.out.println(item.getKey()+"->"+item.getValue());
        }
    }
}
import java.util.*;
public class Anagaram {
  public static void main(String[] args) {
    System.out.println(isAnagram("hello","lloel"));
  }
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
    for(int i=0;i<s1.length();i++){
      hash[s1.charAt(i)]++;
      hash[s2.charAt(i)]--;
    }
    for(int n:hash){
      if(n!=0) return false;
    }
     return true;
  }
}

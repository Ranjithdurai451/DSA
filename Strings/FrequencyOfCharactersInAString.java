public class FrequencyOfCharactersInAString {
  public static void main(String[] args) {
    frequencyOfCharactersInAString("hello");
  }

  public static void frequencyOfCharactersInAString(String str) {
    char[] char_arr = str.toCharArray();
    int count;
    for (int i = 0; i < char_arr.length; i++) {
      count = 1;
      if (char_arr[i] != '0') {
        for (int j = i + 1; j < char_arr.length; j++) {
          if (char_arr[i] == char_arr[j]) {
            count++;
            char_arr[j] = '0';
          }
        }

        System.out.println(char_arr[i] + " :" + count);
      }
    }
  }
}

package SlidingWindowAndTwoPointer;

public class LongestUniqueSubstring {

    public static void main(String[] args) {

    }

    public static int longestUniqueSubstring(String s) {

        int i = 0;
        int j = 0;
        int max = 0;
        while (i <= j && j < s.length()) {

            while (!IsUnique(s.substring(i, j + 1))) {
                i++;
            }
            max = Math.max(max, (j - i + 1));

            j++;
        }
        return max;
    }

    public static boolean IsUnique(String s) {

        boolean[] isCharacterAvailable = new boolean[256];
        for (char c : s.toCharArray()) {

            if (isCharacterAvailable[c])
                return false;
            isCharacterAvailable[c] = true;
        }
        return true;
    }
}

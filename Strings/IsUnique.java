public class IsUnique {
    public static void main(String[] args) {
        System.out.println(IsUnique("hel"));
    }

    /**
     * Determines if a string contains all unique characters using a boolean array.
     * This approach assumes ASCII characters (256 possible values).
     * Time Complexity: O(n), where n is the length of the string.
     * Space Complexity: O(1), because the boolean array size is fixed (256).
     * @param s The input string to check for unique characters.
     * @return true if all characters in the string are unique, false otherwise.
     */
    public static boolean IsUnique(String s) {

        boolean[] isCharacterAvailable = new boolean[256];
        for (char c : s.toCharArray()) {

            // If character already exists, string is not unique
            if (isCharacterAvailable[c])
                return false;
            isCharacterAvailable[c] = true; // Mark character as seen
        }
        return true; // All characters are unique
    }
}
public class IsUnique {
    public static void main(String[] args) {
        System.out.println(IsUnique("hel"));
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

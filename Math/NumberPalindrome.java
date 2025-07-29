public class NumberPalindrome {
    public static void main(String[] args) {
        System.out.println(numberPalindrome(1));
    }

    public static boolean numberPalindrome(int n) {
        if (n == ReverseANumber.reverseANumber(n))
            return true;
        return false;
    }
}

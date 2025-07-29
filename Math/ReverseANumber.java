public class ReverseANumber {
    public static void main(String[] args) {
        System.out.println(reverseANumber(123));
    }

    public static int reverseANumber(int n) {
        // int reversed = 0;
        // while (n > 0) {
        // reversed = (reversed * 10) + (n % 10);
        // n /= 10;
        // }
        // return reversed;

        return Integer.parseInt((new StringBuilder(Math.abs(n) + "")).reverse().toString());
    }
}

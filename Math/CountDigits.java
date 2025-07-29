public class CountDigits {
    public static void main(String[] args) {
        System.out.println(countDigits(123));
    }

    public static int countDigits(int number) {
        // if (number == 0)
        // return 1;
        // int count = 0;
        // while (number > 0) {
        // number /= 10;
        // count++;
        // }
        // return count;
        return (Math.abs(number) + "").length();
    }
}
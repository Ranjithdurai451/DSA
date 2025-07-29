import java.util.Arrays;

public class Main {
    public static void main(String args[]) {
        // numbersFromOneToN(5);
        // numbersFromNToOne(5);
        // System.out.println(sumOfNumbersFromOnetoN(3));
        // System.out.println(productOfNumbersFromOnetoN(5));
        // System.out.println(factorial(5));
        // sumTriangleFromArray(new int[] { 1, 2, 3, 4, 5 });
        // findUppercaseCharacter("weLH");
        // System.out.println(stringReverse("k"));
        // System.out.println(arraySortedOrNot(new int[] { 1, 2, 3, 4, 5 }, 5));
        // System.out.println(isPower(8, 3));
        System.out.println(reverseNumber(123));
        // System.out.println(countDigits(1));
    }

    public static void numbersFromOneToN(int n) {
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        numbersFromOneToN(n - 1);
        System.out.print(n + " ");
    }

    public static void numbersFromNToOne(int n) {
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        System.out.print(n + " ");
        numbersFromNToOne(n - 1);
    }

    public static int sumOfNumbersFromOnetoN(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumOfNumbersFromOnetoN(n - 1);
    }

    public static int productOfNumbersFromOnetoN(int n) {
        if (n == 1) {
            return 1;
        }
        return n * productOfNumbersFromOnetoN(n - 1);
    }

    public static int factorial(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        return n * factorial(n - 1);

    }

    public static void sumTriangleFromArray(int[] arr) {
        if (arr.length < 1)
            return;
        int[] temp = new int[arr.length - 1];

        for (int i = 0; i < arr.length - 1; i++) {
            temp[i] = arr[i] + arr[i + 1];
        }

        sumTriangleFromArray(temp);
        System.out.println(Arrays.toString(arr));
    }

    public static void findUppercaseCharacter(String s) {

        if (s.length() < 1) {
            System.out.println("The dosen't contain a uppercase character");
            return;
        }
        if (s.charAt(0) >= 'A' && s.charAt(0) <= 'Z') {
            System.out.println(s.charAt(0));
            return;
        }
        findUppercaseCharacter(s.substring(1));

    }

    public static String stringReverse(String s) {
        if (s.length() == 1) {
            return s;
        }
        return s.charAt(s.length() - 1) + stringReverse(s.substring(0, s.length() - 1));
    }

    public static boolean arraySortedOrNot(int a[], int n) {
        if (n == 1 || n == 0)
            return true;
        return a[n - 1] >= a[n - 2]
                && arraySortedOrNot(a, n - 1);
    }

    public static boolean isPower(int num, int base) {
        if (num == 1)
            return true;
        if (num < 0 || num % base != 0) {
            return false;
        }
        return isPower(num / base, base);

    }

    public static int sumOfDigits(int n) {
        if (n == 0) {
            return 0;
        }
        return (n % 10) + sumOfDigits(n / 10);
    }

    public static int reverseNumber(int n) {
        if (n >= 0 && n <= 9) {
            return n;
        }
        return ((n % 10) * (int) Math.pow(10, countDigits(n / 10))) + reverseNumber(n / 10);
    }

    public static int countDigits(int n) {
        if (n >= 0 && n <= 9) {
            return 1;
        }
        return 1 + countDigits(n / 10);
    }

}

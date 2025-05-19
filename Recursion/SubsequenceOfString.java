import java.util.ArrayList;

public class SubsequenceOfString {
    public static void main(String[] args) {
        // System.out.println(subsequenceCountReturnHelper("", "abc"));
    }

    // With Three parameters
    // Function to display all possible subsequences
    public static void subsequenceHelper(String processed, String unprocessed, int index) {
        if (index >= unprocessed.length()) {
            System.out.print(processed + " ");
            return;
        }
        // Take one
        subsequenceHelper(processed + unprocessed.charAt(index), unprocessed, index + 1);
        // Leave one
        subsequenceHelper(processed, unprocessed, index + 1);

    }

    // With two parameters
    // Function to display all possible subsequences
    public static void subsequenceHelper(String processed, String unprocessed) {
        if (unprocessed == "") {
            System.out.print(processed + " ");
            return;
        }
        // Take one
        subsequenceHelper(processed + unprocessed.charAt(0), unprocessed.substring(1));
        // Leave one
        subsequenceHelper(processed, unprocessed.substring(1));

    }

    // function to return an array that contains all possible subsequences
    // with two parameters
    public static ArrayList<String> subsequenceArrayReturnHelper(String processed, String unprocessed) {
        if (unprocessed == "") {

            var result = new ArrayList<String>();
            result.add(processed);
            return result;
        }

        // Take one
        var left = subsequenceArrayReturnHelper(processed + unprocessed.charAt(0), unprocessed.substring(1));
        // Leave one
        var right = subsequenceArrayReturnHelper(processed, unprocessed.substring(1));
        left.addAll(right);
        return left;

    }

    // getting all possible subsequences by passing array to the function
    public static void subsequenceArrayReturnHelper(String processed, String unprocessed,
            ArrayList<String> result) {
        if (unprocessed == "") {
            result.add(processed);
            return;
        }

        // Take one
        subsequenceArrayReturnHelper(processed + unprocessed.charAt(0), unprocessed.substring(1), result);
        // Leave one
        subsequenceArrayReturnHelper(processed, unprocessed.substring(1), result);
    }

    // function to return number of subsequences
    public static int subsequenceCountReturnHelper(String processed, String unprocessed) {
        if (unprocessed.isEmpty()) {
            return 1;
        }
        // Take it
        int left = subsequenceCountReturnHelper(processed + unprocessed.charAt(0), unprocessed.substring(1));
        int right = subsequenceCountReturnHelper(processed, unprocessed.substring(1));
        return left + right;
    }

}

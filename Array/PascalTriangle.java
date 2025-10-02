import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalTriangle {
    public static void main(String[] args) {
        // pascalTriangle(5);
        // System.out.println(getElement(5, 0));
        // System.out.println(generateRow(4));
        var res = pascalTriangle(5);
        for (List<Integer> list : res) {
            System.out.println(list.toString());
        }
    }

    /**
     * Computes an element in Pascal's Triangle using a combination-based approach.
     * The element at (row, column) is calculated using the formula n! / (r! * (n-r)!),
     * optimized to avoid full factorial calculations.
     * Time Complexity: O(column) - Iterates up to the column number.
     * Space Complexity: O(1) - Constant space.
     * @param row The row number (0-indexed).
     * @param column The column number (0-indexed).
     * @return The value of the element at the specified row and column.
     */
    // Brute Force
    public static int getElement(int row, int column) {
        // Optimization: Reduce factorial calculations by iteratively computing the result.
        int result = 1;
        for (int i = 0; i < column; i++) {
            result = result * (row - i);
            result = result / (i + 1);
        }

        return result;

    }

    // public static void pascalTriangle(int n) {
    // for(

    // int i = 0;i<n;i++)
    // {
    // for (int j = n - 2; j >= i; j--) {
    // System.out.print(" ");
    // }
    // for (int j = 0; j <= i; j++) {
    // System.out.print(getElement(i, j) + " ");
    // }
    // System.out.println();

    // }
    // }

    public static int factorial(int n) {
        if (n <= 1)
            return 1;
        return n * factorial(n - 1);
    }

    /**
     * Generates Pascal's Triangle up to a specified number of rows.
     * It iteratively generates each row using the generateRow method.
     * Time Complexity: O(n^2) - Iterates n times, each time calling generateRow which takes O(n).
     * Space Complexity: O(n^2) - Stores n rows, each with up to n elements.
     * @param n The number of rows to generate.
     * @return A list of lists representing Pascal's Triangle.
     */
    public static List<List<Integer>> pascalTriangle(int n) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            result.add(generateRow(i));

        }
        return result;

    }

    /**
     * Generates a specific row of Pascal's Triangle.
     * It efficiently calculates each element in the row based on the previous element,
     * avoiding redundant calculations.
     * Time Complexity: O(row) - Iterates through each element in the row.
     * Space Complexity: O(row) - Stores the elements of the row.
     * @param row The row number to generate (0-indexed).
     * @return A list of integers representing the generated row.
     */
    public static List<Integer> generateRow(int row) {

        List<Integer> result = new ArrayList<>();
        int colValue = 1;
        result.add(colValue);
        // Optimization: Calculate each element based on the previous element in the row.
        for (int i = 0; i < row; i++) {
            colValue *= row - i;
            colValue /= (i + 1);
            result.add(colValue);
        }
        return result;

    }
    // Optimal
}
import java.util.Arrays;

public class RotateMatrixByNinetyDegree {
    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        rotateMatrixByNinetyDegree(arr);
    }

    /**
     * Rotates a square matrix by 90 degrees clockwise.
     * The algorithm first transposes the matrix and then reverses each row.
     * Time Complexity: O(N^2), where N is the number of rows/columns in the matrix.
     * Space Complexity: O(N^2) due to the creation of a new transposed matrix.
     * @param arr The square matrix to rotate.
     */
    public static void rotateMatrixByNinetyDegree(int[][] arr) {
        // Create a new matrix to store the transpose of the original matrix
        int[][] trans = new int[arr.length][arr[0].length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                trans[j][i] = arr[i][j];

            }

        }
        int temp = 0;
        // Reverse each row of the transposed matrix
        for (int i = 0; i < trans.length; i++) {
            // Use two pointers to swap elements from the beginning and end of the row
            for (int j = 0, k = trans[0].length - 1; j < k; j++, k--) {
                temp = trans[i][j];
                trans[i][j] = trans[i][k];
                trans[i][k] = temp;

            }

        }
        for (int i = 0; i < trans.length; i++) {
            System.out.println(Arrays.toString(trans[i]));

        }
    }
}
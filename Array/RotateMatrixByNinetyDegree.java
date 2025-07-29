import java.util.Arrays;

public class RotateMatrixByNinetyDegree {
    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        rotateMatrixByNinetyDegree(arr);
    }

    public static void rotateMatrixByNinetyDegree(int[][] arr) {
        // Its Simple ,first Transpose ,and then we need swap first half by secound half

        int[][] trans = new int[arr.length][arr[0].length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                trans[j][i] = arr[i][j];

            }

        }
        int temp = 0;
        for (int i = 0; i < trans.length; i++) {
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

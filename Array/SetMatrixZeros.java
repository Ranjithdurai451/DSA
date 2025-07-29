import java.util.Arrays;

public class SetMatrixZeros {

    public static void main(String[] args) {
        int[][] arr = { { 0, 1, 2, 0 }, { 3, 4, 5, 2 }, { 1, 3, 1, 5 } };

        setMatrixZeros(arr);

    }

    public static void setMatrixZeros(int[][] arr) {
        // Check Take u forward for extreme Burte Force
        // Approach 1 :
        // we can maintain two single one dimensional array to mark the rows and columns
        // are zero or not by marking as 1
        // int[] rowMark = new int[arr.length];
        // int[] columnMark = new int[arr[0].length];

        // for (int i = 0; i < arr.length; i++) {
        // for (int j = 0; j < arr[0].length; j++) {
        // if (arr[i][j] == 0) {
        // rowMark[i] = 1;
        // columnMark[j] = 1;
        // }
        // }
        // }
        // for (int i = 0; i < arr.length; i++) {
        // for (int j = 0; j < arr[0].length; j++) {
        // if (rowMark[i] == 1 || columnMark[j] == 1)
        // arr[i][j] = 0;
        // }
        // }
        // Approach 2:
        // Here aslo we are using same logic but instead of having two extra arrays we
        // are using first row and first column as the storage ,since arr[0][0] is can
        // used either as row or column mark,so we need another varable to store another
        // mark,in case we are using arr[0][0] as rowMark and having new Varable called
        // firstColumnMark

        boolean firstColumnMark = false;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {

                if (arr[i][j] == 0) {
                    arr[i][0] = 0;
                    // Since we have separete variable for the first column,it should interfere with
                    // rowMark that's is arr[0][0]
                    if (j != 0)
                        arr[0][j] = 0;
                    else
                        firstColumnMark = true;
                }

            }
        }
        for (int i = 1; i < arr.length; i++) {
            for (int j = 1; j < arr[0].length; j++) {

                if (arr[i][0] == 0 || arr[0][j] == 0) {
                    arr[i][j] = 0;
                }

            }
        }

        if (arr[0][0] == 0) {
            for (int i = 0; i < arr[0].length; i++) {
                arr[0][i] = 0;
            }

        }
        if (firstColumnMark)
            for (int i = 0; i < arr.length; i++) {
                arr[i][0] = 0;
            }

    }
}
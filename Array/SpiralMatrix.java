import java.util.Arrays;

public class SpiralMatrix {
    public static void main(String[] args) {

        // int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        printSpiralMatrix(new int[][] { { 1, 2 } });
    }

    public static void printSpiralMatrix(int[][] arr) {
        int left = 0;
        int right = arr[0].length - 1;
        int bottom = arr.length - 1;
        int top = 0;
        int[] newArr = new int[arr.length * arr[0].length];
        int index = 0;

        while (left <= right && top <= bottom) {
            for (int i = left; i <= right; i++) {
                // System.out.print(arr[top][i]);
                newArr[index++] = arr[top][i];

            }
            top++;
            for (int i = top; i <= bottom; i++) {
                // System.out.print(arr[i][right]);
                newArr[index++] = arr[i][right];

            }
            right--;
            if (top <= bottom && left <= right)
                for (int i = right; i >= left; i--) {
                    // System.out.print(arr[bottom][i]);
                    newArr[index++] = arr[bottom][i];

                }
            bottom--;
            for (int i = bottom; i >= top; i--) {
                // System.out.println(arr[i][left]);
                newArr[index++] = arr[i][left];
            }
            left++;
        }
        System.out.println(Arrays.toString(newArr));
    }
}

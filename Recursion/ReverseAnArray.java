import java.util.Arrays;

public class ReverseAnArray {
    public static void main(String[] args) {

        int[] arr = new int[] { 1, 2, 3 };
        // reverse(arr, 0, arr.length - 1);
        reverse(arr, 0);
        System.out.println(Arrays.toString(arr));

    }

    // Using two parameters
    public static void reverse(int arr[], int start, int end) {
        if (start >= end)
            return;
        arr[start] = (arr[start] + arr[end]) - (arr[end] = arr[start]);
        reverse(arr, start + 1, end - 1);
    }

    // Using Single parameters
    public static void reverse(int arr[], int index) {
        if (index >= (arr.length - 1 - index))
            return;
        arr[index] = (arr[index] + arr[(arr.length - 1 - index)]) - (arr[(arr.length - 1 - index)] = arr[index]);
    
        reverse(arr, index + 1, (arr.length - 1 - index) - 1);
    }
}

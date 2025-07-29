import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        removeDuplicates(new int[] { 1, 2 });
    }

    public static void removeDuplicates(int arr[]) {
        int i = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[i] != arr[j])
                arr[++i] = arr[j];
        }
        System.out.println(Arrays.toString(arr));
    }
}

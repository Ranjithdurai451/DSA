package SlidingWindowAndTwoPointer;

public class RemoveDuplicatesInAnSortedArray {
    public static void main(String[] args) {
        removeDuplicatesInAnSortedArray(new int[] {
                1, 2, 2, 2, 3, 3, 3, 5, 5, 5,
        });
    }

    public static void removeDuplicatesInAnSortedArray(int[] arr) {

        int currentIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i == 0 || arr[i] != arr[i - 1]) {
                arr[currentIndex++] = arr[i];
            }
        }

        for (int i = 0; i < currentIndex; i++) {
            System.out.print(arr[i] + " ");

        }

    }
}

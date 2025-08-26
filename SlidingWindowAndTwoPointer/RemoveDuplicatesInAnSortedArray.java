public class RemoveDuplicatesInAnSortedArray {
    public static void main(String[] args) {
        removeDuplicatesInAnSortedArray(new int[] {
                1, 2, 2, 2, 3, 3, 3, 5, 5, 5,
        });
    }

    /**
     * Removes duplicate elements from a sorted integer array in-place.
     * The algorithm iterates through the array, maintaining a 'currentIndex'
     * to track the position of the next unique element.
     * Time Complexity: O(n) - single pass through the array
     * Space Complexity: O(1) - in-place modification
     * @param arr The sorted integer array to remove duplicates from.
     */
    public static void removeDuplicatesInAnSortedArray(int[] arr) {

        int currentIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            // Place the current element if it's the first element or different from the previous one
            if (i == 0 || arr[i] != arr[i - 1]) {
                arr[currentIndex++] = arr[i];
            }
        }

        // Print the array up to the index of the last unique element
        for (int i = 0; i < currentIndex; i++) {
            System.out.print(arr[i] + " ");

        }

    }
}
public class CheckArrayIsSorted {
    public static void main(String[] args) {
        System.out.println(checkArrayIsSorted(new int[] { 1, 2, 3, 4, 3 }));
    }

    /**
     * Checks if an array is sorted in ascending order.
     * The algorithm iterates through the array, comparing each element to the next.
     * If an element is greater than the next, the array is not sorted.
     * Time Complexity: O(n) - linear time, iterates through the array once.
     * Space Complexity: O(1) - constant space, uses only a few variables.
     * @param arr The array to check.
     * @return True if the array is sorted, false otherwise.
     */
    public static boolean checkArrayIsSorted(int arr[]) {
        
        for (int i = 0; i < arr.length - 1; i++) {
            // If the current element is greater than the next, the array is not sorted
            if (arr[i] > arr[i + 1])
                return false;
        }
        return true;
    }

}
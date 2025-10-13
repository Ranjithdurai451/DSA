public class CheckArrayIsSorted {
    public static void main(String[] args) {
        System.out.println(checkArrayIsSorted(new int[] { 1, 2, 3, 4, 3 }));
    }

   /**
    * Checks if the given array is sorted in ascending order.
    * The algorithm iterates through the array, comparing each element to the next.
    * Time Complexity: O(n) - linear, as it iterates through the array once.
    * Space Complexity: O(1) - constant, as it uses a fixed amount of extra space.
    * @param arr The array to check for sorting.
    * @return true if the array is sorted, false otherwise.
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
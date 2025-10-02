import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        removeDuplicates(new int[] { 1, 1,1,2,2,2,3,3,4,5,5,6,7,8,9 });
    }

    /**
     * Removes duplicate elements from a sorted integer array in-place.
     * The algorithm maintains a pointer 'i' to track the index of the last unique element found.
     * It iterates through the array, and if a new unique element is encountered, it's placed at index 'i+1'.
     * Time Complexity: O(n) - single pass through the array
     * Space Complexity: O(1) - in-place modification
     * @param arr The sorted integer array to remove duplicates from.
     */
    public static void removeDuplicates(int arr[]) {
        int i = 0; // Index of the last unique element

        // Iterate through the array starting from the second element
        for (int j = 1; j < arr.length; j++) {
            // If the current element is different from the last unique element
            if(arr[i]!=arr[j]){
                arr[++i]=arr[j]; // Place the new unique element at the next available position
            }
       
        }
        // Print the array with duplicates removed
        for(int j=0;j<=i;j++){
            System.out.print(arr[j]+" ");
        }
    }
}
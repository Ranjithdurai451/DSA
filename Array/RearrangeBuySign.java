import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RearrangeBuySign {
    public static void main(String[] args) {
        int[] arr = new int[] { 1, -2, 13, 432, -1, -3, 5, -5, -6 };
        rearrangeBuySign(arr);
        System.out.println(Arrays.toString(arr));

    }

    /**
     * Rearranges the elements of an array such that positive and negative numbers alternate.
     * The approach involves separating positive and negative numbers into separate lists,
     * then merging them back into the original array in an alternating fashion.
     * Time Complexity: O(n) - Iterating through the array multiple times.
     * Space Complexity: O(n) - Storing positive and negative numbers in separate lists.
     * @param arr The array to be rearranged.
     */
    public static void rearrangeBuySign(int arr[]) {
        // Separate positive and negative numbers
        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0)
                neg.add(arr[i]);
            else
                pos.add(arr[i]);
        }
        // Merge positive and negative numbers back into the array in alternating order
        int posIndex = 0;
        int negIndex = 0;
        int currentIndex = 0;
        while (posIndex < pos.size() && negIndex < neg.size()) {
            // Place positive number if the current index is even
            if (currentIndex % 2 == 0) {
                arr[currentIndex] = pos.get(posIndex);
                currentIndex++;
                posIndex++;
            } else {
                // Place negative number if the current index is odd
                arr[currentIndex] = neg.get(negIndex);
                currentIndex++;
                negIndex++;

            }
        }
        // Add any remaining positive numbers
        while (posIndex < pos.size()) {
            arr[currentIndex] = pos.get(posIndex);
            currentIndex++;
            posIndex++;

        }
        // Add any remaining negative numbers
        while (negIndex < neg.size()) {
            arr[currentIndex] = neg.get(negIndex);
            currentIndex++;
            negIndex++;

        }

    }
}
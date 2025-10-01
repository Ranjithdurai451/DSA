public class MajorityElement {
    public static void main(String[] args) {
        System.out.println(majorityElement(new int[] { 1, 1, 2, 3, 4, 1, 1, 1, 1, 3, 4 }));
    }

    /**
     * Finds the majority element in an array (element appearing more than n/2 times) using Moore's Voting Algorithm.
     * Time Complexity: O(n) - single pass through the array
     * Space Complexity: O(1) - constant extra space
     * @param arr The input array of integers.
     * @return The majority element in the array.
     */
    public static int majorityElement(int[] arr) {
        int currentElement = -1;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            // If count is zero, assign current element to the new candidate
            if (count <= 0) {
                currentElement = arr[i];
            }
            // Increment count if the current element is the same as the candidate
            if (arr[i] == currentElement)
                count++;
            // Decrement count if the current element is different from the candidate
            else
                count--;

        }
        return currentElement;

    }
}
public class MajorityElement {
    public static void main(String[] args) {
        System.out.println(majorityElement(new int[] { 1, 1, 2, 3, 4, 1, 1, 1, 1, 3, 4 }));
    }

    public static int majorityElement(int[] arr) {

        // Brute Force
        // We can find frequencies of each element and find the maximum frequency it
        // will take O(N) TC and SP O(N) for hashmap
        // Optimal
        int currentElement = -1;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (count <= 0) {
                currentElement = arr[i];
            }
            if (arr[i] == currentElement)
                count++;
            else
                count--;

        }
        return currentElement;

    }
}

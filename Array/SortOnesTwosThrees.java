import java.util.*;

public class SortOnesTwosThrees {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 0, 1, 0, 2, 1 };
        sortOnesTwosThrees(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void sortOnesTwosThrees(int[] arr) {
        // Brute Force
        // Any Sorting Technique
        // Time Complexity O (NlogN) or O(N2)
        // Optimal
        // Dutch National flag Algorithm
        // In this algorthim we spliting the array in three sections
        // 0,0,0,0,0,0, 1,1,1,1,1,1, unsorted 2,2,2,2,2,2
        // 0 l-1 l m-1 m h h+1 n-1
        // Using three pointers,Here mid and high is consider as a unsorted part ,in our
        // case own array is unsorted
        int low = 0;
        int mid = 0;
        int high = arr.length - 1;
        int temp;
        while (mid <= high) {
            if (arr[mid] == 0) {
                temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;
                low++;
                mid++;

            } else if (arr[mid] == 1) {
                mid++;

            } else {
                temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }

    }

}

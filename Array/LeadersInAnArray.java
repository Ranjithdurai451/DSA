import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class LeadersInAnArray {

    public static void main(String[] args) {

    }

    public static void leadersInAnArray(int[] arr) {
        // Brute Force we can manully compare each element with all elements on right
        // side
        // Time Complexity O(N2)
        // List<Integer> leaders = new ArrayList<>();
        // boolean isLeader;
        // for (int i = 0; i < arr.length; i++) {
        // isLeader = true;
        // for (int j = i + 1; j < arr.length; j++) {
        // if (arr[j] > arr[i]) {
        // isLeader = false;
        // break;
        // }

        // }
        // if (isLeader)
        // leaders.add(arr[i]);

        // }
        List<Integer> leaders = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] > max) {
                leaders.add(arr[i]);
                max = Math.max(max, arr[i]);
            }

        }
        System.out.println(leaders.toString());
    }
}
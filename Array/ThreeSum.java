import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ThreeSum {
    public static void main(String[] args) {
        var result = threeSum(new int[] { -1, 0, 1, 2, -1, -4 });
        // {-4,-1,-1,0,1,2}
        for (List<Integer> list : result) {
            System.out.println(list);
        }

    }

    public static List<List<Integer>> threeSum(int[] arr) {
        // TC O(N3)
        // Set<List<Integer>> result = new HashSet<>();
        // int sum = 0;
        // for (int i = 0; i < arr.length; i++) {
        // for (int j = i + 1; j < arr.length; j++) {
        // for (int k = j + 1; k < arr.length; k++) {
        // sum = arr[i] + arr[j] + arr[k];
        // var list = new ArrayList<>(Arrays.asList(arr[i], arr[j], arr[k]));
        // list.sort((a, b) -> Integer.compare(a, b));
        // if (sum == 0) {
        // result.add(list);
        // }
        // }

        // }
        // }
        // return new ArrayList<>(result);
        // TC O(N2)
        // SP O(N)
        // Set<List<Integer>> result = new HashSet<>();
        // for (int i = 0; i < arr.length; i++) {
        // Map<Integer, Integer> hash = new HashMap<>();
        // for (int j = i + 1; j < arr.length; j++) {

        // int remainingValue = -(arr[i] + arr[j]);
        // if (hash.containsKey(remainingValue)) {
        // var list = new ArrayList<>(Arrays.asList(arr[i], arr[j], remainingValue));
        // list.sort((a, b) -> Integer.compare(a, b));
        // result.add(list);

        // }

        // hash.put(arr[j], j);
        // }
        // }

        // return new ArrayList<>(result);
        Arrays.sort(arr);
        Set<List<Integer>> result = new HashSet<>();
        int j;
        int k;
        int sum;
        for (int i = 0; i < arr.length; i++) {
            if (i != 0 && arr[i] == arr[i - 1])
                continue;
            // System.out.println(i);

            j = i + 1;
            k = arr.length - 1;

            while (j < k) {
                if (i == 1)
                    System.out.println(arr[i] + " " + arr[j] + " " + arr[k]);
                sum = arr[i] + arr[j] + arr[k];
                if (sum == 0) {
                    result.add(new ArrayList<>(Arrays.asList(arr[i], arr[j], arr[k])));
                    j++;
                    k--;
                    while (j < k && arr[j] == arr[j - 1]) {
                        j++;
                    }
                    while (j < k && arr[k] == arr[k + 1]) {
                        k--;
                    }

                } else if (sum > 0) {
                    k--;

                } else {
                    j++;

                }
            }

        }
        return new ArrayList<>(result);
    }

}

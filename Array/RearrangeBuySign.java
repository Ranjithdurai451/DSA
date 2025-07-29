import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RearrangeBuySign {
    public static void main(String[] args) {
        int[] arr = new int[] { 1, -2, 13, 432, -1, -3, 5, -5, -6 };
        rearrangeBuySign(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void rearrangeBuySign(int arr[]) {
        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0)
                neg.add(arr[i]);
            else
                pos.add(arr[i]);
        }
        int posIndex = 0;
        int negIndex = 0;
        int currentIndex = 0;
        while (posIndex < pos.size() && negIndex < neg.size()) {
            if (currentIndex % 2 == 0) {
                arr[currentIndex] = pos.get(posIndex);
                currentIndex++;
                posIndex++;
            } else {
                arr[currentIndex] = neg.get(negIndex);
                currentIndex++;
                negIndex++;

            }
        }
        while (posIndex < pos.size()) {
            arr[currentIndex] = pos.get(posIndex);
            currentIndex++;
            posIndex++;

        }
        while (negIndex < neg.size()) {
            arr[currentIndex] = neg.get(negIndex);
            currentIndex++;
            negIndex++;

        }

    }
}

public class CheckArrayIsSorted {
    public static void main(String[] args) {
        System.out.println(checkArrayIsSorted(new int[] { 1, 2, 3, 4, 3 }));
    }

    public static boolean checkArrayIsSorted(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1])
                return false;
        }
        return true;
    }

}

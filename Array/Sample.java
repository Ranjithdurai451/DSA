import java.util.*;

public class Sample {
  public static void main(String[] args) {
    int arr1[] = new int[] { 1, 2, 3, 4, 5 };
    int arr2[] = new int[] { 1, 2, 3, 5, 6, 6, 7 };
    unionOfSortedArrays(arr1, arr2);
    int arr[] = new int[] { 1, 2, 3, 4, 5, 6, 7 };
    int arr3[] = new int[] { 1, 2, 3, 4, 5, 6, 7 };
    int arr4[] = new int[] { 1, 2, 3, 4, 5, 6, 7 };:
  
  }

  public static void removeDuplicates(int arr[]) {
    int index = 0;
    for (int i = 1; i < arr.length; i++) {
      if (arr[i] != arr[index]) {
        arr[++index] = arr[i];
      }
    }
    for (i = 0; i < max; i++) {

    }
    for (int i = 0; i < index; i++) {
      System.out.println(arr[i]);

    }
  }

  public static void leftRotate(int arr[], int n) {
    // Brute Force Approach
    // int t = n % arr.length;
    // for (int j = 0; j < t; j++) {
    // int temp = arr[0];
    // for (int i = 0; i < arr.length - 1; i++) arr[i] = arr[i + 1];
    // arr[arr.length - 1] = temp;
    // }
    // Better Approach
    int t = (n % arr.length);
    int temp[] = new int[t];
    for (int i = 0; i < t; i++) {
      temp[i] = arr[i];
    }
    for (int i = t; i < arr.length; i++) {
      arr[i - t] = arr[i];
    }
    for (int i = arr.length - t; i < arr.length; i++) {
      arr[i] = temp[i - (arr.length - t)];
    }
    // Optimal Approach
    // int t = n % arr.length;
    // reverse(arr, 0, t);
    // reverse(arr, t, arr.length);
    // reverse(arr, 0, arr.length);
  }

  public static void reverse(int arr[], int start, int end) {
    int temp;
    for (int i = start, j = end - 1; i < j; i++, j--) {
      temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;

    }
  }

  public static void unionOfSortedArrays(int arr1[], int[] arr2) {
    var ans = new TreeSet<Integer>();
    for (int n : arr1)
      ans.add(n);
    for (int n : arr2)
      ans.add(n);
    System.out.println(ans.toString());
    // var arr = new ArrayList<Integer>();
    // int i = 0;
    // int j = 0;
    // while (i < arr1.length && j < arr2.length) {
    // if (arr1[i] < arr2[j]) {
    // if ((arr.size() == 0 || arr.get(arr.size() - 1) != arr1[i]))
    // arr.add(arr1[i]);
    // i++;
    // } else if (arr1[i] == arr2[j]) {
    // if (arr.size() == 0 || arr.get(arr.size() - 1) != arr1[i])
    // arr.add(arr1[i]);
    // i++;
    // j++;
    // } else {
    // if (arr.size() == 0 || arr.get(arr.size() - 1) != arr2[j])
    // arr.add(arr2[j]);
    // j++;
    // }

    // }
    // while (i < arr1.length) {
    // if (arr.size() == 0 || arr.get(arr.size() - 1) != arr1[i])
    // arr.add(arr1[i]);
    // i++;
    // }
    // while (j < arr2.length) {
    // if (arr.size() == 0 || arr.get(arr.size() - 1) != arr2[j])
    // arr.add(arr2[j]);
    // j++;
    // }
    // System.out.println(arr.toString());
  }
}

import java.util.*;

public class FindPairsWithGivenSum {

  public static void main(String[] args) {

    int[] arr = new int[] { 1, 2, 3, 4, 9 };
    DoublyLinkedList dll = new DoublyLinkedList();
    dll.add(arr);
    var result = twoSumPairs(dll.head, 5);
    for (List<Integer> i : result) {
      System.out.println(i.toString());

    }
  }

  public static DoublyListNode findTail(DoublyListNode head) {
    DoublyListNode current = head;
    while (current.next != null) {
      current = current.next;
    }
    return current;
  }

  public static List<List<Integer>> twoSumPairs(DoublyListNode head, int target) {
    List<List<Integer>> result = new ArrayList<>();
    DoublyListNode left = head;
    DoublyListNode right = findTail(head);
    while (left.data < right.data) {
      if ((left.data + right.data) == target) {
        result.add(new ArrayList<>(Arrays.asList(left.data, right.data)));
        right = right.prev;
        left = left.next;
      } else if ((left.data + right.data) > target) {
        right = right.prev;
      } else {
        left = left.next;
      }
    }
    return result;
  }

}

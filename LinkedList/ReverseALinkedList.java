import java.util.*;

public class ReverseALinkedList {

  public static void main(String[] args) {
    LinkedList list = new LinkedList();
    int[] arr = new int[] { 1, 2, 2, 3, 4, };
    list.add(arr);
    Node newHead = recursiveReverse(list.getHead());
    list.display(newHead);
  }

  public static Node reverseALinkedList(Node head) {
    // Approach 1:
    // Using a external datastruture to store and iterate them reversely and create
    // a new Head
    // TC: O(2N);
    // SC:O(N)
    // Node current = head;
    // Stack<Integer> stack = new Stack<>();
    // while (current != null) {
    // stack.push(current.data);
    // current = current.next;
    // }
    // current = head;
    // while (current != null) {
    // current.data = stack.pop();
    // current = current.next;
    // }
    // return head;
    // Approach 2:
    // Changing the links
    // TC:O(N)
    if (head == null || head.next == null)
      return head;
    Node current = head;
    Node prev = null;
    Node next = null;
    while (current != null) {
      next = current.next;
      current.next = prev;
      prev = current;
      current = next;
    }
    return prev;
  }

  public static Node recursiveReverse(Node head) {
    // 1 -> 2 -> 3-> 4
    if (head == null || head.next == null)
      return head;
    Node newHead = recursiveReverse(head.next);
    head.next.next = head;
    head.next = null;
    return newHead;
  }
}

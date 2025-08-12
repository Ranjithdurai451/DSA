
public class MiddleOfALinkedList {
  public static void main(String[] args) {
    LinkedList list = new LinkedList();
    list.add(new int[] { 1, 2, 3, 4, 5, 6 });
    list.show();
    Node newHead = middleOfALinkedList(list.getHead());
    list.display(newHead);
  }

  public static Node middleOfALinkedList(Node head) {
    // Approach 1:
    // Finding the tmiddle Index with help size of the list
    // TC : O(N)
    // if (head == null || head.next == null)
    // return head;
    // int len = 0;
    // Node current = head;
    // while (current != null) {
    // len++;
    // current = current.next;
    // }
    // System.out.println(len);
    // current = head;
    // int mid = (len) / 2;
    // System.out.println(mid);
    // for (int i = 0; i <= mid; i++) {
    // if (mid == i)
    // return current;
    // current = current.next;
    // }
    // return null;
    // Approach 2:
    // Using fast and slow pointer
    // TC: O(N)
    if (head == null || head.next == null)
      return head;
    Node slow = head;
    Node fast = head;
    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }
    return slow;

  }
}

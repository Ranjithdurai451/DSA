public class RemoveMiddle {
  public static void main(String[] args) {
    int[] arr = new int[] { 1, 2, 3, 4, 5 };
    LinkedList list = new LinkedList();
    list.add(arr);
    list.show();
    removeMiddle(list.getHead());
    list.show();
  }

  public static Node removeMiddle(Node head) {
    if (head == null || head.next == null) {
      return null;
    }
    Node slow = head;
    Node fast = head;
    Node prev = null;

    while (fast != null && fast.next != null) {
      prev = slow;
      slow = slow.next;
      fast = fast.next.next;
    }
    prev.next = prev.next.next;
    return head;
  }
}

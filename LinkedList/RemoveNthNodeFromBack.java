public class RemoveNthNodeFromBack {
  public static void main(String[] args) {
    int[] arr = new int[] { 1, 2, 3, 4, 5 };
    LinkedList list = new LinkedList();
    list.add(arr);
    list.show();
    removeNthNodeFromBack(list.getHead(), 2);
    list.show();
  }

  public static Node removeNthNodeFromBack(Node head, int index) {
    Node slow = head;
    Node fast = head;
    for (int i = 0; i < index; i++) {
      fast = fast.next;

    }
    if (fast == null) {
      head = head.next;
      return head;
    }
    while (fast.next != null) {
      slow = slow.next;
      fast = fast.next;
    }
    slow.next = slow.next.next;
    return head;
  }
}

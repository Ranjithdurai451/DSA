public class MergeSort {
  public static void main(String[] args) {
    int[] arr = new int[] { 1, 2, 3, 4, 5 };
    LinkedList list = new LinkedList();
    list.add(arr);
    Node head = ReverseALinkedList.reverseALinkedList(list.getHead());
    list.display(head);

    list.display(mergeSort(head));
  }

  public static Node mergeSort(Node head) {
    if (head == null || head.next == null)
      return head;
    Node middle = MiddleOfALinkedList.middleOfALinkedList(head);
    Node left = head;
    Node right = middle.next;
    left = mergeSort(left);
    right = mergeSort(right);
    return merge(left, right);

  }

  public static Node merge(Node left, Node right) {
    Node newNode = new Node(-1);
    Node current = newNode;
    while (left != null && right != null) {

      if (left.data <= right.data) {
        current.next = left;
        left = left.next;
      } else {
        current.next = right;
        right = right.next;
      }
      current = current.next;
    }
    while (left != null) {

      current.next = left;
      left = left.next;
      current = current.next;
    }
    while (right != null) {

      current.next = right;
      right = right.next;
      current = current.next;
    }
    return newNode.next;
  }
}

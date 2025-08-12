public class AddOne {
  public static void main(String[] args) {
    int[] arr = new int[] { 9, 9 };
    LinkedList list = new LinkedList();
    list.add(arr);
    Node newNode = addOne(list.getHead());
    list.display(newNode);
  }

  public static Node addOne(Node head) {
    int carry = helper(head);
    if (carry == 1) {
      Node newNode = new Node(carry);
      newNode.next = head;
      return newNode;
    }
    return head;
  }

  public static int helper(Node head) {
    if (head == null)
      return 1;
    int carry = helper(head.next);
    int currentData = head.data + carry;
    head.data = currentData % 10;
    return currentData / 10;
  }
}

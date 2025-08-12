public class SortOnesTwosAndThrees {
  public static void main(String[] args) {

    int[] arr = new int[] { 0, 1, 2, 1, 2, 0, 0 };
    LinkedList list = new LinkedList();
    list.add(arr);
    sortOnesTwosAndThrees(list.getHead());
    list.show();
  }

  public static Node sortOnesTwosAndThrees(Node head) {
    Node OnesStart = new Node(-1);
    Node twosStart = new Node(-1);
    Node threesStart = new Node(-1);
    Node onesNode = OnesStart;
    Node twosNode = twosStart;
    Node threesNode = threesStart;
    Node current = head;
    while (current != null) {
      if (current.data == 0) {
        onesNode.next = current;
        onesNode = onesNode.next;
      } else if (current.data == 1) {
        twosNode.next = current;
        twosNode = twosNode.next;
      } else {
        threesNode.next = current;
        threesNode = threesNode.next;
      }
      current = current.next;
    }
    onesNode.next = twosStart.next;
    twosNode.next = threesStart.next;
    threesNode.next = null;
    return OnesStart.next;
  }
}

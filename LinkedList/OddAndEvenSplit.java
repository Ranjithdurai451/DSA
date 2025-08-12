public class OddAndEvenSplit {
  public static void main(String[] args) {
    int[] arr = new int[] { 1, 2, 3, 4, 5 };
    LinkedList list = new LinkedList();
    list.add(arr);
    oddAndEvenSplit(list.getHead());
    list.show();
  }

  public static Node oddAndEvenSplit(Node head) {
    if (head == null || head.next == null)
      return head;
    Node evenNodes = head.next;
    Node evenNodeStart = evenNodes;
    Node oddNodes = head;

    while (evenNodes != null && evenNodes.next != null) {
      oddNodes.next = evenNodes.next;
      oddNodes = oddNodes.next;
      evenNodes.next = oddNodes.next;
      evenNodes = evenNodes.next;
    }
    oddNodes.next = evenNodeStart;
    return head;
  }
}

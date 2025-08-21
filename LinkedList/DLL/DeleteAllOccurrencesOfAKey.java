public class DeleteAllOccurrencesOfAKey {
  public static void main(String[] args) {
    int[] arr = new int[] {
        1, 2, 3, 1, 4, 5, 1
    };
    DoublyLinkedList dll = new DoublyLinkedList();
    dll.add(arr);
    System.out.println(dll);
    delete(dll.head, 1);
    // System.out.println(dll);
  }

  public static void delete(DoublyListNode head, int k) {
    // This just involves in changing the links that is connecting previous and next
    // node of target
    DoublyListNode current = head;

    DoublyListNode prevNode;
    DoublyListNode nextNode;
    while (current != null) {
      if (head.data == k) {
        head = head.next;
      }
      if (current.data == k) {
        prevNode = current.prev;
        nextNode = current.next;
        if (prevNode != null)
          prevNode.next = nextNode;
        if (nextNode != null)
          nextNode.prev = prevNode;
      }
      current = current.next;
    }

    current = head;
    while (current != null) {
      System.out.print(current.data + " ");
      current = current.next;
    }

  }
}

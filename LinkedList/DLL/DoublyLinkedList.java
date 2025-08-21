public class DoublyLinkedList {
  DoublyListNode head;

  public void add(int data) {
    DoublyListNode newNode = new DoublyListNode(data);
    if (head == null) {
      head = newNode;
    } else {
      DoublyListNode current = head;
      while (current.next != null) {
        current = current.next;
      }
      current.next = newNode;
      newNode.prev = current;
    }
  }

  public void add(int[] arr) {
    for (int n : arr) {
      add(n);
    }
  }

  @Override
  public String toString() {
    StringBuilder result = new StringBuilder();
    DoublyListNode current = head;
    while (current != null) {
      if (current.next != null)
        result.append(current.data + " -> ");
      else
        result.append(current.data);
      current = current.next;
    }
    return result.toString();
  }
}

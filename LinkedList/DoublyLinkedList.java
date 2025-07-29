public class DoublyLinkedList {
  private static class Node {
    int data;
    Node prev;
    Node next;

    public Node(int data, Node prev, Node next) {
      this.data = data;
      this.prev = prev;
      this.next = next;
    }

    public Node(int data) {
      this.data = data;
    }

  }

  private Node head;
  private Node tail;

  public void add(int data) {
    if (head == null) {
      head = new Node(data);
      tail = head;
    } else {
      Node newNode = new Node(data, tail, null);
      tail.next = newNode;
      tail = newNode;
    }
  }

  public void add(int[] arr) {
    for (int i : arr) {
      add(i);
    }
  }

  public void show() {
    Node current = head;
    while (current != null) {
      System.out.print(current.data + " ");
      if (current.next != null)
        System.out.print("-> ");
      current = current.next;
    }
  }

  public int size() {
    int count = 0;
    Node current = head;
    while (current != null) {
      count++;
      current = current.next;
    }
    return count;
  }

  public boolean isEmpty() {
    return head == null;
  }

}

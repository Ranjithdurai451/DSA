public class LinkedList {
  Node head;

  private static class Node {
    int data;
    Node next;

    public Node(int data) {
      this.data = data;
    }

    public Node(int data, Node next) {
      this.data = data;
      this.next = next;
    }

  }

  public void add(int data) {
    Node newNode = new Node(data);
    if (head == null)
      head = newNode;
    else {
      Node current = head;
      while (current.next != null) {
        current = current.next;
      }
      current.next = newNode;

    }
  }

  public void show() {
    Node current = head;
    while (current != null) {
      if (current.next != null)
        System.out.print(current.data + " -> ");
      else
        System.out.print(current.data);
      current = current.next;
    }
    System.out.println();
  }
}

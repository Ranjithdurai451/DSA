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

  public void add(int val) {
    if (head == null) {
      head = new Node(val);
      tail = head;
    } else {
      Node newNode = new Node(val, tail, null);
      tail.next = newNode;
      tail = newNode;
    }
  }

  public void add(int[] arr) {
    for (int i : arr) {
      add(i);
    }
  }

  public void insertFirst(int val) {
    Node current = head;
    Node newNode = new Node(val);
    current.prev = newNode;
    newNode.next = current;
    head = newNode;
  }

  public void insert(int index, int val) {
    if (index < 0 || index >= size()) {
      System.out.println("Invalid Index");
      return;
    }
    Node newNode = new Node(val);
    if (index == 0) {
      insertFirst(val);
      return;
    }
    Node current = head;
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

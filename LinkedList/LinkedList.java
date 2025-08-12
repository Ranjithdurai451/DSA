public class LinkedList {
  Node head;

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

  public void add(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      add(arr[i]);
    }
  }

  public void insertFirst(int val) {
    Node newNode = new Node(val, head);
    head = newNode;
  }

  public void insertAt(int index, int val) {

    if (index < 0 || index >= size()) {
      System.out.println("Invalid Index");
      return;
    }
    if (index == 0) {
      insertFirst(val);
      return;
    }
    Node current = head;
    int i = 0;
    while (current != null) {
      if (i == index - 1) {
        Node newNode = new Node(val, current.next);
        current.next = newNode;
      }
      i++;
      current = current.next;
    }
  }

  public void deleteFirst() {
    if (head == null) {
      System.out.print("list is empty");
      return;
    }

    if (head != null)
      head = head.next;
  }

  public void deleteLast() {
    Node current = head;
    if (isEmpty()) {
      System.out.print("list is empty");
      return;
    }

    if (current.next == null) {
      head = null;
    } else {
      while (current.next.next != null) {
        current = current.next;
      }
      current.next = null;
    }
  }

  public void deleteAt(int index) {
    Node current = head;
    if (index < 0 || index >= size()) {
      System.out.println("Invalid Index");
      return;
    }
    int i = 0;
    if (index == 0) {
      deleteFirst();
      return;
    }
    while (current != null) {
      if (i == index - 1) {
        current.next = current.next.next;
        return;
      }
      i++;
      current = current.next;
    }
  }

  public void delete(int val) {
    if (isEmpty()) {
      System.out.println("list is empty");
      return;
    }
    if (head.data == val) {
      deleteFirst();
      return;
    }
    Node current = head.next;
    Node prev = head;
    while (current != null) {
      if (current.data == val) {
        prev.next = current.next;
        return;
      }
      prev = current;
      current = current.next;
    }
    System.out.println("Value not found");
  }

  public int size() {
    Node current = head;
    int count = 0;
    while (current != null) {
      count++;
      current = current.next;
    }
    return count;
  }

  public int[] toArray() {
    int[] result = new int[size()];
    int index = 0;
    Node current = head;
    while (current != null) {
      result[index++] = current.data;
      current = current.next;
    }
    return result;
  }

  public boolean isEmpty() {
    return head == null;
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

  public void display(Node head) {
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

  public Node getHead() {
    return head;
  }

}

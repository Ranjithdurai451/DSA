public class DoublyListNode {
  DoublyListNode prev;
  int data;
  DoublyListNode next;

  DoublyListNode(int data, DoublyListNode prev, DoublyListNode next) {
    this.data = data;
    this.prev = prev;
    this.next = next;
  }

  DoublyListNode(int data) {
    this.data = data;
  }

}

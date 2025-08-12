public class Palindrome {
  public static void main(String[] args) {
    int[] arr = new int[] { 1, 2, 2, 1, 1 };
    LinkedList list = new LinkedList();
    list.add(arr);
    System.out.println(isPalin(list.getHead()));
  }

  public static boolean isPalin(Node head) {
    Node slow = head;
    Node fast = head;
    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }
    fast = head;
    Node reversedHead;
    if (fast.next == null) {
      reversedHead = ReverseALinkedList.recursiveReverse(slow.next);
    } else {
      reversedHead = ReverseALinkedList.recursiveReverse(slow);
    }
    while (reversedHead != null) {
      if (fast.data != reversedHead.data)
        return false;
      reversedHead = reversedHead.next;
      fast = fast.next;
    }

    return true;
  }

}

public class StartingPointInTheLoop {

  public static Node startingPoint(Node head) {
    // We can use same hashmap method and fine the starting point but the tc will
    // O(N)
    // so we can solve using same tortoise and hare method,through some mathmatical
    // logic
    Node slow = head;
    Node fast = head;
    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
      if (slow == fast) {
        slow = head;
        while (slow != fast) {
          slow = slow.next;
          fast = fast.next;
        }
        return slow;
      }
    }
    return null;
  }
}

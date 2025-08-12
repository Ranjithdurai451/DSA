import java.util.HashMap;
import java.util.Map;

public class DetectLoop {
  public static void main(String[] args) {
  }

  public static boolean DetectLoop(Node head) {
    // Approach 1:
    // Using HashMap to store nodes ,and checking whether the node exists while
    // inserting a node in HashMap
    // TC :O(N)
    // SC:O(N)
    // if (head == null || head.next == null) {
    // return false;
    // }
    // Node current = head;
    // Map<Node, Integer> hash = new HashMap<>();
    // while (current != null) {
    // if (hash.containsKey(current)) {
    // return true;
    // }
    // hash.put(current, current.data);
    // current = current.next;
    // }
    // return false;
    // Approach 2:
    // Using Two pointers,tortoise and hare alogorithm
    // Here,how this basically works thats since the use two pointers they will
    // definitly meet at some point if cyclce
    // Why is that means whenever fast moves 2 steps and slow moves 1 steps
    // ,distance btw them will reduced by one step each time,so they will meet
    // TC: O(N)
    if (head == null || head.next == null)
      return false;
    Node slow = head;
    Node fast = head;

    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
      if (slow == fast)
        return true;
    }
    return false;
  }
}

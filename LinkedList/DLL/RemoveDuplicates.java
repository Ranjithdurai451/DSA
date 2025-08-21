public class RemoveDuplicates {
  /**
   * Removes consecutive duplicate nodes from a sorted doubly linked list.
   * Uses two pointers to iterate and relink the list, skipping duplicate values.
   * Time Complexity: O(n) - Iterates through the list once.
   * Space Complexity: O(1) - Uses constant extra space.
   * 
   * @param head The head of the doubly linked list.
   */
  public static void removeDuplicates(DoublyListNode head) {
    if (head == null)
      return; // Handle empty list case

    DoublyListNode current = head;
    DoublyListNode temp = head.next;

    // Iterate through the list, comparing current and next nodes
    while (temp != null) {
      // If the current node's data is different from the next node's data
      if (current.data != temp.data) {
        current.next = temp; // Link current node to the next unique node
        temp.prev = current; // Link the next unique node back to the current node
        current = current.next; // Move current to the next unique node
      }
      temp = temp.next; // Move to the next node
    }
    current.next = null; // Terminate the list after the last unique element
  }
}

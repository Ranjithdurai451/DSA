public class AddTwoNumbers {

  /**
   * Adds two numbers represented as linked lists.
   * Each node in the linked list represents a digit, and the digits are stored in
   * reverse order.
   * The algorithm iterates through both linked lists, adding the digits at each
   * position and handling any carry.
   * Time Complexity: O(max(m, n)), where m and n are the lengths of the input
   * lists.
   * Space Complexity: O(max(m, n)), for the length of the new list.
   * 
   * @param l1 The first linked list representing a number.
   * @param l2 The second linked list representing a number.
   * @return The linked list representing the sum of the two numbers.
   */
  public Node addTwoNumbers(Node l1, Node l2) {
    int carry = 0;
    Node numberOne = l1;
    Node numberTwo = l2;
    Node begin = new Node(-1);
    Node result = begin;
    int sum = 0;
    // Iterate until both lists are exhausted
    while (numberOne != null || numberTwo != null) {
      sum = carry;
      if (numberOne != null) {
        sum += numberOne.data;
        numberOne = numberOne.next;
      }
      if (numberTwo != null) {
        sum += numberTwo.data;
        numberTwo = numberTwo.next;
      }
      // Create a new node with the digit
      result.next = new Node(sum % 10);
      carry = sum / 10;
      result = result.next;
    }

    // Handle the remaining carry
    if (carry == 1) {
      result.next = new Node(1);
    }
    return begin.next;
  }
}

public class AddOne {

    public static void main(String[] args) {
        int[] arr = new int[] { 9, 9 };
        LinkedList list = new LinkedList();
        list.add(arr);
        Node newNode = addOne(list.getHead());
        list.display(newNode);
    }

    /**
     * Adds one to a number represented as a linked list.
     * The algorithm uses recursion to traverse the list from the least significant digit to the most significant digit,
     * adding one and handling any carry.
     * Time Complexity: O(n), where n is the number of digits in the number.
     * Space Complexity: O(n) due to the recursive call stack.
     * @param head The head of the linked list representing the number.
     * @return The head of the linked list representing the incremented number.
     */
    public static Node addOne(Node head) {
        int carry = helper(head); // Propagate carry from rightmost digit
        if (carry == 1) {
            // If there's a carry after processing all digits, add a new node at the beginning
            Node newNode = new Node(carry);
            newNode.next = head;
            return newNode;
        }
        return head;
    }

    /**
     * Recursive helper function to add one to the number represented by the linked list.
     * @param head The current node being processed.
     * @return The carry value after adding one to the current digit.
     */
    public static int helper(Node head) {
        if (head == null) return 1; // Base case: end of the list, return 1 to add to the last digit
        int carry = helper(head.next); // Recursively add one to the next digit
        int currentData = head.data + carry; // Add the carry to the current digit
        head.data = currentData % 10; // Update the current digit with the result modulo 10
        return currentData / 10; // Calculate and return the carry for the next digit
    }
}

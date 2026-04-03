/**
 * Problem: Remove Linked List Elements - LeetCode 203
 * 
 * Remove all nodes of the linked list that have value = val
 * and return the new head.
 * 
 * Approach:
 * - Use a dummy node to handle edge cases where head needs removal
 * - Traverse the list with prev and curr pointers
 * - If current node matches target value, skip it
 * - Otherwise move prev forward
 * 
 * Pattern: Linked List / Dummy Node Traversal
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class RemoveLinkedListElements {

    public ListNode removeElements(ListNode head, int val) {

        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode prev = dummy;
        ListNode curr = head;

        while (curr != null) {

            if (curr.val == val) {
                prev.next = curr.next; // remove current node
            } else {
                prev = curr; // move prev only if node is kept
            }

            curr = curr.next;
        }

        return dummy.next;
    }
}

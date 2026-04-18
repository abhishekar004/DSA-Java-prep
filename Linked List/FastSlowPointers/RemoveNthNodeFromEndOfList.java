/**
 * Problem: Remove Nth Node From End of List - LeetCode 19
 *
 * Remove the nth node from the end of the list and return its head.
 *
 * Approach:
 * - Use a dummy node to simplify edge cases
 * - Maintain a gap of n nodes between fast and slow pointers
 * - Move both pointers until fast reaches the end
 * - Delete the target node using slow pointer
 *
 * Pattern: Two Pointer / Fast-Slow Gap
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class RemoveNthNodeFromEnd {

    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode slow = dummy;
        ListNode fast = dummy;

        // Move fast n+1 steps ahead
        for (int i = 0; i <= n; i++) {
            fast = fast.next;
        }

        // Move both pointers
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        // Remove target node
        slow.next = slow.next.next;

        return dummy.next;
    }
}

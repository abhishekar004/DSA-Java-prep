/**
 * Problem: Swap Nodes in Pairs - LeetCode 24
 *
 * Given a linked list, swap every two adjacent nodes and return its head.
 *
 * Approach:
 * - Use a dummy node to simplify edge cases
 * - Iterate through list in pairs
 * - Swap nodes by adjusting pointers (not values)
 *
 * Pattern: Linked List / Pairwise Pointer Rewiring
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class SwapNodesInPairs {

    public ListNode swapPairs(ListNode head) {

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prev = dummy;

        while (prev.next != null && prev.next.next != null) {

            ListNode first = prev.next;
            ListNode second = first.next;

            // swap
            first.next = second.next;
            second.next = first;
            prev.next = second;

            // move prev forward
            prev = first;
        }

        return dummy.next;
    }
}

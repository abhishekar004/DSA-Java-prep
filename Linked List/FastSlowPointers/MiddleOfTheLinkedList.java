/**
 * Problem: Middle of the Linked List - LeetCode 876
 * 
 * Return the middle node of the linked list.
 * If there are two middle nodes, return the second one.
 * 
 * Approach:
 * - Use fast and slow pointers
 * - Slow moves 1 step, fast moves 2 steps
 * - When fast reaches end, slow is at middle
 * 
 * Pattern: Fast & Slow Pointers
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class MiddleOfLinkedList {

    public ListNode middleNode(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
}

/**
 * Problem: Linked List Cycle - LeetCode 141
 * 
 * Determine if a linked list has a cycle.
 * 
 * Approach:
 * - Use two pointers:
 *   slow moves 1 step
 *   fast moves 2 steps
 * - If a cycle exists, they will eventually meet
 * - If fast reaches null, no cycle exists
 * 
 * Pattern: Fast & Slow Pointers (Floyd’s Cycle Detection)
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

public class LinkedListCycle {

    public boolean hasCycle(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }

        return false;
    }
}

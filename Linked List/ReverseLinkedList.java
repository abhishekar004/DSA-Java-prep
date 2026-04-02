/**
 * Problem: Reverse Linked List - LeetCode 206
 * 
 * Reverse a singly linked list and return the new head.
 * 
 * Approach:
 * - Use three pointers:
 *   prev -> previous node
 *   curr -> current node
 *   next -> next node
 * - Reverse links one by one
 * 
 * Pattern: Linked List / Pointer Reversal
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class ReverseLinkedList {

    public ListNode reverseList(ListNode head) {

        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {

            ListNode next = curr.next; // store next node
            curr.next = prev;          // reverse current link
            prev = curr;               // move prev forward
            curr = next;               // move curr forward
        }

        return prev;
    }
}

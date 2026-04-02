/**
 * Problem: Remove Duplicates from Sorted List - LeetCode 83
 * 
 * Given the head of a sorted linked list, delete all duplicates
 * such that each element appears only once.
 * 
 * Approach:
 * - Since list is sorted, duplicates are adjacent
 * - Traverse list and skip duplicate nodes
 * 
 * Pattern: Linked List / In-place Traversal
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class RemoveDuplicatesFromSortedList {

    public ListNode deleteDuplicates(ListNode head) {

        ListNode curr = head;

        while (curr != null && curr.next != null) {

            if (curr.val == curr.next.val) {
                curr.next = curr.next.next; // skip duplicate
            } else {
                curr = curr.next;
            }
        }

        return head;
    }
}

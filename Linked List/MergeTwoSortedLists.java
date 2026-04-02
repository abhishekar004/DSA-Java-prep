/**
 * Problem: Merge Two Sorted Lists - LeetCode 21
 * 
 * Merge two sorted linked lists into one sorted list
 * and return the head of the merged list.
 * 
 * Approach:
 * - Use a dummy node to simplify merging
 * - Compare nodes from both lists
 * - Attach the smaller node to the result list
 * - At the end, attach the remaining nodes
 * 
 * Pattern: Linked List / Two Pointer Merge
 * Time Complexity: O(n + m)
 * Space Complexity: O(1)
 */

class MergeTwoSortedLists {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;

        while (list1 != null && list2 != null) {

            if (list1.val < list2.val) {
                tail.next = list1;
                list1 = list1.next;
            } else {
                tail.next = list2;
                list2 = list2.next;
            }

            tail = tail.next;
        }

        // Attach remaining nodes
        if (list1 != null) tail.next = list1;
        if (list2 != null) tail.next = list2;

        return dummy.next;
    }
}

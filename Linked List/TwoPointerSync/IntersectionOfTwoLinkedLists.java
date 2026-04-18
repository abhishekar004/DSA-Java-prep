/**
 * Problem: Intersection of Two Linked Lists - LeetCode 160
 *
 * Given the heads of two singly linked lists, return the node
 * at which the two lists intersect. If the two linked lists
 * have no intersection, return null.
 *
 * Approach:
 * - Use two pointers traversing both lists
 * - When a pointer reaches end, redirect it to the other list
 * - This equalizes traversal distance
 * - If intersection exists, they meet there
 * - Otherwise, both reach null at same time
 *
 * Pattern: Two Pointer / Path Switching
 * Time Complexity: O(m + n)
 * Space Complexity: O(1)
 */

public class IntersectionOfLinkedLists {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        ListNode p1 = headA;
        ListNode p2 = headB;

        while (p1 != p2) {
            p1 = (p1 == null) ? headB : p1.next;
            p2 = (p2 == null) ? headA : p2.next;
        }

        return p1; // intersection node or null
    }
}

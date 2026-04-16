/**
 * Problem: Palindrome Linked List - LeetCode 234
 *
 * Check if a singly linked list is a palindrome.
 *
 * Approach:
 * - Use slow and fast pointers to find middle
 * - Reverse second half of the list
 * - Compare first half and reversed second half
 *
 * Pattern: Fast & Slow Pointer + In-place Reversal
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class PalindromeLinkedList {

    public boolean isPalindrome(ListNode head) {

        if (head == null || head.next == null) return true;

        // Step 1: Find middle
        ListNode slow = head, fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step 2: Skip middle for odd length
        if (fast != null) {
            slow = slow.next;
        }

        // Step 3: Reverse second half
        ListNode secondHalf = reverse(slow);

        // Step 4: Compare both halves
        ListNode firstHalf = head;

        while (secondHalf != null) {
            if (firstHalf.val != secondHalf.val) return false;

            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }

        return true;
    }

    private ListNode reverse(ListNode head) {

        ListNode prev = null;

        while (head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }

        return prev;
    }
}

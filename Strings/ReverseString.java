/**
 * Problem: Reverse String - LeetCode 344
 * 
 * Given a character array, reverse the array in-place.
 * 
 * Approach:
 * - Use two pointers:
 *   left → start
 *   right → end
 * 
 * - Swap characters and move pointers inward
 * 
 * Pattern: Two Pointers (In-place Reversal)
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class ReverseString {

    public void reverseString(char[] s) {

        int left = 0;
        int right = s.length - 1;

        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            left++;
            right--;
        }
    }
}

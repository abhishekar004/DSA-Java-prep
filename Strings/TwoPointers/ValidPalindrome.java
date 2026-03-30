/**
 * Problem: Valid Palindrome - LeetCode 125
 * 
 * Given a string, determine if it is a palindrome,
 * considering only alphanumeric characters and ignoring cases.
 * 
 * Approach:
 * - Use two pointers (left, right)
 * - Skip non-alphanumeric characters
 * - Compare characters in lowercase
 * 
 * Pattern: Two Pointers (String Validation)
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class ValidPalindrome {

    public boolean isPalindrome(String s) {

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {

            // Skip non-alphanumeric from left
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }

            // Skip non-alphanumeric from right
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }

            // Compare after converting to lowercase
            if (Character.toLowerCase(s.charAt(left)) != 
                Character.toLowerCase(s.charAt(right))) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}

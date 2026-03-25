/**
 * Problem: Longest Palindromic Substring - LeetCode 5
 * 
 * Given a string s, return the longest palindromic substring.
 * 
 * Approach:
 * - A palindrome mirrors around its center
 * - For each index, expand around:
 *   1. Single center (odd length palindrome)
 *   2. Double center (even length palindrome)
 * - Track the longest palindrome found
 * 
 * Pattern: Expand Around Center
 * Time Complexity: O(n²)
 * Space Complexity: O(1)
 */

class LongestPalindromicSubstring {

    public String longestPalindrome(String s) {

        if (s == null || s.length() < 2) return s;

        int start = 0, end = 0;

        for (int i = 0; i < s.length(); i++) {

            int len1 = expand(s, i, i);       // Odd-length palindrome
            int len2 = expand(s, i, i + 1);   // Even-length palindrome
            int len = Math.max(len1, len2);

            if (len > (end - start + 1)) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }

        return s.substring(start, end + 1);
    }

    private int expand(String s, int left, int right) {

        while (left >= 0 && right < s.length() &&
               s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }

        return right - left - 1;
    }
}

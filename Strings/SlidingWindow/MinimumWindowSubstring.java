import java.util.*;

/**
 * Problem: Minimum Window Substring - LeetCode 76
 * 
 * Given two strings s and t, return the minimum window substring
 * of s such that every character in t is included in the window.
 * If no such substring exists, return "".
 * 
 * Approach:
 * - Use sliding window with two hash maps:
 *   need   -> frequency of chars in t
 *   window -> frequency of chars in current window
 * 
 * - Expand right pointer until all required characters are matched
 * - Then shrink from left to find the minimum valid window
 * 
 * Pattern: Sliding Window (Variable Size + Frequency Map)
 * Time Complexity: O(n + m)
 * Space Complexity: O(k)
 */

class MinimumWindowSubstring {

    public String minWindow(String s, String t) {

        if (s.length() < t.length()) return "";

        Map<Character, Integer> need = new HashMap<>();
        Map<Character, Integer> window = new HashMap<>();

        // Build frequency map for t
        for (char c : t.toCharArray()) {
            need.put(c, need.getOrDefault(c, 0) + 1);
        }

        int required = need.size();
        int formed = 0;

        int left = 0, right = 0;
        int minLen = Integer.MAX_VALUE;
        int start = 0;

        while (right < s.length()) {
            char rightChar = s.charAt(right);

            window.put(rightChar, window.getOrDefault(rightChar, 0) + 1);

            if (need.containsKey(rightChar) &&
                window.get(rightChar).intValue() == need.get(rightChar).intValue()) {
                formed++;
            }

            // Try shrinking window
            while (left <= right && formed == required) {
                char leftChar = s.charAt(left);

                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    start = left;
                }

                window.put(leftChar, window.get(leftChar) - 1);

                if (need.containsKey(leftChar) &&
                    window.get(leftChar) < need.get(leftChar)) {
                    formed--;
                }

                left++;
            }

            right++;
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen);
    }
}

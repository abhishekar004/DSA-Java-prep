import java.util.*;

/**
 * Problem: Longest Substring Without Repeating Characters - LeetCode 3
 * 
 * Approach:
 * - Use sliding window with HashSet
 * - Expand window using right pointer
 * - If duplicate found, shrink window from left until duplicate is removed
 * 
 * Pattern: Sliding Window (Variable Size)
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

class LongestSubstringWithoutRepeating {

    public int lengthOfLongestSubstring(String s) {

        int left = 0;
        int maxLength = 0;

        HashSet<Character> set = new HashSet<>();

        for (int right = 0; right < s.length(); right++) {

            // Remove characters until no duplicate
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }

            set.add(s.charAt(right));
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}

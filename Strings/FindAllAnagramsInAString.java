import java.util.*;

/**
 * Problem: Find All Anagrams in a String - LeetCode 438
 * 
 * Given two strings s and p, return all starting indices
 * of p's anagrams in s.
 * 
 * Approach:
 * - Use fixed-size sliding window of length p.length()
 * - Track frequency counts of characters
 * - Maintain a match counter to avoid comparing all 26 chars every time
 * 
 * Pattern: Sliding Window (Fixed Size + Frequency Count)
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class FindAllAnagrams {

    public List<Integer> findAnagrams(String s, String p) {

        List<Integer> result = new ArrayList<>();
        if (p.length() > s.length()) return result;

        int[] pCount = new int[26];
        int[] windowCount = new int[26];

        // Build frequency arrays
        for (int i = 0; i < p.length(); i++) {
            pCount[p.charAt(i) - 'a']++;
            windowCount[s.charAt(i) - 'a']++;
        }

        // Count how many characters currently match
        int matches = 0;
        for (int i = 0; i < 26; i++) {
            if (pCount[i] == windowCount[i]) {
                matches++;
            }
        }

        int left = 0;

        for (int right = p.length(); right < s.length(); right++) {

            if (matches == 26) {
                result.add(left);
            }

            int rightIndex = s.charAt(right) - 'a';
            int leftIndex = s.charAt(left) - 'a';

            // Add new character to window
            windowCount[rightIndex]++;
            if (windowCount[rightIndex] == pCount[rightIndex]) {
                matches++;
            } else if (windowCount[rightIndex] == pCount[rightIndex] + 1) {
                matches--;
            }

            // Remove old character from window
            windowCount[leftIndex]--;
            if (windowCount[leftIndex] == pCount[leftIndex]) {
                matches++;
            } else if (windowCount[leftIndex] == pCount[leftIndex] - 1) {
                matches--;
            }

            left++;
        }

        // Check final window
        if (matches == 26) {
            result.add(left);
        }

        return result;
    }
}

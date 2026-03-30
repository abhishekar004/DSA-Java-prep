/**
 * Problem: Permutation in String - LeetCode 567
 * 
 * Given two strings s1 and s2, return true if s2 contains
 * a permutation of s1 as a substring.
 * 
 * Approach:
 * - Use fixed-size sliding window of length s1.length()
 * - Track frequency counts of 26 lowercase letters
 * - Maintain how many character counts currently match
 * 
 * Pattern: Sliding Window (Fixed Size + Frequency Count)
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class PermutationInString {

    public boolean checkInclusion(String s1, String s2) {

        if (s1.length() > s2.length()) return false;

        int[] s1Count = new int[26];
        int[] windowCount = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            s1Count[s1.charAt(i) - 'a']++;
            windowCount[s2.charAt(i) - 'a']++;
        }

        int matches = 0;
        for (int i = 0; i < 26; i++) {
            if (s1Count[i] == windowCount[i]) {
                matches++;
            }
        }

        int left = 0;

        for (int right = s1.length(); right < s2.length(); right++) {

            if (matches == 26) return true;

            int indexRight = s2.charAt(right) - 'a';
            int indexLeft = s2.charAt(left) - 'a';

            // Add new char
            windowCount[indexRight]++;
            if (windowCount[indexRight] == s1Count[indexRight]) {
                matches++;
            } else if (windowCount[indexRight] - 1 == s1Count[indexRight]) {
                matches--;
            }

            // Remove old char
            windowCount[indexLeft]--;
            if (windowCount[indexLeft] == s1Count[indexLeft]) {
                matches++;
            } else if (windowCount[indexLeft] + 1 == s1Count[indexLeft]) {
                matches--;
            }

            left++;
        }

        return matches == 26;
    }
}

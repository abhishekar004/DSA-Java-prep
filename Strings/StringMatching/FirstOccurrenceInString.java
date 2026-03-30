/**
 * Problem: Find the Index of the First Occurrence in a String - LeetCode 28
 * 
 * Approach:
 * - Use sliding window (brute force string matching)
 * - Try matching the needle at every valid index
 * - Only iterate till (n - m) to avoid out-of-bounds
 * 
 * Pattern: Sliding Window / String Matching
 * Time Complexity: O(n * m)
 * Space Complexity: O(1)
 */

class ImplementStrStr {

    public int strStr(String haystack, String needle) {

        int n = haystack.length();
        int m = needle.length();

        // Edge cases
        if (m == 0) return 0;
        if (m > n) return -1;

        // Check only valid starting indices
        for (int i = 0; i <= n - m; i++) {

            int j = 0;

            // Match characters one by one
            while (j < m && haystack.charAt(i + j) == needle.charAt(j)) {
                j++;
            }

            // If full match found
            if (j == m) {
                return i;
            }
        }

        return -1;
    }
}

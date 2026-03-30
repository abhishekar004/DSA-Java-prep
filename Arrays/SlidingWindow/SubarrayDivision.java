/**
 * Problem: Subarray Division (Birthday Chocolate) - HackerRank
 * 
 * Find the number of contiguous subarrays of length m
 * whose sum equals d.
 * 
 * Approach:
 * - Use a fixed-size sliding window of size m
 * - Maintain the sum of the current window
 * - Slide the window across the array efficiently
 * 
 * Pattern: Sliding Window (Fixed Size)
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class SubarrayDivision {

    public static int birthday(List<Integer> s, int d, int m) {

        int count = 0;
        int left = 0;
        int windowSum = 0;

        for (int right = 0; right < s.size(); right++) {

            windowSum += s.get(right);

            // Keep window size exactly m
            if (right - left + 1 > m) {
                windowSum -= s.get(left);
                left++;
            }

            // Check valid window
            if (right - left + 1 == m && windowSum == d) {
                count++;
            }
        }

        return count;
    }
}

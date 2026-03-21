/*
LeetCode 1283 - Find the Smallest Divisor Given a Threshold

Topic: Binary Search on Answer
Difficulty: Medium


Problem:
Find the smallest divisor such that the sum of divisions
is less than or equal to threshold.

Approach:
1. Search range: 1 → max(nums)
2. Binary search on divisor
3. Use ceil division to compute sum

Time Complexity: O(n log max)
Space Complexity: O(1)
*/

class SmallestDivisor {

    public int smallestDivisor(int[] nums, int threshold) {

        int low = 1, high = 0;

        for (int n : nums) {
            high = Math.max(high, n);
        }

        while (low < high) {

            int mid = low + (high - low) / 2;

            if (isValid(nums, threshold, mid)) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }

    private boolean isValid(int[] nums, int threshold, int d) {

        int sum = 0;

        for (int n : nums) {
            sum += (n + d - 1) / d;
        }

        return sum <= threshold;
    }
}

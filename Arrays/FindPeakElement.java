/*
LeetCode 162 - Find Peak Element

Topic: Arrays, Binary Search
Difficulty: Medium

Problem:
Find any peak element in the array.

Approach:
Use binary search on slope:

- If nums[mid] < nums[mid+1] → move right
- Else → move left

Time Complexity: O(log n)
Space Complexity: O(1)
*/

class FindPeakElement {

    public int findPeakElement(int[] nums) {

        int left = 0;
        int right = nums.length - 1;

        while (left < right) {

            int mid = left + (right - left) / 2;

            if (nums[mid] < nums[mid + 1]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return left;
    }
}

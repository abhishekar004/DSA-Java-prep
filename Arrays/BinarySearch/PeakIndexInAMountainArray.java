/*
LeetCode 852 - Peak Index in a Mountain Array

Topic: Arrays, Binary Search
Difficulty: Medium

Problem:
Find the peak index in a mountain array.

Approach:
Use binary search on slope:

- If arr[mid] < arr[mid+1] → move right
- Else → move left

Time Complexity: O(log n)
Space Complexity: O(1)
*/

class PeakIndexMountain {

    public int peakIndexInMountainArray(int[] arr) {

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            int mid = left + (right - left) / 2;

            if (arr[mid] < arr[mid + 1]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return left;
    }
}

/*
LeetCode 977 - Squares of a Sorted Array

Problem:
Given an integer array nums sorted in non-decreasing order,
return an array of the squares of each number sorted in non-decreasing order.

Example:
Input: nums = [-7,-3,2,3,11]
Output: [4,9,9,49,121]

Approach:
Use Two Pointer Technique.

1. The largest square will come from either:
   - the leftmost element
   - the rightmost element

2. Compare squares of both ends.
3. Place the larger square at the end of the result array.
4. Move pointers accordingly.

Time Complexity: O(n)
Space Complexity: O(n)
*/

class Solution {

    public int[] sortedSquares(int[] nums) {

        int n = nums.length;
        int[] result = new int[n];

        int left = 0;
        int right = n - 1;
        int pos = n - 1;

        while (left <= right) {

            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];

            if (leftSquare > rightSquare) {
                result[pos] = leftSquare;
                left++;
            } else {
                result[pos] = rightSquare;
                right--;
            }

            pos--;
        }

        return result;
    }
}

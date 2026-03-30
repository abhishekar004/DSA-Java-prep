/*
LeetCode 53 - Maximum Subarray

Topic: Arrays, Kadane's Algorithm
Difficulty: Medium

Problem:
Given an integer array nums, find the contiguous subarray 
(containing at least one number) which has the largest sum 
and return its sum.

Example:
Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation:
The subarray [4,-1,2,1] has the largest sum = 6.

Approach (Kadane's Algorithm):
1. Maintain a running sum of the current subarray.
2. If adding the current number is worse than starting fresh,
   start a new subarray from the current number.
3. Track the maximum sum seen so far.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class MaximumSubarray {

    public int maxSubArray(int[] nums) {

        int currentSum = nums[0];
        int maxSum = nums[0];

        for(int i = 1; i < nums.length; i++){

            currentSum = Math.max(nums[i], currentSum + nums[i]);

            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }
}

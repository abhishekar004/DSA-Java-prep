/*
LeetCode 189 - Rotate Array

Topic: Arrays, Reversal Technique
Difficulty: Medium

Approach:
1. Reverse first n-k elements
2. Reverse last k elements
3. Reverse the whole array

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {

    public void rotate(int[] nums, int k) {

        int n = nums.length;
        k = k % n;

        reverse(nums, 0, n - k - 1);
        reverse(nums, n - k, n - 1);
        reverse(nums, 0, n - 1);
    }

    public void reverse(int[] nums, int left, int right){

        while(left < right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;

            left++;
            right--;
        }
    }
}

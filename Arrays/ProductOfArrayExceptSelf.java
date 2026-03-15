/*
LeetCode 238 - Product of Array Except Self

Topic: Arrays, Prefix Product, Suffix Product
Difficulty: Medium
Day: 3

Problem:
Given an integer array nums, return an array answer such that
answer[i] is equal to the product of all the elements of nums except nums[i].

You must solve it without using division and in O(n) time.

Example:
Input: nums = [1,2,3,4]
Output: [24,12,8,6]

Approach:
1. Store left products in result array
2. Traverse from right while maintaining rightProduct
3. Multiply both to get final result

Time Complexity: O(n)
Space Complexity: O(1) (excluding output array)
*/

class ProductOfArrayExceptSelf {

    public int[] productExceptSelf(int[] nums) {

        int n = nums.length;
        int[] result = new int[n];

        result[0] = 1;

        // Left products
        for(int i = 1; i < n; i++){
            result[i] = result[i-1] * nums[i-1];
        }

        int rightProduct = 1;

        // Right products
        for(int i = n-1; i >= 0; i--){
            result[i] = result[i] * rightProduct;
            rightProduct = rightProduct * nums[i];
        }

        return result;
    }
}

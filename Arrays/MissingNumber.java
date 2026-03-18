/*
LeetCode 268 - Missing Number

Topic: Arrays, Math
Difficulty: Easy

Approach:
Use sum formula:
total = n * (n + 1) / 2

Subtract actual sum to find missing number.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class MissingNumber {

    public int missingNumber(int[] nums) {

        int n = nums.length;

        int totalSum = n * (n + 1) / 2;

        int sum = 0;

        for(int num : nums){
            sum += num;
        }

        return totalSum - sum;
    }
}


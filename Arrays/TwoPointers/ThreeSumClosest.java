/*
LeetCode 16 - 3Sum Closest

Topic: Arrays, Two Pointers
Difficulty: Medium

Problem:
Given an integer array nums and an integer target,
find three integers such that the sum is closest to target.

Return the sum of the three integers.

Approach:
1. Sort the array
2. Fix one element
3. Use two pointers to find closest sum
4. Track minimum difference

Time Complexity: O(n^2)
Space Complexity: O(1)
*/

import java.util.*;

class ThreeSumClosest {

    public int threeSumClosest(int[] nums, int target) {

        Arrays.sort(nums);

        int bestSum = nums[0] + nums[1] + nums[2];

        for(int i = 0; i < nums.length - 2; i++){

            int left = i + 1;
            int right = nums.length - 1;

            while(left < right){

                int sum = nums[i] + nums[left] + nums[right];

                // Update best sum
                if(Math.abs(sum - target) < Math.abs(bestSum - target)){
                    bestSum = sum;
                }

                // Move pointers
                if(sum < target){
                    left++;
                }
                else if(sum > target){
                    right--;
                }
                else{
                    return sum; // exact match
                }
            }
        }

        return bestSum;
    }
}

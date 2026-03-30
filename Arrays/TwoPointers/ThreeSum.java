/*
LeetCode 15 - 3Sum

Topic: Arrays, Two Pointers, Sorting
Difficulty: Medium

Problem:
Find all unique triplets in the array which gives the sum of zero.

Example:
Input: nums = [-1,0,1,2,-1,-4]
Output: [[-1,-1,2],[-1,0,1]]

Approach:
1. Sort the array
2. Fix one element
3. Use two pointers to find remaining two numbers
4. Skip duplicates

Time Complexity: O(n^2)
Space Complexity: O(1) (excluding output)
*/

import java.util.*;

class ThreeSum {

    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        for(int i = 0; i < nums.length - 2; i++){

            // Skip duplicates
            if(i > 0 && nums[i] == nums[i - 1]) continue;

            // Optimization
            if(nums[i] > 0) break;

            int left = i + 1;
            int right = nums.length - 1;

            while(left < right){

                int sum = nums[i] + nums[left] + nums[right];

                if(sum == 0){

                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    left++;
                    right--;

                    // Skip duplicates
                    while(left < right && nums[left] == nums[left - 1]) left++;
                    while(left < right && nums[right] == nums[right + 1]) right--;
                }

                else if(sum < 0){
                    left++;
                }

                else{
                    right--;
                }
            }
        }

        return result;
    }
}

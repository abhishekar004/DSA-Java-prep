/*
LeetCode 448 - Find All Numbers Disappeared in an Array

Topic: Arrays, In-place Marking
Difficulty: Easy

Problem:
Given an array nums of size n where nums[i] is in the range [1, n],
return all the numbers in the range [1, n] that do not appear in nums.

Approach:
1. Use index mapping (value → index = value - 1)
2. Mark visited indices as negative
3. Positive indices indicate missing numbers

Time Complexity: O(n)
Space Complexity: O(1) (excluding output)
*/

import java.util.*;

class FindDisappearedNumbers {

    public List<Integer> findDisappearedNumbers(int[] nums) {

        List<Integer> result = new ArrayList<>();

        // Mark visited indices
        for(int i = 0; i < nums.length; i++){
            int index = Math.abs(nums[i]) - 1;

            if(nums[index] > 0){
                nums[index] = -nums[index];
            }
        }

        // Collect missing numbers
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > 0){
                result.add(i + 1);
            }
        }

        return result;
    }
}

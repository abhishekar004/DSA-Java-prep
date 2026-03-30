/*
LeetCode 442 - Find All Duplicates in an Array

Topic: Arrays, In-place Hashing (Index Marking)
Difficulty: Medium

Problem:
Given an integer array nums of size n where nums[i] is in the range [1, n],
return all elements that appear twice.

Approach:
1. Use index mapping (value → index = value - 1)
2. Mark visited indices as negative
3. If already negative → duplicate found

Time Complexity: O(n)
Space Complexity: O(1) (excluding output)
*/

import java.util.*;

class FindDuplicates {

    public List<Integer> findDuplicates(int[] nums) {

        List<Integer> result = new ArrayList<>();

        for(int i = 0; i < nums.length; i++){

            int index = Math.abs(nums[i]) - 1;

            if(nums[index] < 0){
                result.add(Math.abs(nums[i]));
            }
            else{
                nums[index] = -nums[index];
            }
        }

        return result;
    }
}

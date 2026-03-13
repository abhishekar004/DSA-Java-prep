/*
Problem: Two Sum
Platform: LeetCode #1
Topic: Arrays + HashMap

Approach:
Use HashMap to store numbers and their indices.
For each number check if (target - current number) exists.

Time Complexity: O(n)
Space Complexity: O(n)
*/

import java.util.*;

class TwoSum {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++){

            int complement = target - nums[i];

            if(map.containsKey(complement)){
                return new int[]{map.get(complement), i};
            }

            map.put(nums[i], i);
        }

        return new int[]{};
    }
}

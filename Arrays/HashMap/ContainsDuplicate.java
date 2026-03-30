/*
LeetCode 217 - Contains Duplicate

Problem:
Given an integer array nums, return true if any value appears at least twice
in the array, and return false if every element is distinct.

Example:
Input: nums = [1,2,3,1]
Output: true

Approach:
Use a HashSet to store visited elements.
If an element already exists in the set, a duplicate is found.

Time Complexity: O(n)
Space Complexity: O(n)
*/

import java.util.HashSet;

class Solution {

    public boolean containsDuplicate(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (!set.add(num)) {
                return true;
            }
        }

        return false;
    }
}

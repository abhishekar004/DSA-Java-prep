/*
LeetCode 80 - Remove Duplicates from Sorted Array II

Topic: Arrays, Two Pointers
Difficulty: Medium

Problem:
Remove duplicates such that each element appears at most twice.

Approach:
Use two pointers:
- i → position to place next valid element

Allow insertion only if:
- first 2 elements OR
- current element != nums[i-2]

Time Complexity: O(n)
Space Complexity: O(1)
*/

class RemoveDuplicatesII {

    public int removeDuplicates(int[] nums) {

        int i = 0;

        for (int num : nums) {

            if (i < 2 || num != nums[i - 2]) {
                nums[i] = num;
                i++;
            }
        }

        return i;
    }
}

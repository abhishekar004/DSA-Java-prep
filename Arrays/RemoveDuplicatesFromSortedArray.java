/*
LeetCode 26 - Remove Duplicates from Sorted Array

Topic: Arrays, Two Pointers
Difficulty: Easy

Approach:
Use two pointers:
- i → last unique index
- j → traversal pointer

If nums[j] != nums[i], move it forward.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class RemoveDuplicates {

    public int removeDuplicates(int[] nums) {

        int i = 0;

        for(int j = 1; j < nums.length; j++){

            if(nums[j] != nums[i]){
                i++;
                nums[i] = nums[j];
            }
        }

        return i + 1;
    }
}

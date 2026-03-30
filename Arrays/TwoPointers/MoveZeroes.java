/*
LeetCode 283 - Move Zeroes

Topic: Arrays, Two Pointers
Difficulty: Easy

Problem:
Move all 0's to the end of the array while maintaining 
the relative order of the non-zero elements.

Approach:
Use two pointers:
- left → position to place next non-zero
- right → iterate through array

Swap non-zero elements to the front.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class MoveZeroes {

    public void moveZeroes(int[] nums) {

        int left = 0;

        for(int right = 0; right < nums.length; right++){

            if(nums[right] != 0){

                int temp = nums[right];
                nums[right] = nums[left];
                nums[left] = temp;

                left++;
            }
        }
    }
}

/*
LeetCode 775 - Global and Local Inversions

Topic: Arrays, Greedy
Difficulty: Medium

Problem:
Check if number of global inversions equals number of local inversions.

Approach:
If any element is more than 1 position away from its correct index,
then a non-local inversion exists.

Condition:
Math.abs(nums[i] - i) <= 1

Time Complexity: O(n)
Space Complexity: O(1)
*/

class IdealPermutation {

    public boolean isIdealPermutation(int[] nums) {

        for (int i = 0; i < nums.length; i++) {

            if (Math.abs(nums[i] - i) > 1) {
                return false;
            }
        }

        return true;
    }
}

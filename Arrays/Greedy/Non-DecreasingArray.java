/*
LeetCode 665 - Non-decreasing Array

Topic: Arrays, Greedy
Difficulty: Medium
Day: 6

Problem:
Check if array can become non-decreasing by modifying at most one element.

Approach:
1. Count violations
2. If more than 1 → return false
3. Fix violation greedily by modifying left or right element

Time Complexity: O(n)
Space Complexity: O(1)
*/

class CheckPossibility {

    public boolean checkPossibility(int[] nums) {

        int count = 0;

        for (int i = 0; i < nums.length - 1; i++) {

            if (nums[i] > nums[i + 1]) {

                count++;

                if (count > 1) return false;

                if (i > 0 && nums[i - 1] > nums[i + 1]) {
                    nums[i + 1] = nums[i];
                } else {
                    nums[i] = nums[i + 1];
                }
            }
        }

        return true;
    }
}

/*
LeetCode 1752 - Check if Array Is Sorted and Rotated

Topic: Arrays
Difficulty: Easy


Problem:
Check if the array is sorted and then rotated.

Approach:
Count how many times order breaks.

If more than one break → not valid.

Use modulo to handle circular comparison.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class CheckSortedRotated {

    public boolean check(int[] nums) {

        int count = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {

            if (nums[i] > nums[(i + 1) % n]) {
                count++;
            }
        }

        return count <= 1;
    }
}

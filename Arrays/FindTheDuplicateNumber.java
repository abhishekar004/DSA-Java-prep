/*
LeetCode 287 - Find the Duplicate Number
Difficulty : Medium

Topic: Arrays, Floyd’s Cycle Detection
Difficulty: Medium

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {

    public int findDuplicate(int[] nums) {

        int slow = nums[0];
        int fast = nums[0];

        // Phase 1: Detect cycle
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while(slow != fast);

        // Phase 2: Find entry point
        slow = nums[0];

        while(slow != fast){
            slow = nums[slow];
            fast = nums[fast];
        }

        return slow;
    }
}

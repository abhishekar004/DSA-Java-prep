/*
LeetCode 41 - First Missing Positive

Topic: Arrays, Cyclic Sort
Difficulty: Hard

Problem:
Find the smallest missing positive integer.

Constraints:
- Must run in O(n) time
- Use constant extra space

Approach (Cyclic Sort):
1. Place each number at its correct index (value → index = value - 1)
2. Ignore numbers <= 0 or > n
3. After rearrangement, first index where nums[i] != i+1 is the answer

Time Complexity: O(n)
Space Complexity: O(1)
*/

class FirstMissingPositive {

    public int firstMissingPositive(int[] nums) {

        int n = nums.length;

        // Place elements in correct positions
        for(int i = 0; i < n; i++){

            while(nums[i] > 0 && nums[i] <= n && nums[nums[i] - 1] != nums[i]){

                int correctIndex = nums[i] - 1;

                int temp = nums[i];
                nums[i] = nums[correctIndex];
                nums[correctIndex] = temp;
            }
        }

        // Find first missing positive
        for(int i = 0; i < n; i++){
            if(nums[i] != i + 1){
                return i + 1;
            }
        }

        return n + 1;
    }
}

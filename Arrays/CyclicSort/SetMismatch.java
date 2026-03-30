/*
LeetCode 645 - Set Mismatch

Topic: Arrays, Cyclic Sort
Difficulty: Easy


Problem:
You have a set from 1 to n.
One number is duplicated and one number is missing.

Return [duplicate, missing].

Approach:
1. Place each number at correct index (value → index = value - 1)
2. After placement, find index where nums[i] != i+1
   - nums[i] → duplicate
   - i+1 → missing

Time Complexity: O(n)
Space Complexity: O(1)
*/

class SetMismatch {

    public int[] findErrorNums(int[] nums) {

        int i = 0;

        while(i < nums.length){

            int correctIndex = nums[i] - 1;

            if(nums[i] != nums[correctIndex]){

                int temp = nums[i];
                nums[i] = nums[correctIndex];
                nums[correctIndex] = temp;
            }
            else{
                i++;
            }
        }

        // Find mismatch
        for(i = 0; i < nums.length; i++){
            if(nums[i] != i + 1){
                return new int[]{nums[i], i + 1};
            }
        }

        return new int[]{-1, -1};
    }
}

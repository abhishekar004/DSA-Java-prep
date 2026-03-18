/*
LeetCode 268 - Missing Number

Topic: Arrays, Math
Difficulty: Easy

Approach:
Use sum formula:
total = n * (n + 1) / 2

Subtract actual sum to find missing number.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class MissingNumber {

    public int missingNumber(int[] nums) {

        int n = nums.length;

        int totalSum = n * (n + 1) / 2;

        int sum = 0;

        for(int num : nums){
            sum += num;
        }

        return totalSum - sum;
    }
}

/*
Approach: Cyclic Sort

Place each number at index = value

Then find index where nums[i] != i

Time Complexity: O(n)
Space Complexity: O(1)
*/

class MissingNumberCyclic {

    public int missingNumber(int[] nums) {

        int n = nums.length;
        int i = 0;

        while(i < n){

            if(nums[i] < n && nums[i] != nums[nums[i]]){

                int correctIndex = nums[i];

                int temp = nums[i];
                nums[i] = nums[correctIndex];
                nums[correctIndex] = temp;
            }
            else{
                i++;
            }
        }

        for(i = 0; i < n; i++){
            if(nums[i] != i){
                return i;
            }
        }

        return n;
    }
}

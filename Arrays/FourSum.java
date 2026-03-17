/*
LeetCode 18 - 4Sum

Topic: Arrays, Sorting, Two Pointers
Difficulty: Medium

Problem:
Find all unique quadruplets [a, b, c, d] such that:
a + b + c + d = target

Approach:
1. Sort the array
2. Fix two elements (i, j)
3. Use two pointers for remaining two elements
4. Skip duplicates

Time Complexity: O(n^3)
Space Complexity: O(1) (excluding output)
*/

import java.util.*;

class FourSum {

    public List<List<Integer>> fourSum(int[] nums, int target) {

        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        for(int i = 0; i < nums.length - 3; i++){

            if(nums[i] > target && nums[i] >= 0) break; //you can skip unnecessary work

            if(i > 0 && nums[i] == nums[i - 1]) continue;

            for(int j = i + 1; j < nums.length - 2; j++){

                if(j > i + 1 && nums[j] == nums[j - 1]) continue;

                int left = j + 1;
                int right = nums.length - 1;

                while(left < right){

                    long sum = (long) nums[i] + nums[j] + nums[left] + nums[right];

                    if(sum == target){

                        result.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));

                        left++;
                        right--;

                        while(left < right && nums[left] == nums[left - 1]) left++;
                        while(left < right && nums[right] == nums[right + 1]) right--;
                    }

                    else if(sum < target){
                        left++;
                    }

                    else{
                        right--;
                    }
                }
            }
        }

        return result;
    }
}

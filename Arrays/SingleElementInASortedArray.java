/*
LeetCode 540 - Single Element in a Sorted Array

Topic: Arrays, Binary Search
Difficulty: Medium

Problem:
Find the single element in a sorted array where every element
appears twice except one.

Approach:
Use binary search with index parity.

1. Ensure mid is even
2. Compare nums[mid] with nums[mid+1]
3. Decide search direction based on pairing

Time Complexity: O(log n)
Space Complexity: O(1)
*/

class SingleNonDuplicate {

    public int singleNonDuplicate(int[] nums) {

        int low = 0, high = nums.length - 1;

        while (low < high) {

            int mid = low + (high - low) / 2;

            // make mid even
            if (mid % 2 == 1) mid--;

            if (nums[mid] == nums[mid + 1]) {
                low = mid + 2;
            } else {
                high = mid;
            }
        }

        return nums[low];
    }
}

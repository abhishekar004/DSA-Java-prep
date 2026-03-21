/*
LeetCode 560 - Subarray Sum Equals K

Topic: Prefix Sum + HashMap
Difficulty: Medium

Problem:
Find total number of subarrays whose sum equals k.

Approach:
1. Maintain prefix sum
2. Store frequency of prefix sums in HashMap
3. If (sum - k) exists → add its frequency

Time Complexity: O(n)
Space Complexity: O(n)
*/

import java.util.*;

class SubarraySumEqualsK {

    public int subarraySum(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(0, 1);

        int sum = 0;
        int count = 0;

        for (int num : nums) {

            sum += num;

            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }

            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return count;
    }
}

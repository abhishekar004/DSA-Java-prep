/*
GeeksforGeeks - Subarray with 0 Sum

Difficulty: Medium
Topic: Prefix Sum, HashSet

Problem:
Given an array, check if there exists a subarray with sum = 0.

Approach:
1. Maintain prefix sum
2. Store prefix sums in HashSet
3. If prefixSum == 0 OR already exists → subarray found

Time Complexity: O(n)
Space Complexity: O(n)
*/

import java.util.*;

class SubarrayWithZeroSum {

    static boolean findsum(int arr[]) {

        HashSet<Integer> set = new HashSet<>();

        int prefixSum = 0;

        for (int num : arr) {

            prefixSum += num;

            if (prefixSum == 0 || set.contains(prefixSum)) {
                return true;
            }

            set.add(prefixSum);
        }

        return false;
    }
}

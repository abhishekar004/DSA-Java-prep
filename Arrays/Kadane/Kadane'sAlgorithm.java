/*
GeeksforGeeks - Kadane's Algorithm

Difficulty: Medium
Topic: Arrays, Dynamic Programming (Greedy DP)

Problem:
Find the maximum sum of a contiguous subarray.

Approach:
At each index:
- Either extend previous subarray
- Or start a new subarray

Use Kadane’s Algorithm.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class KadaneAlgorithm {

    int maxSubarraySum(int[] arr) {

        int maxSum = arr[0];
        int currentSum = arr[0];

        for (int i = 1; i < arr.length; i++) {

            currentSum = Math.max(arr[i], currentSum + arr[i]);
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }
}

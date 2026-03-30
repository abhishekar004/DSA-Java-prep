/*
GeeksforGeeks - Median of an Array

Difficulty: Easy
Topic: Arrays, Sorting

Problem:
Find the median of an array.

Approach:
1. Sort the array
2. If odd → return middle element
3. If even → return average of two middle elements

Time Complexity: O(n log n)
Space Complexity: O(1)
*/

import java.util.*;

class MedianOfArray {

    public double findMedian(int[] arr) {

        Arrays.sort(arr);

        int n = arr.length;

        if (n % 2 == 1) {
            return arr[n / 2];
        }

        return (arr[n / 2 - 1] + arr[n / 2]) / 2.0;
    }
}

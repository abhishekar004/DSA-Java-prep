/*
LeetCode 56 - Merge Intervals

Topic: Arrays, Sorting
Difficulty: Medium

Problem:
Given an array of intervals where intervals[i] = [start, end],
merge all overlapping intervals and return an array of the
non-overlapping intervals that cover all the intervals.

Example:
Input: [[1,3],[2,6],[8,10],[15,18]]
Output: [[1,6],[8,10],[15,18]]

Approach:
1. Sort intervals based on start time.
2. Traverse the intervals.
3. If the current interval overlaps with the previous one, merge them.
4. Otherwise add the new interval to the result list.

Time Complexity: O(n log n)  (due to sorting)
Space Complexity: O(n)
*/

import java.util.*;

class MergeIntervals {

    public int[][] merge(int[][] intervals) {

        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        List<int[]> result = new ArrayList<>();

        int[] current = intervals[0];
        result.add(current);

        for (int[] interval : intervals) {

            if (interval[0] <= current[1]) {
                current[1] = Math.max(current[1], interval[1]);
            } 
            else {
                current = interval;
                result.add(current);
            }
        }

        return result.toArray(new int[result.size()][]);
    }
}

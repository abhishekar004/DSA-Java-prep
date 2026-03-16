/*
LeetCode 57 - Insert Interval

Topic: Arrays, Interval Merging
Difficulty: Medium

Problem:
You are given an array of non-overlapping intervals sorted by their start times.
Insert a new interval into the intervals and merge if necessary.

Example:
Input:
intervals = [[1,3],[6,9]]
newInterval = [2,5]

Output:
[[1,5],[6,9]]

Approach:
1. Iterate through intervals.
2. If the interval ends before the new interval starts → add it directly.
3. If the interval starts after the new interval ends → add newInterval and update it.
4. If intervals overlap → merge them by updating newInterval.

Time Complexity: O(n)
Space Complexity: O(n)
*/

import java.util.*;

class InsertInterval {

    public int[][] insert(int[][] intervals, int[] newInterval) {

        List<int[]> result = new ArrayList<>();

        for(int[] interval : intervals){

            if(interval[1] < newInterval[0]){
                result.add(interval);
            }

            else if(interval[0] > newInterval[1]){
                result.add(newInterval);
                newInterval = interval;
            }

            else{
                newInterval[0] = Math.min(newInterval[0], interval[0]);
                newInterval[1] = Math.max(newInterval[1], interval[1]);
            }
        }

        result.add(newInterval);

        return result.toArray(new int[result.size()][]);
    }
}

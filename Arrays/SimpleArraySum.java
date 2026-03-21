/*
HackerRank - Simple Array Sum

Difficulty: Easy
Topic: Arrays, Basic Iteration

Problem:
Calculate the sum of all elements in the array.

Approach:
1. Initialize sum = 0
2. Traverse array
3. Add each element to sum

Time Complexity: O(n)
Space Complexity: O(1)
*/

import java.util.*;

class SimpleArraySum {

    public static int simpleArraySum(List<Integer> ar) {

        int sum = 0;

        for (int num : ar) {
            sum += num;
        }

        return sum;
    }
}

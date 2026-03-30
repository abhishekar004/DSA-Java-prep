/*
GeeksforGeeks - Array Subset

Difficulty: Easy
Topic: Arrays, HashMap (Frequency Matching)

Problem:
Given two arrays a[] and b[], determine whether b[] is a subset of a[].

A subset means all elements of b[] must be present in a[] 
with at least the same frequency.

Example:
Input:
a[] = [11, 7, 1, 13, 21, 3, 7, 3]
b[] = [11, 3, 7, 1, 7]

Output: true

Approach:
1. Count frequency of elements in a[] using HashMap
2. Traverse b[] and reduce frequency
3. If any element is missing → return false

Time Complexity: O(n + m)
Space Complexity: O(n)
*/

import java.util.*;

class ArraySubset {

    public boolean isSubset(int a[], int b[]) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // Step 1: Count frequency of elements in a[]
        for (int num : a) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Step 2: Check elements of b[]
        for (int num : b) {

            if (!map.containsKey(num)) {
                return false;
            }

            map.put(num, map.get(num) - 1);

            if (map.get(num) == 0) {
                map.remove(num);
            }
        }

        return true;
    }
}

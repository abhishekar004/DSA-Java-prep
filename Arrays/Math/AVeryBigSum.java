/**
 * Problem: A Very Big Sum - HackerRank
 * 
 * Given an array of large integers, compute their sum.
 * 
 * Key Constraint:
 * - Values can be large → must use long
 * 
 * Approach:
 * - Traverse array and accumulate sum using long
 * 
 * Pattern: Array Traversal / Aggregation
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class VeryBigSum {

    public static long aVeryBigSum(List<Long> ar) {

        long total = 0;

        for (long num : ar) {
            total += num;
        }

        return total;
    }
}

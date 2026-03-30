import java.util.*;

/**
 * Problem: Plus Minus - HackerRank
 * 
 * Given an array of integers, calculate the fractions of:
 * - positive numbers
 * - negative numbers
 * - zeros
 * 
 * Print each value on a new line with 6 decimal places.
 * 
 * Pattern: Array Traversal / Counting
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class PlusMinus {

    public static void plusMinus(List<Integer> arr) {

        int n = arr.size();

        int positive = 0;
        int negative = 0;
        int zero = 0;

        for (int num : arr) {
            if (num > 0) {
                positive++;
            } else if (num < 0) {
                negative++;
            } else {
                zero++;
            }
        }

        System.out.printf("%.6f%n", (double) positive / n);
        System.out.printf("%.6f%n", (double) negative / n);
        System.out.printf("%.6f%n", (double) zero / n);
    }
}

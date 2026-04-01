/**
 * Problem: Mini-Max Sum - HackerRank
 * 
 * Given five positive integers, find the minimum and maximum values
 * that can be calculated by summing exactly four of the five integers.
 * 
 * Approach:
 * - Compute total sum of all elements
 * - Track minimum and maximum element
 * - Minimum sum = total - max element
 * - Maximum sum = total - min element
 * 
 * Pattern: Array Traversal / Min-Max Tracking
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class MiniMaxSum {

    public static void miniMaxSum(List<Integer> arr) {

        long total = 0;
        int minElement = Integer.MAX_VALUE;
        int maxElement = Integer.MIN_VALUE;

        for (int num : arr) {
            total += num;

            if (num < minElement) {
                minElement = num;
            }

            if (num > maxElement) {
                maxElement = num;
            }
        }

        System.out.println((total - maxElement) + " " + (total - minElement));
    }
}

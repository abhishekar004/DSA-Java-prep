/**
 * Problem: Diagonal Difference - HackerRank
 * 
 * Given a square matrix, calculate the absolute difference
 * between the sums of its diagonals.
 * 
 * Approach:
 * - Traverse rows once
 * - Add primary diagonal element: arr[i][i]
 * - Add secondary diagonal element: arr[i][n - 1 - i]
 * - Return absolute difference
 * 
 * Pattern: Matrix Traversal / Diagonal Pattern
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class DiagonalDifference {

    public static int diagonalDifference(List<List<Integer>> arr) {

        int n = arr.size();
        int primarySum = 0;
        int secondarySum = 0;

        for (int i = 0; i < n; i++) {
            primarySum += arr.get(i).get(i);
            secondarySum += arr.get(i).get(n - 1 - i);
        }

        return Math.abs(primarySum - secondarySum);
    }
}

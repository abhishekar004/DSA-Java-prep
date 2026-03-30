import java.util.*;

/**
 * Problem: Find the Closest Pair from Two Arrays
 * 
 * Given two arrays and a target x, find a pair (one from each array)
 * such that their sum is closest to x.
 * 
 * Approach:
 * - Use Two Pointer technique:
 *   i → start of arr1
 *   j → end of arr2
 * 
 * - Calculate sum and update best pair if closer to x
 * - If sum > x → decrease j
 * - If sum < x → increase i
 * 
 * Note:
 * Arrays must be sorted. If not, sort them first.
 * 
 * Pattern: Two Pointers (Opposite Direction)
 * Time Complexity: O(n + m)
 * Space Complexity: O(1)
 */

class ClosestPair {

    public static ArrayList<Integer> findClosestPair(int arr1[], int arr2[], int x) {
        
        ArrayList<Integer> ans = new ArrayList<>();

        int i = 0;
        int j = arr2.length - 1;
        int bestDiff = Integer.MAX_VALUE;

        while (i < arr1.length && j >= 0) {
            int sum = arr1[i] + arr2[j];
            int diff = Math.abs(sum - x);

            if (diff < bestDiff) {
                bestDiff = diff;
                ans.clear();
                ans.add(arr1[i]);
                ans.add(arr2[j]);
            }

            if (sum > x) {
                j--;
            } else {
                i++;
            }
        }

        return ans;
    }
}

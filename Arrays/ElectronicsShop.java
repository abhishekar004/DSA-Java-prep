/**
 * Problem: Electronics Shop - HackerRank
 *
 * Find the maximum amount of money that can be spent on buying
 * one keyboard and one USB drive without exceeding the budget.
 *
 * Approach:
 * - Sort both arrays
 * - Use two pointers:
 *      i → smallest keyboard
 *      j → largest drive
 * - Adjust pointers based on sum
 * - Track maximum valid sum
 *
 * Pattern: Two Pointers on Sorted Arrays
 * Time Complexity: O(n log n + m log m)
 * Space Complexity: O(1)
 */

class ElectronicsShop {

    static int getMoneySpent(int[] keyboards, int[] drives, int b) {

        Arrays.sort(keyboards);
        Arrays.sort(drives);

        int i = 0;
        int j = drives.length - 1;

        int ans = -1;

        while (i < keyboards.length && j >= 0) {

            int sum = keyboards[i] + drives[j];

            if (sum == b) return sum;

            if (sum < b) {
                ans = Math.max(ans, sum);
                i++;
            } else {
                j--;
            }
        }

        return ans;
    }
}

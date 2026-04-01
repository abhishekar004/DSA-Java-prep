/**
 * Problem: Divisible Sum Pairs - HackerRank
 * 
 * Count the number of pairs (i, j) such that:
 * - i < j
 * - (ar[i] + ar[j]) % k == 0
 * 
 * Approach:
 * - Use remainder frequency array
 * - For each number:
 *   rem = num % k
 *   needed = (k - rem) % k
 * - Add count of previously seen numbers with needed remainder
 * 
 * Pattern: Math / Remainder Frequency
 * Time Complexity: O(n)
 * Space Complexity: O(k)
 */

class DivisibleSumPairs {

    public static int divisibleSumPairs(int n, int k, List<Integer> ar) {

        int[] freq = new int[k];
        int count = 0;

        for (int num : ar) {

            int rem = num % k;
            int needed = (k - rem) % k;

            count += freq[needed];
            freq[rem]++;
        }

        return count;
    }
}

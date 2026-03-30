/**
 * Problem: Migratory Birds - HackerRank
 * 
 * Find the bird type that appears most frequently.
 * If multiple types have the same frequency,
 * return the smallest bird type ID.
 * 
 * Approach:
 * - Use frequency array to count bird occurrences
 * - Traverse frequency array to find the max frequency
 * - Since we check from smaller IDs first, tie is handled automatically
 * 
 * Pattern: Frequency Counting / Hashing
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class MigratoryBirds {

    public static int migratoryBirds(List<Integer> arr) {

        int[] freq = new int[6]; // Bird IDs are from 1 to 5

        for (int bird : arr) {
            freq[bird]++;
        }

        int maxFreq = 0;
        int result = 0;

        for (int i = 1; i <= 5; i++) {
            if (freq[i] > maxFreq) {
                maxFreq = freq[i];
                result = i;
            }
        }

        return result;
    }
}

/**
 * Problem: Mars Exploration - HackerRank
 *
 * A message consisting of "SOS" repeated n times was sent.
 * Due to noise, some characters may have been altered.
 * Count how many characters differ from the expected message.
 *
 * Approach:
 * - Use modular indexing to determine expected character
 * - Compare each character with expected pattern
 * - Count mismatches
 *
 * Pattern: String Pattern Matching / Modular Indexing
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class MarsExploration {

    public static int marsExploration(String s) {

        int count = 0;
        String pattern = "SOS";

        for (int i = 0; i < s.length(); i++) {

            char expected = pattern.charAt(i % 3);

            if (s.charAt(i) != expected) {
                count++;
            }
        }

        return count;
    }
}

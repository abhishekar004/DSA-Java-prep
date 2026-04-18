/**
 * Problem: CamelCase - HackerRank
 *
 * Given a string in camelCase, count the number of words.
 *
 * Approach:
 * - Count uppercase letters
 * - Add 1 for the first word
 *
 * Pattern: Character Scanning / Counting
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class CamelCase {

    public static int camelcase(String s) {

        if (s == null || s.isEmpty()) return 0;

        int words = 1;

        for (char ch : s.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                words++;
            }
        }

        return words;
    }
}

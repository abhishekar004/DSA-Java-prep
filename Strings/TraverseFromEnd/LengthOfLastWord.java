/**
 * Problem: Length of Last Word - LeetCode 58
 * 
 * Given a string consisting of words and spaces,
 * return the length of the last word.
 * 
 * Approach:
 * - Traverse from the end of the string
 * - Skip trailing spaces
 * - Count characters until next space
 * 
 * Pattern: Reverse Traversal / Two Pointers
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class LengthOfLastWord {

    public int lengthOfLastWord(String s) {

        int i = s.length() - 1;
        int length = 0;

        // Skip trailing spaces
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }

        // Count last word length
        while (i >= 0 && s.charAt(i) != ' ') {
            length++;
            i--;
        }

        return length;
    }
}

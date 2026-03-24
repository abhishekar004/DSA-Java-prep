/**
 * Problem: Reverse Words in a String - LeetCode 151
 * 
 * Given a string, reverse the order of words.
 * Remove extra spaces.
 * 
 * Approach:
 * - Traverse from end of string
 * - Skip spaces
 * - Extract words and build result
 * 
 * Pattern: Reverse Traversal / Two Pointers
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

class ReverseWordsInString {

    public String reverseWords(String s) {

        StringBuilder result = new StringBuilder();
        int i = s.length() - 1;

        while (i >= 0) {

            // Skip spaces
            while (i >= 0 && s.charAt(i) == ' ') i--;

            if (i < 0) break;

            int j = i;

            // Find word
            while (j >= 0 && s.charAt(j) != ' ') j--;

            // Append word
            result.append(s.substring(j + 1, i + 1));

            // Add space if needed
            if (result.length() > 0) result.append(" ");

            i = j;
        }

        return result.toString().trim();
    }
}

/**
 * Problem: Super Reduced String - HackerRank
 * 
 * Reduce the string by removing adjacent pairs of identical characters
 * until no more reductions can be made.
 * 
 * If the final string is empty, return "Empty String".
 * 
 * Approach:
 * - Use StringBuilder as a stack
 * - Traverse characters:
 *   - If current char matches top → remove top
 *   - Else → push current char
 * 
 * Pattern: Stack (Using StringBuilder)
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

class SuperReducedString {

    public static String superReducedString(String s) {

        StringBuilder stack = new StringBuilder();

        for (char ch : s.toCharArray()) {

            int len = stack.length();

            if (len > 0 && stack.charAt(len - 1) == ch) {
                stack.deleteCharAt(len - 1);
            } else {
                stack.append(ch);
            }
        }

        return stack.length() == 0 ? "Empty String" : stack.toString();
    }
}

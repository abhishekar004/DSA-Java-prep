import java.util.*;

/**
 * Problem: Longest Valid Parentheses - LeetCode 32
 * 
 * Given a string containing just '(' and ')',
 * find the length of the longest valid (well-formed)
 * parentheses substring.
 * 
 * Approach:
 * - Use a stack to store indices
 * - Push -1 initially as a base index
 * - For '(' push index
 * - For ')' pop one index
 *   - if stack becomes empty, push current index as new base
 *   - otherwise calculate valid length
 * 
 * Pattern: Stack / Index Tracking
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

class LongestValidParentheses {

    public int longestValidParentheses(String s) {

        Stack<Integer> stack = new Stack<>();
        stack.push(-1); // base index

        int maxLength = 0;

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (ch == '(') {
                stack.push(i);
            } else {
                stack.pop();

                if (stack.isEmpty()) {
                    stack.push(i); // new invalid boundary
                } else {
                    maxLength = Math.max(maxLength, i - stack.peek());
                }
            }
        }

        return maxLength;
    }
}

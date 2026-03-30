import java.util.*;

/**
 * Problem: Valid Parentheses - LeetCode 20
 * 
 * Given a string containing just '(', ')', '{', '}', '[' and ']',
 * determine if the input string is valid.
 * 
 * Approach:
 * - Use stack to track opening brackets
 * - On closing bracket, check if it matches top of stack
 * 
 * Pattern: Stack (LIFO Matching)
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

class ValidParentheses {

    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {

            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } 
            else {
                if (stack.isEmpty()) return false;

                char top = stack.pop();

                if (ch == ')' && top != '(') return false;
                if (ch == '}' && top != '{') return false;
                if (ch == ']' && top != '[') return false;
            }
        }

        return stack.isEmpty();
    }
}

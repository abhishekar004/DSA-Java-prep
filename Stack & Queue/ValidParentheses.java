/**
 * Problem: Valid Parentheses - LeetCode 20
 *
 * Given a string containing only:
 * (), {}, []
 *
 * Determine whether the input string is valid.
 *
 * A string is valid if:
 * 1. Open brackets are closed by the same type.
 * 2. Open brackets are closed in the correct order.
 * 3. Every closing bracket has a matching opening bracket.
 *
 * Approach:
 * - Use a stack to track opening brackets.
 * - Push opening brackets.
 * - When a closing bracket appears:
 *      - Check if stack is empty.
 *      - Pop the top element.
 *      - Verify matching pair.
 * - At the end, stack must be empty.
 *
 * Pattern: Stack
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

import java.util.ArrayDeque;
import java.util.Deque;

class Solution {

    public boolean isValid(String s) {

        Deque<Character> stack = new ArrayDeque<>();

        for (char ch : s.toCharArray()) {

            if (ch == '(' || ch == '[' || ch == '{') {

                stack.push(ch);

            } else {

                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();

                if ((ch == ')' && top != '(') ||
                    (ch == ']' && top != '[') ||
                    (ch == '}' && top != '{')) {

                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}

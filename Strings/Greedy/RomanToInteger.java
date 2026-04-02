/**
 * Problem: Roman to Integer - LeetCode 13
 * 
 * Convert a Roman numeral string into an integer.
 * 
 * Approach:
 * - Traverse the string from left to right
 * - If current value is greater than previous value,
 *   it means previous value should have been subtracted
 * - Adjust by subtracting twice the previous value
 * 
 * Pattern: String Traversal / Greedy Parsing
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class RomanToInteger {

    public int romanToInt(String s) {

        int prevVal = 0;
        int result = 0;

        for (int i = 0; i < s.length(); i++) {

            int currVal = romanValue(s.charAt(i));

            if (prevVal < currVal) {
                result += currVal - 2 * prevVal;
            } else {
                result += currVal;
            }

            prevVal = currVal;
        }

        return result;
    }

    private int romanValue(char ch) {
        switch (ch) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return -1;
        }
    }
}

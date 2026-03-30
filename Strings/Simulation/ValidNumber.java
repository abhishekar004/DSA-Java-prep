/**
 * Problem: Valid Number - LeetCode 65
 * 
 * Determine if a given string is a valid number.
 * Supports integers, decimals, and scientific notation.
 * 
 * Approach:
 * - Traverse string and track:
 *   - seenDigit → at least one digit exists
 *   - seenDot → decimal point used
 *   - seenE → exponent used
 * 
 * Rules:
 * - '+' / '-' allowed only at start or after e/E
 * - '.' allowed only once and before e/E
 * - e/E allowed once and must follow a digit
 * - After e/E, there must be a digit
 * 
 * Pattern: String Parsing / State Simulation
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class ValidNumber {

    public boolean isNumber(String s) {

        s = s.trim();

        boolean seenDigit = false;
        boolean seenDot = false;
        boolean seenE = false;

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (Character.isDigit(ch)) {
                seenDigit = true;
            }

            else if (ch == '+' || ch == '-') {
                if (i > 0 && s.charAt(i - 1) != 'e' && s.charAt(i - 1) != 'E') {
                    return false;
                }
            }

            else if (ch == '.') {
                if (seenDot || seenE) return false;
                seenDot = true;
            }

            else if (ch == 'e' || ch == 'E') {
                if (seenE || !seenDigit) return false;
                seenE = true;
                seenDigit = false; // must have digit after e
            }

            else {
                return false;
            }
        }

        return seenDigit;
    }
}

/**
 * Problem: Caesar Cipher - HackerRank
 * 
 * Encrypt the string by shifting each alphabet character by k positions.
 * Non-alphabet characters remain unchanged.
 * 
 * Approach:
 * - Reduce k using modulo 26
 * - For each character:
 *   - If lowercase, rotate within 'a' to 'z'
 *   - If uppercase, rotate within 'A' to 'Z'
 *   - Otherwise, keep as is
 * 
 * Pattern: String Manipulation / Character Arithmetic
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

class CaesarCipher {

    public static String caesarCipher(String s, int k) {

        StringBuilder result = new StringBuilder();
        k = k % 26;

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                ch = (char) ((ch - 'a' + k) % 26 + 'a');
            } 
            else if (ch >= 'A' && ch <= 'Z') {
                ch = (char) ((ch - 'A' + k) % 26 + 'A');
            }

            result.append(ch);
        }

        return result.toString();
    }
}

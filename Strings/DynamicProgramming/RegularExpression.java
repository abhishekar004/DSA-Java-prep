/**
 * Problem: Regular Expression Matching - LeetCode 10
 * 
 * Given a string s and pattern p, implement regex matching with:
 * - '.' matches any single character
 * - '*' matches zero or more of the preceding element
 * 
 * Approach:
 * - Use recursion with memoization (Top-Down DP)
 * - dp[i][j] = whether s[i:] matches p[j:]
 * 
 * Pattern: Dynamic Programming (Memoization)
 * Time Complexity: O(n * m)
 * Space Complexity: O(n * m)
 */

class RegularExpressionMatching {

    Boolean[][] dp;

    public boolean isMatch(String s, String p) {
        dp = new Boolean[s.length() + 1][p.length() + 1];
        return solve(0, 0, s, p);
    }

    private boolean solve(int i, int j, String s, String p) {

        // If pattern finished
        if (j == p.length()) {
            return i == s.length();
        }

        if (dp[i][j] != null) return dp[i][j];

        boolean firstMatch = (i < s.length() &&
                (s.charAt(i) == p.charAt(j) || p.charAt(j) == '.'));

        boolean ans;

        // Handle '*'
        if (j + 1 < p.length() && p.charAt(j + 1) == '*') {
            ans = solve(i, j + 2, s, p) || 
                  (firstMatch && solve(i + 1, j, s, p));
        } else {
            ans = firstMatch && solve(i + 1, j + 1, s, p);
        }

        return dp[i][j] = ans;
    }
}

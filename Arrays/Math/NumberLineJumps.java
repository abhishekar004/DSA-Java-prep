/**
 * Problem: Number Line Jumps (Kangaroo) - HackerRank
 * 
 * Approach:
 * We convert the movement into a mathematical equation:
 * 
 * x1 + n*v1 = x2 + n*v2
 * => (x2 - x1) = n * (v1 - v2)
 * 
 * For n to be an integer:
 * (x2 - x1) % (v1 - v2) == 0
 * 
 * Also, v1 must be greater than v2, otherwise kangaroo 1
 * will never catch up.
 * 
 * Pattern: Mathematical / Algebraic Equation
 * Time Complexity: O(1)
 * Space Complexity: O(1)
 */

class NumberLineJumps {

    public static String kangaroo(int x1, int v1, int x2, int v2) {
        
        // If first kangaroo is slower or equal, it can never catch up
        if (v1 <= v2) {
            return "NO";
        }

        // Check if they meet at same point after same number of jumps
        if ((x2 - x1) % (v1 - v2) == 0) {
            return "YES";
        }

        return "NO";
    }
}

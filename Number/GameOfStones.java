/**
 * Problem: Game of Stones - HackerRank
 *
 * Two players take turns removing 2, 3, or 5 stones.
 * The player who cannot make a move loses.
 *
 * Approach:
 * - Observe pattern for small values
 * - Pattern repeats every 7
 * - If n % 7 == 0 or 1 → losing position
 *
 * Pattern: Game Theory / Modulo Pattern
 * Time Complexity: O(1)
 * Space Complexity: O(1)
 */

class GameOfStones {

    public static String gameOfStones(int n) {

        if (n % 7 == 0 || n % 7 == 1)
            return "Second";
        else
            return "First";
    }
}

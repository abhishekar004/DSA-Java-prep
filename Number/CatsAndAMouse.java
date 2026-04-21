/**
 * Problem: Cats and a Mouse - HackerRank
 *
 * Two cats and a mouse are at different positions on a number line.
 * Determine which cat reaches the mouse first.
 * If both reach at same time → mouse escapes.
 *
 * Approach:
 * - Calculate distance of each cat from mouse
 * - Compare distances
 *
 * Pattern: Math / Absolute Difference
 * Time Complexity: O(1)
 * Space Complexity: O(1)
 */

class CatsAndMouse {

    static String catAndMouse(int x, int y, int z) {

        int diffX = Math.abs(x - z);
        int diffY = Math.abs(y - z);

        if (diffX < diffY) return "Cat A";
        if (diffY < diffX) return "Cat B";

        return "Mouse C";
    }
}

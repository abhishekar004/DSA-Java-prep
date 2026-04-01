/**
 * Problem: Drawing Book - HackerRank
 * 
 * Given total pages n and target page p,
 * return the minimum number of page turns required
 * from either the front or the back of the book.
 * 
 * Approach:
 * - Each page turn flips 2 pages
 * - Turns from front = p / 2
 * - Turns from back = (n / 2) - (p / 2)
 * - Return the minimum
 * 
 * Pattern: Math / Formula
 * Time Complexity: O(1)
 * Space Complexity: O(1)
 */

class DrawingBook {

    public static int pageCount(int n, int p) {

        int fromFront = p / 2;
        int fromBack = (n / 2) - (p / 2);

        return Math.min(fromFront, fromBack);
    }
}

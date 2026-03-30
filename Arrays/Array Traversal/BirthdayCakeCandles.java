/**
 * Problem: Birthday Cake Candles - HackerRank
 * 
 * Given candle heights, return how many candles are tallest.
 * 
 * Approach:
 * - Track the maximum height seen so far
 * - Count how many times it appears
 * - If a taller candle is found, reset count
 * 
 * Pattern: Array Traversal / Max Tracking
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class BirthdayCakeCandles {

    public static int birthdayCakeCandles(List<Integer> candles) {

        int maxHeight = Integer.MIN_VALUE;
        int count = 0;

        for (int candle : candles) {

            if (candle > maxHeight) {
                maxHeight = candle;
                count = 1;
            } else if (candle == maxHeight) {
                count++;
            }
        }

        return count;
    }
}

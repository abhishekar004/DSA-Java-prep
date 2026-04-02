/**
 * Problem: Counting Valleys - HackerRank
 * 
 * A valley is a sequence of steps below sea level,
 * starting with a step down from sea level
 * and ending with a step up to sea level.
 * 
 * Approach:
 * - Track current level (altitude)
 * - Increment valley count when returning to sea level from below
 * 
 * Pattern: Simulation / Level Tracking
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class CountingValleys {

    public static int countingValleys(int steps, String path) {

        int level = 0;
        int valleys = 0;

        for (char step : path.toCharArray()) {

            if (step == 'U') {
                level++;

                // Completed a valley
                if (level == 0) {
                    valleys++;
                }
            } else {
                level--;
            }
        }

        return valleys;
    }
}

/**
 * Problem: Viral Advertising - HackerRank
 *
 * A company advertises starting with 5 people.
 * Each day:
 * - Half of the people like the ad
 * - Each person who likes shares with 3 new people
 *
 * Find total cumulative likes after n days.
 *
 * Approach:
 * - Simulate day-by-day process
 * - Track shared, liked, and cumulative likes
 *
 * Pattern: Simulation / Iterative Update
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class ViralAdvertising {

    public static int viralAdvertising(int n) {

        int shared = 5;
        int cumulative = 0;

        for (int i = 1; i <= n; i++) {

            int liked = shared / 2;
            cumulative += liked;
            shared = liked * 3;
        }

        return cumulative;
    }
}

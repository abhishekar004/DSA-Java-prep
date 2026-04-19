/**
 * Problem: Marc's Cakewalk - HackerRank
 *
 * Marc wants to minimize miles walked by eating cupcakes
 * in an optimal order.
 *
 * Approach:
 * - Sort calories in descending order
 * - Multiply each by 2^i
 * - Use bit shifting instead of Math.pow
 *
 * Pattern: Greedy + Sorting
 * Time Complexity: O(n log n)
 * Space Complexity: O(1)
 */

class MarcsCakewalk {

    public static long marcsCakewalk(List<Integer> calorie) {

        // Sort in descending order
        Collections.sort(calorie, Collections.reverseOrder());

        long ans = 0;

        for (int i = 0; i < calorie.size(); i++) {
            ans += (1L << i) * calorie.get(i);
        }

        return ans;
    }
}

/*
LeetCode 849 - Maximize Distance to Closest Person

Topic: Arrays, Greedy
Difficulty: Medium

Problem:
Find a seat such that the distance to the closest person is maximized.

Approach:
Handle three cases:
1. Leading zeros
2. Middle gaps
3. Trailing zeros

Time Complexity: O(n)
Space Complexity: O(1)
*/

class MaxDistToClosest {

    public int maxDistToClosest(int[] seats) {

        int maxDist = 0;
        int last = -1;

        for (int i = 0; i < seats.length; i++) {

            if (seats[i] == 1) {

                if (last == -1) {
                    maxDist = i;
                } else {
                    maxDist = Math.max(maxDist, (i - last) / 2);
                }

                last = i;
            }
        }

        // trailing zeros
        maxDist = Math.max(maxDist, seats.length - 1 - last);

        return maxDist;
    }
}

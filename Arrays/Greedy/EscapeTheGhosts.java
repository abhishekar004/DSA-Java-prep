/*
LeetCode 789 - Escape The Ghosts

Topic: Arrays, Greedy (Manhattan Distance)
Difficulty: Medium


Problem:
Determine if you can reach the target before any ghost.

Approach:
1. Compute your distance from (0,0) to target
2. Compute each ghost's distance to target
3. If any ghost reaches target earlier or at same time → return false

Time Complexity: O(n)
Space Complexity: O(1)
*/

class EscapeGhosts {

    public boolean escapeGhosts(int[][] ghosts, int[] target) {

        int myDist = Math.abs(target[0]) + Math.abs(target[1]);

        for (int[] ghost : ghosts) {

            int ghostDist = Math.abs(ghost[0] - target[0]) 
                          + Math.abs(ghost[1] - target[1]);

            if (ghostDist <= myDist) {
                return false;
            }
        }

        return true;
    }
}

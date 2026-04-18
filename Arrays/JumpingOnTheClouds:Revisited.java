/**
 * Problem: Jumping on the Clouds: Revisited - HackerRank
 *
 * A character jumps through clouds in a circular array.
 * Each jump reduces energy:
 * - -1 for every jump
 * - -2 extra if thundercloud (value = 1)
 *
 * Return remaining energy after completing full cycle.
 *
 * Approach:
 * - Use modulo for circular traversal
 * - Simulate jumps using do-while loop
 * - Deduct energy based on rules
 *
 * Pattern: Simulation + Circular Array
 * Time Complexity: O(n / k)
 * Space Complexity: O(1)
 */

class JumpingOnClouds {

    static int jumpingOnClouds(int[] c, int k) {

        int energy = 100;
        int i = 0;
        int n = c.length;

        do {
            i = (i + k) % n;

            energy -= 1;

            if (c[i] == 1) energy -= 2;

        } while (i != 0);

        return energy;
    }
}

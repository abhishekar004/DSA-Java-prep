import java.util.*;

/**
 * Problem: Between Two Sets - HackerRank
 * 
 * A number x is considered between two sets if:
 * 1. Every element in array a is a factor of x
 * 2. x is a factor of every element in array b
 * 
 * Approach:
 * - Find LCM of all elements in array a
 * - Find GCD of all elements in array b
 * - Count multiples of LCM(a) that exactly divide GCD(b)
 * 
 * Pattern: Math / Number Theory (LCM + GCD)
 * Time Complexity: O(n log M + m log M + (gcdB / lcmA))
 * Space Complexity: O(1)
 */

class BetweenTwoSets {

    public static int getTotalX(List<Integer> a, List<Integer> b) {

        int lcmA = a.get(0);
        for (int i = 1; i < a.size(); i++) {
            lcmA = lcm(lcmA, a.get(i));
        }

        int gcdB = b.get(0);
        for (int i = 1; i < b.size(); i++) {
            gcdB = gcd(gcdB, b.get(i));
        }

        int count = 0;

        for (int x = lcmA; x <= gcdB; x += lcmA) {
            if (gcdB % x == 0) {
                count++;
            }
        }

        return count;
    }

    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    private static int lcm(int a, int b) {
        return (a / gcd(a, b)) * b;
    }
}

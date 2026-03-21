/*
LeetCode 875 - Koko Eating Bananas

Topic: Binary Search on Answer
Difficulty: Medium

Problem:
Find minimum eating speed such that all bananas are eaten within h hours.

Approach:
1. Search range: 1 → max(pile)
2. Use binary search on speed
3. Check feasibility using ceil division

Time Complexity: O(n log maxPile)
Space Complexity: O(1)
*/

class KokoEatingBananas {

    public int minEatingSpeed(int[] piles, int h) {

        int low = 1;
        int high = 0;

        for (int pile : piles) {
            high = Math.max(high, pile);
        }

        while (low < high) {

            int mid = low + (high - low) / 2;

            if (canFinish(piles, h, mid)) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }

    private boolean canFinish(int[] piles, int h, int k) {

        long hours = 0;

        for (int pile : piles) {
            hours += (pile + k - 1) / k;
        }

        return hours <= h;
    }
}

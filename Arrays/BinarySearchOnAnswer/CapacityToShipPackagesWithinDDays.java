/*
LeetCode 1011 - Capacity To Ship Packages Within D Days

Topic: Binary Search on Answer
Difficulty: Medium
Day: 8

Problem:
Find minimum ship capacity to deliver packages within given days.

Approach:
1. Search range: max(weights) → sum(weights)
2. Use binary search
3. Check feasibility using simulation

Time Complexity: O(n log sum)
Space Complexity: O(1)
*/

class ShipPackages {

    public int shipWithinDays(int[] weights, int days) {

        int low = 0, high = 0;

        for (int w : weights) {
            low = Math.max(low, w);
            high += w;
        }

        while (low < high) {

            int mid = low + (high - low) / 2;

            if (canShip(weights, days, mid)) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }

    private boolean canShip(int[] weights, int days, int cap) {

        int usedDays = 1;
        int currentLoad = 0;

        for (int w : weights) {

            if (currentLoad + w > cap) {
                usedDays++;
                currentLoad = 0;
            }

            currentLoad += w;
        }

        return usedDays <= days;
    }
}

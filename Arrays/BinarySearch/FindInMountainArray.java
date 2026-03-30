/*
LeetCode 1095 - Find in Mountain Array

Topic: Binary Search, Interactive
Difficulty: Hard

Approach:
1. Find peak index using binary search
2. Search left (ascending)
3. Search right (descending)

Time Complexity: O(log n)
Space Complexity: O(1)
*/

class FindInMountainArray {

    public int findInMountainArray(int target, MountainArray mountainArr) {

        int n = mountainArr.length();

        int peak = findPeak(mountainArr, n);

        int left = binarySearchIncreasing(mountainArr, 0, peak, target);

        if (left != -1) return left;

        return binarySearchDecreasing(mountainArr, peak + 1, n - 1, target);
    }

    private int findPeak(MountainArray arr, int n) {

        int left = 0, right = n - 1;

        while (left < right) {

            int mid = left + (right - left) / 2;

            if (arr.get(mid) < arr.get(mid + 1)) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return left;
    }

    private int binarySearchIncreasing(MountainArray arr, int left, int right, int target) {

        while (left <= right) {

            int mid = left + (right - left) / 2;
            int val = arr.get(mid);

            if (val == target) return mid;
            else if (val < target) left = mid + 1;
            else right = mid - 1;
        }

        return -1;
    }

    private int binarySearchDecreasing(MountainArray arr, int left, int right, int target) {

        while (left <= right) {

            int mid = left + (right - left) / 2;
            int val = arr.get(mid);

            if (val == target) return mid;
            else if (val < target) right = mid - 1;
            else left = mid + 1;
        }

        return -1;
    }
}

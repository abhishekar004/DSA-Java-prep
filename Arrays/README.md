# 📘 Arrays — DSA Placement Preparation

> 💡 **"Don't just solve problems — recognize patterns instantly."**

A **pattern-based DSA revision system** for fast pattern recognition, placement prep, and quick interview revision.

---

## 📁 Folder Structure

```
arrays/
├── README.md
├── TwoSum.java
├── SquaresOfSortedArray.java
├── BestTimeToBuyAndSellStock.java
├── ContainsDuplicate.java
├── ProductOfArrayExceptSelf.java
├── RotateArray.java
├── MaximumSubarray.java
├── ValidSudoku.java
├── MergeIntervals.java
├── InsertInterval.java
├── ThreeSum.java
├── FourSum.java
├── ThreeSumClosest.java
├── MoveZeroes.java
├── FindDisappearedNumbers.java
├── FirstMissingPositive.java
├── MissingNumber.java
├── FindDuplicateNumber.java
├── SetMismatch.java
├── ReverseAnArray.java
├── RemoveDuplicatesI.java
├── RemoveDuplicatesII.java
├── CheckIfSortedAndRotated.java
├── SingleElementInSortedArray.java
├── NonDecreasingArray.java
├── GlobalAndLocalInversions.java
├── EscapeTheGhosts.java
├── MaximizeDistanceToClosestPerson.java
├── PeakIndexInMountainArray.java
├── FindPeakElement.java
├── FindInMountainArray.java
├── KokoEatingBananas.java
├── CapacityToShipPackages.java
├── SmallestDivisor.java
├── ArraySubset.java
├── SubarrayWithZeroSum.java
├── KadanesAlgorithm.java
├── KthSmallest.java
├── MedianOfArray.java
├── PalindromicArray.java
├── SalesByMatch.java
├── SimpleArraySum.java
├── SubarraySumEqualsK.java
├── BreakingTheRecords.java
└── NumberLineJumps.java
└── FindTheClosestPairFromTwoArrays.java
```

---

## 🎯 Progress

**Problems Solved: 45 / 300**

```
████░░░░░░░░░░░░░░░░  15%
```

---

## ⚡ Pattern Recognition Cheat Sheet

| If you see…                    | Think Pattern           |
| ------------------------------ | ----------------------- |
| Pair / target sum              | HashMap                 |
| Sorted array, pair/triplet     | Two Pointers            |
| Maximum subarray               | Kadane's Algorithm      |
| Subarray sum = k               | Prefix Sum + HashMap    |
| Missing / duplicate in 1..n    | Cyclic Sort             |
| Overlapping ranges             | Interval Merge          |
| Minimum valid answer           | Binary Search on Answer |
| Top K elements                 | Heap                    |
| Duplicate with O(1) space      | Floyd Cycle Detection   |
| Local max in sorted-ish array  | Binary Search           |
| Track running min/max          | Greedy                  |

---

## 🧩 Problems — Grouped by Pattern

---

### 1️⃣ HashMap

**Approach:** Use a hash map for O(1) lookups. Store elements you've seen and check if the complement or match already exists. Great for frequency counting and pair detection.

**Key formula:** `target - num` → check if result is in map

| Problem | Platform | Difficulty |
| ------- | -------- | ---------- |
| [Two Sum](https://leetcode.com/problems/two-sum/) | LC #1 | 🟢 Easy |
| [Contains Duplicate](https://leetcode.com/problems/contains-duplicate/) | LC #217 | 🟢 Easy |
| [Array Subset of Another Array](https://www.geeksforgeeks.org/problems/array-subset-of-another-array2317/1) | GFG | 🟢 Easy |
| [Sales by Match](https://www.hackerrank.com/challenges/sock-merchant/problem) | HackerRank | 🟢 Easy |

---

### 2️⃣ Two Pointers

**Approach:** Use left and right pointers on a sorted array and move them based on whether the current sum is too small or too large. Also used for in-place operations like removing duplicates or moving zeroes.

**Key rule:**
```
sum < target → left++
sum > target → right--
```

| Problem | Platform | Difficulty |
| ------- | -------- | ---------- |
| [Squares of Sorted Array](https://leetcode.com/problems/squares-of-a-sorted-array/) | LC #977 | 🟢 Easy |
| [Move Zeroes](https://leetcode.com/problems/move-zeroes/) | LC #283 | 🟢 Easy |
| [Remove Duplicates from Sorted Array](https://leetcode.com/problems/remove-duplicates-from-sorted-array/) | LC #26 | 🟢 Easy |
| [Remove Duplicates from Sorted Array II](https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/) | LC #80 | 🟠 Medium |
| [3Sum](https://leetcode.com/problems/3sum/) | LC #15 | 🟠 Medium |
| [3Sum Closest](https://leetcode.com/problems/3sum-closest/) | LC #16 | 🟠 Medium |
| [4Sum](https://leetcode.com/problems/4sum/) | LC #18 | 🟠 Medium |
| [Reverse An Array](https://www.geeksforgeeks.org/problems/reverse-an-array/1) | GFG | 🟢 Easy |

---

### 3️⃣ Greedy

**Approach:** Make the locally optimal choice at each step. Track a running minimum or maximum while iterating — no need to look back.

**Key formula:**
```
profit = currentPrice - minPriceSeen
update min/max dynamically on each iteration
```

| Problem | Platform | Difficulty |
| ------- | -------- | ---------- |
| [Best Time to Buy & Sell Stock](https://leetcode.com/problems/best-time-to-buy-and-sell-stock/) | LC #121 | 🟢 Easy |
| [Non-Decreasing Array](https://leetcode.com/problems/non-decreasing-array/) | LC #665 | 🟠 Medium |
| [Global and Local Inversions](https://leetcode.com/problems/global-and-local-inversions/) | LC #775 | 🟠 Medium |
| [Escape the Ghosts](https://leetcode.com/problems/escape-the-ghosts/) | LC #789 | 🟠 Medium |
| [Maximize Distance to Closest Person](https://leetcode.com/problems/maximize-distance-to-closest-person/) | LC #849 | 🟠 Medium |
| [Breaking The Records](https://www.hackerrank.com/contests/mountblue-technologies/challenges/breaking-best-and-worst-records) | HackerRank | 🟢 Easy |

---

### 4️⃣ Prefix Sum

**Approach:** Precompute cumulative sums so any subarray sum `[i..j]` = `prefix[j] - prefix[i-1]`. Pair with a HashMap to find subarrays with a target sum in O(n).

**Key formula:**
```
prefix[j] - prefix[i] = k
→ check if (prefix[j] - k) exists in map
```

| Problem | Platform | Difficulty |
| ------- | -------- | ---------- |
| [Product of Array Except Self](https://leetcode.com/problems/product-of-array-except-self/) | LC #238 | 🟠 Medium |
| [Subarray with 0 Sum](https://www.geeksforgeeks.org/problems/subarray-with-0-sum-1587115621/1) | GFG | 🟠 Medium |
| [Subarray Sum Equals K](https://leetcode.com/problems/subarray-sum-equals-k/description/) | LC #560 | 🟠 Medium |

---

### 5️⃣ Kadane's Algorithm

**Approach:** Track the maximum subarray sum ending at each index. At each step, decide whether to extend the current subarray or start fresh from the current element.

**Key formula:**
```
curr = max(num, curr + num)
result = max(result, curr)
```

| Problem | Platform | Difficulty |
| ------- | -------- | ---------- |
| [Maximum Subarray](https://leetcode.com/problems/maximum-subarray/) | LC #53 | 🟢 Easy |
| [Kadane's Algorithm](https://www.geeksforgeeks.org/problems/kadanes-algorithm-1587115620/1) | GFG | 🟠 Medium |

---

### 6️⃣ Cyclic Sort

**Approach:** For arrays with elements in range [1..n], place each element at its correct index (index = value - 1). After sorting, a misplaced element reveals a missing or duplicate number.

**Key formula:**
```
correct index = nums[i] - 1
swap nums[i] with nums[correct index] until nums[i] is in place
```

| Problem | Platform | Difficulty |
| ------- | -------- | ---------- |
| [Find All Numbers Disappeared in Array](https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/) | LC #448 | 🟢 Easy |
| [Missing Number](https://leetcode.com/problems/missing-number/) | LC #268 | 🟢 Easy |
| [Set Mismatch](https://leetcode.com/problems/set-mismatch/) | LC #645 | 🟢 Easy |
| [First Missing Positive](https://leetcode.com/problems/first-missing-positive/) | LC #41 | 🔴 Hard |

---

### 7️⃣ Floyd Cycle Detection

**Approach:** Treat the array as a linked list where `nums[i]` is a pointer. Use slow and fast pointers — when they meet, reset slow to start and advance both one step at a time to find the duplicate (cycle entry point).

**Key formula:**
```
slow = nums[slow]
fast = nums[nums[fast]]
→ when slow == fast, reset slow = 0, then move both one step until equal
```

| Problem | Platform | Difficulty |
| ------- | -------- | ---------- |
| [Find the Duplicate Number](https://leetcode.com/problems/find-the-duplicate-number/) | LC #287 | 🟠 Medium |

---

### 8️⃣ Interval Problems

**Approach:** Sort intervals by start time. Merge when the current interval's start ≤ previous end. For insertion, handle three phases: intervals before, overlapping (merge all), and after the new interval.

**Key rule:**
```
if curr.start <= prev.end → merge: end = max(prev.end, curr.end)
else → no overlap, add prev to result
```

| Problem | Platform | Difficulty |
| ------- | -------- | ---------- |
| [Merge Intervals](https://leetcode.com/problems/merge-intervals/) | LC #56 | 🟠 Medium |
| [Insert Interval](https://leetcode.com/problems/insert-interval/) | LC #57 | 🟠 Medium |

---

### 9️⃣ Binary Search

**Approach:** On a sorted or partially sorted array, eliminate half the search space each step. For mountain arrays, compare `mid` with its neighbors to decide which side the peak is on.

**Key formula:**
```
mid = low + (high - low) / 2   ← avoids integer overflow
```

| Problem | Platform | Difficulty |
| ------- | -------- | ---------- |
| [Check if Array is Sorted and Rotated](https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/) | LC #1752 | 🟢 Easy |
| [Single Element in a Sorted Array](https://leetcode.com/problems/single-element-in-a-sorted-array/) | LC #540 | 🟠 Medium |
| [Peak Index in a Mountain Array](https://leetcode.com/problems/peak-index-in-a-mountain-array/) | LC #852 | 🟠 Medium |
| [Find Peak Element](https://leetcode.com/problems/find-peak-element/) | LC #162 | 🟠 Medium |
| [Find in Mountain Array](https://leetcode.com/problems/find-in-mountain-array/) | LC #1095 | 🔴 Hard |

---

### 🔟 Binary Search on Answer

**Approach:** When asked for the "minimum valid X" over a range, binary search on the answer itself (not the array index). Write an `isValid(mid)` helper. If valid, search left for something smaller; if not, search right for something larger.

**Key logic:**
```
if isValid(mid) → high = mid - 1   (try smaller answer)
else            → low  = mid + 1   (need larger answer)
```

**Ceiling division trick:**
```
ceil(a / b) = (a + b - 1) / b
```

| Problem | Platform | Difficulty |
| ------- | -------- | ---------- |
| [Koko Eating Bananas](https://leetcode.com/problems/koko-eating-bananas/) | LC #875 | 🟠 Medium |
| [Capacity to Ship Packages Within D Days](https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/) | LC #1011 | 🟠 Medium |
| [Find the Smallest Divisor Given a Threshold](https://leetcode.com/problems/find-the-smallest-divisor-given-a-threshold/) | LC #1283 | 🟠 Medium |

---

### 1️⃣1️⃣ Heap

**Approach:** Use a min-heap or max-heap to efficiently access the Kth smallest or largest element. Building a heap is O(n); each extraction is O(log n).

**Trigger:** "Top K", "Kth smallest/largest"

| Problem | Platform | Difficulty |
| ------- | -------- | ---------- |
| [Kth Smallest Element](https://www.geeksforgeeks.org/problems/kth-smallest-element5635/1) | GFG | 🟠 Medium |

---

### 1️⃣2️⃣ Math & Sorting

**Approach:** Use mathematical properties (sum formula, XOR, algebra) or simple sort + index tricks. Fast to implement and often the cleanest solution for well-defined numeric problems.

| Problem | Platform | Difficulty |
| ------- | -------- | ---------- |
| [Rotate Array](https://leetcode.com/problems/rotate-array/) | LC #189 | 🟠 Medium |
| [Valid Sudoku](https://leetcode.com/problems/valid-sudoku/) | LC #36 | 🟠 Medium |
| [Median of an Array](https://www.geeksforgeeks.org/problems/find-the-median0527/1) | GFG | 🟢 Easy |
| [Palindromic Array](https://www.geeksforgeeks.org/problems/palindromic-array-1587115620/1) | GFG | 🟢 Easy |
| [Simple Array Sum](https://www.hackerrank.com/challenges/simple-array-sum/problem) | HackerRank | 🟢 Easy |
| [Number Line Jumps](https://www.hackerrank.com/contests/mountblue-technologies/challenges/kangaroo) | HackerRank | 🟢 Easy |

---
pattern tip for FindTheClosestPairFromTwoArrays.java
🧠 Pattern Tip

👉 When you see:

Two sorted arrays
Need pair with target / closest sum

💡 Trigger:

Two pointers from opposite ends

⚙️ Approach (Short)
Start:
i = 0 (arr1)
j = n-1 (arr2)
Compute sum
Update closest pair
Move:
sum > x → move left (j--)
sum < x → move right (i++)


---

## 🏢 Company Mapping

| Company   | Focus Patterns                          |
| --------- | --------------------------------------- |
| Amazon    | HashMap, Sliding Window, Greedy         |
| Google    | Prefix Sum, Binary Search, Two Pointers |
| Microsoft | Arrays, Greedy, Intervals               |
| Meta      | Two Pointers, Cyclic Sort               |
| Adobe     | Sorting, Math                           |

---

## 🔁 Revision Strategy

| Mode         | How to Use                                        |
| ------------ | ------------------------------------------------- |
| 🟩 Learn      | Solve problems + study the pattern approach       |
| 🟨 Revise     | Re-read pattern sections + formulas only          |
| 🟥 Interview  | Identify pattern from cheat sheet in under 30 sec |

**Daily target:** 3 problems/day — focus on one pattern group at a time

---

## 🎯 Key Takeaway

> *"If you identify the pattern in 30 seconds, you can solve it in 5 minutes."*

**Arrays = Pattern Recognition. Same patterns repeat. Speed = Pattern + Practice.**

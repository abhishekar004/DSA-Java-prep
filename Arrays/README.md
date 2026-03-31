# 📘 Arrays — DSA Placement Preparation

> ⚡ **"If you identify the pattern in 30 seconds, you can solve it in 5 minutes."**
>
> A **pattern-based DSA revision system** built for fast pattern recognition, placement prep, and high-pressure interview revision.

---

## 📁 Folder Structure

```
arrays/
├── README.md
├── HashMap/
│   ├── TwoSum.java
│   ├── ContainsDuplicate.java
│   ├── ArraySubset.java
│   └── SalesByMatch.java
├── TwoPointers/
│   ├── SquaresOfSortedArray.java
│   ├── MoveZeroes.java
│   ├── RemoveDuplicatesI.java
│   ├── RemoveDuplicatesII.java
│   ├── ThreeSum.java
│   ├── ThreeSumClosest.java
│   ├── FourSum.java
│   ├── ReverseAnArray.java
│   └── FindTheClosestPairFromTwoArrays.java
├── Greedy/
│   ├── BestTimeToBuyAndSellStock.java
│   ├── NonDecreasingArray.java
│   ├── GlobalAndLocalInversions.java
│   ├── EscapeTheGhosts.java
│   ├── MaximizeDistanceToClosestPerson.java
│   └── BreakingTheRecords.java
├── PrefixSum/
│   ├── ProductOfArrayExceptSelf.java
│   ├── SubarrayWithZeroSum.java
│   └── SubarraySumEqualsK.java
├── Kadane/
│   ├── MaximumSubarray.java
│   └── KadanesAlgorithm.java
├── CyclicSort/
│   ├── FindDisappearedNumbers.java
│   ├── MissingNumber.java
│   ├── SetMismatch.java
│   └── FirstMissingPositive.java
├── FloydCycle/
│   └── FindDuplicateNumber.java
├── Intervals/
│   ├── MergeIntervals.java
│   └── InsertInterval.java
├── BinarySearch/
│   ├── CheckIfSortedAndRotated.java
│   ├── SingleElementInSortedArray.java
│   ├── PeakIndexInMountainArray.java
│   ├── FindPeakElement.java
│   └── FindInMountainArray.java
├── BinarySearchOnAnswer/
│   ├── KokoEatingBananas.java
│   ├── CapacityToShipPackages.java
│   └── SmallestDivisor.java
├── Heap/
│   ├── KthSmallest.java
│   └── MedianOfArray.java
├── SlidingWindow/
│   └── SubarrayDivision.java
├── Partition/
│   └── Quicksort1-Partition.java
├── Math/
│   ├── RotateArray.java
│   ├── ValidSudoku.java
│   ├── PalindromicArray.java
│   ├── NumberLineJumps.java
│   ├── BetweenTwoSets.java
│   ├── MissingNumber.java (XOR variant)
│   ├── SimpleArraySum.java
│   ├── AVeryBigSum.java
│   ├── PlusMinus.java
│   ├── BillDivision.java
│   ├── MigratoryBirds.java
│   └── FindPeakElement.java
│   └── GradingStudents.java
└── Misc/
│  └── SubarrayDivision.java
├── Matrix Traversal/
│   └── DiagonalDifference.java
├── Array Traversal/
│   └── BirthdayCakeCandles.java
```

---

## 🎯 Progress Tracker

**Problems Solved: 46 / 300**

```
████░░░░░░░░░░░░░░░░  16%  [48 / 300]
```

| Pattern | Solved | Target |
|---------|--------|--------|
| HashMap | 4 | 20 |
| Two Pointers | 9 | 25 |
| Greedy | 6 | 20 |
| Prefix Sum | 3 | 15 |
| Kadane's | 2 | 10 |
| Cyclic Sort | 4 | 10 |
| Floyd Cycle | 1 | 5 |
| Intervals | 2 | 10 |
| Binary Search | 5 | 20 |
| Binary Search on Answer | 3 | 15 |
| Heap | 1 | 10 |
| Sliding Window | 1 | 20 |
| Partition | 1 | 10 |
| Math / LCM+GCD | 1 | 10 |
| Math & Sorting | 5 | 30 |
| Frequency Array | 1 | 10 |
| Miscellaneous | 4 | 10 |

---

## ⚡ Pattern Recognition Cheat Sheet

> 🔑 **Master this table. In an interview, identify the pattern first — then code.**

| Trigger (What You See in the Problem) | Pattern to Apply |
|---------------------------------------|-----------------|
| Pair / target sum | HashMap |
| Frequency count, fast lookup | HashMap |
| Sorted array + pair / triplet | Two Pointers |
| Two sorted arrays, closest sum | Two Pointers (opposite ends) |
| In-place rearrangement | Two Pointers |
| Maximize profit, track running min/max | Greedy |
| Locally optimal = globally optimal | Greedy |
| Subarray sum = k | Prefix Sum + HashMap |
| Range sum query | Prefix Sum |
| Zero-sum subarray | Prefix Sum + HashMap |
| Maximum subarray (contiguous) | Kadane's Algorithm |
| Missing / duplicate in [1..n] | Cyclic Sort |
| Find duplicate without extra space | Floyd Cycle Detection |
| Overlapping ranges | Interval Merge |
| Sorted array, find element or peak | Binary Search |
| "Minimize the maximum" / threshold condition | Binary Search on Answer |
| Top K / Kth smallest / largest | Heap |
| Fixed-size window, contiguous subarray | Sliding Window |
| Variable-size window (shrink/expand) | Sliding Window |
| Rearrange around pivot | Partition (QuickSort) |
| All of A divides X, X divides all of B | LCM + GCD |
| Count occurrences in small fixed range | Frequency Array |
| Sum of large numbers, big constraints | Use `long`, check overflow |
| Exclude one element, split cost | Total Sum − Excluded Element |

---

## 🧩 Problems — Grouped by Pattern

---

### 1️⃣ HashMap

> **Core Idea:** Trade space for speed. Use a hash map for O(1) lookups to detect pairs, complements, or frequencies in a single pass instead of nested loops.

**Trigger keywords:** "find pair", "target sum", "frequency", "duplicate check", "fast lookup"

**Key insight:** `target - num` → check if result already exists in map

| Problem | Platform | Difficulty |
|---------|----------|------------|
| [Two Sum](https://leetcode.com/problems/two-sum/) | LC #1 | 🟢 Easy |
| [Contains Duplicate](https://leetcode.com/problems/contains-duplicate/) | LC #217 | 🟢 Easy |
| [Array Subset of Another Array](https://www.geeksforgeeks.org/problems/array-subset-of-another-array2317/1) | GFG | 🟢 Easy |
| [Sales by Match](https://www.hackerrank.com/challenges/sock-merchant/problem) | HackerRank | 🟢 Easy |

**Key Template:**
```java
Map<Integer, Integer> map = new HashMap<>();
for (int i = 0; i < nums.length; i++) {
    int complement = target - nums[i];
    if (map.containsKey(complement)) return new int[]{map.get(complement), i};
    map.put(nums[i], i);
}
```

⚠️ **Common Mistakes:**
- Putting `num` into the map **before** checking for complement — causes the same element to be used twice
- Using a HashSet when index is needed (Two Sum requires indices, not just existence)
- Not using `getOrDefault` when counting frequencies (causes NPE or wrong counts)

🔥 **Interview Tips:**
- If brute force is O(n²), ask: "Can I use a HashMap to reduce lookup to O(1)?"
- Follow-up: "What if the array is sorted?" → Two Pointers is better (O(1) space)
- Follow-up: "What if there are multiple valid pairs?" → collect all, don't return early

---

### 2️⃣ Two Pointers

> **Core Idea:** Use left and right pointers on a sorted (or partitioned) array, moving them toward each other based on whether the current sum is too small or too large. Also handles in-place operations like removing duplicates or moving zeroes without extra space.

**Trigger keywords:** "sorted array + pair/triplet", "in-place", "two sorted arrays + closest sum", "remove/rearrange in-place"

**Key rule:**
```
sum < target  →  left++    (need bigger value)
sum > target  →  right--   (need smaller value)
```

| Problem | Platform | Difficulty |
|---------|----------|------------|
| [Squares of Sorted Array](https://leetcode.com/problems/squares-of-a-sorted-array/) | LC #977 | 🟢 Easy |
| [Move Zeroes](https://leetcode.com/problems/move-zeroes/) | LC #283 | 🟢 Easy |
| [Remove Duplicates from Sorted Array](https://leetcode.com/problems/remove-duplicates-from-sorted-array/) | LC #26 | 🟢 Easy |
| [Remove Duplicates from Sorted Array II](https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/) | LC #80 | 🟠 Medium |
| [3Sum](https://leetcode.com/problems/3sum/) | LC #15 | 🟠 Medium |
| [3Sum Closest](https://leetcode.com/problems/3sum-closest/) | LC #16 | 🟠 Medium |
| [4Sum](https://leetcode.com/problems/4sum/) | LC #18 | 🟠 Medium |
| [Reverse An Array](https://www.geeksforgeeks.org/problems/reverse-an-array/1) | GFG | 🟢 Easy |
| [Find the Closest Pair from Two Arrays](https://www.geeksforgeeks.org/given-two-sorted-arrays-number-x-find-pair-whose-sum-closest-x/) | GFG | 🟠 Medium |

**Key Template — Closest pair from two sorted arrays:**
```java
int i = 0, j = arr2.length - 1;
while (i < arr1.length && j >= 0) {
    int sum = arr1[i] + arr2[j];
    // update closest pair here
    if (sum < x) i++;       // need bigger value
    else         j--;       // need smaller value
}
```

**Key Template — 3Sum (fix + two pointers):**
```java
Arrays.sort(nums);
for (int k = 0; k < nums.length - 2; k++) {
    if (k > 0 && nums[k] == nums[k - 1]) continue; // skip outer duplicates
    int left = k + 1, right = nums.length - 1;
    while (left < right) {
        int sum = nums[k] + nums[left] + nums[right];
        if (sum == 0) {
            result.add(Arrays.asList(nums[k], nums[left], nums[right]));
            while (left < right && nums[left] == nums[left + 1]) left++;   // skip inner dupes
            while (left < right && nums[right] == nums[right - 1]) right--;
            left++; right--;
        } else if (sum < 0) left++;
        else right--;
    }
}
```

⚠️ **Common Mistakes:**
- Applying two pointers on an unsorted array — the pattern breaks entirely without sorting
- Not skipping duplicates in 3Sum/4Sum — produces duplicate triplets in output
- Moving the wrong pointer when `sum == target`
- Using nested loops when two pointers already achieves O(n)

🔥 **Interview Tips:**
- Always ask: "Is the array sorted?" If not, sort it first and acknowledge the O(n log n) overhead
- For 3Sum: fix one element with a for loop, run two pointers on the rest → O(n³) becomes O(n²)
- Generalization for Remove Duplicates II: "What if at most K duplicates allowed?" → use a count variable

---

### 3️⃣ Greedy

> **Core Idea:** Make the locally optimal choice at each step with no backtracking. Track a running minimum or maximum while iterating — the decision at each index is final and never revisited.

**Trigger keywords:** "maximize profit", "minimize cost", "track running min/max", "locally optimal"

**Key insight:** If the best local choice never invalidates the global optimum → greedy works.

```java
// Pattern: running min + max profit
int minPrice = nums[0], maxProfit = 0;
for (int price : nums) {
    maxProfit = Math.max(maxProfit, price - minPrice);
    minPrice  = Math.min(minPrice, price);
}
```

| Problem | Platform | Difficulty |
|---------|----------|------------|
| [Best Time to Buy & Sell Stock](https://leetcode.com/problems/best-time-to-buy-and-sell-stock/) | LC #121 | 🟢 Easy |
| [Non-Decreasing Array](https://leetcode.com/problems/non-decreasing-array/) | LC #665 | 🟠 Medium |
| [Global and Local Inversions](https://leetcode.com/problems/global-and-local-inversions/) | LC #775 | 🟠 Medium |
| [Escape the Ghosts](https://leetcode.com/problems/escape-the-ghosts/) | LC #789 | 🟠 Medium |
| [Maximize Distance to Closest Person](https://leetcode.com/problems/maximize-distance-to-closest-person/) | LC #849 | 🟠 Medium |
| [Breaking The Records](https://www.hackerrank.com/contests/mountblue-technologies/challenges/breaking-best-and-worst-records) | HackerRank | 🟢 Easy |

⚠️ **Common Mistakes:**
- Initializing `min = 0` instead of `nums[0]` — breaks for all-negative arrays
- Reaching for DP when greedy suffices — if a running variable is enough, don't build a table
- Not recognizing greedy applicability — ask "Is there any reason to revisit a past decision?"

🔥 **Interview Tips:**
- Prove greedy correctness: "At each step I pick X because any other choice can only make things worse"
- Follow-up for Stock I: "What if you can buy/sell multiple times?" → add profit whenever `price[i] > price[i-1]`
- For Non-Decreasing Array: consider how modifying `nums[i-1]` vs `nums[i]` affects future elements

---

### 4️⃣ Prefix Sum

> **Core Idea:** Precompute cumulative sums so any subarray sum `[i..j] = prefix[j] - prefix[i-1]` in O(1). Combine with a HashMap to find subarrays with a target sum in a single pass.

**Trigger keywords:** "subarray sum = k", "range sum query", "zero-sum subarray", "product except self"

**Key formula:**
```
prefix[j] - prefix[i] = k
→ check if (prefix[j] - k) exists in map
```

| Problem | Platform | Difficulty |
|---------|----------|------------|
| [Product of Array Except Self](https://leetcode.com/problems/product-of-array-except-self/) | LC #238 | 🟠 Medium |
| [Subarray with 0 Sum](https://www.geeksforgeeks.org/problems/subarray-with-0-sum-1587115621/1) | GFG | 🟠 Medium |
| [Subarray Sum Equals K](https://leetcode.com/problems/subarray-sum-equals-k/) | LC #560 | 🟠 Medium |

**Key Template:**
```java
Map<Integer, Integer> map = new HashMap<>();
map.put(0, 1);  // ← CRITICAL: handles subarrays starting at index 0
int sum = 0, count = 0;
for (int num : nums) {
    sum += num;
    count += map.getOrDefault(sum - k, 0);
    map.put(sum, map.getOrDefault(sum, 0) + 1);
}
```

⚠️ **Common Mistakes:**
- Forgetting `map.put(0, 1)` — misses subarrays that start from index 0
- Off-by-one: `prefix[j] - prefix[i]` covers `[i+1..j]`, not `[i..j]`
- Building a full prefix array when a running sum variable is sufficient
- Applying sliding window for negative numbers — sliding window requires non-negative; prefix sum handles negatives fine

🔥 **Interview Tips:**
- The `map.put(0, 1)` line is the most commonly forgotten part — say it aloud during interviews
- For Product Except Self: left-pass stores prefix products, right-pass multiplies in-place → O(1) extra space
- Follow-up: "What if the array has negatives?" → Prefix sum works; sliding window does not

---

### 5️⃣ Kadane's Algorithm

> **Core Idea:** At each index, decide whether to extend the running subarray or start fresh. One variable tracks the best ending here; another tracks the global best. One pass, O(n), O(1) space.

**Trigger keywords:** "maximum subarray", "contiguous subarray with largest sum", "max sum"

**Key formula:**
```java
curr   = Math.max(num, curr + num);   // extend or restart
result = Math.max(result, curr);       // update global max
```

| Problem | Platform | Difficulty |
|---------|----------|------------|
| [Maximum Subarray](https://leetcode.com/problems/maximum-subarray/) | LC #53 | 🟢 Easy |
| [Kadane's Algorithm](https://www.geeksforgeeks.org/problems/kadanes-algorithm-1587115620/1) | GFG | 🟠 Medium |

**Key Template:**
```java
int curr = nums[0], result = nums[0];
for (int i = 1; i < nums.length; i++) {
    curr   = Math.max(nums[i], curr + nums[i]);
    result = Math.max(result, curr);
}
return result;
```

⚠️ **Common Mistakes:**
- Initializing `curr = 0` and `result = 0` — fails when all elements are negative
- Confusing "subarray" (contiguous) with "subsequence" (non-contiguous) — Kadane's is for subarrays only
- Not returning the index boundaries when asked to also return the actual subarray

🔥 **Interview Tips:**
- Always initialize `curr` and `result` from `nums[0]`, not 0
- Follow-up: "What if you need to return the subarray itself?" → track `start`, `end`, `tempStart`
- Follow-up: "What if the array wraps around (circular)?" → max of standard Kadane + (totalSum - minSubarray)

---

### 6️⃣ Cyclic Sort

> **Core Idea:** For arrays where elements are in range [1..n], place each element at its correct index (`index = value - 1`) by swapping. After one pass, any index where `nums[i] != i + 1` reveals a missing or duplicate.

**Trigger keywords:** "missing number in [1..n]", "find duplicate in [1..n]", "numbers in known range"

**Key formula:**
```java
int correctIdx = nums[i] - 1;
if (nums[i] != nums[correctIdx]) swap(nums, i, correctIdx);
else i++;
```

| Problem | Platform | Difficulty |
|---------|----------|------------|
| [Find All Numbers Disappeared in Array](https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/) | LC #448 | 🟢 Easy |
| [Missing Number](https://leetcode.com/problems/missing-number/) | LC #268 | 🟢 Easy |
| [Set Mismatch](https://leetcode.com/problems/set-mismatch/) | LC #645 | 🟢 Easy |
| [First Missing Positive](https://leetcode.com/problems/first-missing-positive/) | LC #41 | 🔴 Hard |

**Key Template:**
```java
// Phase 1: sort cyclically
int i = 0;
while (i < nums.length) {
    int correctIdx = nums[i] - 1;
    if (correctIdx >= 0 && correctIdx < nums.length && nums[i] != nums[correctIdx])
        swap(nums, i, correctIdx);
    else i++;
}

// Phase 2: detect anomaly
for (int j = 0; j < nums.length; j++) {
    if (nums[j] != j + 1) return j + 1; // missing number
}
```

⚠️ **Common Mistakes:**
- Forgetting to guard against out-of-range values (First Missing Positive has values outside [1..n])
- Infinite loop: not incrementing `i` when `nums[i] == nums[correctIdx]` (duplicate case)
- Confusing the two phases — sort first, then scan for anomaly

🔥 **Interview Tips:**
- Cyclic Sort is O(n) time and O(1) space — always mention this
- Works only when the value range is known and bounded
- Follow-up: "What if the range is [0..n]?" → adjust `correctIdx = nums[i]`

---

### 7️⃣ Floyd's Cycle Detection

> **Core Idea:** Treat the array as an implicit linked list where `nums[i]` is a "next pointer". Slow pointer moves 1 step, fast moves 2. When they meet, reset slow to start and move both 1 step — where they meet again is the duplicate (cycle entry point).

**Trigger keywords:** "find duplicate without extra space", "O(1) space, no modification", "array as linked list"

**Key formula:**
```java
// Phase 1: detect cycle
int slow = nums[0], fast = nums[0];
do {
    slow = nums[slow];
    fast = nums[nums[fast]];
} while (slow != fast);

// Phase 2: find entry (duplicate)
slow = nums[0];
while (slow != fast) {
    slow = nums[slow];
    fast = nums[fast];
}
return slow;
```

| Problem | Platform | Difficulty |
|---------|----------|------------|
| [Find the Duplicate Number](https://leetcode.com/problems/find-the-duplicate-number/) | LC #287 | 🟠 Medium |

⚠️ **Common Mistakes:**
- Starting both pointers at index 0 vs `nums[0]` — the linked list starts at `nums[0]`
- Forgetting Phase 2 and returning the meeting point from Phase 1 (that's not the duplicate)
- Trying cyclic sort when the problem forbids array modification

🔥 **Interview Tips:**
- Constraint: "cannot modify the array, O(1) extra space" → this is the pattern
- Without these constraints, cyclic sort or a HashSet would be simpler alternatives
- This is based on Floyd's algorithm from linked list cycle detection — say so in the interview

---

### 8️⃣ Interval Problems

> **Core Idea:** Sort intervals by start time. Merge when the current interval overlaps the last merged one (start ≤ prev end). For insertion, handle three distinct phases: intervals strictly before the new one, all overlapping intervals (merge), then intervals strictly after.

**Trigger keywords:** "overlapping ranges", "merge intervals", "insert interval", "meeting rooms"

**Key rule:**
```java
if (curr.start <= prev.end)  →  merge: end = Math.max(prev.end, curr.end)
else                         →  no overlap, add prev to result
```

| Problem | Platform | Difficulty |
|---------|----------|------------|
| [Merge Intervals](https://leetcode.com/problems/merge-intervals/) | LC #56 | 🟠 Medium |
| [Insert Interval](https://leetcode.com/problems/insert-interval/) | LC #57 | 🟠 Medium |

**Key Template — Merge Intervals:**
```java
Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
List<int[]> result = new ArrayList<>();
result.add(intervals[0]);
for (int i = 1; i < intervals.length; i++) {
    int[] last = result.get(result.size() - 1);
    if (intervals[i][0] <= last[1])
        last[1] = Math.max(last[1], intervals[i][1]); // merge
    else
        result.add(intervals[i]);                     // no overlap
}
```

⚠️ **Common Mistakes:**
- Not sorting before merging — the algorithm only works on sorted intervals
- Taking `min` instead of `max` of the end boundary during merge
- For Insert Interval: handling the three phases with a single loop without clearly separating them

🔥 **Interview Tips:**
- Insert Interval (LC #57) doesn't require re-sorting since input is already sorted
- Follow-up: "What's the minimum number of meeting rooms needed?" → count max overlapping intervals with a sorted events approach

---

### 9️⃣ Binary Search

> **Core Idea:** On a sorted or partially sorted array, eliminate half the search space at each step. For mountain arrays, compare `mid` with neighbors to determine which slope you're on. Always use `mid = low + (high - low) / 2` to avoid integer overflow.

**Trigger keywords:** "sorted array", "find element", "peak element", "O(log n) search"

**Key formulas:**
```java
mid = low + (high - low) / 2;             // always use this — avoids overflow

// Standard binary search
if (arr[mid] == target) return mid;
else if (arr[mid] < target) low = mid + 1;
else high = mid - 1;

// Peak element (mountain)
if (arr[mid] < arr[mid + 1]) low = mid + 1;   // ascending slope → peak is right
else high = mid;                               // descending / at peak → go left
```

| Problem | Platform | Difficulty |
|---------|----------|------------|
| [Check if Array is Sorted and Rotated](https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/) | LC #1752 | 🟢 Easy |
| [Single Element in a Sorted Array](https://leetcode.com/problems/single-element-in-a-sorted-array/) | LC #540 | 🟠 Medium |
| [Peak Index in a Mountain Array](https://leetcode.com/problems/peak-index-in-a-mountain-array/) | LC #852 | 🟠 Medium |
| [Find Peak Element](https://leetcode.com/problems/find-peak-element/) | LC #162 | 🟠 Medium |
| [Find in Mountain Array](https://leetcode.com/problems/find-in-mountain-array/) | LC #1095 | 🔴 Hard |

⚠️ **Common Mistakes:**
- Using `low + high / 2` instead of `low + (high - low) / 2` — integer overflow for large inputs
- Wrong loop condition: `low < high` vs `low <= high` depends on whether mid is a valid answer
- For Single Element: missing the parity trick — pairs break after the missing element shifts indices

🔥 **Interview Tips:**
- Any time you need O(log n) on a sorted structure, say "binary search" immediately
- For rotated sorted arrays, binary search still works — one half is always normally sorted
- Find in Mountain Array (Hard): 3-phase binary search — find peak, then search each slope separately

---

### 🔟 Binary Search on Answer

> **Core Idea:** When asked for the "minimum valid X" over a range, binary search on the *answer space* rather than array indices. Write an `isValid(mid)` predicate — if valid, try smaller (`high = mid - 1`); if not, try larger (`low = mid + 1`).

**Trigger keywords:** "minimize the maximum", "minimum feasible threshold", "at most K", "ship within D days"

**Key logic:**
```java
int low = minPossible, high = maxPossible;
while (low <= high) {
    int mid = low + (high - low) / 2;
    if (isValid(mid)) high = mid - 1;  // valid → try smaller
    else              low  = mid + 1;  // invalid → need larger
}
return low;  // smallest valid answer

// Ceiling division (used inside isValid):
int chunks = (a + b - 1) / b;
```

| Problem | Platform | Difficulty |
|---------|----------|------------|
| [Koko Eating Bananas](https://leetcode.com/problems/koko-eating-bananas/) | LC #875 | 🟠 Medium |
| [Capacity to Ship Packages Within D Days](https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/) | LC #1011 | 🟠 Medium |
| [Find the Smallest Divisor Given a Threshold](https://leetcode.com/problems/find-the-smallest-divisor-given-a-threshold/) | LC #1283 | 🟠 Medium |

⚠️ **Common Mistakes:**
- Setting wrong search bounds: `low` should be the minimum possible answer, `high` the maximum
- Wrong direction: if `isValid(mid)` is true, you want *smaller* → `high = mid - 1`
- Integer division in `isValid` — always use ceiling: `(a + b - 1) / b`

🔥 **Interview Tips:**
- These three problems are nearly identical in structure — recognize the template and write `isValid` first
- The search space is always `[1..max(array)]` or similar — state this clearly
- Follow-up: "Why binary search and not linear scan?" → O(n log n) vs O(n × max)

---

### 1️⃣1️⃣ Heap

> **Core Idea:** Use a min-heap to maintain the K largest elements seen so far. After processing all elements, `heap.peek()` is the Kth largest. Building the heap is O(n); each operation is O(log K).

**Trigger keywords:** "Top K", "Kth smallest / largest", "K closest", "streaming data"

| Problem | Platform | Difficulty |
|---------|----------|------------|
| [Kth Smallest Element](https://www.geeksforgeeks.org/problems/kth-smallest-element5635/1) | GFG | 🟠 Medium |
| [Median of an Array](https://www.geeksforgeeks.org/problems/find-the-median0527/1) | GFG | 🟢 Easy |

**Key Template — Kth Largest (min-heap of size K):**
```java
PriorityQueue<Integer> minHeap = new PriorityQueue<>();
for (int num : nums) {
    minHeap.offer(num);
    if (minHeap.size() > k) minHeap.poll(); // remove smallest
}
return minHeap.peek(); // Kth largest
```

**Key Template — Kth Smallest (max-heap of size K):**
```java
PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
for (int num : nums) {
    maxHeap.offer(num);
    if (maxHeap.size() > k) maxHeap.poll(); // remove largest
}
return maxHeap.peek(); // Kth smallest
```

⚠️ **Common Mistakes:**
- Using a max-heap for Kth largest (use min-heap instead — it evicts the smallest, keeping the K largest)
- Sorting the full array at O(n log n) when a heap gives O(n log K) — faster when K << n
- For median: forgetting the two-heap approach (max-heap for lower half + min-heap for upper half)

🔥 **Interview Tips:**
- State complexity: O(n log K) time, O(K) space — better than sort when K is small
- Median of a stream: maintain max-heap (lower) and min-heap (upper); balance sizes after each insertion
- Quick Select (O(n) average) is another alternative for Kth smallest on a static array

---

### 1️⃣2️⃣ Sliding Window

> **Core Idea:** Maintain a window over the array, expanding the right edge and shrinking the left edge based on a condition. For fixed-size windows: move both edges together. For variable-size: expand right freely, contract left only when the window violates the constraint.

**Trigger keywords:** "contiguous subarray", "fixed window size", "maximum/minimum of subarray length K", "all characters in window"

**Fixed Window Template:**
```java
int windowSum = 0, maxSum = 0;
for (int i = 0; i < nums.length; i++) {
    windowSum += nums[i];
    if (i >= k) windowSum -= nums[i - k];  // shrink left
    if (i >= k - 1) maxSum = Math.max(maxSum, windowSum);
}
```

**Variable Window Template:**
```java
int left = 0, result = 0;
for (int right = 0; right < nums.length; right++) {
    // expand window by including nums[right]
    while (/* window violates condition */) {
        // shrink window from left
        left++;
    }
    result = Math.max(result, right - left + 1);
}
```

| Problem | Platform | Difficulty |
|---------|----------|------------|
| [Subarray Division](https://www.hackerrank.com/challenges/the-birthday-bar/problem) | HackerRank | 🟢 Easy |

⚠️ **Common Mistakes:**
- Using nested loops to recompute subarray sums — always reuse the previous window's sum
- Applying sliding window to arrays with negative numbers — only valid for non-negative values (use prefix sum instead)
- For variable window: not moving `left` past `right` — window size can be 0

🔥 **Interview Tips:**
- Sliding Window is a foundation for: Longest Substring Without Repeating Characters, Max Sum Subarray of Size K, Minimum Window Substring
- "Fixed length" in the problem → immediately think fixed sliding window
- "At most K distinct" or "at least" → variable window

---

### 1️⃣3️⃣ Partition (QuickSort Foundation)

> **Core Idea:** Pick a pivot, traverse the rest of the array, and rearrange so all elements smaller than the pivot go left and larger go right. This one-pass rearrangement is the foundation of QuickSort and QuickSelect (Kth element in O(n) average).

**Trigger keywords:** "rearrange around pivot", "smaller on left, larger on right", "partition array"

**Lomuto Partition Scheme:**
```java
int pivot = nums[high], i = low - 1;
for (int j = low; j < high; j++) {
    if (nums[j] <= pivot) {
        i++;
        swap(nums, i, j);
    }
}
swap(nums, i + 1, high);
return i + 1;   // pivot's final sorted index
```

| Problem | Platform | Difficulty |
|---------|----------|------------|
| [Quicksort 1 - Partition](https://www.hackerrank.com/challenges/quicksort1/problem) | HackerRank | 🟢 Easy |

⚠️ **Common Mistakes:**
- Attempting full recursive QuickSort when only the partition step is requested
- Placing equal elements incorrectly — they can go on either side with Lomuto, but be consistent
- Off-by-one in boundary conditions leading to missed elements

🔥 **Interview Tips:**
- Follow-up: "Implement full QuickSort" → recurse on `[low..pivotIdx-1]` and `[pivotIdx+1..high]`
- QuickSelect uses this partition to find the Kth smallest in O(n) average without full sorting
- Hoare partition is faster in practice but trickier to implement — know both exist

---

### 1️⃣4️⃣ Math — LCM & GCD

> **Core Idea:** When all elements of array A must divide X, and X must divide all elements of array B, valid X values are multiples of `LCM(A)` that also divide `GCD(B)`. Count multiples of LCM(A) in the range [LCM(A), GCD(B)].

**Trigger keywords:** "all of A divides X", "X divides all of B", "numbers between two sets", "divisibility on two arrays"

**Key insight:**
```
Valid X must satisfy:
    X % LCM(A) == 0          ← X is divisible by every element in A
    GCD(B) % X  == 0          ← X divides every element in B

Safe LCM formula (avoids overflow):
    lcm(a, b) = (a / gcd(a, b)) * b
```

| Problem | Platform | Difficulty |
|---------|----------|------------|
| [Between Two Sets](https://www.hackerrank.com/challenges/between-two-sets/problem) | HackerRank | 🟢 Easy |

⚠️ **Common Mistakes:**
- Brute forcing every number from 1 to max — correct but O(max × n), inefficient
- Using `(a * b) / gcd(a, b)` for LCM — overflows for large inputs; divide first, then multiply
- Missing that X must be ≥ LCM(A) and ≤ GCD(B)

🔥 **Interview Gold:**
> "Multiple numbers must all divide X → think **LCM**."
> "X must divide multiple numbers → think **GCD**."

---

### 1️⃣5️⃣ Frequency Array

> **Core Idea:** When values are from a small, known range, use an array indexed by value instead of a HashMap. Faster due to cache locality and simpler to implement.

**Trigger keywords:** "most frequent element", "count occurrences", "values in fixed range [1..5]", "small distinct values"

**Key Template:**
```java
int[] freq = new int[maxVal + 1];
for (int x : arr) freq[x]++;

// Find max frequency
int maxFreq = 0, result = -1;
for (int i = 1; i <= maxVal; i++) {
    if (freq[i] > maxFreq) {    // strict > ensures smallest ID wins ties
        maxFreq = freq[i];
        result = i;
    }
}
```

| Problem | Platform | Difficulty |
|---------|----------|------------|
| [Migratory Birds](https://www.hackerrank.com/challenges/migratory-birds/problem) | HackerRank | 🟢 Easy |

⚠️ **Common Mistakes:**
- Using `>=` instead of `>` in the max-frequency check — causes largest ID to win ties instead of smallest
- Using a HashMap unnecessarily when the range is small and fixed
- Allocating the array with the wrong size (off by one — use `maxVal + 1`)

🔥 **Interview Tips:**
- Rule: if values are from a small fixed range → array is faster than HashMap
- This principle extends to Counting Sort (O(n + k) vs O(n log n) for comparison sort)
- If the range is unknown or large → use HashMap

---

### 1️⃣6️⃣ Miscellaneous Math Patterns

> **Core Idea:** Several HackerRank-style problems test basic programming fundamentals: correct data types, careful arithmetic, output formatting, and edge-case handling. These aren't algorithmic puzzles but elimination filters — small mistakes cost candidates.

---

#### 💰 Bill Division (Exclude One Element)

**Trigger:** "Exclude one item", "split cost", "divide bill fairly"

```java
// Pattern: total sum - excluded element, then compare
int total = 0;
for (int item : bill) total += item;
int fairShare = (total - bill[k]) / 2;
System.out.println(charged == fairShare ? "Bon Appetit" : charged - fairShare);
```

⚠️ **Mistakes:** Dividing total before removing the item. Wrong index handling.

---

#### 🔢 A Very Big Sum (Data Type Overflow)

**Trigger:** "Very large numbers", "sum of big values", "n up to 10^10"

```java
long total = 0L;           // ALWAYS use long, never int
for (long num : arr) total += num;
```

⚠️ **Mistake:** Using `int` → silent overflow gives wrong answer with no error.

**Rule:** Check constraints. If values can exceed ~2 billion, use `long`.

---

#### ➕➖ Plus Minus (Ratio / Percentage)

**Trigger:** "Count how many belong to each group", "return ratio", "proportion"

```java
int pos = 0, neg = 0, zer = 0;
for (int x : arr) {
    if (x > 0) pos++;
    else if (x < 0) neg++;
    else zer++;
}
System.out.printf("%.6f%n", (double) pos / arr.length);
System.out.printf("%.6f%n", (double) neg / arr.length);
System.out.printf("%.6f%n", (double) zer / arr.length);
```

⚠️ **Mistakes:** Integer division (`pos / n` instead of `(double) pos / n`). Missing zero count. Wrong decimal formatting.

---

pattern tip for diagonal difference 

🧠 Pattern Tip

👉 When you see:

“Square matrix”
“Main diagonal / secondary diagonal”

💡 Trigger:

Index-based matrix traversal

⚙️ Approach (README-ready)
Traverse each row once
Add:
primary diagonal → arr[i][i]
secondary diagonal → arr[i][n - 1 - i]
Return absolute difference
🎯 Key Insight

👉 You don’t need to scan the full matrix
👉 Diagonal indices are directly computable

⚠️ Common Mistakes
❌ Looping over every matrix cell
❌ Wrong secondary diagonal index
❌ Forgetting absolute difference
🚀 Interview Tip

This teaches an important matrix rule:

If positions follow a formula,
don’t traverse everything — compute directly.

That mindset helps in:

diagonals
borders
matrix patterns
spiral traversal

---

pattern tip for birthday cake candles

🧠 Pattern Tip

👉 When you see:

“Largest / maximum element”
“Count how many times max appears”

💡 Trigger:

Track max + count together

⚙️ Approach (README-ready)
Traverse the array once
Maintain:
current maximum height
count of max height
If new max found → reset count
If same max found → increment count
🎯 Key Insight

👉 You don’t need to count all values
👉 Only care about the maximum

⚠️ Common Mistakes
❌ Using HashMap unnecessarily
❌ Sorting the array (extra work)
❌ Forgetting to reset count when new max appears
🚀 Interview Tip

This teaches a very important interview rule:

If problem asks only about max/min and count,
don’t store everything.

That mindset saves both:

space
complexity
code clutter

---
pattern tip for grading students

🧠 Pattern Tip

👉 When you see:

“Round to nearest multiple”
“Special condition based rounding”

💡 Trigger:

Math formula + conditional check

⚙️ Approach (README-ready)
If grade is below 38 → leave it unchanged
Otherwise:
find next multiple of 5
if difference is less than 3 → round up
else keep original grade
🎯 Key Insight

👉 Don’t manually check +1, +2

Instead:

directly compute the next multiple of 5

That’s cleaner and scalable.

⚠️ Common Mistakes
❌ Rounding grades below 38
❌ Manual hardcoding (+1, +2)
❌ Wrong multiple-of-5 calculation
🚀 Interview Tip

This problem teaches a good habit:

If logic involves “next multiple / next valid number”
use a formula, not trial-and-error checks.

That makes code:

cleaner
shorter
easier to explain


---

| Problem | Platform | Difficulty |
|---------|----------|------------|
| [Bill Division](https://www.hackerrank.com/challenges/bon-appetit/problem) | HackerRank | 🟢 Easy |
| [A Very Big Sum](https://www.hackerrank.com/challenges/a-very-big-sum/problem) | HackerRank | 🟢 Easy |
| [Plus Minus](https://www.hackerrank.com/challenges/plus-minus/problem) | HackerRank | 🟢 Easy |
| [Simple Array Sum](https://www.hackerrank.com/challenges/simple-array-sum/problem) | HackerRank | 🟢 Easy |
| [Number Line Jumps](https://www.hackerrank.com/challenges/kangaroo/problem) | HackerRank | 🟢 Easy |
| [Rotate Array](https://leetcode.com/problems/rotate-array/) | LC #189 | 🟠 Medium |
| [Valid Sudoku](https://leetcode.com/problems/valid-sudoku/) | LC #36 | 🟠 Medium |
| [Palindromic Array](https://www.geeksforgeeks.org/problems/palindromic-array-1587115620/1) | GFG | 🟢 Easy |

---

## 🏢 Company Pattern Mapping

| Company | Primary Patterns | High-Frequency Topics |
|---------|-----------------|----------------------|
| **Amazon** | HashMap, Sliding Window, Greedy | Two Sum, Stock problems, Max Subarray |
| **Google** | Prefix Sum, Binary Search, Two Pointers | Subarray Sum, Mountain Array, 3Sum |
| **Microsoft** | Arrays, Greedy, Intervals | Merge Intervals, Non-Decreasing Array |
| **Meta** | Two Pointers, Cyclic Sort | Remove Duplicates, Missing Number |
| **Adobe** | Sorting, Math, Heap | Kth Smallest, Median, Rotate Array |
| **Flipkart** | Greedy, Binary Search | Kadane's, Product Except Self |

---

## 🔁 Revision Strategy

| Mode | When to Use | How |
|------|-------------|-----|
| 📖 **Learn** | First time seeing a pattern | Solve problems + study approach, templates, mistakes |
| 🔁 **Revise** | Day before interview | Re-read Pattern Recognition Cheat Sheet + key templates only |
| ⚡ **Interview** | During the interview | Identify pattern from table in ≤30 sec, then code the template |

**Daily target:** 3 problems/day — one pattern group at a time. Don't jump between patterns.

**Weekly review:** Re-attempt problems you found hard, without looking at notes. Timed: 20 minutes per problem.

---

## 📊 Pattern Difficulty Distribution

```
Easy   ████████████░░░░  ~45%  (build speed + confidence)
Medium ██████████████░░  ~48%  (core interview problems)
Hard   ██░░░░░░░░░░░░░░   ~7%  (differentiation problems)
```

---

> 🚀 **Arrays = Pattern Recognition. The same ~15 patterns repeat across 300+ problems.**
>
> ⚡ **Speed = Pattern Recognition + Practice. If you spot the pattern in 30 seconds, you can code it in 5 minutes.**

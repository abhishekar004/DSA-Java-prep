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
├── MatrixTraversal/
│   └── DiagonalDifference.java
├── ArrayTraversal/
│   ├── BirthdayCakeCandles.java
│   └── MiniMaxSum.java
└── Math/
    ├── RotateArray.java
    ├── ValidSudoku.java
    ├── PalindromicArray.java
    ├── NumberLineJumps.java
    ├── BetweenTwoSets.java
    ├── SimpleArraySum.java
    ├── AVeryBigSum.java
    ├── PlusMinus.java
    ├── BillDivision.java
    ├── MigratoryBirds.java
    ├── GradingStudents.java
    ├── DrawingBook.java
    └── DivisionSumPairs.java
```

---

## 🎯 Progress Tracker

**Problems Solved: 57 / 300**

```
████░░░░░░░░░░░░░░░░  19%  [57 / 300]
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
| Heap | 2 | 10 |
| Sliding Window | 1 | 20 |
| Partition | 1 | 10 |
| Math / LCM+GCD | 1 | 10 |
| Math & Sorting | 5 | 30 |
| Frequency Array | 1 | 10 |
| Matrix Traversal | 1 | 10 |
| Array Traversal | 2 | 10 |
| Modular Arithmetic | 1 | 10 |
| Miscellaneous | 3 | 10 |

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
| Sum of all except one, min/max contribution | Total Sum ± min/max tracking |
| Square matrix, main + secondary diagonal | Index-based Matrix Traversal |
| Largest element + how many times it appears | Track max + count together |
| Round to nearest multiple, conditional rounding | Math formula + conditional |
| Minimum turns, can start from either end | Compute both directions, take min |
| Count pairs with sum/difference divisible by k | Modular Arithmetic (remainders) |

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
    if (sum < x) i++;
    else         j--;
}
```

**Key Template — 3Sum (fix + two pointers):**
```java
Arrays.sort(nums);
for (int k = 0; k < nums.length - 2; k++) {
    if (k > 0 && nums[k] == nums[k - 1]) continue;
    int left = k + 1, right = nums.length - 1;
    while (left < right) {
        int sum = nums[k] + nums[left] + nums[right];
        if (sum == 0) {
            result.add(Arrays.asList(nums[k], nums[left], nums[right]));
            while (left < right && nums[left] == nums[left + 1]) left++;
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
- Applying sliding window for negative numbers — prefix sum handles negatives; sliding window does not

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
curr   = Math.max(num, curr + num);
result = Math.max(result, curr);
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
- Confusing "subarray" (contiguous) with "subsequence" (non-contiguous)
- Not returning index boundaries when asked to return the actual subarray

🔥 **Interview Tips:**
- Always initialize `curr` and `result` from `nums[0]`, not 0
- Follow-up: "Return the subarray itself?" → track `start`, `end`, `tempStart`
- Follow-up: "Circular array?" → max of standard Kadane + (totalSum - minSubarray)

---

### 6️⃣ Cyclic Sort

> **Core Idea:** For arrays where elements are in range [1..n], place each element at its correct index (`index = value - 1`) by swapping. After one pass, any index where `nums[i] != i + 1` reveals a missing or duplicate.

**Trigger keywords:** "missing number in [1..n]", "find duplicate in [1..n]", "numbers in known range"

| Problem | Platform | Difficulty |
|---------|----------|------------|
| [Find All Numbers Disappeared in Array](https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/) | LC #448 | 🟢 Easy |
| [Missing Number](https://leetcode.com/problems/missing-number/) | LC #268 | 🟢 Easy |
| [Set Mismatch](https://leetcode.com/problems/set-mismatch/) | LC #645 | 🟢 Easy |
| [First Missing Positive](https://leetcode.com/problems/first-missing-positive/) | LC #41 | 🔴 Hard |

**Key Template:**
```java
// Phase 1: cyclic sort
int i = 0;
while (i < nums.length) {
    int correctIdx = nums[i] - 1;
    if (correctIdx >= 0 && correctIdx < nums.length && nums[i] != nums[correctIdx])
        swap(nums, i, correctIdx);
    else i++;
}
// Phase 2: scan for anomaly
for (int j = 0; j < nums.length; j++) {
    if (nums[j] != j + 1) return j + 1;
}
```

⚠️ **Common Mistakes:**
- Forgetting to guard out-of-range values (First Missing Positive has values outside [1..n])
- Infinite loop: not incrementing `i` when `nums[i] == nums[correctIdx]`
- Confusing the two phases — sort first, then scan

🔥 **Interview Tips:**
- O(n) time, O(1) space — always mention this
- Follow-up: "Range is [0..n]?" → adjust `correctIdx = nums[i]`

---

### 7️⃣ Floyd's Cycle Detection

> **Core Idea:** Treat the array as an implicit linked list where `nums[i]` is a "next pointer". Slow pointer moves 1 step, fast moves 2. When they meet, reset slow to start and move both 1 step — where they meet again is the duplicate.

**Trigger keywords:** "find duplicate without extra space", "O(1) space, no modification", "array as linked list"

| Problem | Platform | Difficulty |
|---------|----------|------------|
| [Find the Duplicate Number](https://leetcode.com/problems/find-the-duplicate-number/) | LC #287 | 🟠 Medium |

**Key Template:**
```java
// Phase 1: detect cycle
int slow = nums[0], fast = nums[0];
do { slow = nums[slow]; fast = nums[nums[fast]]; } while (slow != fast);

// Phase 2: find entry (duplicate)
slow = nums[0];
while (slow != fast) { slow = nums[slow]; fast = nums[fast]; }
return slow;
```

⚠️ **Common Mistakes:**
- Starting both pointers at index 0 vs `nums[0]` — the linked list starts at `nums[0]`
- Returning Phase 1 meeting point instead of Phase 2 — they are different

🔥 **Interview Tips:**
- Constraint "cannot modify array, O(1) space" → this is the signal for Floyd's
- Based on Floyd's linked list cycle algorithm — name it in the interview

---

### 8️⃣ Interval Problems

> **Core Idea:** Sort intervals by start time. Merge when the current interval overlaps the last merged one. For insertion, handle three phases: before, overlapping (merge), after.

**Trigger keywords:** "overlapping ranges", "merge intervals", "insert interval", "meeting rooms"

| Problem | Platform | Difficulty |
|---------|----------|------------|
| [Merge Intervals](https://leetcode.com/problems/merge-intervals/) | LC #56 | 🟠 Medium |
| [Insert Interval](https://leetcode.com/problems/insert-interval/) | LC #57 | 🟠 Medium |

**Key Template:**
```java
Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
List<int[]> result = new ArrayList<>();
result.add(intervals[0]);
for (int i = 1; i < intervals.length; i++) {
    int[] last = result.get(result.size() - 1);
    if (intervals[i][0] <= last[1])
        last[1] = Math.max(last[1], intervals[i][1]);
    else
        result.add(intervals[i]);
}
```

⚠️ **Common Mistakes:**
- Not sorting before merging
- Taking `min` instead of `max` of the end boundary during merge

🔥 **Interview Tips:**
- Insert Interval doesn't need re-sorting — input is already sorted
- Follow-up: "Minimum meeting rooms?" → count max overlapping intervals

---

### 9️⃣ Binary Search

> **Core Idea:** On a sorted or partially sorted array, eliminate half the search space each step. Always use `mid = low + (high - low) / 2` to avoid integer overflow.

**Trigger keywords:** "sorted array", "find element", "peak element", "O(log n)"

**Key formulas:**
```java
mid = low + (high - low) / 2;

// Standard
if (arr[mid] == target) return mid;
else if (arr[mid] < target) low = mid + 1;
else high = mid - 1;

// Peak (mountain)
if (arr[mid] < arr[mid + 1]) low = mid + 1;
else high = mid;
```

| Problem | Platform | Difficulty |
|---------|----------|------------|
| [Check if Array is Sorted and Rotated](https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/) | LC #1752 | 🟢 Easy |
| [Single Element in a Sorted Array](https://leetcode.com/problems/single-element-in-a-sorted-array/) | LC #540 | 🟠 Medium |
| [Peak Index in a Mountain Array](https://leetcode.com/problems/peak-index-in-a-mountain-array/) | LC #852 | 🟠 Medium |
| [Find Peak Element](https://leetcode.com/problems/find-peak-element/) | LC #162 | 🟠 Medium |
| [Find in Mountain Array](https://leetcode.com/problems/find-in-mountain-array/) | LC #1095 | 🔴 Hard |

⚠️ **Common Mistakes:**
- `low + high / 2` instead of `low + (high - low) / 2` — integer overflow
- Wrong loop condition: `low < high` vs `low <= high` — depends on whether `mid` is a valid answer

🔥 **Interview Tips:**
- For rotated sorted arrays: one half is always normally sorted — binary search still works
- Find in Mountain Array (Hard): 3-phase binary search — find peak, search each slope

---

### 🔟 Binary Search on Answer

> **Core Idea:** When asked for the "minimum valid X", binary search on the answer space, not the array. Write an `isValid(mid)` predicate — if valid, search smaller; if not, search larger.

**Trigger keywords:** "minimize the maximum", "minimum feasible threshold", "ship within D days"

**Key logic:**
```java
int low = minPossible, high = maxPossible;
while (low <= high) {
    int mid = low + (high - low) / 2;
    if (isValid(mid)) high = mid - 1;
    else              low  = mid + 1;
}
return low;

// Ceiling division inside isValid:
int chunks = (a + b - 1) / b;
```

| Problem | Platform | Difficulty |
|---------|----------|------------|
| [Koko Eating Bananas](https://leetcode.com/problems/koko-eating-bananas/) | LC #875 | 🟠 Medium |
| [Capacity to Ship Packages Within D Days](https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/) | LC #1011 | 🟠 Medium |
| [Find the Smallest Divisor Given a Threshold](https://leetcode.com/problems/find-the-smallest-divisor-given-a-threshold/) | LC #1283 | 🟠 Medium |

⚠️ **Common Mistakes:**
- Wrong direction: if `isValid(mid)` is true, search smaller → `high = mid - 1`
- Integer division in `isValid` — always ceiling: `(a + b - 1) / b`

🔥 **Interview Tips:**
- These three problems are nearly identical — write `isValid` first, then binary search around it
- Search space is always `[1..max(array)]` or similar — state it clearly

---

### 1️⃣1️⃣ Heap

> **Core Idea:** Use a min-heap or max-heap to maintain the K most extreme elements. O(n log K) time, O(K) space — better than sorting when K << n.

**Trigger keywords:** "Top K", "Kth smallest/largest", "K closest", "streaming data"

| Problem | Platform | Difficulty |
|---------|----------|------------|
| [Kth Smallest Element](https://www.geeksforgeeks.org/problems/kth-smallest-element5635/1) | GFG | 🟠 Medium |
| [Median of an Array](https://www.geeksforgeeks.org/problems/find-the-median0527/1) | GFG | 🟢 Easy |

**Key Template — Kth Largest (min-heap of size K):**
```java
PriorityQueue<Integer> minHeap = new PriorityQueue<>();
for (int num : nums) {
    minHeap.offer(num);
    if (minHeap.size() > k) minHeap.poll();
}
return minHeap.peek();
```

**Key Template — Kth Smallest (max-heap of size K):**
```java
PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
for (int num : nums) {
    maxHeap.offer(num);
    if (maxHeap.size() > k) maxHeap.poll();
}
return maxHeap.peek();
```

⚠️ **Common Mistakes:**
- Using a max-heap for Kth largest — use min-heap (it evicts smallest, keeping the K largest)
- Sorting full array at O(n log n) when heap gives O(n log K)

🔥 **Interview Tips:**
- Median of a stream: max-heap (lower half) + min-heap (upper half), balance after each insert
- Quick Select is O(n) average for Kth smallest on a static array

---

### 1️⃣2️⃣ Sliding Window

> **Core Idea:** Maintain a window over the array, expanding right and shrinking left based on a condition. Reuse the previous window sum — never recompute from scratch.

**Trigger keywords:** "contiguous subarray", "fixed window size", "sum of subarray of length K"

**Fixed Window Template:**
```java
int windowSum = 0, maxSum = 0;
for (int i = 0; i < nums.length; i++) {
    windowSum += nums[i];
    if (i >= k) windowSum -= nums[i - k];
    if (i >= k - 1) maxSum = Math.max(maxSum, windowSum);
}
```

**Variable Window Template:**
```java
int left = 0, result = 0;
for (int right = 0; right < nums.length; right++) {
    // include nums[right] in window
    while (/* window violates condition */) left++;
    result = Math.max(result, right - left + 1);
}
```

| Problem | Platform | Difficulty |
|---------|----------|------------|
| [Subarray Division](https://www.hackerrank.com/challenges/the-birthday-bar/problem) | HackerRank | 🟢 Easy |

⚠️ **Common Mistakes:**
- Using nested loops to recompute sums — always reuse the window
- Applying sliding window to arrays with negative numbers — use prefix sum instead

---

### 1️⃣3️⃣ Partition (QuickSort Foundation)

> **Core Idea:** Pick a pivot, rearrange so smaller elements go left and larger go right. Foundation of QuickSort and QuickSelect.

**Trigger keywords:** "rearrange around pivot", "smaller on left, larger on right"

**Lomuto Partition:**
```java
int pivot = nums[high], i = low - 1;
for (int j = low; j < high; j++) {
    if (nums[j] <= pivot) swap(nums, ++i, j);
}
swap(nums, i + 1, high);
return i + 1;
```

| Problem | Platform | Difficulty |
|---------|----------|------------|
| [Quicksort 1 - Partition](https://www.hackerrank.com/challenges/quicksort1/problem) | HackerRank | 🟢 Easy |

🔥 **Interview Tips:**
- QuickSelect finds Kth smallest in O(n) average using this partition
- Follow-up: "Full QuickSort?" → recurse on `[low..pivot-1]` and `[pivot+1..high]`

---

### 1️⃣4️⃣ Math — LCM & GCD

> **Core Idea:** Valid X values must be multiples of LCM(A) that also divide GCD(B). Use safe LCM formula to avoid overflow.

**Trigger keywords:** "all of A divides X", "X divides all of B", "between two sets"

```
Valid X: X % LCM(A) == 0  AND  GCD(B) % X == 0
Safe LCM: lcm(a, b) = (a / gcd(a, b)) * b
```

| Problem | Platform | Difficulty |
|---------|----------|------------|
| [Between Two Sets](https://www.hackerrank.com/challenges/between-two-sets/problem) | HackerRank | 🟢 Easy |

🔥 **Interview Gold:**
> "Multiple numbers must divide X → **LCM**. X must divide multiple numbers → **GCD**."

---

### 1️⃣5️⃣ Frequency Array

> **Core Idea:** When values are from a small, known range, use an array indexed by value instead of a HashMap. Faster due to cache locality.

**Trigger keywords:** "most frequent element", "count occurrences", "values in small fixed range"

```java
int[] freq = new int[maxVal + 1];
for (int x : arr) freq[x]++;
int maxFreq = 0, result = -1;
for (int i = 1; i <= maxVal; i++) {
    if (freq[i] > maxFreq) { maxFreq = freq[i]; result = i; }  // strict > → smallest ID wins ties
}
```

| Problem | Platform | Difficulty |
|---------|----------|------------|
| [Migratory Birds](https://www.hackerrank.com/challenges/migratory-birds/problem) | HackerRank | 🟢 Easy |

⚠️ **Common Mistakes:**
- Using `>=` instead of `>` — largest ID wins ties instead of smallest
- Allocating array with wrong size — use `maxVal + 1`

---

### 1️⃣6️⃣ Matrix Traversal

> **Core Idea:** For square matrix diagonal problems, positions follow a direct index formula — compute them, don't scan the full matrix.

**Trigger keywords:** "square matrix", "main diagonal", "secondary diagonal", "diagonal difference"

**Key insight:**
```
Primary diagonal:    arr[i][i]
Secondary diagonal:  arr[i][n - 1 - i]
→ Traverse each row once. No nested loops needed.
```

| Problem | Platform | Difficulty |
|---------|----------|------------|
| [Diagonal Difference](https://www.hackerrank.com/challenges/diagonal-difference/problem) | HackerRank | 🟢 Easy |

**Key Template:**
```java
int primary = 0, secondary = 0;
for (int i = 0; i < n; i++) {
    primary   += arr[i][i];
    secondary += arr[i][n - 1 - i];
}
return Math.abs(primary - secondary);
```

⚠️ **Common Mistakes:**
- Looping over every cell — diagonal indices are directly computable, no full scan needed
- Wrong secondary diagonal formula — it's `n - 1 - i`, not `n - i`
- Forgetting `Math.abs()` — the problem asks for absolute difference

🔥 **Interview Tips:**
- This teaches a broader mindset: "If positions follow a formula, compute directly — don't traverse everything"
- The same idea appears in: matrix borders, spiral traversal, anti-diagonal patterns

---

### 1️⃣7️⃣ Array Traversal — Max + Count

> **Core Idea:** When you only need the maximum and how many times it appears, track both in a single pass. No sorting, no HashMap — just reset count when a new max is found.

**Trigger keywords:** "largest element", "count how many times max appears", "tallest candle"

| Problem | Platform | Difficulty |
|---------|----------|------------|
| [Birthday Cake Candles](https://www.hackerrank.com/challenges/birthday-cake-candles/problem) | HackerRank | 🟢 Easy |
| [Mini-Max Sum](https://www.hackerrank.com/challenges/mini-max-sum/problem) | HackerRank | 🟢 Easy |

**Key Template — Max + Count:**
```java
int maxVal = arr[0], count = 1;
for (int i = 1; i < arr.length; i++) {
    if (arr[i] > maxVal) { maxVal = arr[i]; count = 1; }  // new max → reset
    else if (arr[i] == maxVal) count++;                    // same max → increment
}
return count;
```

**Key Template — Mini-Max Sum (total ± extremes):**
```java
long total = 0, minVal = arr[0], maxVal = arr[0];
for (int x : arr) {
    total += x;
    minVal = Math.min(minVal, x);
    maxVal = Math.max(maxVal, x);
}
// Min sum = total - max element (exclude the largest)
// Max sum = total - min element (exclude the smallest)
System.out.println((total - maxVal) + " " + (total - minVal));
```

⚠️ **Common Mistakes:**
- Using HashMap for Birthday Cake Candles — unnecessary when you only care about the max
- Sorting the array — extra O(n log n) work when one pass suffices
- Using `int` for Mini-Max Sum — values can reach 5 × 10⁹, use `long`
- Forgetting to reset `count` when a new maximum is found

🔥 **Interview Tips:**
- Rule: "If the problem asks only about max/min and its count, don't store everything — track inline"
- Mini-Max Sum teaches: "Sum all, then subtract one" — this pattern recurs in prefix/suffix and contribution problems
- Follow-up: "What if K elements are excluded?" → sort, sum all, subtract K smallest / K largest

---

### 1️⃣8️⃣ Math — Conditional Rounding & Formula Derivation

> **Core Idea:** When a problem involves rounding to the nearest multiple or computing minimum moves, derive a direct formula rather than simulating step by step. Formula-based solutions convert O(n) simulation → O(1).

**Trigger keywords:** "round to nearest multiple", "minimum turns/moves", "can start from either end", "next multiple of 5"

#### 🎓 Grading Students

**Key insight:** Find the next multiple of 5 using integer math — don't manually try +1, +2.

```java
int nextMultiple = (int)(Math.ceil(grade / 5.0) * 5);
if (grade < 38 || nextMultiple - grade >= 3) return grade;  // don't round
return nextMultiple;                                          // round up
```

#### 📖 Drawing Book

**Key insight:** Each page turn flips 2 pages, not 1. Compute both directions and take the minimum.

```java
int fromFront = p / 2;
int fromBack  = (n / 2) - (p / 2);
return Math.min(fromFront, fromBack);
```

| Problem | Platform | Difficulty |
|---------|----------|------------|
| [Grading Students](https://www.hackerrank.com/challenges/grading/problem) | HackerRank | 🟢 Easy |
| [Drawing Book](https://www.hackerrank.com/challenges/drawing-book/problem) | HackerRank | 🟢 Easy |

⚠️ **Common Mistakes:**
- Grading: rounding grades below 38 — the rule explicitly excludes them
- Grading: manually checking `+1`, `+2` instead of computing `nextMultiple` directly
- Drawing Book: simulating one turn at a time — derive the formula instead
- Drawing Book: forgetting each turn covers 2 pages

🔥 **Interview Tips:**
- General rule: "Before coding a simulation, ask — can I derive a formula?" O(n) → O(1) is a huge win
- `Math.ceil(grade / 5.0) * 5` is the idiomatic "next multiple of 5" — memorize this pattern

---

### 1️⃣9️⃣ Modular Arithmetic

> **Core Idea:** For counting pairs where `(a + b) % k == 0`, check only remainders — not raw values. If `rem = a % k`, the required partner has remainder `(k - rem) % k`. Use a frequency map of remainders for O(n) solution instead of O(n²) nested loops.

**Trigger keywords:** "count pairs", "sum divisible by k", "remainder", "pair condition on divisibility"

| Problem | Platform | Difficulty |
|---------|----------|------------|
| [Division Sum Pairs](https://www.hackerrank.com/challenges/divisible-sum-pairs/problem) | HackerRank | 🟢 Easy |

**Key Template:**
```java
int[] remFreq = new int[k];
int count = 0;
for (int x : arr) {
    int rem = x % k;
    int partner = (k - rem) % k;   // ← (k - rem) % k handles rem = 0 correctly
    count += remFreq[partner];
    remFreq[rem]++;
}
return count;
```

⚠️ **Common Mistakes:**
- Using nested loops O(n²) — always check if remainders let you do this in O(n)
- Using `(k - rem)` instead of `(k - rem) % k` — fails when `rem == 0` (partner would be `k`, out of bounds)
- Not updating `remFreq` after querying — order matters: query first, then record

🔥 **Interview Tips:**
- Core rule: "Divisibility → think in terms of remainders, not raw values"
- This exact pattern recurs in: Subarray Sum Divisible by K (LC #974), Count Pairs with Given Sum
- `(k - rem) % k` is the canonical partner formula — state it explicitly in interviews

---

### 2️⃣0️⃣ Miscellaneous Math Patterns

> Foundational problems that test correct data types, arithmetic, and output formatting. These are elimination filters — small mistakes cost candidates.

---

#### 💰 Bill Division

**Trigger:** "Exclude one item", "split cost", "divide bill fairly"

```java
int total = 0;
for (int item : bill) total += item;
int fairShare = (total - bill[k]) / 2;
System.out.println(charged == fairShare ? "Bon Appetit" : charged - fairShare);
```

⚠️ **Mistake:** Dividing total before removing the excluded item.

---

#### 🔢 A Very Big Sum

**Trigger:** "Very large numbers", "sum of big values", "values up to 10^10"

```java
long total = 0L;
for (long num : arr) total += num;
```

⚠️ **Rule:** If values can exceed ~2 billion, use `long`. Silent overflow with `int` gives wrong answers with no error.

---

#### ➕➖ Plus Minus

**Trigger:** "Count how many belong to each group", "ratio", "proportion"

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

⚠️ **Mistake:** Integer division — `pos / n` instead of `(double) pos / n`.

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
| 🔁 **Revise** | Day before interview | Re-read cheat sheet + key templates only |
| ⚡ **Interview** | During the interview | Identify pattern in ≤30 sec, code the template |

**Daily target:** 3 problems/day — one pattern group at a time.

**Weekly review:** Re-attempt hard problems without notes. Timed: 20 minutes each.

---

## 📊 Pattern Difficulty Distribution

```
Easy   ████████████░░░░  ~45%  (build speed + confidence)
Medium ██████████████░░  ~48%  (core interview problems)
Hard   ██░░░░░░░░░░░░░░   ~7%  (differentiation problems)
```

---

> 🚀 **Arrays = Pattern Recognition. The same ~20 patterns repeat across 300+ problems.**
>
> ⚡ **Speed = Pattern Recognition + Practice. Spot the pattern in 30 seconds, code it in 5 minutes.**

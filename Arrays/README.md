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
├── NumberLineJumps.java
├── FindTheClosestPairFromTwoArrays.java
├── Quicksort1-Partition.java
└── BetweenTwoSets.java
└── BillDivision.java
└── AVeryBigSum.java
└── PlusMinus.java
└── SubarrayDivision.java
└── MigratoryBirds.java
```

---

## 🎯 Progress

**Problems Solved: 48 / 300**

```
████░░░░░░░░░░░░░░░░  16%
```

---

## ⚡ Pattern Recognition Cheat Sheet

| If you see… | Think Pattern |
|-------------|---------------|
| Pair / target sum | HashMap |
| Sorted array, pair/triplet | Two Pointers |
| Two sorted arrays, closest sum | Two Pointers (opposite ends) |
| Maximum subarray | Kadane's Algorithm |
| Subarray sum = k | Prefix Sum + HashMap |
| Missing / duplicate in 1..n | Cyclic Sort |
| Overlapping ranges | Interval Merge |
| Minimum valid answer | Binary Search on Answer |
| Top K elements | Heap |
| Duplicate with O(1) space | Floyd Cycle Detection |
| Local max in sorted-ish array | Binary Search |
| Track running min/max | Greedy |
| Rearrange around pivot | Partition (QuickSort) |
| All of A divides x, x divides all of B | LCM + GCD |

---

## 🧩 Problems — Grouped by Pattern

---

### 1️⃣ HashMap

> **Approach:** Use a hash map for O(1) lookups. Store elements you've seen and check if the complement or match already exists. Great for frequency counting and pair detection.

**Trigger:** "find pair", "frequency", "duplicate check", "fast lookup"

**Key formula:** `target - num` → check if result is in map

| Problem | Platform | Difficulty |
|---------|----------|------------|
| [Two Sum](https://leetcode.com/problems/two-sum/) | LC #1 | 🟢 Easy |
| [Contains Duplicate](https://leetcode.com/problems/contains-duplicate/) | LC #217 | 🟢 Easy |
| [Array Subset of Another Array](https://www.geeksforgeeks.org/problems/array-subset-of-another-array2317/1) | GFG | 🟢 Easy |
| [Sales by Match](https://www.hackerrank.com/challenges/sock-merchant/problem) | HackerRank | 🟢 Easy |

**Key Template:**
```java
Map<Integer, Integer> map = new HashMap<>();
for (int num : nums) {
    if (map.containsKey(target - num)) return new int[]{map.get(target - num), i};
    map.put(num, i);
}
```

⚠️ **Common Mistakes:**
- Putting `num` in the map **before** checking for complement — causes same element to be used twice
- Using a HashSet when index is also needed (Two Sum requires index, not just existence)
- Not handling duplicates in frequency problems (use `getOrDefault`, not `containsKey` alone)

🔥 **Interview Tips:**
- If brute force is O(n²), always ask: "Can I use a HashMap to reduce lookup to O(1)?"
- Follow-up: "What if the array is sorted?" → Two Pointers is better (O(1) space)
- Follow-up: "What if there are multiple pairs?" → collect all results, don't return early

---

### 2️⃣ Two Pointers

> **Approach:** Use left and right pointers on a sorted array and move them based on whether the current sum is too small or too large. Also used for in-place operations like removing duplicates or moving zeroes. For two sorted arrays with a target sum, start `i` at the beginning of arr1 and `j` at the end of arr2 — move them toward each other based on whether the sum is above or below the target.

**Trigger:** "sorted array + pair/triplet", "in-place partition", "two sorted arrays + closest sum"

**Key rule:**
```java
sum < target → left++ (or i++)
sum > target → right-- (or j--)
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

**Key Template:**
```java
// Closest pair from two sorted arrays
int i = 0, j = arr2.length - 1;
while (i < arr1.length && j >= 0) {
    int sum = arr1[i] + arr2[j];
    // update closest pair
    if (sum < x) i++;
    else j--;
}
```

⚠️ **Common Mistakes:**
- Not sorting before applying two pointers — the entire pattern breaks on unsorted input
- Moving the wrong pointer on equal sums
- Not skipping duplicates in 3Sum/4Sum — produces duplicate triplets in output
- Using nested loops when two pointers already gives O(n)

🔥 **Interview Tips:**
- Always clarify: "Is the array sorted?" If not, sort it first and state the O(n log n) overhead
- For 3Sum: fix one element with a loop, then apply two pointers on the rest — reduces O(n³) → O(n²)
- Follow-up for Remove Duplicates II: "What if at most K duplicates are allowed?" → generalize with a count variable

---

### 3️⃣ Greedy

> **Approach:** Make the locally optimal choice at each step. Track a running minimum or maximum while iterating — no need to look back. The decision at each step is final.

**Trigger:** "maximize profit", "track min/max", "locally optimal", "no backtracking"

**Key formula:**
```java
profit = currentPrice - minPriceSeen;
update min/max dynamically on each iteration
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
- Initializing min/max as 0 instead of `nums[0]` — breaks for all-negative arrays
- Trying DP when greedy is sufficient — if local optimum always leads to global optimum, greedy is enough
- Not recognizing greedy applicability — if you catch yourself building a table, ask "is a running variable enough?"

🔥 **Interview Tips:**
- Greedy works when: making the best local choice never invalidates a better global choice
- Prove it: "At each step I pick X because choosing anything else can only make things worse"
- Follow-up for Stock: "What if you can buy and sell multiple times?" → add profit whenever `price[i] > price[i-1]`

---

### 4️⃣ Prefix Sum

> **Approach:** Precompute cumulative sums so any subarray sum `[i..j]` = `prefix[j] - prefix[i-1]` in O(1). Pair with a HashMap to find subarrays with a target sum in a single pass.

**Trigger:** "subarray sum", "range sum query", "sum equals k", "zero sum subarray"

**Key formula:**
```java
prefix[j] - prefix[i] = k
→ check if (prefix[j] - k) exists in map
```

| Problem | Platform | Difficulty |
|---------|----------|------------|
| [Product of Array Except Self](https://leetcode.com/problems/product-of-array-except-self/) | LC #238 | 🟠 Medium |
| [Subarray with 0 Sum](https://www.geeksforgeeks.org/problems/subarray-with-0-sum-1587115621/1) | GFG | 🟠 Medium |
| [Subarray Sum Equals K](https://leetcode.com/problems/subarray-sum-equals-k/) | LC #560 | 🟠 Medium |

⚠️ **Common Mistakes:**
- Forgetting to initialize map with `{0: 1}` — misses subarrays starting from index 0
- Off-by-one: `prefix[j] - prefix[i]` covers `[i+1..j]`, not `[i..j]`
- Building the actual prefix array when just a running sum variable suffices
- Not handling negative numbers — prefix sum still works, but sliding window does NOT for negatives

🔥 **Interview Tips:**
- The map initialization `{0: 1}` is the most commonly forgotten line — mention it explicitly
- For Product Except Self: "Can you do it without division and in O(1) extra space?" → left-pass × right-pass in-place
- Follow-up: "What if the array has negative numbers?" → prefix sum handles it; sliding window does not

---

### 5️⃣ Kadane's Algorithm

> **Approach:** Track the maximum subarray sum ending at each index. At each step, decide whether to extend the current subarray or start fresh from the current element. One pass, O(n).

**Trigger:** "maximum subarray", "contiguous subarray", "largest sum"

**Key formula:**
```java
curr = Math.max(num, curr + num);
result = Math.max(result, curr);
```

| Problem | Platform | Difficulty |
|---------|----------|------------|
| [Maximum Subarray](https://leetcode.com/problems/maximum-subarray/) | LC #53 | 🟢 Easy |
| [Kadane's Algorithm](https://www.geeksforgeeks.org/problems/kadanes-algorithm-1587115620/1) | GFG | 🟠 Medium |

---

### 6️⃣ Cyclic Sort

> **Approach:** For arrays with elements in range [1..n], place each element at its correct index (`index = value - 1`). After one pass, any index where `nums[i] != i + 1` reveals a missing or duplicate number.

**Trigger:** "missing number", "duplicate in [1..n]", "numbers in known range"

**Key formula:**
```java
correct index = nums[i] - 1
swap nums[i] with nums[correct index] until nums[i] is in place
```

| Problem | Platform | Difficulty |
|---------|----------|------------|
| [Find All Numbers Disappeared in Array](https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/) | LC #448 | 🟢 Easy |
| [Missing Number](https://leetcode.com/problems/missing-number/) | LC #268 | 🟢 Easy |
| [Set Mismatch](https://leetcode.com/problems/set-mismatch/) | LC #645 | 🟢 Easy |
| [First Missing Positive](https://leetcode.com/problems/first-missing-positive/) | LC #41 | 🔴 Hard |

---

### 7️⃣ Floyd Cycle Detection

> **Approach:** Treat the array as a linked list where `nums[i]` is a pointer. Use slow (1 step) and fast (2 steps) pointers — when they meet, reset slow to the start and advance both one step at a time to find the cycle entry point (the duplicate).

**Trigger:** "find duplicate without extra space", "array as implicit linked list"

**Key formula:**
```java
slow = nums[slow];
fast = nums[nums[fast]];
// after meeting → reset slow = 0, move both one step until equal
```

| Problem | Platform | Difficulty |
|---------|----------|------------|
| [Find the Duplicate Number](https://leetcode.com/problems/find-the-duplicate-number/) | LC #287 | 🟠 Medium |

---

### 8️⃣ Interval Problems

> **Approach:** Sort intervals by start time. Merge when the current interval's start ≤ previous end. For insertion, handle three phases: intervals strictly before, overlapping (merge all), and after the new interval.

**Trigger:** "overlapping ranges", "merge intervals", "insert interval"

**Key rule:**
```java
if curr.start <= prev.end → merge: end = max(prev.end, curr.end)
else → no overlap, add prev to result
```

| Problem | Platform | Difficulty |
|---------|----------|------------|
| [Merge Intervals](https://leetcode.com/problems/merge-intervals/) | LC #56 | 🟠 Medium |
| [Insert Interval](https://leetcode.com/problems/insert-interval/) | LC #57 | 🟠 Medium |

---

### 9️⃣ Binary Search

> **Approach:** On a sorted or partially sorted array, eliminate half the search space each step. For mountain arrays, compare `mid` with its neighbors to decide which side the peak is on. Always use `mid = low + (high - low) / 2` to avoid overflow.

**Trigger:** "sorted array", "find element", "peak element", "mountain array"

**Key formula:**
```java
mid = low + (high - low) / 2;   // avoids integer overflow
if (arr[mid] < arr[mid + 1]) low = mid + 1;   // ascending side
else high = mid;                               // descending / peak side
```

| Problem | Platform | Difficulty |
|---------|----------|------------|
| [Check if Array is Sorted and Rotated](https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/) | LC #1752 | 🟢 Easy |
| [Single Element in a Sorted Array](https://leetcode.com/problems/single-element-in-a-sorted-array/) | LC #540 | 🟠 Medium |
| [Peak Index in a Mountain Array](https://leetcode.com/problems/peak-index-in-a-mountain-array/) | LC #852 | 🟠 Medium |
| [Find Peak Element](https://leetcode.com/problems/find-peak-element/) | LC #162 | 🟠 Medium |
| [Find in Mountain Array](https://leetcode.com/problems/find-in-mountain-array/) | LC #1095 | 🔴 Hard |

---

### 🔟 Binary Search on Answer

> **Approach:** When asked for the "minimum valid X" over a range, binary search on the answer space (not the array index). Write an `isValid(mid)` helper — if valid, search left for something smaller; if not, search right.

**Trigger:** "minimize the maximum", "minimum feasible value", "threshold condition"

**Key logic:**
```java
if (isValid(mid)) high = mid - 1;   // try smaller answer
else              low  = mid + 1;   // need larger answer

// Ceiling division trick
int ceil = (a + b - 1) / b;
```

| Problem | Platform | Difficulty |
|---------|----------|------------|
| [Koko Eating Bananas](https://leetcode.com/problems/koko-eating-bananas/) | LC #875 | 🟠 Medium |
| [Capacity to Ship Packages Within D Days](https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/) | LC #1011 | 🟠 Medium |
| [Find the Smallest Divisor Given a Threshold](https://leetcode.com/problems/find-the-smallest-divisor-given-a-threshold/) | LC #1283 | 🟠 Medium |

---

### 1️⃣1️⃣ Heap

> **Approach:** Use a min-heap or max-heap to efficiently access the Kth smallest or largest element. Building a heap is O(n); each extraction is O(log n) — better than sorting the full array at O(n log n).

**Trigger:** "Top K", "Kth smallest/largest", "K closest"

| Problem | Platform | Difficulty |
|---------|----------|------------|
| [Kth Smallest Element](https://www.geeksforgeeks.org/problems/kth-smallest-element5635/1) | GFG | 🟠 Medium |

**Key Template:**
```java
PriorityQueue<Integer> minHeap = new PriorityQueue<>();
for (int num : nums) {
    minHeap.offer(num);
    if (minHeap.size() > k) minHeap.poll();
}
return minHeap.peek();
```

---

### 1️⃣2️⃣ Partition (QuickSort Foundation)

> **Approach:** Pick a pivot (typically the first element). Traverse the rest of the array — elements smaller than the pivot go left, elements larger go right. Combine as `left + pivot + right`. This one-pass rearrangement is the core of QuickSort and the basis for QuickSelect (finding Kth element in O(n) average).

**Trigger:** "rearrange around pivot", "smaller on left larger on right", "partition array"

**Key logic:**
```java
// Lomuto partition scheme
int pivot = nums[high], i = low - 1;
for (int j = low; j < high; j++) {
    if (nums[j] <= pivot) swap(nums, ++i, j);
}
swap(nums, i + 1, high);
return i + 1;   // pivot's final index
```

| Problem | Platform | Difficulty |
|---------|----------|------------|
| [Quicksort 1 - Partition](https://www.hackerrank.com/challenges/quicksort1/problem) | HackerRank | 🟢 Easy |

⚠️ **Common Mistakes:**
- Trying to write full recursive QuickSort when only partition is asked
- Wrong pivot placement — equal elements must be handled
- Missing elements when boundary conditions are off

🔥 **Follow-up:** "Can you implement full QuickSort?" → recurse on left and right subarrays using in-place Hoare or Lomuto partition.

---

### 1️⃣3️⃣ Math — LCM & GCD

> **Approach:** When all elements of array A must divide X, and X must divide all elements of array B, the valid X values are multiples of `LCM(A)` that also divide `GCD(B)`. So compute `LCM(A)` and `GCD(B)`, then count how many multiples of `LCM(A)` divide `GCD(B)`. Use the safe LCM formula `(a / gcd(a, b)) * b` to avoid overflow.

**Trigger:** "all of A divides X", "X divides all of B", "numbers between two sets", "divisibility condition on two arrays"

**Key insight:**
```
Valid X must satisfy:
  X % LCM(A) == 0        (X is divisible by all elements of A)
  GCD(B) % X == 0        (X divides all elements of B)

Safe LCM formula (avoids overflow):
  lcm(a, b) = (a / gcd(a, b)) * b
```

| Problem | Platform | Difficulty |
|---------|----------|------------|
| [Between Two Sets](https://www.hackerrank.com/challenges/between-two-sets/problem) | HackerRank | 🟢 Easy |

⚠️ **Common Mistakes:**
- Brute forcing every number from 1 to max instead of using LCM/GCD
- Using `(a * b) / gcd(a, b)` for LCM — overflows for large inputs
- Forgetting that valid X must lie between `LCM(A)` and `GCD(B)` in value

🔥 **Interview Gold:**
> "If multiple numbers must divide one value → think LCM.
> If one value must divide multiple numbers → think GCD."

---

### 1️⃣4️⃣ Math & Sorting

> **Approach:** Use mathematical properties (sum formula, algebra) or sort + index tricks. Fast to implement and often the cleanest solution for well-defined numeric problems.

| Problem | Platform | Difficulty |
|---------|----------|------------|
| [Rotate Array](https://leetcode.com/problems/rotate-array/) | LC #189 | 🟠 Medium |
| [Valid Sudoku](https://leetcode.com/problems/valid-sudoku/) | LC #36 | 🟠 Medium |
| [Median of an Array](https://www.geeksforgeeks.org/problems/find-the-median0527/1) | GFG | 🟢 Easy |
| [Palindromic Array](https://www.geeksforgeeks.org/problems/palindromic-array-1587115620/1) | GFG | 🟢 Easy |
| [Simple Array Sum](https://www.hackerrank.com/challenges/simple-array-sum/problem) | HackerRank | 🟢 Easy |
| [Number Line Jumps](https://www.hackerrank.com/contests/mountblue-technologies/challenges/kangaroo) | HackerRank | 🟢 Easy |

---
pattrn tip for bill division 

🧠 Pattern Tip

👉 When you see:

“Exclude one element”
“Split cost / average”

💡 Trigger:

Total sum – excluded element

⚙️ Approach (Short)
Compute total sum
Subtract skipped item
Divide by 2
Compare with charged amount
🎯 Key Insight

👉 Only ONE item is excluded → don’t overthink

⚠️ Common Mistakes
❌ Dividing total before removing item
❌ Wrong index handling
❌ Printing instead of returning (platform specific)
🚀 Interview Tip

👉 This tests:

Attention to detail
Basic arithmetic logic

👉 Easy problem — but mistakes = rejection

---
pattern tip for a very big sum

🧠 Pattern Tip

👉 When you see:

“Very big numbers”
“Sum of large values”

💡 Trigger:

Use long (not int)

⚙️ Approach (Short)
Initialize long total = 0
Iterate through array
Add each element
🎯 Key Insight

👉 Data type matters more than logic here

⚠️ Common Mistakes
❌ Using int → overflow
❌ Ignoring constraints
❌ Using unnecessary data structures
🚀 Interview Tip

👉 This problem tests:

Attention to constraints
Correct data type selection

👉 Easy problem, but:

❗ Wrong data type = instant rejection

---
pattern tip for plus minus 

🧠 Pattern Tip

👉 When you see:

“Count how many belong to each group”
“Return ratio / percentage”

💡 Trigger:

Single traversal + counters

⚙️ Approach (README-ready)
Traverse the array once
Count:
positives
negatives
zeros
Divide each count by total size
Print with 6 decimal places
🎯 Key Insight

👉 Don’t store extra arrays
👉 Just count directly

⚠️ Common Mistakes
❌ Integer division mistake:
positive / n

This gives wrong result if both are int

✔ Correct:

(double) positive / n
❌ Wrong formatting (not printing 6 decimals)
❌ Forgetting zero count
🚀 Interview Tip

This problem is simple, but it checks:

loop control
condition handling
type casting
output formatting

👉 Easy problems still eliminate candidates if they get careless.

---

pattern tip for subarray division

🧠 Pattern Tip

👉 When you see:

“Contiguous subarray”
“Fixed length”
“Find sum/count”

💡 Trigger:

Fixed-size Sliding Window

⚙️ Approach (README-ready)
Maintain a window of size m
Keep track of its sum
When window size exceeds m, remove left element
If sum equals d, increment answer
🎯 Key Insight

👉 Don’t recompute subarray sum every time
👉 Reuse previous window sum efficiently

⚠️ Common Mistakes
❌ Using nested loops to calculate every subarray sum
❌ Forgetting window size check
❌ Not removing left element when window grows
🚀 Interview Tip

This is a foundation problem for:

Maximum sum subarray of size K
First negative in every window
Anagram / permutation window problems

👉 If you recognize “fixed length”, you should immediately think:

Sliding Window

---
pattern tip for migratory birds

🧠 Pattern Tip

👉 When you see:

“Most frequent element”
“Count occurrences”
“Small fixed range of values”

💡 Trigger:

Frequency Array

⚙️ Approach (README-ready)
Create frequency array
Count each bird type
Find the type with highest count
If tie occurs, smaller ID wins automatically
🎯 Key Insight

👉 Since bird IDs are limited (1 to 5),
you don’t need a HashMap.

👉 Array is faster and cleaner.

⚠️ Common Mistakes
❌ Using nested loops to count frequency
❌ Using HashMap unnecessarily for small fixed range
❌ Mishandling tie condition
🚀 Interview Tip

This teaches an important rule:

If values are from a small known range
use an array instead of HashMap

That is a powerful optimization trick.

---

## 🏢 Company Mapping

| Company | Focus Patterns |
|---------|----------------|
| Amazon | HashMap, Sliding Window, Greedy |
| Google | Prefix Sum, Binary Search, Two Pointers |
| Microsoft | Arrays, Greedy, Intervals |
| Meta | Two Pointers, Cyclic Sort |
| Adobe | Sorting, Math |

---

## 🔁 Revision Strategy

| Mode | How to Use |
|------|------------|
| 📖 Learn | Solve problems + study the pattern approach |
| 🔁 Revise | Re-read pattern sections + formulas only |
| ⚡ Interview | Identify pattern from cheat sheet in under 30 sec |

**Daily target:** 3 problems/day — focus on one pattern group at a time

---

> ⚡ **"If you identify the pattern in 30 seconds, you can solve it in 5 minutes."**
>
> 🚀 Arrays = Pattern Recognition. Same patterns repeat. Speed = Pattern + Practice.

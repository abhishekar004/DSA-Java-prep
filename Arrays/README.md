# 📘 Arrays Problems

This folder contains **Array-based problems solved in Java** as part of my **DSA Placement Preparation**.

---

## 📊 Pattern Coverage

| Pattern            | Status      |
| ------------------ | ----------- |
| HashMap            | ✅ Covered   |
| Two Pointers       | ✅ Covered   |
| Greedy             | ✅ Covered   |
| Prefix/Suffix      | ✅ Covered   |
| Interval Problems  | ✅ Covered   |
| Kadane's Algorithm | ✅ Covered   |
| Grid Hashing       | ✅ Covered   |
| Sliding Window     | 🔜 Upcoming |
| Prefix Sum         | 🔜 Upcoming |

---

# 🧩 Problems Solved

| #  | Problem                         | Platform      | Pattern               |
| -- | ------------------------------- | ------------- | --------------------- |
| 1  | Two Sum                         | LeetCode #1   | HashMap               |
| 2  | Squares of a Sorted Array       | LeetCode #977 | Two Pointers          |
| 3  | Best Time to Buy and Sell Stock | LeetCode #121 | Greedy / Min Tracking |
| 4  | Contains Duplicate              | LeetCode #217 | HashSet               |
| 5  | Product Of Array Except Self    | LeetCode #238 | Prefix + Suffix       |
| 6  | Rotate Array                    | LeetCode #189 | Reversal Technique    |
| 7  | Maximum Subarray                | LeetCode #53  | Kadane's Algorithm    |
| 8  | Valid Sudoku                    | LeetCode #36  | Grid Hashing          |
| 9  | Merge Intervals                 | LeetCode #56  | Interval Merging      |
| 10 | Insert Intervals                | LeetCode #57  | Interval Insertion    |
| 11 | 3Sum                            | LeetCode #15  | Two Pointers          |
| 12 | 4Sum                            | LeetCode #18  | k-Sum Pattern         |
| 13 | 3Sum Closest                    | LeetCode #16  | Two Pointers          |
| 14 | Move Zeroes                     | LeetCode #283 | Two Pointers          |
| 15 | Find All Numbers Disappeared in an Array| LeetCode #448 | In-Place Marking   |
| 16 | First Missing Positive          | LeetCode #41  | Cyclic Sort           |
| 17 | Missing Number                  | LeetCode #268 | Math / Cyclic Sort    |
| 18 | Find the Duplicate Number       | LeetCode #287 | Floyd Cycle Detection |
| 19 | Set Mismatch                    | LeetCode #645 | Cyclic Sort           |
| 20 | Reverse an Array                | GeekforGeeks  | Two Pointers          |
| 21 | Remove Duplicates from Sorted Array | Leetcode #26  | Two Pointers          |
| 22 | Remove Duplicates from Sorted Array II | LeetCode #80  | Two Pointers       |
| 23 | Check if Array is Sorted and Rotated   | LeetCode #1752 | Circular Array Check |
| 24 | Single Element in a Sorted Array       | LeetCode #540  | Binary Search   |
| 25 | Non-Decreasing Array            | LeetCode #665  | Greedy   |
| 26 | Global and Local Inversions     | LeetCode #775  | Greedy   |
| 27 | Escape the Ghosts               | LeetCode #789  | Greedy   |
| 28 | Maximize Distance to Closest Person    | LeetCode #849  | Greedy   |
| 29 | Peak Index in a Mountain Array  | LeetCode #852  | Binary Search   |
| 30 | Find Peak Element               | LeetCode #162  | Binary Search   |

---

# 🧠 Important Patterns

## 1️⃣ HashMap Lookup

**Used in:**

* Two Sum

**Concept**

Store numbers in a HashMap to check the complement in **O(1)** time.

```
target - currentNumber
```

If it already exists → solution found.

**Time Complexity:** `O(n)`
**Space Complexity:** `O(n)`

---

## 2️⃣ Two Pointer Techniques (Core Pattern)

**Used in:**

* Squares of a Sorted Array
* 3Sum
* 4Sum
* 3Sum Closest

**Concept**

Use two pointers (`left`, `right`) on a **sorted array** to reduce time complexity.

Instead of brute force:

* If sum < target → move `left++`
* If sum > target → move `right--`

---

### 🔹 Variations

**Pair Problems (2Sum Sorted)**

* Time: `O(n)`

**Triplets (3Sum)**

* Fix one element + two pointers
* Time: `O(n²)`

**Quadruplets (4Sum)**

* Fix two elements + two pointers
* Time: `O(n³)`

**Closest Sum Problems**

* Track minimum difference instead of exact match

**Space Complexity:** `O(1)`

---

## 3️⃣ Greedy (Minimum Tracking)

**Used in:**

* Best Time to Buy and Sell Stock

**Concept**

Track the **minimum value so far** and compute profit dynamically.

```
profit = currentPrice - minPrice
```

**Time Complexity:** `O(n)`
**Space Complexity:** `O(1)`

---

## 4️⃣ HashSet Lookup

**Used in:**

* Contains Duplicate

**Concept**

Use a HashSet to track visited elements.

If insertion fails → duplicate found.

**Time Complexity:** `O(n)`
**Space Complexity:** `O(n)`

---

## 5️⃣ Prefix + Suffix Product

**Used in:**

* Product of Array Except Self

**Concept**

```
result[i] = leftProduct × rightProduct
```

Optimized using:

* Left stored in result[]
* Right tracked using variable

**Time Complexity:** `O(n)`
**Space Complexity:** `O(1)`

---

## 6️⃣ Array Reversal Technique

**Used in:**

* Rotate Array

**Concept**

Steps:

1. Reverse first `n-k`
2. Reverse last `k`
3. Reverse entire array

**Time Complexity:** `O(n)`
**Space Complexity:** `O(1)`

### 🔹 Simple Reversal

**Used in:**
- Reverse Array
**Concept:**
Swap elements from both ends moving inward.
```
left++ and right-- until they meet
```
---

## 7️⃣ Kadane's Algorithm

**Used in:**

* Maximum Subarray

**Concept**

```
currentSum = max(nums[i], currentSum + nums[i])
maxSum = max(maxSum, currentSum)
```

**Time Complexity:** `O(n)`
**Space Complexity:** `O(1)`

---

## 8️⃣ Hashing for Grid Validation

**Used in:**

* Valid Sudoku

**Concept**

Track:

* Rows
* Columns
* 3×3 Boxes

```
num + " in row " + i
num + " in column " + j
num + " in box " + (i/3) + "-" + (j/3)
```

**Time Complexity:** `O(1)`
**Space Complexity:** `O(1)`

---

## 9️⃣ Interval Merging (Sorting + Greedy)

**Used in:**

* Merge Intervals

**Concept**

1. Sort intervals
2. Merge overlapping ones

**Time Complexity:** `O(n log n)`
**Space Complexity:** `O(n)`

---

## 🔟 Interval Insertion

**Used in:**

* Insert Interval

**Concept**

```
1. If no overlap → add interval
2. If overlap → merge
```

**Time Complexity:** `O(n)`
**Space Complexity:** `O(n)`

---

## 1️⃣1️⃣ k-Sum Pattern

**Used in:**

* 3Sum
* 4Sum

**Concept**

Reduce problem:

```
k-Sum → (k-1)-Sum → ... → 2Sum
```

**Time Complexity:**

* 3Sum → `O(n²)`
* 4Sum → `O(n³)`

**Space Complexity:** `O(1)`

---

## 1️⃣2️⃣ Closest Sum Optimization

**Used in:**

* 3Sum Closest

**Concept**

Track the closest value instead of exact match:

```
if(abs(sum - target) < bestDiff)
    update answer
```

**Time Complexity:** `O(n²)`
**Space Complexity:** `O(1)`

---

## 1️⃣3️⃣ Two Pointers (In-Place Rearrangement)

**Used in:**

- Move Zeroes

**Concept**

Use two pointers to rearrange elements **in-place** while maintaining order.

- `left` → position for next valid element  
- `right` → iterate through array  

If element is valid (non-zero):
- Swap with `left`
- Move `left++`

Key idea:
Shift non-zero elements forward, push zeroes to the end


**Time Complexity:** `O(n)`  
**Space Complexity:** `O(1)`

---

## 1️⃣4️⃣ Index Marking (In-Place Hashing)

**Used in:**

- Find Disappeared Numbers  
- Find Duplicates  

**Concept**

Use array indices as a **hashing structure**.
```
index = value - 1
```
---

### 🔹 Variations

**Find Missing Numbers**
- Positive index → missing  

**Find Duplicates**
- Already negative → duplicate  

---

**Key Idea**
```
Use sign (+/-) to mark visited elements
```
**Time Complexity:** `O(n)`  
**Space Complexity:** `O(1)`
---


## 1️⃣5️⃣ Cyclic Sort (Index Placement)

**Used in:**

- First Missing Positive  
- Missing Number  
- Set Mismatch  

**Concept**

Place each element at its correct index:
```
value → index = value - 1
```
---

### 🔹 Variations

**First Missing Positive**
- Find first index where nums[i] != i+1  

**Missing Number**
- Find index where nums[i] != i  

**Set Mismatch**
- nums[i] → duplicate  
- i+1 → missing  

---

**Key Idea**
Correct placement reveals errors in the array

**Time Complexity:** `O(n)`  
**Space Complexity:** `O(1)`

---
## 1️⃣6️⃣ Mathematical Sum Trick

**Used in:**

- Missing Number

**Concept**

Use formula:

n * (n + 1) / 2

Subtract actual sum from expected sum.
```
missing = totalSum - actualSum
```
**Time Complexity:** `O(n)`  
**Space Complexity:** `O(1)`
---

# 🚧 Upcoming Patterns

* Sliding Window
* Prefix Sum + HashMap

---

## 1️⃣7️⃣ Floyd’s Cycle Detection (Tortoise & Hare)

**Used in:**

- Find the Duplicate Number

**Concept**

Treat array as a linked list:
```
nums[i] → next index
```
Since duplicate exists → cycle forms.

Steps:

1. Detect cycle using slow & fast pointers  
2. Find cycle start → duplicate number  

**Time Complexity:** `O(n)`  
**Space Complexity:** `O(1)`

---
## 1️⃣8️⃣ Two Pointers (Unique Elements)

**Used in:**

- Remove Duplicates from Sorted Array

**Concept**

Since array is sorted, duplicates are adjacent.

Use two pointers:

- i → last unique element  
- j → traverse array  

If nums[j] != nums[i]:
    move nums[j] forward

**Time Complexity:** O(n)  
**Space Complexity:** O(1)

---

## 1️⃣9️⃣ Two Pointers (Allow K Duplicates)

**Used in:**

- Remove Duplicates from Sorted Array II

**Concept**

Allow at most K duplicates using index comparison.

For K = 2:
```
if(i < 2 || nums[i] != nums[i-2])
```
General idea:
Compare current element with element K positions before.

If different → allow insertion

**Time Complexity:** O(n)  
**Space Complexity:** O(1)

---

## 2️⃣0️⃣ Circular Array Check

**Used in:**

- Check if Array is Sorted and Rotated

**Concept**

A sorted rotated array has at most one point where order breaks.
```
nums[i] > nums[(i+1) % n]
```
If count of such breaks ≤ 1 → valid

Key idea:
Treat array as circular using modulo.

**Time Complexity:** O(n)  
**Space Complexity:** O(1)

---

## 2️⃣1️⃣ Binary Search on Pattern (Index Parity)

**Used in:**

- Single Element in a Sorted Array

**Concept**

Use binary search with index parity:

- Before single → pairs start at even index  
- After single → pairs shift  

Force mid to even:
```
if(mid % 2 == 1) mid--
```
Compare:
- nums[mid] == nums[mid+1] → move right  
- else → move left  

**Time Complexity:** O(log n)  
**Space Complexity:** O(1)

---

## 2️⃣2️⃣ Greedy (Local Fix Strategy)

**Used in:**

- Non-decreasing Array

**Concept**

When violation occurs:
```
nums[i] > nums[i+1]
```
Fix locally by modifying one element.

Decision:

- If nums[i-1] > nums[i+1] → modify nums[i+1]
- Else → modify nums[i]

Key idea:
Fix locally while minimizing impact on future elements

**Time Complexity:** O(n)  
**Space Complexity:** O(1)

---

## 2️⃣3️⃣ Greedy (Index Distance Constraint)

**Used in:**

- Global and Local Inversions

**Concept**

For global inversions to equal local inversions:

Each element must be at most 1 position away from its correct index.
```
Math.abs(nums[i] - i) <= 1
```
If any element violates this → non-local inversion exists.

**Time Complexity:** O(n)  
**Space Complexity:** O(1)

---

## 2️⃣4️⃣ Greedy (Distance Comparison)

**Used in:**

- Escape The Ghosts

**Concept**

Use Manhattan distance to compare reachability.
```
|x1 - x2| + |y1 - y2|
```
If any opponent can reach target earlier or at same time → fail.

Key idea:
Compare distances instead of simulating movement.

**Time Complexity:** O(n)  
**Space Complexity:** O(1)

---

## 2️⃣5️⃣ Greedy (Gap Analysis)

**Used in:**

- Maximize Distance to Closest Person

**Concept**

Analyze gaps between occupied seats.

Cases:
1. Leading zeros → distance = index  
2. Middle gap → distance = gap / 2  
3. Trailing zeros → distance = length - lastIndex  

Key idea:
Choose position maximizing minimum distance.

**Time Complexity:** O(n)  
**Space Complexity:** O(1)

---

## 2️⃣6️⃣ Binary Search on Peak (Slope Method)

**Used in:**

- Peak Index in Mountain Array  
- Find Peak Element  

**Concept**

Use binary search based on slope:
```
if(nums[mid] < nums[mid+1]) → go right
else → go left
```
Key idea:
Peak exists where increasing turns into decreasing.

Works even if multiple peaks exist.

**Time Complexity:** O(log n)  
**Space Complexity:** O(1)

---

# 🎯 Key Takeaways

Array problems often revolve around:

* HashMap Lookup
* Two Pointers
* Greedy Techniques
* Prefix & Suffix
* Interval Handling
* Kadane’s Algorithm

Mastering these patterns makes **most interview problems easier to solve** 🚀

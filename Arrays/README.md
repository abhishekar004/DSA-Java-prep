# 📘 Arrays Problems

This folder contains **Array-based problems solved in Java** as part of my **DSA Placement Preparation**.

---

# 🧩 Problems Solved

| #  | Problem                         | Platform      | Pattern               |
| -  | ------------------------------- | ------------- | --------------------- |
| 1  | Two Sum                         | LeetCode #1   | HashMap               |
| 2  | Squares of a Sorted Array       | LeetCode #977 | Two Pointers          |
| 3  | Best Time to Buy and Sell Stock | LeetCode #121 | Greedy / Min Tracking |
| 4  | Contains Duplicate              | LeetCode #217 | HashSet               |
| 5  | Product Of Array Except Self    | LeetCode #238 | Prefix + Suffix       |
| 6  | Rotate Array                    | LeetCode #189 | Reversal Technique    |
| 7  | Maximum Subarray                | LeetCode #53  | Kadane's Algorithm    |
| 8  | Valid Sudoku                    | LeetCode #36  | HashSet               |
| 9  | Merge Intervals                 | LeetCode #56  | Interval Merging      |
| 10 | Insert Intervals                | LeetCode #57  | Interval Insertion    |
| 11 | 3Sum                            | LeetCode #15  | Sorting + Two Pointers|
| 12 | 4Sum                            | LeetCode #18  | K-Sum Pattern         |

---

# 🧠 Important Patterns

## 1️⃣ HashMap Lookup

**Used in:**

* Two Sum

**Concept**

Store numbers in a HashMap to check the complement in **O(1)** time.

Example idea:

```
target - currentNumber
```

If it already exists in the HashMap → solution found.

**Time Complexity:** `O(n)`
**Space Complexity:** `O(n)`

---

## 2️⃣ Two Pointer Technique

**Used in:**

* Squares of a Sorted Array

**Concept**

Use two pointers at the **start and end of the array** to compare values and build the result array.

Common when:

* Array is **sorted**
* Need to compare **largest/smallest elements**

**Time Complexity:** `O(n)`
**Space Complexity:** `O(n)`

---

## 3️⃣ Greedy (Minimum Tracking)

**Used in:**

* Best Time to Buy and Sell Stock

**Concept**

Track the **minimum price seen so far** and calculate the **profit if sold today**.

```
profit = currentPrice - minPrice
```

Update the maximum profit while traversing the array.

**Time Complexity:** `O(n)`
**Space Complexity:** `O(1)`

---

## 4️⃣ HashSet Lookup

**Used in:**

* Contains Duplicate

**Concept**

Use a HashSet to track already seen elements.

If inserting an element into the set fails, it means the element already exists, indicating a duplicate or invalid placement.

**Examples:**
```
Store numbers in a HashSet.

If a number already exists → duplicate found.
```

**Time Complexity:** `O(n)` 
**Space Complexity:** `O(n)`


---

## 5️⃣ Prefix + Suffix Product

**Used in:**

* Product of Array Except Self

**Concept**

For each index:

```
result[i] = product of elements on the left × product of elements on the right
```

Instead of storing two arrays, we can compute:

* Left products in `result[]`
* Multiply by a running **right product**

This achieves **O(1) extra space**.

**Time Complexity:** `O(n)`
**Space Complexity:** `O(1)`

---

## 6️⃣ Array Reversal Technique

**Used in:**

* Rotate Array

Concept

To rotate an array to the right by k steps without extra space, we can use the array reversal trick.

Steps:

Reverse the first n-k elements

Reverse the last k elements

Reverse the entire array

**Time Complexity:** `O(n)`
**Space Complexity:** `O(1)`

---

## 7️⃣ Kadane's Algorithm

**Used in:**

* Maximum Subarray

**Concept**

Kadane's Algorithm finds the **maximum sum contiguous subarray**.

At each step we decide:

Start a new subarray OR extend the existing one.

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

Use a **HashSet** to track seen values for:
```
- rows
- columns
- 3×3 sub-boxes
```
Each element is encoded as a string:
```
num + " in row " + i
num + " in column " + j
num + " in box i" + i/3 + "-" + j/3
```

If inserting into the set fails, it means the number already exists
in that row, column, or box.

**Time Complexity:** `O(1)` (board size is fixed 9×9)  
**Space Complexity:** `O(1)`

---

## 9️⃣ Interval Merging (Sorting + Greedy)

**Used in:**

* Merge Intervals

**Concept**

When dealing with intervals:
```
1. First **sort intervals by start time**
2. Compare the current interval with the previous one
3. If they overlap → merge them
4. Otherwise → add a new interval
```

**Time Complexity:** `O(n log n)`  
**Space Complexity:** `O(n)`

---

## 🔟 Interval Insertion

**Used in:**

- Insert Interval

**Concept**

Given sorted non-overlapping intervals, insert a new interval and merge overlaps.

While iterating:
```
1. If current interval ends before new interval → add it
2. If current interval starts after new interval → add new interval
3. If intervals overlap → merge them
```


**Time Complexity:** `O(n)`
**Space Complexity:** `O(n)`

---

## 1️⃣1️⃣ Two Pointers with Sorting (3Sum Pattern)

**Used in:**

* 3Sum

**Concept**

1. Sort the array
2. Fix one element
3. Use two pointers to find remaining two elements
4. Skip duplicates to avoid repeated triplets

Key idea:
```
Fix nums[i] → find pair (left, right) such that sum = 0
```
**Time Complexity:** `O(n^2)`  
**Space Complexity:** `O(1)`

---

## 1️⃣2️⃣ k-Sum Pattern (Generalized Two Pointers)

**Used in:**

- 3Sum
- 4Sum

**Concept**

1. Sort the array
2. Fix k-2 elements using loops
3. Use two pointers for remaining 2 elements
4. Skip duplicates

Example:

3Sum → fix 1 element  
4Sum → fix 2 elements  

Key idea:
```
Reduce k-Sum → (k-1)-Sum → ... → 2Sum
```
**Time Complexity:**  
- 3Sum → `O(n^2)`  
- 4Sum → `O(n^3)`

**Space Complexity:** `O(1)`

---

# 🎯 Key Takeaways

Array problems often revolve around a few powerful patterns:

* HashMap Lookup
* Two Pointers
* Greedy Techniques
* Prefix & Suffix Products
* Sliding Window
* Prefix Sum

Mastering these patterns makes **many interview problems easier to solve**.

---

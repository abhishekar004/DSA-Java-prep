# 📘 Arrays Problems

This folder contains **Array-based problems solved in Java** as part of my **DSA Placement Preparation**.

---

# 🧩 Problems Solved

| # | Problem                         | Platform      | Pattern               |
| - | ------------------------------- | ------------- | --------------------- |
| 1 | Two Sum                         | LeetCode #1   | HashMap               |
| 2 | Squares of a Sorted Array       | LeetCode #977 | Two Pointers          |
| 3 | Best Time to Buy and Sell Stock | LeetCode #121 | Greedy / Min Tracking |
| 4 | Contains Duplicate              | LeetCode #217 | HashSet               |
| 5 | Product Of Array Except Self    | LeetCode #238 | Prefix + Suffix       |
| 6 | Rotate Array                    | LeetCode #189 | Reversal Technique    |
| 7 | Maximum Subarray                | LeetCode #53  | Kadane's Algorithm    |
| 8 | Valid Sudoku                    | LeetCode #36  | HashSet               |


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

* Valid Sudoku

**Concept**

Use a HashSet to track already seen elements.

If inserting an element into the set fails, it means the element already exists, indicating a duplicate or invalid placement.

Examples:
```
Contains Duplicate

Store numbers in a HashSet.

If a number already exists → duplicate found.
```
```
Valid Sudoku

Store unique identifiers for:

row

column

3×3 box

Example representation:

num + " in row i"
num + " in column j"
num + " in box i/3-j/3"

If any of these identifiers already exist in the set → the board is invalid.
```
**Time Complexity: **`O(n)` (array problems) / `O(1)` for fixed-size grids like Sudoku
**Space Complexity: **`O(n)`


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

Used in:

Rotate Array

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

- Maximum Subarray

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

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

Use a **HashSet** to track visited elements.

If an element already exists in the set → duplicate found.

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

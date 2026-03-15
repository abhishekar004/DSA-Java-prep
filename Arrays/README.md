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

---

# 🧠 Important Patterns

## 1️⃣ HashMap Lookup

**Used in:**

* Two Sum

**Concept**

Store numbers in a HashMap to check the complement in **O(1)** time.

Example idea:

target - currentNumber

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

Profit = `currentPrice - minPrice`

Update the maximum profit while traversing the array.

**Time Complexity:** `O(n)`
**Space Complexity:** `O(1)`

---

4️⃣ HashSet Lookup

Used in:
- Contains Duplicate

Concept:
Use a HashSet to track seen elements. If the element already exists,
a duplicate is found.

Time Complexity: O(n)
Space Complexity: O(n)

---

# 🎯 Key Takeaways

Array problems often revolve around a few powerful patterns:

* HashMap Lookup
* Two Pointers
* Greedy Techniques
* Sliding Window
* Prefix Sum

Mastering these patterns makes **many interview problems easier to solve**.

---

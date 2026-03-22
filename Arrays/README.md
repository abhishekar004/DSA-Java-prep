# 🚀 📘 Arrays Mastery Notes (DSA Placement Preparation)

> 💡 **"Don’t just solve problems — recognize patterns instantly."**

This is a **pattern-based DSA revision system** designed for:

* ⚡ Fast pattern recognition
* 🎯 Placement preparation
* 🔁 Quick revision before interviews

---

# 🎯 Goals

* ✅ Solve **300+ DSA problems**
* ✅ Master **core patterns**
* ✅ Crack **product-based companies**

---

# 🧠 How to Use This README

### 🔥 3 Modes

| Mode           | How to Use                    |
| -------------- | ----------------------------- |
| Learning Mode  | Solve problems + read pattern |
| Revision Mode  | Revise patterns + formulas    |
| Interview Mode | Identify pattern in <30 sec   |

---

# 📊 Pattern Coverage

| Pattern            | Status      |
| ------------------ | ----------- |
| HashMap            | ✅ Covered   |
| Two Pointers       | ✅ Covered   |
| Greedy             | ✅ Covered   |
| Prefix/Suffix      | ✅ Covered   |
| Interval Problems  | ✅ Covered   |
| Kadane's Algorithm | ✅ Covered   |
| Grid Hashing       | ✅ Covered   |
| Binary Search      | ✅ Covered   |
| Prefix Sum         | ✅ Covered   |
| Heap               | ⚡ Practiced |
| Sliding Window     | 🔜 Upcoming |

---

# 🧩 Problems Solved (43)

| #  | Problem                 | Platform | Pattern              | Difficulty |
| -- | ----------------------- | -------- | -------------------- | ---------- |
| 1  | Two Sum                 | LC #1    | HashMap              | 🟢         |
| 2  | Squares of Sorted Array | LC #977  | Two Pointers         | 🟢         |
| 3  | Buy & Sell Stock        | LC #121  | Greedy               | 🟢         |
| 4  | Contains Duplicate      | LC #217  | HashSet              | 🟢         |
| 5  | Product Except Self     | LC #238  | Prefix/Suffix        | 🟠         |
| 6  | Rotate Array            | LC #189  | Reversal             | 🟠         |
| 7  | Maximum Subarray        | LC #53   | Kadane               | 🟢         |
| 8  | Valid Sudoku            | LC #36   | Grid Hashing         | 🟠         |
| 9  | Merge Intervals         | LC #56   | Interval             | 🟠         |
| 10 | Insert Interval         | LC #57   | Interval             | 🟠         |
| 11 | 3Sum                    | LC #15   | Two Pointers         | 🟠         |
| 12 | 4Sum                    | LC #18   | k-Sum                | 🟠         |
| 13 | 3Sum Closest            | LC #16   | Two Pointers         | 🟠         |
| 14 | Move Zeroes             | LC #283  | Two Pointers         | 🟢         |
| 15 | Missing Numbers         | LC #448  | Index Marking        | 🟢         |
| 16 | First Missing Positive  | LC #41   | Cyclic Sort          | 🔴         |
| 17 | Missing Number          | LC #268  | Math                 | 🟢         |
| 18 | Find Duplicate          | LC #287  | Floyd Cycle          | 🟠         |
| 19 | Set Mismatch            | LC #645  | Cyclic               | 🟢         |
| 32 | Koko Bananas            | LC #875  | Binary Search        | 🟠         |
| 33 | Ship Packages           | LC #1011 | Binary Search        | 🟠         |
| 34 | Smallest Divisor        | LC #1283 | Binary Search        | 🟠         |
| 35 | Array Subset            | GFG      | HashMap              | 🟢         |
| 36 | Subarray 0 Sum          | GFG      | Prefix Sum           | 🟠         |
| 37 | Kadane (GFG)            | GFG      | Kadane               | 🟠         |
| 38 | Kth Smallest            | GFG      | Heap                 | 🟠         |
| 39 | Median                  | GFG      | Sorting              | 🟢         |
| 40 | Palindromic Array       | GFG      | Math                 | 🟢         |
| 41 | Sock Merchant           | HR       | HashMap              | 🟢         |
| 42 | Simple Sum              | HR       | Basic                | 🟢         |
| 43 | Subarray Sum K          | LC #560  | Prefix Sum + HashMap | 🟠         |

---

# ⚡ Pattern Recognition Cheat Sheet (🔥 MOST IMPORTANT)

| If you see…                | Think Pattern |
| -------------------------- | ------------- |
| Pair / target              | HashMap       |
| Sorted array               | Two Pointers  |
| Maximum subarray           | Kadane        |
| Subarray sum               | Prefix Sum    |
| Missing / duplicate (1..n) | Cyclic Sort   |
| Overlapping ranges         | Interval      |
| Minimum valid answer       | Binary Search |
| Kth smallest               | Heap          |

---

# 🧠 Important Patterns (Formulas + Triggers)

---

## 1️⃣ HashMap

📌 Problems: Two Sum, Subset, Sock Merchant

💡 Trigger:

* Fast lookup
* Frequency

🔑 Formula:

```
target - num
```

🏷 Tags: #hashmap #lookup #frequency

---

## 2️⃣ Two Pointers

📌 Problems: 3Sum, Move Zeroes

💡 Trigger:

* Sorted array
* Pair/triplet

🔑 Rule:

```
sum < target → left++
sum > target → right--
```

🏷 Tags: #twopointers #inplace

---

## 3️⃣ Greedy

📌 Problems: Stock, Non-Decreasing

💡 Trigger:

* Local optimal choice

🔑 Formula:

```
profit = price - min
```

🏷 Tags: #greedy

---

## 4️⃣ Prefix Sum 🔥

📌 Problems: Subarray Sum K, 0 Sum

💡 Trigger:

* Subarray problems

🔑 Formula:

```
prefix[j] - prefix[i] = k
```

🏷 Tags: #prefixsum #subarray

---

## 5️⃣ Kadane

📌 Problems: Max Subarray

🔑 Formula:

```
curr = max(num, curr + num)
```

🏷 Tags: #kadane

---

## 6️⃣ Cyclic Sort

📌 Problems: Missing Number

🔑 Formula:

```
nums[i] → index = nums[i] - 1
```

🏷 Tags: #cyclicsort

---

## 7️⃣ Binary Search

📌 Problems: Peak, Mountain

🔑 Rule:

```
mid = low + (high - low)/2
```

🏷 Tags: #binarysearch

---

## 8️⃣ Binary Search on Answer 🔥

📌 Problems: Koko, Ship

🔑 Logic:

```
if(valid(mid)) → search left
else → right
```

🔥 Ceil Trick:

```
(a + b - 1) / b
```

🏷 Tags: #binarysearch #optimization

---

## 9️⃣ Heap

📌 Problems: Kth Smallest

💡 Trigger:

* Top K

🏷 Tags: #heap

---

## 🔟 Floyd Cycle

📌 Problems: Duplicate Number

🔑 Formula:

```
slow = nums[slow]
fast = nums[nums[fast]]
```

🏷 Tags: #cycle

---

## 🔹 Greedy (Min/Max Tracking)

**Used in:**
- Breaking the Records
- Best Time to Buy & Sell Stock

**Trigger**
- Track highest/lowest value dynamically

**Concept**
Update min/max while iterating

**Template**
min = max = arr[0]
for each element:
    update min/max


---

# 🧪 Revision Strategy

### 🔁 Level 1 → Solve

3 problems/day

### 🔁 Level 2 → Patterns

Revise patterns only

### 🔁 Level 3 → Interview

Only this README

---

# 🏢 Company Mapping

| Company   | Focus                           |
| --------- | ------------------------------- |
| Amazon    | HashMap, Sliding Window, Greedy |
| Google    | Prefix Sum, Binary Search       |
| Microsoft | Arrays, Greedy                  |
| Meta      | Two Pointers                    |
| Adobe     | Sorting                         |

---

# 🎯 Final Takeaways

* Arrays = Pattern Recognition
* Same patterns repeat
* Speed = Pattern + Practice

---

# ⚡ Final Advice

> “If you identify pattern in 30 sec,
> you can solve in 5 minutes.”

🚀 **This README = Your Placement Weapon**

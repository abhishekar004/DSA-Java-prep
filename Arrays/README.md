# 📘 Arrays Problems

This folder contains **Array-based problems solved in Java** as part of my **DSA Placement Preparation**.

---

# 🚀 📘 Arrays Mastery Notes (DSA Placement Preparation)

> 💡 “Don’t just solve problems — recognize patterns instantly.”

This repository is a **complete revision system** for:

- ⚡ Pattern Recognition  
- 🎯 Interview Preparation  
- 🔁 Fast Recall  

---

# 🎯 Goals

- ✅ Solve 300+ DSA problems  
- ✅ Master core patterns  
- ✅ Crack product-based companies  

---

# 🧠 How to Use

### 🔥 3 Modes

- Learning Mode  
- Revision Mode  
- Interview Mode (Pattern in <30 sec)

---

# 📊 Pattern Coverage

| Pattern | Status |
|--------|-------|
| HashMap | ✅ Covered |
| Two Pointers | ✅ Covered |
| Greedy | ✅ Covered |
| Prefix/Suffix | ✅ Covered |
| Interval Problems | ✅ Covered |
| Kadane's Algorithm | ✅ Covered |
| Grid Hashing | ✅ Covered |
| Sliding Window | 🔜 Upcoming |
| Prefix Sum | 🔜 Upcoming |

---

# 🧩 Problems Solved

| # | Problem | Platform | Pattern |
|--|--------|----------|--------|
| 1 | Two Sum | LeetCode #1 | HashMap |
| 2 | Squares of Sorted Array | LC #977 | Two Pointers |
| 3 | Buy & Sell Stock | LC #121 | Greedy |
| 4 | Contains Duplicate | LC #217 | HashSet |
| 5 | Product Except Self | LC #238 | Prefix/Suffix |
| 6 | Rotate Array | LC #189 | Reversal |
| 7 | Maximum Subarray | LC #53 | Kadane |
| 8 | Valid Sudoku | LC #36 | Grid Hashing |
| 9 | Merge Intervals | LC #56 | Interval |
| 10 | Insert Interval | LC #57 | Interval |
| 11 | 3Sum | LC #15 | Two Pointers |
| 12 | 4Sum | LC #18 | k-Sum |
| 13 | 3Sum Closest | LC #16 | Two Pointers |
| 14 | Move Zeroes | LC #283 | Two Pointers |
| 15 | Missing Numbers | LC #448 | Index Marking |
| 16 | First Missing Positive | LC #41 | Cyclic Sort |
| 17 | Missing Number | LC #268 | Math |
| 18 | Find Duplicate | LC #287 | Cycle |
| 19 | Set Mismatch | LC #645 | Cyclic |
| 20 | Reverse Array | GFG | Two Pointers |
| 21 | Remove Duplicates I | LC #26 | Two Pointers |
| 22 | Remove Duplicates II | LC #80 | Two Pointers |
| 23 | Sorted Rotated Check | LC #1752 | Circular |
| 24 | Single Element | LC #540 | Binary Search |
| 25 | Non-Decreasing Array | LC #665 | Greedy |
| 26 | Global vs Local Inversion | LC #775 | Greedy |
| 27 | Escape Ghosts | LC #789 | Greedy |
| 28 | Max Distance | LC #849 | Greedy |
| 29 | Peak Index | LC #852 | Binary Search |
| 30 | Find Peak | LC #162 | Binary Search |
| 31 | Mountain Array | LC #1095 | Binary Search |
| 32 | Koko Bananas | LC #875 | BS Answer |
| 33 | Ship Packages | LC #1011 | BS Answer |
| 34 | Smallest Divisor | LC #1283 | BS Answer |
| 35 | Array Subset | GFG | HashMap |
| 36 | Subarray 0 Sum | GFG | Prefix |
| 37 | Kadane (GFG) | GFG | Kadane |
| 38 | Kth Smallest | GFG | Heap |
| 39 | Median | GFG | Sorting |
| 40 | Palindromic Array | GFG | Math |
| 41 | Sock Merchant | HR | HashMap |
| 42 | Simple Sum | HR | Basic |
| 43 | Subarray Sum K | LC #560 | Prefix |

---

# ⚡ Pattern Recognition Cheat Sheet

| If you see… | Use |
|------------|-----|
| Pair / target | HashMap |
| Sorted array | Two Pointers |
| Max sum | Kadane |
| Subarray sum | Prefix |
| Missing/duplicate | Cyclic |
| Overlap | Interval |
| Min/Max answer | Binary Search |

---

# 🧠 Important Patterns (WITH PROBLEMS + FORMULAS)

---

## 1️⃣ HashMap Lookup

### 📌 Problems
- Two Sum  
- Array Subset  
- Sock Merchant  

### 💡 Concept
Store complement for O(1) lookup

### 🔑 Formula

target - num


---

## 2️⃣ Two Pointers

### 📌 Problems
- Squares Sorted  
- 3Sum  
- 4Sum  
- Move Zeroes  
- Remove Duplicates  

### 💡 Concept
Use left & right on sorted array

### 🔑 Rule

sum < target → left++
sum > target → right--


---

## 3️⃣ Greedy

### 📌 Problems
- Buy Sell Stock  
- Non-Decreasing Array  
- Escape Ghosts  
- Max Distance  

### 💡 Concept
Make locally optimal choice

### 🔑 Formula

profit = price - min


---

## 4️⃣ Prefix + Suffix

### 📌 Problems
- Product Except Self  

### 🔑 Formula

res[i] = left * right


---

## 5️⃣ Kadane’s Algorithm

### 📌 Problems
- Maximum Subarray  

### 🔑 Formula

curr = max(num, curr + num)
max = max(max, curr)


---

## 6️⃣ Cyclic Sort

### 📌 Problems
- First Missing Positive  
- Missing Number  
- Set Mismatch  

### 🔑 Formula

nums[i] → index = nums[i] - 1


---

## 7️⃣ Binary Search

### 📌 Problems
- Peak Element  
- Single Element  
- Mountain Array  

### 🔑 Rule

mid = (low + high)/2


---

## 8️⃣ Binary Search on Answer

### 📌 Problems
- Koko Bananas  
- Ship Packages  
- Smallest Divisor  

### 🔑 Formula

if(valid(mid)) → left else right


### 🔥 Ceil Trick

(a + b - 1) / b


---

## 9️⃣ Prefix Sum

### 📌 Problems
- Subarray Sum K  
- Subarray 0 Sum  

### 🔑 Formula

prefix[j] - prefix[i] = k


---

## 🔟 Floyd Cycle Detection

### 📌 Problems
- Find Duplicate  

### 🔑 Formula

slow = nums[slow]
fast = nums[nums[fast]]


---

# 🧪 Revision Strategy

### 🔁 Level 1
- Solve 3/day  

### 🔁 Level 2
- Revise patterns  

### 🔁 Level 3
- Only this README  

---

# 🏢 Company Focus

### Amazon
- Sliding Window  
- Two Pointers  
- Kadane  

### Google
- 3Sum / 4Sum  
- Binary Search  

### Microsoft
- Prefix Sum  
- Greedy  

---

# 🎯 Final Takeaways

- Arrays = Pattern Recognition  
- Same patterns repeat  
- Speed = Practice + Memory  

---

# ⚡ Final Advice

“If you can identify pattern in 30 sec,  
you can solve problem in 5 minutes.”

🚀 This README = Your Placement Weapon

<h1 align="center">🚀 DSA Java — Placement Preparation</h1>

<p align="center">
  <b>Pattern-based DSA practice in Java for product-based company interviews</b>
</p>

<p align="center">
  <img src="https://img.shields.io/badge/Problems%20Solved-66%2F300-blue?style=for-the-badge" />
  <img src="https://img.shields.io/badge/Language-Java-orange?style=for-the-badge" />
  <img src="https://img.shields.io/badge/Streak-Active-red?style=for-the-badge" />
  <img src="https://img.shields.io/badge/Goal-Software%20Engineer-green?style=for-the-badge" />
</p>

---

## 📌 About

This repo documents my **consistent DSA journey in Java** — structured around patterns, not just problems.

Every solution is:
- Written in clean, readable **Java**
- Commented with **approach + time/space complexity**
- Grouped by **pattern** for fast interview revision

> 💡 **Core philosophy:** Don't grind problems blindly. Recognize the pattern in 30 seconds, solve in 5 minutes.

---

## 📂 Repository Structure

| Folder | Status | Problems Solved | Patterns Covered |
|--------|--------|-----------------|-----------------|
| [📁 Arrays](./arrays/) | 🟢 Active | 48 | HashMap, Two Pointers, Greedy, Prefix Sum, Kadane's, Cyclic Sort, Floyd Cycle, Intervals, Binary Search, Binary Search on Answer, Heap, Partition, LCM+GCD |
| [📁 Strings](./strings/) | 🟢 Active | 18 | Two Pointers, Traverse from End, Sliding Window, Fixed Window, HashMap Grouping, String Matching, Expand Around Center, Simulation, Stack, DP |
| [📁 HashMap](./hashmap/) | ⚪ Upcoming | — | — |
| [📁 Stack](./stack/) | ⚪ Upcoming | — | — |
| [📁 Queue](./queue/) | ⚪ Upcoming | — | — |
| [📁 LinkedList](./linkedlist/) | ⚪ Upcoming | — | — |
| [📁 Trees](./trees/) | ⚪ Upcoming | — | — |
| [📁 Graphs](./graphs/) | ⚪ Upcoming | — | — |
| [📁 Dynamic Programming](./dp/) | ⚪ Upcoming | — | — |

> 📌 Each folder has its own **README with pattern-grouped problems, approach explanations, key templates, and common mistakes.**

---

## 📊 Overall Progress

```
Arrays           ████████████████░░░░  48/300  🟢 Active
Strings          ████████████░░░░░░░░  18/30+  🟢 Active
HashMap          ░░░░░░░░░░░░░░░░░░░░   0/--   ⚪ Upcoming
Stack            ░░░░░░░░░░░░░░░░░░░░   0/--   ⚪ Upcoming
Queue            ░░░░░░░░░░░░░░░░░░░░   0/--   ⚪ Upcoming
LinkedList       ░░░░░░░░░░░░░░░░░░░░   0/--   ⚪ Upcoming
Trees            ░░░░░░░░░░░░░░░░░░░░   0/--   ⚪ Upcoming
Graphs           ░░░░░░░░░░░░░░░░░░░░   0/--   ⚪ Upcoming
DP               ░░░░░░░░░░░░░░░░░░░░   0/--   ⚪ Upcoming

Total: 66 / 300+ problems  ████░░░░░░░░░░░░░░░░  22%
```

---

## 🧠 DSA Patterns Covered

| Pattern | Covered In | Status |
|---------|------------|--------|
| HashMap & HashSet | Arrays, Strings | ✅ |
| Two Pointers | Arrays, Strings | ✅ |
| Greedy | Arrays | ✅ |
| Prefix Sum | Arrays | ✅ |
| Kadane's Algorithm | Arrays | ✅ |
| Cyclic Sort | Arrays | ✅ |
| Floyd's Cycle Detection | Arrays | ✅ |
| Interval Merge | Arrays | ✅ |
| Binary Search | Arrays | ✅ |
| Binary Search on Answer | Arrays | ✅ |
| Heap / Top K | Arrays | ✅ |
| Partition (QuickSort) | Arrays | ✅ |
| LCM & GCD | Arrays | ✅ |
| Sliding Window | Strings | ✅ |
| Fixed-Size Sliding Window | Strings | ✅ |
| Expand Around Center | Strings | ✅ |
| Simulation / Parsing | Strings | ✅ |
| Stack (bracket matching, chain removal) | Strings | ✅ |
| DP on Strings | Strings | ✅ |
| Recursion & Backtracking | — | 🔜 |
| Linked List (Fast/Slow Pointers) | — | 🔜 |
| BFS / DFS on Trees | — | 🔜 |
| Graph Algorithms | — | 🔜 |
| Advanced DP (2D, Knapsack) | — | 🔜 |

---

## 🗺️ Roadmap

```
✅ Phase 1 — Arrays
   └── HashMap · Two Pointers · Greedy · Prefix Sum · Kadane's
       Cyclic Sort · Floyd Cycle · Binary Search · Intervals · Heap
       Partition · LCM+GCD · Frequency Array · Sliding Window basics

✅ Phase 2 — Strings
   └── Two Pointers · Traverse from End · Sliding Window · Fixed Window
       HashMap Grouping · String Matching · Expand Around Center
       Simulation/Parsing · Stack · DP on Strings

⬜ Phase 3 — LinkedList + Stack + Queue
   └── Fast/Slow Pointers · Reverse · Merge · Monotonic Stack · Deque

⬜ Phase 4 — Trees + Recursion
   └── DFS · BFS · Level Order · Path Sum · LCA · BST operations

⬜ Phase 5 — Graphs + BFS/DFS
   └── Topological Sort · Union-Find · Dijkstra · Cycle Detection

⬜ Phase 6 — Dynamic Programming
   └── 1D DP · 2D DP · Knapsack · LCS · Edit Distance · Palindrome DP
```

---

## ⚡ Master Pattern Recognition Cheat Sheet

> 🔑 **In an interview, identify the pattern first — then code.**

### Arrays & General

| Trigger (What You See) | Pattern |
|------------------------|---------|
| Pair / target sum | HashMap |
| Frequency count, fast lookup | HashMap |
| Sorted array + pair or triplet | Two Pointers |
| Two sorted arrays, closest sum | Two Pointers (opposite ends) |
| Maximize profit, track running min/max | Greedy |
| Maximum contiguous subarray | Kadane's Algorithm |
| Subarray sum = k | Prefix Sum + HashMap |
| Zero-sum subarray | Prefix Sum + HashMap |
| Missing / duplicate in [1..n] | Cyclic Sort |
| Find duplicate, no extra space, no modify | Floyd's Cycle Detection |
| Overlapping ranges | Interval Merge |
| Sorted array, find element or peak | Binary Search |
| Minimize the maximum / threshold | Binary Search on Answer |
| Top K / Kth smallest / largest | Heap |
| Rearrange around pivot | Partition (QuickSort) |
| All of A divides X, X divides all of B | LCM + GCD |
| Count in small fixed range | Frequency Array |
| Contiguous subarray, fixed window size | Sliding Window |

### Strings

| Trigger (What You See) | Pattern |
|------------------------|---------|
| Reverse string in-place | Two Pointers (swap from ends) |
| Check palindrome, ignore special chars | Two Pointers + skip invalid |
| Last word / reverse words / trailing spaces | Traverse from End |
| Longest substring, no repeating chars | Sliding Window (variable) |
| Smallest window with all chars of t | Sliding Window + Frequency Map |
| Permutation of pattern / all anagrams | Fixed-Size Window + `int[26]` |
| Concatenation of equal-length words | Fixed-Size Window (chunked) |
| Group strings by same characters | HashMap Grouping (signature key) |
| Find first occurrence of pattern | String Matching (`i <= n - m`) |
| Longest palindromic substring | Expand Around Center |
| String to integer / validate format | Simulation / Parsing |
| Matching brackets / balanced pairs | Stack |
| Remove adjacent duplicates, chain reactions | Stack (push-pop) |
| Pattern with `*` or `.` wildcards | DP on Strings |

---

## 🏢 Company Pattern Mapping

| Company | Primary Patterns | Must-Know Problems |
|---------|-----------------|-------------------|
| **Amazon** | HashMap, Greedy, Sliding Window | Two Sum, Best Time to Buy Stock, Longest Substring |
| **Google** | Prefix Sum, Binary Search, DP | Subarray Sum = K, Min Window Substring, Regex Matching |
| **Microsoft** | Arrays, Two Pointers, Intervals | Merge Intervals, Valid Palindrome, 3Sum |
| **Meta** | Two Pointers, HashMap, Graphs | Remove Duplicates, Group Anagrams, Find All Anagrams |
| **Adobe** | Sorting, Strings, Simulation | Valid Number, Longest Palindrome, atoi |
| **Flipkart** | Greedy, Binary Search, Kadane's | Product Except Self, Koko Bananas, Max Subarray |

---

## 📈 LeetCode Stats

<p align="center">
  <img src="https://leetcard.jacoblin.cool/abhishekar004?theme=dark&font=Nunito" />
</p>

---

## 🔁 How to Use This Repo

| Mode | What to Do |
|------|------------|
| 📖 **Learn** | Open the topic folder → read the pattern README → solve problems group by group |
| 🔁 **Revise** | Read only the cheat sheet above + key templates in each folder README |
| ⚡ **Interview Prep** | Cheat sheet only — identify pattern in ≤ 30 seconds, then code from template |

**Daily target:** 3 problems/day — one pattern group at a time. Don't jump between topics.

**Weekly review:** Re-attempt hard problems without notes. Timed: 20 minutes each.

---

## 🙌 Connect

<p align="center">
  <a href="https://www.linkedin.com/in/abhishekar004">
    <img src="https://img.shields.io/badge/LinkedIn-abhishekar004-blue?style=for-the-badge&logo=linkedin" />
  </a>
  &nbsp;
  <a href="https://github.com/abhishekar004">
    <img src="https://img.shields.io/badge/GitHub-abhishekar004-black?style=for-the-badge&logo=github" />
  </a>
</p>

---

<p align="center">
  <i>⭐ Star this repo if it helps you. Keep solving. Keep growing. 🚀</i>
</p>

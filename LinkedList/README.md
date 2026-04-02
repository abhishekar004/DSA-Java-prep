# 🔗 Linked List — DSA Placement Preparation

> ⚡ **"If you identify the pattern in 30 seconds, you can solve it in 5 minutes."**
>
> A **pattern-based DSA revision system** built for fast pattern recognition, placement prep, and high-pressure interview revision.

---

## 📁 Folder Structure

```
linkedlist/
├── README.md
├── Reversal/
│   └── ReverseLinkedList.java
├── TwoPointerMerge/
│   ├── MergeTwoSortedLists.java
│   └── RemoveDuplicatesFromSortedList.java
└── FastSlowPointers/
    ├── LinkedListCycle.java
    └── MiddleOfLinkedList.java
```

---

## 🎯 Progress Tracker

**Problems Solved: 5 / 50+**

```
██░░░░░░░░░░░░░░░░░░  10%  [5 / 50+]
```

| Pattern | Solved | Target |
|---------|--------|--------|
| Reversal | 1 | 10 |
| Two Pointer Merge | 2 | 10 |
| Fast & Slow Pointers | 2 | 15 |
| Dummy Node | 0 | 10 |
| Recursion on Lists | 0 | 5 |
| In-place Modification | 0 | 10 |

---

## ⚡ Pattern Recognition Cheat Sheet

> 🔑 **Master this table. In an interview, identify the pattern first — then code.**

| Trigger (What You See in the Problem) | Pattern to Apply |
|---------------------------------------|-----------------|
| Reverse entire list / modify next pointers | Three-Pointer Reversal |
| Reverse part of a list (positions i to j) | Three-Pointer Reversal (bounded) |
| Merge two sorted lists, pick smaller each step | Two Pointer Merge + Dummy Node |
| Remove duplicates from sorted list | Adjacent Comparison (no extra space) |
| Detect cycle / loop in list | Fast & Slow Pointers |
| Find middle of list / split list in half | Fast & Slow Pointers |
| Find kth node from end | Fast & Slow Pointers (gap of k) |
| Check if linked list is a palindrome | Fast & Slow + Reversal |
| Reorder list (first, last, second, second-last) | Fast & Slow + Reversal |
| Add two numbers stored as linked lists | Reversal + carry tracking |
| Merge K sorted lists | Two Pointer Merge + Heap |
| Remove Nth node from end | Fast & Slow Pointers (gap of N) |

---

## 🧩 Problems — Grouped by Pattern

---

### 1️⃣ Reversal

> **Core Idea:** Use three pointers — `prev`, `curr`, `next` — to reverse the direction of each `next` pointer one node at a time. Always save `curr.next` before reversing, or you lose the rest of the list. At the end, `prev` is the new head.

**Trigger keywords:** "reverse linked list", "modify next pointers", "reverse in-place"

| Problem | Platform | Difficulty |
|---------|----------|------------|
| [Reverse Linked List](https://leetcode.com/problems/reverse-linked-list/) | LC #206 | 🟢 Easy |

**Key Template:**
```java
ListNode prev = null, curr = head;
while (curr != null) {
    ListNode next = curr.next;   // ← save next FIRST — critical
    curr.next = prev;            // reverse pointer
    prev = curr;                 // move prev forward
    curr = next;                 // move curr forward
}
return prev;                     // prev is the new head
```

⚠️ **Common Mistakes:**
- Not saving `curr.next` before reversing — you permanently lose the rest of the list
- Returning `head` instead of `prev` — head is now the tail after reversal
- Moving `curr = curr.next` after already reversing the pointer — `curr.next` now points backward

🔥 **Interview Tips:**
- Draw the pointer diagram before coding — reversal is easy to get wrong under pressure
- This is the **core building block** for: Reverse Linked List II · Palindrome Linked List · Reorder List · Reverse Nodes in K-Group
- Follow-up: "Reverse from position i to j?" → advance to node i-1, then apply bounded reversal
- Follow-up: "Do it recursively?" → `reverse(head.next)` returns new head; set `head.next.next = head; head.next = null`

---

### 2️⃣ Two Pointer Merge

> **Core Idea:** When both lists are already sorted, you never need to search — just compare the current heads and attach the smaller one. Use a dummy node to avoid special-casing the head. For removing duplicates from a sorted list, duplicates are always adjacent — no HashSet needed, just compare neighbors.

**Trigger keywords:** "merge two sorted lists", "pick smaller each step", "sorted list + duplicates", "no extra space"

| Problem | Platform | Difficulty |
|---------|----------|------------|
| [Merge Two Sorted Lists](https://leetcode.com/problems/merge-two-sorted-lists/) | LC #21 | 🟢 Easy |
| [Remove Duplicates from Sorted List](https://leetcode.com/problems/remove-duplicates-from-sorted-list/) | LC #83 | 🟢 Easy |

**Key Template — Merge Two Sorted Lists:**
```java
ListNode dummy = new ListNode(0);   // dummy avoids special-casing the head
ListNode curr = dummy;
while (l1 != null && l2 != null) {
    if (l1.val <= l2.val) { curr.next = l1; l1 = l1.next; }
    else                  { curr.next = l2; l2 = l2.next; }
    curr = curr.next;
}
curr.next = (l1 != null) ? l1 : l2;  // attach remaining nodes
return dummy.next;
```

**Key Template — Remove Duplicates from Sorted List:**
```java
ListNode curr = head;
while (curr != null && curr.next != null) {
    if (curr.val == curr.next.val)
        curr.next = curr.next.next;   // skip duplicate
    else
        curr = curr.next;             // only advance if no skip
}
return head;
```

⚠️ **Common Mistakes:**
- Merge: forgetting the dummy node — without it you need a separate null check for the result head
- Merge: not attaching the remaining list at the end — one list may still have nodes after the loop exits
- Merge: advancing both pointers after attaching — only advance the pointer whose node you just used
- Remove Duplicates: using a HashSet — unnecessary since sorted means duplicates are always adjacent
- Remove Duplicates: advancing `curr` even after skipping — only move forward when no skip happened

🔥 **Interview Tips:**
- The dummy node pattern is idiomatic for list construction — always use it when building a new list
- "Sorted input → try without extra space" — this mindset signals strong optimization thinking to interviewers
- Merge Two Sorted Lists is the foundation for: Merge Sort on Linked Lists · Merge K Sorted Lists
- Follow-up: "Merge K sorted lists?" → repeatedly merge pairs (divide and conquer) or use a min-heap

---

### 3️⃣ Fast & Slow Pointers

> **Core Idea:** Use two pointers moving at different speeds — slow moves 1 step, fast moves 2. Because fast travels twice as far, when fast reaches the end, slow is at the middle. In a cycle, fast must eventually lap slow and they will meet. The same speed-gap principle finds the kth node from the end when you start fast k steps ahead.

**Trigger keywords:** "detect cycle", "find middle", "split list", "kth from end", "loop detection", "half traversal"

| Problem | Platform | Difficulty |
|---------|----------|------------|
| [Linked List Cycle](https://leetcode.com/problems/linked-list-cycle/) | LC #141 | 🟢 Easy |
| [Middle of the Linked List](https://leetcode.com/problems/middle-of-the-linked-list/) | LC #876 | 🟢 Easy |

**Key Template — Cycle Detection:**
```java
ListNode slow = head, fast = head;
while (fast != null && fast.next != null) {  // ← always check BOTH
    slow = slow.next;
    fast = fast.next.next;
    if (slow == fast) return true;            // cycle detected
}
return false;
```

**Key Template — Middle of Linked List:**
```java
ListNode slow = head, fast = head;
while (fast != null && fast.next != null) {
    slow = slow.next;
    fast = fast.next.next;
}
return slow;   // for even-length list: returns the second middle node
```

⚠️ **Common Mistakes:**
- Checking only `fast != null` without `fast.next != null` — `fast.next.next` throws NullPointerException
- Comparing node **values** instead of node **references** — two different nodes can have the same value
- Using a HashSet for cycle detection — fast/slow is O(1) space, always preferred
- Middle: wrong loop condition causes slow to land one node off for even-length lists
- Middle: forgetting even vs odd behavior — for even length, this returns the **second** middle node

🔥 **Interview Tips:**
- Always check **both** `fast != null && fast.next != null` — missing either causes NPE
- Compare **node references** (`slow == fast`), never values (`slow.val == fast.val`)
- This pattern is the base for: Find Cycle Start · Happy Number · Palindrome Linked List · Remove Nth From End
- Follow-up: "Find where the cycle starts?" → after meeting, reset slow to head; move both 1 step at a time until they meet — that's the cycle entry point
- Follow-up: "Find kth node from end?" → advance fast k steps first, then move both 1 step until fast reaches null — slow is at the answer

---

## 🏢 Company Pattern Mapping

| Company | Primary Patterns | High-Frequency Problems |
|---------|-----------------|------------------------|
| **Amazon** | Fast & Slow, Reversal | Linked List Cycle, Reverse Linked List |
| **Google** | Fast & Slow, Merge | Middle of List, Merge K Sorted Lists |
| **Microsoft** | Reversal, Merge | Reverse Linked List II, Merge Two Sorted Lists |
| **Meta** | Fast & Slow, Reversal | Palindrome Linked List, Reorder List |
| **Adobe** | Merge, Reversal | Add Two Numbers, Remove Duplicates |

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

## 📊 What's Coming Next

```
⬜ Reversal II      — Reverse Linked List II · Reverse Nodes in K-Group
⬜ Dummy Node       — Remove Nth From End · Swap Nodes in Pairs
⬜ Fast & Slow II   — Find Cycle Start · Palindrome Linked List · Reorder List
⬜ Merge Advanced   — Merge K Sorted Lists · Sort List
⬜ Recursion        — Add Two Numbers · Flatten Multilevel List
```

---

> 🚀 **Linked Lists = Pointer Manipulation. Draw before you code. Every bug is a lost pointer.**
>
> ⚡ **Master Reversal + Fast/Slow — they unlock 80% of all linked list problems.**

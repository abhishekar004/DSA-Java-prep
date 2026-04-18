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
├── FastSlowPointers/
│   ├── LinkedListCycle.java
│   ├── MiddleOfLinkedList.java
│   ├── PalindromeLinkedList.java
│   └── RemoveNthNodeFromEnd.java
├── DummyNode/
│   ├── RemoveLinkedListElements.java
│   └── SwapNodesInPairs.java
└── TwoPointerSync/
    └── IntersectionOfTwoLinkedLists.java
```

---

## 🎯 Progress Tracker

**Problems Solved: 10 / 50+**

```
██░░░░░░░░░░░░░░░░░░  10%  [10 / 50+]
```

| Pattern | Solved | Target |
|---------|--------|--------|
| Reversal | 1 | 10 |
| Two Pointer Merge | 2 | 10 |
| Fast & Slow Pointers | 2 | 15 |
| Dummy Node | 0 | 10 |
| Two Pointer Sync | 0 | 5 |
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
| Remove Nth node from end | Fast & Slow Pointers (gap of N+1) |
| Delete nodes matching a value, head may change | Dummy Node + prev/curr pointers |
| Find intersection of two lists, no extra space | Two Pointers + Head Switching |
| Swap adjacent pairs without modifying values | Pointer Rewiring + Dummy Node |

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

**Trigger keywords:** "detect cycle", "find middle", "split list", "kth from end", "loop detection", "half traversal", "palindrome list", "Nth from end"

| Problem | Platform | Difficulty |
|---------|----------|------------|
| [Linked List Cycle](https://leetcode.com/problems/linked-list-cycle/) | LC #141 | 🟢 Easy |
| [Middle of the Linked List](https://leetcode.com/problems/middle-of-the-linked-list/) | LC #876 | 🟢 Easy |
| [Palindrome Linked List](https://leetcode.com/problems/palindrome-linked-list/) | LC #234 | 🟢 Easy |
| [Remove Nth Node From End of List](https://leetcode.com/problems/remove-nth-node-from-end-of-list/) | LC #19 | 🟠 Medium |

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

**Key Template — Palindrome Linked List:**
```java
// Step 1: find middle
ListNode slow = head, fast = head;
while (fast != null && fast.next != null) {
    slow = slow.next;
    fast = fast.next.next;
}
// Step 2: reverse second half
ListNode prev = null, curr = slow;
while (curr != null) {
    ListNode next = curr.next;
    curr.next = prev;
    prev = curr;
    curr = next;
}
// Step 3: compare both halves
ListNode left = head, right = prev;
while (right != null) {
    if (left.val != right.val) return false;
    left = left.next;
    right = right.next;
}
return true;
```

> 🧠 **Pattern Tip — Palindrome Linked List**
>
> You don't need extra memory — just reverse the second half and compare. Find the middle with fast/slow, reverse from there, then walk both halves inward simultaneously.
>
> ⚠️ Common Mistakes: Not handling odd length (slow lands on the true middle — reversing from `slow` works for both odd and even) · Reversing the entire list unnecessarily · Forgetting null checks
>
> 🚀 **Follow-up often asked:** "Can you restore the list after checking?" → Yes — reverse the second half again after comparison.

**Key Template — Remove Nth Node From End:**
```java
ListNode dummy = new ListNode(0);
dummy.next = head;
ListNode fast = dummy, slow = dummy;
// Move fast n+1 steps ahead so slow stops BEFORE the target
for (int i = 0; i <= n; i++) fast = fast.next;
while (fast != null) {
    slow = slow.next;
    fast = fast.next;
}
slow.next = slow.next.next;   // delete the nth node from end
return dummy.next;
```

> 🧠 **Pattern Tip — Remove Nth Node From End**
>
> Maintain a fixed gap of `n+1` nodes between fast and slow (not `n`). This ensures slow stops **before** the target node, giving you the `prev` pointer needed to delete it cleanly. The dummy node handles the edge case where the head itself is the target.
>
> ⚠️ Common Mistakes: Moving fast only `n` steps — off-by-one puts slow on the node to delete, not before it · Skipping the dummy — fails when `n` equals the list length (head removal)
>
> 🚀 **Follow-up:** Remove kth from start and end simultaneously → same gap pattern, two passes.

⚠️ **Common Mistakes:**
- Checking only `fast != null` without `fast.next != null` — `fast.next.next` throws NullPointerException
- Comparing node **values** instead of node **references** for cycle detection — two nodes can share a value
- Using a HashSet for cycle detection — fast/slow is O(1) space, always preferred
- Middle: forgetting even vs odd behavior — for even length, this returns the **second** middle node

🔥 **Interview Tips:**
- Always check **both** `fast != null && fast.next != null` — missing either causes NPE
- Compare **node references** (`slow == fast`), never values (`slow.val == fast.val`) for cycle detection
- Follow-up: "Find where the cycle starts?" → after meeting, reset slow to head; move both 1 step at a time until they meet — that's the cycle entry point

---

### 4️⃣ Dummy Node

> **Core Idea:** When deletions can affect the head, or when you're building a new list node by node, prepend a dummy node so every real node (including head) has a predecessor. This eliminates special-case null checks for the head and lets `prev` always point to a valid node. Return `dummy.next` as the result head.

**Trigger keywords:** "delete nodes matching a value", "head might change", "remove elements", "swap pairs", "don't modify values"

| Problem | Platform | Difficulty |
|---------|----------|------------|
| [Remove Linked List Elements](https://leetcode.com/problems/remove-linked-list-elements/) | LC #203 | 🟢 Easy |
| [Swap Nodes in Pairs](https://leetcode.com/problems/swap-nodes-in-pairs/) | LC #24 | 🟠 Medium |

**Key Template — Remove Linked List Elements:**
```java
ListNode dummy = new ListNode(0);
dummy.next = head;
ListNode prev = dummy, curr = head;
while (curr != null) {
    if (curr.val == val) {
        prev.next = curr.next;   // skip target node
    } else {
        prev = curr;             // only advance prev if NOT deleting
    }
    curr = curr.next;
}
return dummy.next;
```

> 🧠 **Pattern Tip — Remove Linked List Elements**
>
> The dummy node removes the headache of "what if head itself needs deletion?" — every node including head now has a predecessor in `prev`. Key rule: only advance `prev` when you did **not** delete the current node.
>
> ⚠️ Common Mistakes: Moving `prev` even after deletion — breaks the chain · Losing `curr.next` reference before unlinking · Missing the dummy — fails on head deletion
>
> 🚀 This dummy + prev/curr pattern appears in: Remove Duplicates II · Partition List · Delete Nodes by Condition · Reverse Sublist — if deletion is involved, reach for dummy first.

**Key Template — Swap Nodes in Pairs:**
```java
ListNode dummy = new ListNode(0);
dummy.next = head;
ListNode prev = dummy;
while (prev.next != null && prev.next.next != null) {
    ListNode first  = prev.next;
    ListNode second = prev.next.next;
    // Rewire in strict order: first → after second, second → first, prev → second
    first.next  = second.next;
    second.next = first;
    prev.next   = second;
    // Advance past the swapped pair
    prev = first;
}
return dummy.next;
```

> 🧠 **Pattern Tip — Swap Nodes in Pairs**
>
> Always save node references **before** modifying links — otherwise the list breaks mid-swap. The order of the three rewiring steps is strict: connect `first` to what follows `second`, point `second` back to `first`, then attach `prev` to `second`. After swapping, `first` is now the second node — advance `prev` to `first`.
>
> ⚠️ Common Mistakes: Swapping values instead of nodes (interviewers specifically test for this) · Wrong rewiring order — list corrupts silently · Moving `prev` to `second` after the swap instead of `first`
>
> 🚀 **Follow-up:** Reverse Nodes in K-Group (LC #25) — this problem is the direct foundation for that harder variant. Master the 3-step rewiring here first.

⚠️ **Common Mistakes:**
- Not using a dummy node when head itself could be deleted or moved
- Advancing `prev` unconditionally — only move `prev` when no deletion or swap happened at `curr`
- Modifying node values instead of rewiring pointers — interviewers specifically test pointer manipulation

🔥 **Interview Tips:**
- Any problem where the head might change → use dummy node immediately, no hesitation
- For Swap Nodes in Pairs: write out the three pointer assignments on paper before coding — the order is strict
- The dummy node + prev/curr pattern is reused across 6+ linked list problems — internalize it as a single unit

---

### 5️⃣ Two Pointer Sync (Head Switching)

> **Core Idea:** When two lists have different lengths but you need their pointers to arrive at the same node simultaneously, redirect each pointer to the **other list's head** when it reaches null. After at most one switch each, both pointers will have traveled `len(A) + len(B)` total steps — guaranteeing they meet at the intersection (or both reach null if no intersection exists).

**Trigger keywords:** "find intersection", "two linked lists", "no extra space", "no length calculation", "pointer sync"

| Problem | Platform | Difficulty |
|---------|----------|------------|
| [Intersection of Two Linked Lists](https://leetcode.com/problems/intersection-of-two-linked-lists/) | LC #160 | 🟢 Easy |

**Key Template:**
```java
ListNode p1 = headA, p2 = headB;
while (p1 != p2) {
    p1 = (p1 == null) ? headB : p1.next;  // redirect to other list at end
    p2 = (p2 == null) ? headA : p2.next;
}
return p1;   // either the intersection node, or null (no intersection)
```

> 🧠 **Pattern Tip — Intersection of Two Linked Lists**
>
> Both pointers travel equal total distance (`len(A) + len(B)`) regardless of where the intersection is — so they must arrive at the same node simultaneously. No length calculation needed, no extra space, no multiple passes.
>
> ⚠️ Common Mistakes: Using a HashSet — wastes O(n) space · Wrong loop condition (`p1 != null && p2 != null` exits too early, use `p1 != p2`) · Comparing values instead of node references
>
> 🚀 The key insight — **equalize total traversal distance** — is deeply reusable. It appears in: cycle detection variations · linked list merging · pointer synchronization problems.

⚠️ **Common Mistakes:**
- Comparing `p1.val == p2.val` instead of `p1 == p2` — value equality is wrong; you need the same node object
- Loop condition `p1 != null && p2 != null` — exits before pointers can sync; always use `p1 != p2`
- Forgetting that if there's no intersection both pointers reach `null` simultaneously — the loop terminates correctly

🔥 **Interview Tips:**
- State the insight before coding: "Both pointers travel `len(A) + len(B)` total — they must meet at the intersection"
- This is O(m + n) time, O(1) space — optimal and elegant enough to impress interviewers
- Follow-up: "What if lists are circular?" → combine with cycle detection (Floyd's algorithm)

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
⬜ Fast & Slow II   — Find Cycle Start · Happy Number · Reorder List
⬜ Merge Advanced   — Merge K Sorted Lists · Sort List
⬜ Recursion        — Add Two Numbers · Flatten Multilevel List
⬜ In-place Mod     — Rotate List · Partition List
```

---

> 🚀 **Linked Lists = Pointer Manipulation. Draw before you code. Every bug is a lost pointer.**
>
> ⚡ **Master Reversal + Fast/Slow — they unlock 80% of all linked list problems.**

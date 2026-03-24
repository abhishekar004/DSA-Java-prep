# 🔤 Strings Mastery — DSA Placement Preparation

> 💡 **"Don't just solve problems — recognize patterns instantly."**

A **pattern-based DSA revision system** for fast recognition, deep understanding, and placement readiness.

---

## 📁 Folder Structure

```
strings/
├── README.md
├── ReverseString.java
├── ValidPalindrome.java
└── LengthOfLastWord.java
└── FindTheIndexOfFirstOccurance.java
└── LongestSubstringWithoutRepeatingCharacters.java
└── StringToInteger.java
└── ValidNumber.java
└── ValidParentheses.java
```

---

## 📊 Progress

**Problems Solved: 5 / 30+**

```
░░░░░░░░░░░░░░░░░░░░  ~10%
```

---

## 🎯 Goals

- ✅ Master **core string patterns**
- ✅ Solve **30+ string problems**
- ✅ Crack **product-based company** interviews

---

## 🧠 How to Use This README

| Mode | How to Use |
|------|------------|
| 📖 Learning Mode | Read the approach → solve the problems in that group |
| 🔁 Revision Mode | Scan pattern triggers + formulas only |
| ⚡ Interview Mode | Identify pattern within 30 seconds |

---

## 🧩 Problems by Pattern

---

### 1️⃣ Two Pointers on Strings
> **Approach:** Place one pointer at the start and one at the end. Swap or compare characters and move inward until the pointers meet. Works in-place — no extra space needed. For palindrome checks, skip invalid characters (non-alphanumeric) and compare lowercased characters at each step.

**Trigger:** "reverse string/array", "check palindrome", "in-place modification", "ignore spaces/special characters", "no extra space"

| Problem | Platform | Difficulty |
|---------|----------|------------|
| [Reverse String](https://leetcode.com/problems/reverse-string/) | LC #344 | 🟢 Easy |
| [Valid Palindrome](https://leetcode.com/problems/valid-palindrome/) | LC #125 | 🟢 Easy |

**Key Template:**
```java
// Reverse String
int left = 0, right = s.length - 1;
while (left < right) {
    char temp = s[left];
    s[left++] = s[right];
    s[right--] = temp;
}

// Valid Palindrome — skip non-alphanumeric
while (left < right) {
    while (left < right && !Character.isLetterOrDigit(s.charAt(left))) left++;
    while (left < right && !Character.isLetterOrDigit(s.charAt(right))) right--;
    if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right)))
        return false;
    left++; right--;
}
```

---

### 2️⃣ Traverse from End
> **Approach:** Instead of splitting the string (which creates extra space and handles edge cases poorly), start from the last character and work backwards. First skip any trailing spaces, then count characters until the next space or start of string. Clean, O(n), no splits needed.

**Trigger:** "last word", "last element", "ignore trailing spaces", "traverse from end"

| Problem | Platform | Difficulty |
|---------|----------|------------|
| [Length of Last Word](https://leetcode.com/problems/length-of-last-word/) | LC #58 | 🟢 Easy |

**Key Template:**
```java
int i = s.length() - 1, count = 0;
while (i >= 0 && s.charAt(i) == ' ') i--;   // skip trailing spaces
while (i >= 0 && s.charAt(i) != ' ') { count++; i--; }  // count last word
return count;
```

---

## ⚡ Pattern Recognition Cheat Sheet

| If you see… | Pattern |
|-------------|---------|
| Reverse string / array in-place | Two Pointers (swap from ends) |
| Check palindrome, ignore special chars | Two Pointers + skip invalid |
| Last word / trailing spaces | Traverse from end |

---

pattern tip for find the index of first occurance 

🧠 Pattern Tip

👉 When matching substring:

Only check indices where full pattern can fit
👉 i ≤ n - m is critical rule

⚙️ Approach (Short)
Loop till n - m
Match characters one by one
Return index if full match
🎯 Key Insight

👉 Bound your loop properly
👉 Avoid out-of-bounds errors

⚠️ Common Mistakes
❌ Loop till n instead of n - m
❌ Index overflow (i + j)
❌ Missing edge cases
🚀 Interview Tip

👉 This exact bug is very common
Fixing it = shows attention to detail

---

pattern tip for longest substring without repeating characters

🧠 Pattern Tip

👉 When you see:

“Longest substring”
“No repeating characters”

💡 Trigger:

Sliding Window (expand + shrink)

⚙️ Approach (Short)
Use two pointers (left, right)
Expand window
If duplicate → shrink until valid
Track max length
🎯 Key Insight

👉 Window must always be valid (no duplicates)
👉 Use while loop to fix window

⚠️ Common Mistakes
❌ Using if instead of while
❌ Not shrinking fully
❌ Wrong length calculation
🚀 Interview Tip

👉 This is top 10 most asked problem

Follow-up questions:

At most K distinct characters
Longest repeating replacement

---

pattern tip for string to integer

🧠 Pattern Tip

👉 When you see:

“Convert string to number”
“Ignore spaces / handle sign / overflow”

💡 Trigger:

Step-by-step parsing (Simulation)

⚙️ Approach (Short)
Skip spaces
Detect sign
Parse digits
Check overflow before updating
🎯 Key Insight

👉 Overflow check must happen before multiplication

⚠️ Common Mistakes
❌ Ignoring overflow
❌ Using long (not allowed in strict interviews)
❌ Not handling sign properly
❌ Not stopping at non-digit
🚀 Interview Tip

👉 This problem tests:

Attention to detail
Edge case handling
Clean implementation

👉 Writing this correctly = strong signal to interviewer

---

pattern tip for valid number

🧠 Pattern Tip

👉 When you see:

“Validate complex string format”
“Multiple rules / conditions”

💡 Trigger:

State tracking using flags (simulation)

⚙️ Approach (Short)
Traverse string once
Track:
digit
dot
exponent
Apply rules at each step
🎯 Key Insight

👉 Reset seenDigit after e
👉 Because digits must come after exponent

⚠️ Common Mistakes
❌ Allowing multiple dots
❌ Allowing e without digits
❌ Not resetting digit after e
❌ Incorrect sign placement
🚀 Interview Tip

👉 This problem tests:

Precision
Edge-case handling
Clean logic

👉 Writing this correctly = top 5% candidate

---

pattern tip for valid parentheses

🧠 Pattern Tip

👉 When you see:

“Matching pairs”
“Balanced brackets”
“Open/close relationship”

💡 Trigger:

Stack (LIFO)

⚙️ Approach (Short)
Push opening brackets
On closing → check stack top
If mismatch → false
End: stack must be empty
🎯 Key Insight

👉 Last opened = first closed
👉 That’s why stack works perfectly

⚠️ Common Mistakes
❌ Not checking empty stack
❌ Forgetting to pop
❌ Returning true without empty stack
🚀 Interview Tip

👉 Follow-up variations:

Remove minimum parentheses
Longest valid parentheses
Expression evaluation

---


## 🔁 Revision Strategy

| Level | What to Do |
|-------|------------|
| Level 1 — Learn | Read approach → solve all problems in that group |
| Level 2 — Revise | Read only triggers + key templates |
| Level 3 — Interview | Cheat sheet only, identify pattern in < 30 sec |

---

> ⚡ **"Identify the pattern in 30 seconds. Solve in 5 minutes."**
>
> 🚀 This README is your placement weapon.

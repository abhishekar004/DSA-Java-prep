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
├── LengthOfLastWord.java
├── FindTheIndexOfFirstOccurance.java
├── LongestSubstringWithoutRepeatingCharacters.java
├── StringToInteger.java
├── ValidNumber.java
├── ValidParentheses.java
├── ReverseWordsInAString.java
└── ReverseVowelsOfAString.java
└── MinimumWindowSubString.java
└── LongestPalindromicSubstring.java
```

---

## 📊 Progress

**Problems Solved: 10 / 30+**

```
████░░░░░░░░░░░░░░░░  ~33%
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
> **Approach:** Place one pointer at the start, one at the end. Swap or compare and move inward until they meet. Works in-place — no extra space needed. For palindrome checks, skip non-alphanumeric characters and compare lowercased chars. For vowel reversal, skip non-vowels and only swap valid targets.

**Trigger:** "reverse in-place", "check palindrome", "ignore special chars", "swap only specific elements", "no extra space"

| Problem | Platform | Difficulty |
|---------|----------|------------|
| [Reverse String](https://leetcode.com/problems/reverse-string/) | LC #344 | 🟢 Easy |
| [Valid Palindrome](https://leetcode.com/problems/valid-palindrome/) | LC #125 | 🟢 Easy |
| [Reverse Vowels of a String](https://leetcode.com/problems/reverse-vowels-of-a-string/) | LC #345 | 🟢 Easy |

**Key Template:**
```java
// Reverse String — plain swap
int left = 0, right = s.length - 1;
while (left < right) {
    char temp = s[left];
    s[left++] = s[right];
    s[right--] = temp;
}

// Valid Palindrome — skip non-alphanumeric, compare lowercased
while (left < right) {
    while (left < right && !Character.isLetterOrDigit(s.charAt(left))) left++;
    while (left < right && !Character.isLetterOrDigit(s.charAt(right))) right--;
    if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right)))
        return false;
    left++; right--;
}

// Reverse Vowels — skip non-vowels, swap valid targets only
Set<Character> vowels = Set.of('a','e','i','o','u','A','E','I','O','U');
while (left < right) {
    while (left < right && !vowels.contains(arr[left])) left++;
    while (left < right && !vowels.contains(arr[right])) right--;
    char temp = arr[left]; arr[left++] = arr[right]; arr[right--] = temp;
}
```

⚠️ **Common Mistakes:**
- Not handling uppercase vowels in Reverse Vowels
- Returning `true` without fully traversing in Valid Palindrome

---

### 2️⃣ Traverse from End
> **Approach:** Instead of splitting the string (extra space, poor edge-case handling), start from the last character and work backwards. Skip trailing spaces first, then count until hitting a space or the start. Same idea for reversing words — extract words from end and build result manually. Avoids `split()` issues with multiple spaces.

**Trigger:** "last word", "ignore trailing spaces", "reverse words", "remove extra spaces", "no split"

| Problem | Platform | Difficulty |
|---------|----------|------------|
| [Length of Last Word](https://leetcode.com/problems/length-of-last-word/) | LC #58 | 🟢 Easy |
| [Reverse Words in a String](https://leetcode.com/problems/reverse-words-in-a-string/) | LC #151 | 🟠 Medium |

**Key Template:**
```java
// Length of Last Word
int i = s.length() - 1, count = 0;
while (i >= 0 && s.charAt(i) == ' ') i--;              // skip trailing spaces
while (i >= 0 && s.charAt(i) != ' ') { count++; i--; } // count word
return count;

// Reverse Words — extract word by word from end
StringBuilder sb = new StringBuilder();
int i = s.length() - 1;
while (i >= 0) {
    while (i >= 0 && s.charAt(i) == ' ') i--;          // skip spaces
    int j = i;
    while (j >= 0 && s.charAt(j) != ' ') j--;          // find word start
    if (sb.length() > 0) sb.append(' ');
    sb.append(s, j + 1, i + 1);
    i = j;
}
```

⚠️ **Common Mistakes:**
- Using `split()` blindly — produces empty strings with multiple spaces
- Extra spaces leaking into output

🔥 **Follow-up:** "Can you do it in-place?" → Reverse entire string first, then reverse each word individually.

---

### 3️⃣ Sliding Window
> **Approach:** Use two pointers (`left`, `right`) to maintain a valid window. Expand `right` to grow, shrink from `left` when the window becomes invalid (e.g., duplicate found). Track the maximum valid window size. Always use a `while` loop to shrink — the window must be fully valid before moving on.

**Trigger:** "longest substring", "no repeating characters", "at most K distinct", "contiguous window"

| Problem | Platform | Difficulty |
|---------|----------|------------|
| [Longest Substring Without Repeating Characters](https://leetcode.com/problems/longest-substring-without-repeating-characters/) | LC #3 | 🟠 Medium |

**Key Template:**
```java
Map<Character, Integer> map = new HashMap<>();
int left = 0, maxLen = 0;
for (int right = 0; right < s.length(); right++) {
    map.put(s.charAt(right), map.getOrDefault(s.charAt(right), 0) + 1);
    while (map.get(s.charAt(right)) > 1) {             // window invalid — shrink
        map.put(s.charAt(left), map.get(s.charAt(left)) - 1);
        left++;
    }
    maxLen = Math.max(maxLen, right - left + 1);
}
return maxLen;
```

⚠️ **Common Mistakes:**
- Using `if` instead of `while` to shrink — window may still be invalid
- Wrong length: `right - left` instead of `right - left + 1`

🔥 **Follow-ups:** At most K distinct characters · Longest repeating character replacement

---

### 4️⃣ String Matching
> **Approach:** Slide the needle across the haystack. Critical rule: only check starting indices where the full pattern still fits — loop `i <= n - m`. At each index, match characters one by one with an inner loop. Return index on full match. This is the foundation of KMP and Rabin-Karp.

**Trigger:** "find first occurrence", "index of substring", "pattern in string"

| Problem | Platform | Difficulty |
|---------|----------|------------|
| [Find the Index of the First Occurrence](https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/) | LC #28 | 🟢 Easy |

**Key Template:**
```java
int n = haystack.length(), m = needle.length();
for (int i = 0; i <= n - m; i++) {       // critical: n - m not n
    int j = 0;
    while (j < m && haystack.charAt(i + j) == needle.charAt(j)) j++;
    if (j == m) return i;
}
return -1;
```

⚠️ **Common Mistakes:**
- Looping till `n` instead of `n - m` → `i + j` causes index overflow
- Missing edge case: empty needle

🔥 **Interview Tip:** This exact bound bug is extremely common in interviews — fixing it correctly signals attention to detail.

---

### 5️⃣ Simulation / Parsing
> **Approach:** Parse the string step by step following explicit rules. For `atoi`: skip spaces → detect sign → parse digits → check overflow **before** updating result. For `Valid Number`: traverse once with boolean flags (`seenDigit`, `seenDot`, `seenE`), applying rules per character. Key insight: reset `seenDigit = false` after `e` — digits must appear after the exponent symbol too.

**Trigger:** "convert string to number", "validate format", "handle sign / spaces / overflow", "multiple validation rules"

| Problem | Platform | Difficulty |
|---------|----------|------------|
| [String to Integer (atoi)](https://leetcode.com/problems/string-to-integer-atoi/) | LC #8 | 🟠 Medium |
| [Valid Number](https://leetcode.com/problems/valid-number/) | LC #65 | 🔴 Hard |

**Key Template:**
```java
// String to Integer (atoi)
int i = 0, sign = 1, result = 0;
while (i < s.length() && s.charAt(i) == ' ') i++;
if (i < s.length() && (s.charAt(i) == '+' || s.charAt(i) == '-'))
    sign = (s.charAt(i++) == '-') ? -1 : 1;
while (i < s.length() && Character.isDigit(s.charAt(i))) {
    int digit = s.charAt(i++) - '0';
    if (result > (Integer.MAX_VALUE - digit) / 10)   // overflow check BEFORE update
        return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
    result = result * 10 + digit;
}
return sign * result;

// Valid Number — flag-based state tracking
boolean seenDigit = false, seenDot = false, seenE = false;
for (int i = 0; i < s.length(); i++) {
    char c = s.charAt(i);
    if (Character.isDigit(c))           { seenDigit = true; }
    else if (c == '.')                  { if (seenDot || seenE) return false; seenDot = true; }
    else if (c == 'e' || c == 'E')      { if (seenE || !seenDigit) return false; seenE = true; seenDigit = false; }
    else if (c == '+' || c == '-')      { if (i != 0 && s.charAt(i-1) != 'e' && s.charAt(i-1) != 'E') return false; }
    else return false;
}
return seenDigit;
```

⚠️ **Common Mistakes:**
- Overflow check must happen **before** `result = result * 10 + digit`
- Forgetting to reset `seenDigit` after `e` in Valid Number
- Allowing sign characters in the middle of the number

---

### 6️⃣ Stack
> **Approach:** Use a stack (LIFO) for matching pairs. Push every opening bracket. On a closing bracket, check if the stack top is the matching opener — if not or stack is empty, return false. At the end, the stack must be empty (every opener was closed).

**Trigger:** "matching pairs", "balanced brackets", "open/close relationship", "nested structure"

| Problem | Platform | Difficulty |
|---------|----------|------------|
| [Valid Parentheses](https://leetcode.com/problems/valid-parentheses/) | LC #20 | 🟢 Easy |

**Key Template:**
```java
Deque<Character> stack = new ArrayDeque<>();
for (char c : s.toCharArray()) {
    if (c == '(' || c == '{' || c == '[') stack.push(c);
    else {
        if (stack.isEmpty()) return false;
        char top = stack.pop();
        if ((c == ')' && top != '(') ||
            (c == '}' && top != '{') ||
            (c == ']' && top != '[')) return false;
    }
}
return stack.isEmpty();   // all openers must be closed
```

⚠️ **Common Mistakes:**
- Not checking `isEmpty()` before popping
- Returning `true` without verifying stack is empty at the end

🔥 **Follow-ups:** Remove minimum invalid parentheses · Longest valid parentheses · Expression evaluation

---

pattern tip for minimum window substring

🧠 Pattern Tip

👉 When you see:

“Smallest / shortest substring”
“Contains all characters”
“Frequency/count matters”

💡 Trigger:

Sliding Window + Frequency Map

⚙️ Approach (Short)
Store required frequencies of t
Expand window with right
When all required chars are matched:
shrink from left
update minimum window
🎯 Key Insight

👉 Window becomes valid only when:

formed == required

That is the core condition.

⚠️ Common Mistakes
❌ Using set instead of frequency map
❌ Not handling repeated chars in t
❌ Shrinking too early
❌ Forgetting to update min window before shrinking
🚀 Interview Tip

👉 This is one of the most important hard sliding window problems

If you master this, you can solve:

Permutation in String
Find All Anagrams
Smallest Distinct Window
Longest Repeating Character Replacement


---
pattern tip for longest palindromic substring

🧠 Pattern Tip

👉 When you see:

“Longest palindrome substring”
“Check palindrome around index”

💡 Trigger:

Expand Around Center

⚙️ Approach (Short)
For each character:
expand for odd palindrome
expand for even palindrome
Keep track of longest substring
🎯 Key Insight

👉 Every palindrome has a center

one center → odd length
two centers → even length

That’s the entire trick.

⚠️ Common Mistakes
❌ Checking only odd palindromes
❌ Using brute force O(n³)
❌ Wrong start/end calculation
🚀 Interview Tip

👉 If interviewer asks:

“Can you optimize beyond O(n²)?”

That leads to:

Manacher’s Algorithm (O(n)) 🔥

👉 But 95% of interviews accept this solution.

---

## ⚡ Pattern Recognition Cheat Sheet

| If you see… | Pattern |
|-------------|---------|
| Reverse string / array in-place | Two Pointers (swap from ends) |
| Check palindrome, ignore special chars | Two Pointers + skip invalid |
| Reverse only specific elements | Two Pointers + skip unwanted |
| Last word / trailing spaces / reverse words | Traverse from End |
| Longest substring, no repeating / K distinct | Sliding Window |
| Find first occurrence of pattern | String Matching (`i <= n - m`) |
| Convert string to number, handle overflow | Simulation / Parsing |
| Validate complex string format | State Tracking (boolean flags) |
| Matching brackets / balanced pairs | Stack (LIFO) |

---

## 🏢 Company Pattern Mapping

| Company | String Patterns Frequently Asked |
|---------|----------------------------------|
| Amazon | Sliding Window, HashMap, Stack |
| Google | String Matching, Simulation, Sliding Window |
| Microsoft | Two Pointers, Stack, Parsing |
| Meta | Two Pointers, Sliding Window |
| Adobe | Parsing, Stack, Simulation |

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

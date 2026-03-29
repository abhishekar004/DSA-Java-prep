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
├── ReverseVowelsOfAString.java
├── MinimumWindowSubString.java
├── LongestPalindromicSubstring.java
└── SuperReducedString.java
└── GroupAnagrams.java
└── PermutationsInString.java
└── FindAllAnagramsInAString.java
└── RegularExpression.java
└── SubstringWithConcatenationOfAllWords.java

```

---

## 📊 Progress

**Problems Solved: 13 / 30+**

```
████████░░░░░░░░░░░░  ~43%
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
| 🔁 Revision Mode | Scan pattern triggers + key templates only |
| ⚡ Interview Mode | Cheat sheet only, identify pattern in < 30 sec |

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
while (i >= 0 && s.charAt(i) == ' ') i--;               // skip trailing spaces
while (i >= 0 && s.charAt(i) != ' ') { count++; i--; }  // count word
return count;

// Reverse Words — extract word by word from end
StringBuilder sb = new StringBuilder();
int i = s.length() - 1;
while (i >= 0) {
    while (i >= 0 && s.charAt(i) == ' ') i--;           // skip spaces
    int j = i;
    while (j >= 0 && s.charAt(j) != ' ') j--;           // find word start
    if (sb.length() > 0) sb.append(' ');
    sb.append(s, j + 1, i + 1);
    i = j;
}
```

⚠️ **Common Mistakes:**
- Using `split()` blindly — produces empty strings on multiple spaces
- Extra spaces leaking into output

🔥 **Follow-up:** "Can you do it in-place?" → Reverse entire string, then reverse each word individually.

---

### 3️⃣ Sliding Window
> **Approach:** Use two pointers (`left`, `right`) to maintain a valid window. Expand `right` to grow, shrink from `left` when the window becomes invalid. Always use `while` (not `if`) to shrink — window must be fully valid before moving on. For Minimum Window Substring, the window is valid only when `formed == required`. Update the minimum window **before** shrinking, not after.

**Trigger:** "longest/shortest substring", "no repeating characters", "contains all characters of t", "at most K distinct", "frequency/count matters"

| Problem | Platform | Difficulty |
|---------|----------|------------|
| [Longest Substring Without Repeating Characters](https://leetcode.com/problems/longest-substring-without-repeating-characters/) | LC #3 | 🟠 Medium |
| [Minimum Window Substring](https://leetcode.com/problems/minimum-window-substring/) | LC #76 | 🔴 Hard |

**Key Template:**
```java
// Longest Substring Without Repeating Characters
Map<Character, Integer> map = new HashMap<>();
int left = 0, maxLen = 0;
for (int right = 0; right < s.length(); right++) {
    map.merge(s.charAt(right), 1, Integer::sum);
    while (map.get(s.charAt(right)) > 1) {              // window invalid — shrink
        map.merge(s.charAt(left), -1, Integer::sum);
        left++;
    }
    maxLen = Math.max(maxLen, right - left + 1);
}
return maxLen;

// Minimum Window Substring
Map<Character, Integer> need = new HashMap<>();
for (char c : t.toCharArray()) need.merge(c, 1, Integer::sum);
int required = need.size(), formed = 0, left = 0;
int minLen = Integer.MAX_VALUE, minStart = 0;
Map<Character, Integer> window = new HashMap<>();
for (int right = 0; right < s.length(); right++) {
    char c = s.charAt(right);
    window.merge(c, 1, Integer::sum);
    if (need.containsKey(c) && window.get(c).equals(need.get(c))) formed++;
    while (formed == required) {                         // valid — try to shrink
        if (right - left + 1 < minLen) { minLen = right - left + 1; minStart = left; }
        char lc = s.charAt(left++);
        window.merge(lc, -1, Integer::sum);
        if (need.containsKey(lc) && window.get(lc) < need.get(lc)) formed--;
    }
}
return minLen == Integer.MAX_VALUE ? "" : s.substring(minStart, minStart + minLen);
```

⚠️ **Common Mistakes:**
- Using `if` instead of `while` to shrink
- Using a Set instead of frequency map (misses repeated chars in `t`)
- Updating min window **after** shrinking — you'll miss the valid state
- Wrong length formula: must be `right - left + 1`

🔥 **Follow-ups:** Permutation in String · Find All Anagrams · Longest Repeating Character Replacement

---

### 4️⃣ String Matching (Bounded Loop)
> **Approach:** Slide the needle across the haystack. Critical rule: only check starting indices where the full pattern can still fit — loop bound is `i <= n - m`. At each index, match characters one by one. Return on full match. This is the foundation pattern behind KMP and Rabin-Karp.

**Trigger:** "find first occurrence", "index of substring", "pattern in string"

| Problem | Platform | Difficulty |
|---------|----------|------------|
| [Find the Index of First Occurrence](https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/) | LC #28 | 🟢 Easy |

**Key Template:**
```java
int n = haystack.length(), m = needle.length();
for (int i = 0; i <= n - m; i++) {       // critical: n - m, not n
    int j = 0;
    while (j < m && haystack.charAt(i + j) == needle.charAt(j)) j++;
    if (j == m) return i;
}
return -1;
```

⚠️ **Common Mistakes:**
- Looping till `n` instead of `n - m` → `i + j` causes index overflow
- Missing edge case: needle longer than haystack

🔥 **Interview Tip:** This exact bound bug is extremely common — fixing it signals strong attention to detail.

---

### 5️⃣ Expand Around Center
> **Approach:** Every palindrome has a center. For each index, expand outward in both directions while characters match. Handle two cases separately: odd-length palindrome (single center `i, i`) and even-length palindrome (two-char center `i, i+1`). Track the longest palindrome seen. O(n²) — accepted in 95% of interviews.

**Trigger:** "longest palindrome substring", "palindrome centered at index", "expand from center"

| Problem | Platform | Difficulty |
|---------|----------|------------|
| [Longest Palindromic Substring](https://leetcode.com/problems/longest-palindromic-substring/) | LC #5 | 🟠 Medium |

**Key Template:**
```java
String result = "";
for (int i = 0; i < s.length(); i++) {
    String odd  = expand(s, i, i);       // odd-length palindrome
    String even = expand(s, i, i + 1);   // even-length palindrome
    if (odd.length()  > result.length()) result = odd;
    if (even.length() > result.length()) result = even;
}
return result;

private String expand(String s, int left, int right) {
    while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
        left--; right++;
    }
    return s.substring(left + 1, right);  // left+1, right — one step too far on both sides
}
```

⚠️ **Common Mistakes:**
- Checking only odd-length palindromes — misses all even-length ones
- Wrong substring bounds after loop: use `left + 1` to `right` (not `right + 1`)
- Using brute force O(n³)

🔥 **Follow-up:** "Can you do it in O(n)?" → Manacher's Algorithm.

---

### 6️⃣ Simulation / Parsing
> **Approach:** Parse the string step by step with explicit rules. For `atoi`: skip spaces → detect sign → parse digits → check overflow **before** updating result. For `Valid Number`: traverse once with boolean flags, applying rules per character. Key insight: reset `seenDigit = false` after `e` — digits must also appear after the exponent.

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
    if      (Character.isDigit(c))      { seenDigit = true; }
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
- Allowing sign characters in the middle of the string

---

### 7️⃣ Stack
> **Approach:** Use a stack (LIFO) when characters must be matched in pairs or when removing adjacent elements can trigger chain reactions. For matching brackets: push openers, pop and verify on closers, stack must be empty at end. For adjacent duplicate removal: push characters one by one — if the top matches current, pop instead. Chain reactions are handled automatically since each removal may expose a new matching pair.

**Trigger:** "matching pairs", "balanced brackets", "remove adjacent duplicates", "reduce until stable", "chain removal"

| Problem | Platform | Difficulty |
|---------|----------|------------|
| [Valid Parentheses](https://leetcode.com/problems/valid-parentheses/) | LC #20 | 🟢 Easy |
| [Super Reduced String](https://www.hackerrank.com/challenges/reduced-string/problem) | HR | 🟢 Easy |

**Key Template:**
```java
// Valid Parentheses
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
return stack.isEmpty();    // all openers must be closed

// Super Reduced String — push/pop adjacent duplicates
StringBuilder stack = new StringBuilder();
for (char c : s.toCharArray()) {
    if (stack.length() > 0 && stack.charAt(stack.length() - 1) == c)
        stack.deleteCharAt(stack.length() - 1);   // duplicate — pop
    else
        stack.append(c);                           // no duplicate — push
}
return stack.length() == 0 ? "Empty String" : stack.toString();
```

⚠️ **Common Mistakes:**
- Valid Parentheses: not checking `isEmpty()` before popping; returning `true` without verifying stack is empty
- Super Reduced String: using nested loops O(n²); not handling chain reactions; forgetting `"Empty String"` return

🔥 **Follow-ups:** Remove minimum invalid parentheses · Longest valid parentheses · Remove all adjacent duplicates II (k duplicates)

---
pattern tip for Group anagrams

🧠 Pattern Tip

👉 When you see:

“Group similar strings”
“Same letters, different order”

💡 Trigger:

Hashing + normalized key

⚙️ Approach (README-ready)
For each string:
count frequency of letters
build a unique signature
Store strings with same signature in same hash map bucket
Return grouped values
🎯 Key Insight

👉 Anagrams have the same character frequency

So instead of sorting:

use frequency signature as hash key

⚠️ Common Mistakes
❌ Sorting each word without realizing optimization exists
❌ Using mutable arrays directly as map keys
❌ Forgetting repeated letters
🚀 Interview Tip

This problem teaches one very important rule:

If order doesn’t matter, think frequency map / signature

That trick appears in:

Anagrams
Sliding window character matching
String comparison problems

---
pattern tip for permutations in string 

🧠 Pattern Tip

👉 When you see:

“Check if substring is permutation/anagram”
“Window size fixed”

💡 Trigger:

Fixed-size Sliding Window + Frequency Array

⚙️ Approach (README-ready)
Count frequency of s1
Create first window of same size in s2
Slide the window:
add new character
remove old character
If counts match → permutation exists
🎯 Key Insight

👉 A permutation means:

same character frequencies

Not same order.

⚠️ Common Mistakes
❌ Sorting every window → too slow
❌ Forgetting to remove left char
❌ Rechecking full map inefficiently
🚀 Interview Tip

This is one of the most important bridges between:

Group Anagrams
Find All Anagrams in a String
Minimum Window Substring

👉 Master this, and many string problems become easier.

---
pattern tip for find all anagrams in a string

🧠 Pattern Tip

👉 When you see:

“Find all substrings matching pattern”
“Permutation / anagram inside string”

💡 Trigger:

Fixed-size Sliding Window + Frequency Count

⚙️ Approach (README-ready)
Build frequency count of pattern p
Create a window of same size in s
Slide the window one character at a time:
add new char
remove old char
If frequencies match → store index
🎯 Key Insight

👉 Anagram means:

same character counts

Not same order.

⚠️ Common Mistakes
❌ Sorting every substring
❌ Rebuilding frequency array for each window
❌ Forgetting final window check
❌ Off-by-one errors in sliding
🚀 Interview Tip

This is part of one important interview family:

Permutation in String
Find All Anagrams
Minimum Window Substring

👉 If you master one, you should immediately recognize the others.

That’s exactly what you’re doing now.

---
pattern tip for regular expression

🧠 Pattern Tip

👉 When you see:

Pattern matching with rules (*, ., etc.)
Choices (take / skip / repeat)

💡 Trigger:

DP with states (i, j)

⚙️ Approach (README-ready)
Define state:
dp[i][j] = s[i:] matches p[j:]
If next char is *:
skip pattern → solve(i, j+2)
use pattern → solve(i+1, j)
Else:
match current char and move forward
🎯 Key Insight

👉 * gives two choices:

ignore it
use it repeatedly

That’s the entire trick.

⚠️ Common Mistakes
❌ Not handling * properly
❌ Forgetting zero occurrence case
❌ Missing memoization → exponential time
❌ Confusing full match vs partial match
🚀 Interview Tip

This problem tests:

Recursion thinking
State definition
DP optimization

👉 If you solve this cleanly:

You’re in top 5–10% candidates

---
pattern tip for substring with concatenation of all words

🧠 Pattern Tip

👉 When you see:

“Concatenation of words”
“All words same length”
“Need exact frequency matching”

💡 Trigger:

Sliding Window with chunked movement

⚙️ Approach (README-ready)
Build frequency map of words
Since all words have same length, process string in chunks
Try each possible starting offset
Maintain sliding window of words
If window matches required frequencies → store index
🎯 Key Insight

👉 Don’t move one character at a time
👉 Move wordLen characters at a time

That is the core trick.

⚠️ Common Mistakes
❌ Brute force checking every substring
❌ Ignoring duplicate words
❌ Not handling multiple offsets
❌ Reset logic mistakes after invalid word
🚀 Interview Tip

This problem is important because it teaches:

Sometimes sliding window does not move by 1
it moves by logical chunk size

That’s a very powerful advanced insight.

---

## ⚡ Pattern Recognition Cheat Sheet

| If you see… | Pattern |
|-------------|---------|
| Reverse string / array in-place | Two Pointers (swap from ends) |
| Check palindrome, ignore special chars | Two Pointers + skip invalid |
| Reverse only specific elements (vowels) | Two Pointers + skip unwanted |
| Last word / trailing spaces / reverse words | Traverse from End |
| Longest substring, no repeating / K distinct | Sliding Window |
| Smallest window containing all chars of t | Sliding Window + Frequency Map |
| Find first occurrence of pattern | String Matching (`i <= n - m`) |
| Longest palindrome substring | Expand Around Center |
| Convert string to number, handle overflow | Simulation / Parsing |
| Validate complex string format | State Tracking (boolean flags) |
| Matching brackets / balanced pairs | Stack (LIFO) |
| Remove adjacent duplicates, chain reactions | Stack (push-pop) |

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

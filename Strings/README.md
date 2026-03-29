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
├── SuperReducedString.java
├── GroupAnagrams.java
├── PermutationsInString.java
├── FindAllAnagramsInAString.java
├── RegularExpression.java
└── SubstringWithConcatenationOfAllWords.java
```

---

## 📊 Progress

**Problems Solved: 18 / 30+**

```
████████████░░░░░░░░  ~60%
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
- Not handling uppercase vowels in Reverse Vowels — `Set.of(...)` must include both cases
- Returning `true` without fully traversing in Valid Palindrome
- In Reverse String, creating a new array instead of modifying in-place — violates the constraint

🔥 **Interview Tips:**
- Valid Palindrome is usually a warm-up — expect follow-up: "Valid Palindrome II" (allow at most one deletion)
- For Reverse Vowels: "Can you do it without a Set?" → check `"aeiouAEIOU".indexOf(c) >= 0`
- Two Pointers signal: anytime you need to compare or swap from both ends simultaneously

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
- Not appending a space separator between words when building result

🔥 **Interview Tips:**
- When you use `split("\\s+")`, mention it handles multiple spaces — but still uses O(n) extra space
- Traversing from end is cleaner than left-to-right when dealing with trailing/leading whitespace
- Follow-up: "Can you do it in-place?" → Reverse entire string, then reverse each word individually

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
- Using `if` instead of `while` to shrink — window may still be invalid after one shrink
- Using a Set instead of frequency map — misses repeated chars in `t`
- Updating min window **after** shrinking — you'll miss the valid state
- Wrong length formula: must be `right - left + 1`

🔥 **Interview Tips:**
- Longest Substring is a top-10 most asked problem — be ready to code it from memory in under 3 minutes
- For Minimum Window: walk through the `formed == required` condition out loud — interviewers love this
- Follow-up: "What if only lowercase letters?" → replace HashMap with `int[26]` for better constants

🔥 **Follow-ups:** Permutation in String · Find All Anagrams · Longest Repeating Character Replacement

---

### 4️⃣ Fixed-Size Sliding Window + Frequency Map
> **Approach:** When the window size is fixed (equal to the pattern length), slide it one character at a time — add the new right character and remove the old left character. Compare frequency arrays instead of sorting. Use an `int[26]` for lowercase-only problems (O(1) comparison via `Arrays.equals`). For Substring with Concatenation, all words have equal length, so move the window by `wordLen` chunks instead of one character at a time, and try all `wordLen` starting offsets.

**Trigger:** "permutation of pattern in string", "all anagrams", "fixed window size", "concatenation of all words", "word-chunk sliding"

| Problem | Platform | Difficulty |
|---------|----------|------------|
| [Permutation in String](https://leetcode.com/problems/permutation-in-string/) | LC #567 | 🟠 Medium |
| [Find All Anagrams in a String](https://leetcode.com/problems/find-all-anagrams-in-a-string/) | LC #438 | 🟠 Medium |
| [Substring with Concatenation of All Words](https://leetcode.com/problems/substring-with-concatenation-of-all-words/) | LC #30 | 🔴 Hard |

**Key Template:**
```java
// Permutation in String / Find All Anagrams — int[26] frequency window
int[] pCount = new int[26], wCount = new int[26];
for (char c : p.toCharArray()) pCount[c - 'a']++;
for (int i = 0; i < s.length(); i++) {
    wCount[s.charAt(i) - 'a']++;                        // add right char
    if (i >= p.length())
        wCount[s.charAt(i - p.length()) - 'a']--;       // remove left char
    if (Arrays.equals(pCount, wCount))
        result.add(i - p.length() + 1);                 // anagram found
}

// Substring with Concatenation of All Words — chunked window
int wordLen = words[0].length(), totalLen = wordLen * words.length;
Map<String, Integer> need = new HashMap<>();
for (String w : words) need.merge(w, 1, Integer::sum);
for (int offset = 0; offset < wordLen; offset++) {      // try each starting offset
    Map<String, Integer> window = new HashMap<>();
    int left = offset, count = 0;
    for (int right = offset; right + wordLen <= s.length(); right += wordLen) {
        String word = s.substring(right, right + wordLen);
        if (need.containsKey(word)) {
            window.merge(word, 1, Integer::sum);
            count++;
            while (window.get(word) > need.get(word)) { // shrink from left
                String lw = s.substring(left, left + wordLen);
                window.merge(lw, -1, Integer::sum);
                count--; left += wordLen;
            }
            if (count == words.length) result.add(left);
        } else { window.clear(); count = 0; left = right + wordLen; }
    }
}
```

⚠️ **Common Mistakes:**
- Sorting every window — O(n × m log m) instead of O(n) with frequency array
- Forgetting to remove the left character when the window slides
- For Concatenation: moving by 1 character instead of `wordLen` — misses valid alignments
- For Concatenation: not trying all `wordLen` starting offsets — misses results
- Ignoring duplicate words in the word list

🔥 **Interview Tips:**
- `Arrays.equals(int[], int[])` is O(26) = O(1) for lowercase strings — state this explicitly
- Permutation in String and Find All Anagrams are essentially the same problem — one returns bool, other returns indices
- For Concatenation, the key insight is: "all words are the same length, so I can treat each chunk as a unit and slide by `wordLen`" — say this before coding
- Follow-up bridge: Permutation in String → Find All Anagrams → Minimum Window Substring (each one relaxes a constraint)

---

### 5️⃣ HashMap Grouping (Signature Key)
> **Approach:** When strings with the same characters in different order need to be grouped, build a unique signature for each string and use it as a HashMap key. Two approaches: sort the string (O(m log m) per string) or build a frequency count signature (O(m) per string, e.g., `"#2#0#1..."` for character counts). Strings with the same signature are anagrams — group them in the same bucket.

**Trigger:** "group similar strings", "same letters different order", "anagram grouping", "normalize and bucket"

| Problem | Platform | Difficulty |
|---------|----------|------------|
| [Group Anagrams](https://leetcode.com/problems/group-anagrams/) | LC #49 | 🟠 Medium |

**Key Template:**
```java
// Approach 1: Sort as key — O(n × m log m)
Map<String, List<String>> map = new HashMap<>();
for (String s : strs) {
    char[] arr = s.toCharArray();
    Arrays.sort(arr);
    String key = new String(arr);
    map.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
}
return new ArrayList<>(map.values());

// Approach 2: Frequency signature as key — O(n × m), avoids sorting
Map<String, List<String>> map = new HashMap<>();
for (String s : strs) {
    int[] count = new int[26];
    for (char c : s.toCharArray()) count[c - 'a']++;
    StringBuilder key = new StringBuilder();
    for (int i = 0; i < 26; i++) key.append('#').append(count[i]);  // "#2#0#1..."
    map.computeIfAbsent(key.toString(), k -> new ArrayList<>()).add(s);
}
return new ArrayList<>(map.values());
```

⚠️ **Common Mistakes:**
- Using `int[]` directly as a map key — arrays use reference equality, not value equality; convert to String
- Sorting without realizing frequency signature is faster
- Forgetting repeated letters when building the signature
- Using `map.put(key, new ArrayList<>())` instead of `computeIfAbsent` — overwrites existing groups

🔥 **Interview Tips:**
- Always offer both approaches and explain the trade-off: "Sorted key is simpler; frequency key is O(m) vs O(m log m)"
- The frequency signature trick generalizes beyond anagrams: "If order doesn't matter, think frequency map or signature"
- Follow-up: "What if strings can have uppercase or digits?" → extend the signature to 62 characters or use a HashMap for counts
- This pattern appears in: anagram grouping, character matching, sliding window comparisons

---

### 6️⃣ String Matching (Bounded Loop)
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

🔥 **Interview Tips:**
- This exact bound bug is extremely common — fixing it signals strong attention to detail
- Always clarify: "Can the needle be empty?" → LeetCode returns 0 for empty needle
- Follow-up: "Can you do it in O(n)?" → KMP algorithm. Knowing it exists and naming it is enough in most interviews

---

### 7️⃣ Expand Around Center
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
- Checking only odd-length palindromes — misses all even-length ones like "abba"
- Wrong substring bounds after loop: use `left + 1` to `right` (not `right + 1`)
- Using brute force O(n³) — checking all substrings and validating each separately

🔥 **Interview Tips:**
- Always handle both odd and even centers — forgetting the even case costs you the problem
- State complexity clearly: "O(n²) time, O(1) space for expand; O(n) is possible with Manacher's"
- Follow-up: "Count all palindromic substrings" → same expand logic, just count instead of tracking max
- Follow-up: "O(n) solution?" → Manacher's Algorithm — naming it is usually enough

---

### 8️⃣ Simulation / Parsing
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

🔥 **Interview Tips:**
- atoi tests attention to detail — walk through each step out loud: "skip spaces → detect sign → parse digits → check overflow before each update"
- Valid Number is Hard because of edge cases, not algorithm — list them first: `"."`, `"1."`, `".1"`, `"1e2"`, `"1e+2"`, `"+.8"`
- Interviewers often use atoi as a warm-up to test if you think about overflow before being asked

---

### 9️⃣ Stack
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

🔥 **Interview Tips:**
- Valid Parentheses is one of the most common entry-level questions — solve it in under 2 minutes
- The `stack.isEmpty()` check at the end is the line most candidates forget under pressure — always state it
- For Super Reduced String: explain why stack handles chains: "removing 'aa' can expose new adjacents — the stack top always holds the last unpaired character, so it naturally catches this"
- Follow-ups: Remove minimum invalid parentheses · Longest valid parentheses · Expression evaluation · Remove all adjacent duplicates II

---

### 🔟 Dynamic Programming on Strings
> **Approach:** When a string problem involves choices at each character (match, skip, or repeat), define a 2D DP state `dp[i][j]` representing whether `s[i:]` matches `p[j:]`. For regex `*`: it gives two choices — skip the pattern pair (`dp[i][j+2]`) or use it to match current char and stay (`dp[i+1][j]`). Use memoization to avoid redundant subproblem recomputation.

**Trigger:** "pattern matching with rules", "* or . wildcards", "choices at each step (take/skip/repeat)", "full string match"

| Problem | Platform | Difficulty |
|---------|----------|------------|
| [Regular Expression Matching](https://leetcode.com/problems/regular-expression-matching/) | LC #10 | 🔴 Hard |

**Key Template:**
```java
// Top-down DP with memoization
Map<String, Boolean> memo = new HashMap<>();

private boolean dp(String s, String p, int i, int j) {
    String key = i + "," + j;
    if (memo.containsKey(key)) return memo.get(key);
    if (j == p.length()) return i == s.length();

    boolean firstMatch = i < s.length() &&
        (p.charAt(j) == s.charAt(i) || p.charAt(j) == '.');

    boolean result;
    if (j + 1 < p.length() && p.charAt(j + 1) == '*') {
        result = dp(s, p, i, j + 2)                        // skip: zero occurrences
              || (firstMatch && dp(s, p, i + 1, j));        // use: one or more
    } else {
        result = firstMatch && dp(s, p, i + 1, j + 1);
    }
    memo.put(key, result);
    return result;
}
```

⚠️ **Common Mistakes:**
- Not handling the `*` zero-occurrence case — `dp[i][j+2]` skips the pattern pair entirely
- Missing memoization → exponential time O(2^n)
- Confusing full match (entire string must match) vs partial match (substring)
- Not checking `firstMatch` before the "use" branch of `*`

🔥 **Interview Tips:**
- Define your state out loud first: "`dp(i, j)` = does `s[i:]` match `p[j:]`?" — this alone shows strong thinking
- Walk through a small example: `s = "aab"`, `p = "c*a*b"` — trace the `*` branches step by step
- If interviewer asks for bottom-up DP: build the table from the end of both strings going backwards
- Solving this cleanly puts you in the top 5–10% of candidates — most people skip it or brute-force it

---

## ⚡ Pattern Recognition Cheat Sheet

| If you see… | Pattern |
|-------------|---------|
| Reverse string / array in-place | Two Pointers (swap from ends) |
| Check palindrome, ignore special chars | Two Pointers + skip invalid |
| Reverse only specific elements (vowels) | Two Pointers + skip unwanted |
| Last word / trailing spaces / reverse words | Traverse from End |
| Longest/shortest substring, variable window | Sliding Window |
| Smallest window containing all chars of t | Sliding Window + Frequency Map |
| Check if permutation / all anagrams exist | Fixed-Size Sliding Window + `int[26]` |
| Concatenation of equal-length words | Fixed-Size Sliding Window (chunked by wordLen) |
| Group strings by same characters | HashMap Grouping (frequency signature) |
| Find first occurrence of pattern | String Matching (`i <= n - m`) |
| Longest palindrome substring | Expand Around Center |
| Convert string to number, handle overflow | Simulation / Parsing |
| Validate complex string format | State Tracking (boolean flags) |
| Matching brackets / balanced pairs | Stack (LIFO) |
| Remove adjacent duplicates, chain reactions | Stack (push-pop) |
| Pattern matching with `*` or `.` wildcards | DP on Strings (2D state) |

---

## 🏢 Company Pattern Mapping

| Company | String Patterns Frequently Asked |
|---------|----------------------------------|
| Amazon | Sliding Window, HashMap, Stack |
| Google | DP on Strings, String Matching, Sliding Window |
| Microsoft | Two Pointers, Stack, Parsing |
| Meta | Two Pointers, Sliding Window, Anagram patterns |
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

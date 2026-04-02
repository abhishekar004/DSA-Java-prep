# 🔤 Strings Mastery — DSA Placement Preparation

> ⚡ **"If you identify the pattern in 30 seconds, you can solve it in 5 minutes."**
>
> A **pattern-based DSA revision system** built for fast pattern recognition, placement prep, and high-pressure interview revision.

---

## 📁 Folder Structure

```
strings/
├── README.md
├── TwoPointers/
│   ├── ReverseString.java
│   ├── ValidPalindrome.java
│   └── ReverseVowelsOfAString.java
├── TraverseFromEnd/
│   ├── LengthOfLastWord.java
│   └── ReverseWordsInAString.java
├── SlidingWindow/
│   ├── LongestSubstringWithoutRepeatingCharacters.java
│   └── MinimumWindowSubString.java
├── FixedWindow/
│   ├── PermutationsInString.java
│   ├── FindAllAnagramsInAString.java
│   └── SubstringWithConcatenationOfAllWords.java
├── HashMapGrouping/
│   └── GroupAnagrams.java
├── StringMatching/
│   └── FindTheIndexOfFirstOccurance.java
├── ExpandAroundCenter/
│   └── LongestPalindromicSubstring.java
├── Simulation/
│   ├── StringToInteger.java
│   └── ValidNumber.java
│   └── CountingValleys.java
├── Stack/
│   ├── ValidParentheses.java
│   └── SuperReducedString.java
│   └── LongestValidParentheses.java
|── DynamicProgramming/
|   └── RegularExpression.java
└── String Manipulation/
|   └── TimeConversion.java
|   └── CaesarCipher.java
└── Greedy/
    └── RomanToInteger.java
    └── IntegerToRoman.java
```

---

## 📊 Progress Tracker

**Problems Solved: 24 / 30+**

```
████████████░░░░░░░░  ~66%  [24 / 30+]
```

| Pattern | Solved | Target | Status |
|---------|--------|--------|--------|
| Two Pointers | 3 | 5 | 🟡 In Progress |
| Traverse from End | 2 | 3 | 🟡 In Progress |
| Sliding Window | 2 | 5 | 🟡 In Progress |
| Fixed-Size Sliding Window | 3 | 5 | 🟡 In Progress |
| HashMap Grouping | 1 | 3 | 🔴 Needs Work |
| String Matching | 1 | 3 | 🔴 Needs Work |
| Expand Around Center | 1 | 3 | 🔴 Needs Work |
| Simulation / Parsing | 2 | 4 | 🔴 Needs Work |
| Stack | 2 | 4 | 🟡 In Progress |
| Dynamic Programming | 1 | 3 | 🔴 Needs Work |

---

## 🎯 Goals

- ✅ Master all **10 core string patterns**
- ⬜ Solve **30+ string problems**
- ⬜ Crack **product-based company** interviews

---

## ⚡ Pattern Recognition Cheat Sheet

> 🔑 **Read this before every mock interview. Identify the pattern first — then code.**

| Trigger (What You See in the Problem) | Pattern |
|---------------------------------------|---------|
| Reverse string / array in-place | Two Pointers (swap from ends) |
| Check palindrome, ignore special chars | Two Pointers + skip invalid |
| Reverse only specific elements (vowels) | Two Pointers + skip unwanted |
| Last word / trailing spaces / reverse words | Traverse from End |
| Longest/shortest substring, no repeating chars | Sliding Window (variable) |
| Smallest window containing all chars of `t` | Sliding Window + Frequency Map |
| Check if permutation exists / find all anagrams | Fixed-Size Window + `int[26]` |
| Concatenation of equal-length words in string | Fixed-Size Window (chunked by wordLen) |
| Group strings by same characters | HashMap Grouping (signature key) |
| Find first occurrence of pattern | String Matching (`i <= n - m` bound) |
| Longest palindrome substring | Expand Around Center |
| Convert string to integer, handle edge cases | Simulation / Parsing |
| Validate complex string format (number, email) | State Tracking (boolean flags) |
| Matching brackets / balanced pairs | Stack (LIFO) |
| Remove adjacent duplicates, chain reactions | Stack (push-pop) |
| Pattern matching with `*` or `.` wildcards | DP on Strings (2D memoization) |

---

## 🧩 Problems — Grouped by Pattern

---

### 1️⃣ Two Pointers on Strings

> **Core Idea:** Place one pointer at the start, one at the end. Compare or swap and move inward until they meet. Works in-place — O(1) space. For palindrome checks, skip non-alphanumeric characters. For vowel reversal, skip non-vowels and swap only at valid targets.

**Trigger keywords:** "reverse in-place", "check palindrome", "ignore special chars", "swap only specific elements", "no extra space"

| Problem | Platform | Difficulty |
|---------|----------|------------|
| [Reverse String](https://leetcode.com/problems/reverse-string/) | LC #344 | 🟢 Easy |
| [Valid Palindrome](https://leetcode.com/problems/valid-palindrome/) | LC #125 | 🟢 Easy |
| [Reverse Vowels of a String](https://leetcode.com/problems/reverse-vowels-of-a-string/) | LC #345 | 🟢 Easy |

**Key Template — Reverse String:**
```java
int left = 0, right = s.length - 1;
while (left < right) {
    char temp = s[left];
    s[left++] = s[right];
    s[right--] = temp;
}
```

**Key Template — Valid Palindrome (skip non-alphanumeric):**
```java
int left = 0, right = s.length() - 1;
while (left < right) {
    while (left < right && !Character.isLetterOrDigit(s.charAt(left)))  left++;
    while (left < right && !Character.isLetterOrDigit(s.charAt(right))) right--;
    if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right)))
        return false;
    left++; right--;
}
return true;
```

**Key Template — Reverse Vowels:**
```java
Set<Character> vowels = Set.of('a','e','i','o','u','A','E','I','O','U');
char[] arr = s.toCharArray();
int left = 0, right = arr.length - 1;
while (left < right) {
    while (left < right && !vowels.contains(arr[left]))  left++;
    while (left < right && !vowels.contains(arr[right])) right--;
    char temp = arr[left]; arr[left++] = arr[right]; arr[right--] = temp;
}
return new String(arr);
```

⚠️ **Common Mistakes:**
- Not including uppercase vowels in the vowel Set — `'A','E','I','O','U'` must be present
- Returning `true` early in Valid Palindrome before fully traversing both sides
- Creating a new array in Reverse String instead of modifying in-place — violates the constraint
- Forgetting to do both `left++` and `right--` after a valid swap

🔥 **Interview Tips:**
- Valid Palindrome is a warm-up — expect follow-up: "Valid Palindrome II" (allow at most one deletion)
- For Reverse Vowels: "Can you do it without a Set?" → `"aeiouAEIOU".indexOf(c) >= 0` works
- Two Pointers on strings: anytime you need to compare or swap from both ends simultaneously

---

### 2️⃣ Traverse from End

> **Core Idea:** Instead of splitting the string with `split()` (which creates extra arrays and chokes on multiple spaces), start from the last character and work backwards. Skip trailing spaces first, then count or extract until hitting a space or the start.

**Trigger keywords:** "last word", "ignore trailing spaces", "reverse words", "remove extra spaces", "avoid split()"

| Problem | Platform | Difficulty |
|---------|----------|------------|
| [Length of Last Word](https://leetcode.com/problems/length-of-last-word/) | LC #58 | 🟢 Easy |
| [Reverse Words in a String](https://leetcode.com/problems/reverse-words-in-a-string/) | LC #151 | 🟠 Medium |

**Key Template — Length of Last Word:**
```java
int i = s.length() - 1, count = 0;
while (i >= 0 && s.charAt(i) == ' ') i--;               // skip trailing spaces
while (i >= 0 && s.charAt(i) != ' ') { count++; i--; }  // count the word
return count;
```

**Key Template — Reverse Words (no split, extract from end):**
```java
StringBuilder sb = new StringBuilder();
int i = s.length() - 1;
while (i >= 0) {
    while (i >= 0 && s.charAt(i) == ' ') i--;           // skip trailing spaces
    int j = i;
    while (j >= 0 && s.charAt(j) != ' ') j--;           // find word start
    if (i >= 0) {
        if (sb.length() > 0) sb.append(' ');
        sb.append(s, j + 1, i + 1);
    }
    i = j;
}
return sb.toString();
```

⚠️ **Common Mistakes:**
- Using `split(" ")` — produces empty strings `""` between consecutive spaces
- `split("\\s+")` fixes multiple spaces but still uses O(n) extra space — mention the trade-off
- Forgetting to add a space separator *between* words (not before the first or after the last)
- Appending the wrong substring bounds — `s.substring(j + 1, i + 1)` is `[j+1, i]` inclusive

🔥 **Interview Tips:**
- When using `split("\\s+")`, explicitly mention it handles multiple spaces — but it uses extra space
- Follow-up: "Can you do it in-place?" → Reverse entire string, then reverse each word individually — O(1) space

---

### 3️⃣ Sliding Window (Variable Size)

> **Core Idea:** Use `left` and `right` pointers to maintain a valid window. Expand `right` to grow the window; shrink from `left` when the window becomes invalid. Always use `while` (not `if`) to shrink — the window must be fully valid after contracting. Update the result **before** shrinking, not after.

**Trigger keywords:** "longest/shortest substring", "no repeating characters", "contains all chars of t", "at most K distinct", "frequency matters"

| Problem | Platform | Difficulty |
|---------|----------|------------|
| [Longest Substring Without Repeating Characters](https://leetcode.com/problems/longest-substring-without-repeating-characters/) | LC #3 | 🟠 Medium |
| [Minimum Window Substring](https://leetcode.com/problems/minimum-window-substring/) | LC #76 | 🔴 Hard |

**Key Template — Longest Substring Without Repeating Characters:**
```java
Map<Character, Integer> freq = new HashMap<>();
int left = 0, maxLen = 0;
for (int right = 0; right < s.length(); right++) {
    freq.merge(s.charAt(right), 1, Integer::sum);
    while (freq.get(s.charAt(right)) > 1) {             // window invalid — shrink
        freq.merge(s.charAt(left), -1, Integer::sum);
        left++;
    }
    maxLen = Math.max(maxLen, right - left + 1);
}
return maxLen;
```

**Key Template — Minimum Window Substring:**
```java
Map<Character, Integer> need = new HashMap<>();
for (char c : t.toCharArray()) need.merge(c, 1, Integer::sum);

int required = need.size(), formed = 0, left = 0;
int minLen = Integer.MAX_VALUE, minStart = 0;
Map<Character, Integer> window = new HashMap<>();

for (int right = 0; right < s.length(); right++) {
    char c = s.charAt(right);
    window.merge(c, 1, Integer::sum);
    if (need.containsKey(c) && window.get(c).equals(need.get(c))) formed++;

    while (formed == required) {                         // valid window — try to shrink
        if (right - left + 1 < minLen) {
            minLen = right - left + 1;
            minStart = left;
        }
        char lc = s.charAt(left++);
        window.merge(lc, -1, Integer::sum);
        if (need.containsKey(lc) && window.get(lc) < need.get(lc)) formed--;
    }
}
return minLen == Integer.MAX_VALUE ? "" : s.substring(minStart, minStart + minLen);
```

⚠️ **Common Mistakes:**
- Using `if` instead of `while` to shrink — window may still be invalid after one shrink step
- Using a `Set` instead of a frequency map — can't handle repeated characters in `t`
- Recording the minimum window **after** shrinking — you've already missed the valid state
- Window length formula: it's `right - left + 1`, not `right - left`

🔥 **Interview Tips:**
- Longest Substring Without Repeating Characters is a top-10 most asked problem — code it from memory in under 3 minutes
- For Minimum Window: walk through the `formed == required` condition out loud — interviewers love seeing this reasoning
- Follow-up: "What if only lowercase letters?" → replace `HashMap` with `int[26]` for O(1) constant factor improvement
- This pattern extends to: Permutation in String · Find All Anagrams · Longest Repeating Character Replacement

---

### 4️⃣ Fixed-Size Sliding Window + Frequency Map

> **Core Idea:** When the window size is fixed (equal to pattern length), slide it one character at a time — add the new right character, remove the old left character. Compare `int[26]` frequency arrays with `Arrays.equals` instead of sorting — O(26) = O(1). For Concatenation of Words, all words are equal length, so move by `wordLen` chunks and try all `wordLen` starting offsets.

**Trigger keywords:** "permutation of pattern", "all anagrams", "fixed window", "concatenation of all words", "word-chunk sliding"

| Problem | Platform | Difficulty |
|---------|----------|------------|
| [Permutation in String](https://leetcode.com/problems/permutation-in-string/) | LC #567 | 🟠 Medium |
| [Find All Anagrams in a String](https://leetcode.com/problems/find-all-anagrams-in-a-string/) | LC #438 | 🟠 Medium |
| [Substring with Concatenation of All Words](https://leetcode.com/problems/substring-with-concatenation-of-all-words/) | LC #30 | 🔴 Hard |

**Key Template — Permutation in String / Find All Anagrams:**
```java
int[] pCount = new int[26], wCount = new int[26];
for (char c : p.toCharArray()) pCount[c - 'a']++;
List<Integer> result = new ArrayList<>();

for (int i = 0; i < s.length(); i++) {
    wCount[s.charAt(i) - 'a']++;                           // add right char
    if (i >= p.length())
        wCount[s.charAt(i - p.length()) - 'a']--;          // remove left char
    if (Arrays.equals(pCount, wCount))
        result.add(i - p.length() + 1);                    // match found
}
return result;  // for Permutation in String: return !result.isEmpty()
```

**Key Template — Substring with Concatenation of All Words:**
```java
int wordLen = words[0].length(), totalWords = words.length;
Map<String, Integer> need = new HashMap<>();
for (String w : words) need.merge(w, 1, Integer::sum);
List<Integer> result = new ArrayList<>();

for (int offset = 0; offset < wordLen; offset++) {         // try each alignment
    Map<String, Integer> window = new HashMap<>();
    int left = offset, count = 0;
    for (int right = offset; right + wordLen <= s.length(); right += wordLen) {
        String word = s.substring(right, right + wordLen);
        if (need.containsKey(word)) {
            window.merge(word, 1, Integer::sum);
            count++;
            while (window.get(word) > need.get(word)) {    // excess — shrink left
                String lw = s.substring(left, left + wordLen);
                window.merge(lw, -1, Integer::sum);
                count--; left += wordLen;
            }
            if (count == totalWords) result.add(left);
        } else {
            window.clear(); count = 0; left = right + wordLen; // invalid word — reset
        }
    }
}
return result;
```

⚠️ **Common Mistakes:**
- Sorting every window — O(n × m log m) instead of O(n) with frequency array
- Forgetting to remove the left character as the window slides
- For Concatenation: moving 1 character at a time instead of `wordLen` — misses valid alignments
- For Concatenation: not trying all `wordLen` starting offsets — misses results at non-zero alignments
- Not handling duplicate words in the word list (need frequency map, not set)

🔥 **Interview Tips:**
- `Arrays.equals(int[], int[])` on a size-26 array is O(26) = O(1) — state this explicitly to the interviewer
- Permutation in String and Find All Anagrams are the same problem — one returns `bool`, the other returns indices
- For Concatenation: key insight is "all words are the same length, so I can treat each chunk as a unit and slide by `wordLen`" — say this before writing code
- Progression: Permutation in String → Find All Anagrams → Minimum Window Substring (each relaxes one constraint)

---

### 5️⃣ HashMap Grouping (Signature Key)

> **Core Idea:** Build a unique signature for each string — either sort its characters or build a frequency count string — and use that as a HashMap key. All strings that share a signature are anagrams. Group them into the same bucket with `computeIfAbsent`.

**Trigger keywords:** "group similar strings", "same letters different order", "anagram grouping", "normalize and bucket"

| Problem | Platform | Difficulty |
|---------|----------|------------|
| [Group Anagrams](https://leetcode.com/problems/group-anagrams/) | LC #49 | 🟠 Medium |

**Key Template — Sorted Key (simpler, O(m log m) per string):**
```java
Map<String, List<String>> map = new HashMap<>();
for (String s : strs) {
    char[] arr = s.toCharArray();
    Arrays.sort(arr);
    String key = new String(arr);
    map.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
}
return new ArrayList<>(map.values());
```

**Key Template — Frequency Signature Key (faster, O(m) per string):**
```java
Map<String, List<String>> map = new HashMap<>();
for (String s : strs) {
    int[] count = new int[26];
    for (char c : s.toCharArray()) count[c - 'a']++;
    StringBuilder key = new StringBuilder();
    for (int i = 0; i < 26; i++) key.append('#').append(count[i]); // "#2#0#1#0..."
    map.computeIfAbsent(key.toString(), k -> new ArrayList<>()).add(s);
}
return new ArrayList<>(map.values());
```

⚠️ **Common Mistakes:**
- Using `int[]` directly as a map key — arrays use reference equality in Java, not value equality; always convert to String
- Using `map.put(key, new ArrayList<>())` instead of `computeIfAbsent` — overwrites existing groups
- Building the frequency signature without a delimiter (e.g., `"12"` is ambiguous: is it `[1,2]` or `[12,0]`?) — always use `'#'` as separator
- Sorting without realizing the frequency signature is a faster alternative

🔥 **Interview Tips:**
- Always offer both approaches and explain the trade-off: "Sorted key is simpler but O(m log m); frequency signature is O(m)"
- The `computeIfAbsent` pattern is idiomatic Java for "get or create" — use it over a manual null-check
- This signature technique generalizes: wherever order doesn't matter, compute a canonical form and group by it
- Follow-up: "What if strings can have uppercase or digits?" → extend frequency array or use a HashMap for counts

---

### 6️⃣ String Matching (Bounded Loop)

> **Core Idea:** Slide the needle across the haystack one index at a time. The critical rule: only start checks at indices where the full pattern can still fit — loop bound is `i <= n - m`, not `i < n`. At each start index, compare characters one by one and return on a full match.

**Trigger keywords:** "find first occurrence", "index of substring", "pattern in string", "strStr"

| Problem | Platform | Difficulty |
|---------|----------|------------|
| [Find the Index of First Occurrence](https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/) | LC #28 | 🟢 Easy |

**Key Template:**
```java
int n = haystack.length(), m = needle.length();
if (m == 0) return 0;                    // edge case: empty needle
for (int i = 0; i <= n - m; i++) {      // CRITICAL: n - m, not n
    int j = 0;
    while (j < m && haystack.charAt(i + j) == needle.charAt(j)) j++;
    if (j == m) return i;               // full match found
}
return -1;
```

⚠️ **Common Mistakes:**
- Looping to `i < n` instead of `i <= n - m` — accessing `haystack.charAt(i + j)` causes `StringIndexOutOfBoundsException`
- Missing the edge case where `needle` is longer than `haystack` (returns -1 immediately since `n - m < 0`)
- Not handling empty needle — LeetCode convention returns 0; confirm with interviewer

🔥 **Interview Tips:**
- The `n - m` bound is the most common off-by-one mistake in string matching — fixing it proactively signals strong attention to detail
- Always ask: "Can the needle be empty?" — different platforms have different conventions
- Follow-up: "Can you do it in O(n)?" → KMP algorithm. You don't need to implement it live — just name it and describe the key idea (failure function avoids restarting from scratch)

---

### 7️⃣ Expand Around Center

> **Core Idea:** Every palindrome has a center. For each index, expand outward while characters match. Handle two cases: odd-length palindromes (center at `i`) and even-length palindromes (center between `i` and `i+1`). Track the longest seen. O(n²) time, O(1) space — accepted in 95%+ of interviews.

**Trigger keywords:** "longest palindrome substring", "palindrome centered at index", "expand from center"

| Problem | Platform | Difficulty |
|---------|----------|------------|
| [Longest Palindromic Substring](https://leetcode.com/problems/longest-palindromic-substring/) | LC #5 | 🟠 Medium |

**Key Template:**
```java
String result = "";
for (int i = 0; i < s.length(); i++) {
    String odd  = expand(s, i, i);       // odd-length: single center
    String even = expand(s, i, i + 1);   // even-length: two-char center
    if (odd.length()  > result.length()) result = odd;
    if (even.length() > result.length()) result = even;
}
return result;

private String expand(String s, int left, int right) {
    while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
        left--; right++;
    }
    // left and right are one step too far — adjust
    return s.substring(left + 1, right);
}
```

⚠️ **Common Mistakes:**
- Handling only odd-length palindromes — misses all even-length ones like `"abba"` or `"cbbd"`
- Wrong substring bounds after the expand loop: use `left + 1` to `right` (exclusive) — not `right + 1`
- Brute force O(n³): checking all substrings and validating each separately — never do this
- Returning the length instead of the actual substring when the problem asks for the string

🔥 **Interview Tips:**
- Always handle both odd and even cases explicitly — forgetting even-length palindromes loses you the problem
- State complexity upfront: "O(n²) time, O(1) space — optimal for most interviews. Manacher's gives O(n) if needed"
- Follow-up: "Count all palindromic substrings" (LC #647) → same expand logic, count instead of tracking max
- Follow-up: "O(n) solution?" → Manacher's Algorithm — naming and describing it (virtual center trick) is usually enough

---

### 8️⃣ Simulation / Parsing

> **Core Idea:** Parse the string step by step with explicit, ordered rules. For `atoi`: skip whitespace → detect sign → parse digits → check overflow **before** updating (not after). For `Valid Number`: one pass with boolean flags per state. Key subtlety: reset `seenDigit = false` after `e/E` — digits must also appear in the exponent part.

**Trigger keywords:** "convert string to number", "validate format", "handle sign/spaces/overflow", "multiple validation rules per character"

| Problem | Platform | Difficulty |
|---------|----------|------------|
| [String to Integer (atoi)](https://leetcode.com/problems/string-to-integer-atoi/) | LC #8 | 🟠 Medium |
| [Valid Number](https://leetcode.com/problems/valid-number/) | LC #65 | 🔴 Hard |

**Key Template — String to Integer (atoi):**
```java
int i = 0, sign = 1, result = 0;
// Step 1: skip leading spaces
while (i < s.length() && s.charAt(i) == ' ') i++;
// Step 2: detect sign
if (i < s.length() && (s.charAt(i) == '+' || s.charAt(i) == '-'))
    sign = (s.charAt(i++) == '-') ? -1 : 1;
// Step 3: parse digits — overflow check BEFORE updating
while (i < s.length() && Character.isDigit(s.charAt(i))) {
    int digit = s.charAt(i++) - '0';
    if (result > (Integer.MAX_VALUE - digit) / 10)      // check BEFORE update
        return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
    result = result * 10 + digit;
}
return sign * result;
```

**Key Template — Valid Number (flag-based state tracking):**
```java
boolean seenDigit = false, seenDot = false, seenE = false;
for (int i = 0; i < s.length(); i++) {
    char c = s.charAt(i);
    if      (Character.isDigit(c))         { seenDigit = true; }
    else if (c == '.')                     { if (seenDot || seenE) return false; seenDot = true; }
    else if (c == 'e' || c == 'E')         { if (seenE || !seenDigit) return false; seenE = true; seenDigit = false; }
    else if (c == '+' || c == '-')         { if (i != 0 && s.charAt(i-1) != 'e' && s.charAt(i-1) != 'E') return false; }
    else return false;
}
return seenDigit;
```

**Edge cases to test for Valid Number:** `"."`, `"1."`, `".1"`, `"1e2"`, `"1e+2"`, `"+.8"`, `"1e"`, `"e3"`

⚠️ **Common Mistakes:**
- Overflow check must happen **before** `result = result * 10 + digit` — checking after is too late
- Not resetting `seenDigit = false` after `e/E` in Valid Number — `"1e"` would incorrectly return true
- Allowing sign characters in the middle: `"1+2"` must be rejected — sign only valid at index 0 or after `e/E`
- Not handling the case where `s` is entirely spaces (returns 0)

🔥 **Interview Tips:**
- For `atoi`: walk through each step out loud — "skip spaces → detect sign → parse digits → overflow check before update"
- Overflow check formula: `result > (Integer.MAX_VALUE - digit) / 10` — derive this live by rearranging `result * 10 + digit > MAX`
- Valid Number is Hard due to edge cases, not algorithm — list all edge cases first, then code
- `atoi` is a common warm-up question; getting the overflow check right immediately signals experience

---

### 9️⃣ Stack

> **Core Idea:** Use a stack (LIFO) when characters must be matched in pairs or when removing adjacent duplicates can trigger chain reactions. For brackets: push openers, pop and verify on closers, stack must be empty at end. For adjacent duplicate removal: if the stack top matches the current character, pop instead of push — chain reactions are handled automatically.

**Trigger keywords:** "matching pairs", "balanced brackets", "remove adjacent duplicates", "reduce until stable", "chain removal"

| Problem | Platform | Difficulty |
|---------|----------|------------|
| [Valid Parentheses](https://leetcode.com/problems/valid-parentheses/) | LC #20 | 🟢 Easy |
| [Super Reduced String](https://www.hackerrank.com/challenges/reduced-string/problem) | HackerRank | 🟢 Easy |

**Key Template — Valid Parentheses:**
```java
Deque<Character> stack = new ArrayDeque<>();
for (char c : s.toCharArray()) {
    if (c == '(' || c == '{' || c == '[') {
        stack.push(c);
    } else {
        if (stack.isEmpty()) return false;
        char top = stack.pop();
        if ((c == ')' && top != '(') ||
            (c == '}' && top != '{') ||
            (c == ']' && top != '[')) return false;
    }
}
return stack.isEmpty();    // ← critical: all openers must be matched
```

**Key Template — Super Reduced String (adjacent duplicate removal):**
```java
StringBuilder stack = new StringBuilder();
for (char c : s.toCharArray()) {
    if (stack.length() > 0 && stack.charAt(stack.length() - 1) == c)
        stack.deleteCharAt(stack.length() - 1);  // duplicate — pop
    else
        stack.append(c);                          // no duplicate — push
}
return stack.length() == 0 ? "Empty String" : stack.toString();
```

⚠️ **Common Mistakes:**
- Valid Parentheses: not checking `isEmpty()` before `pop()` — throws `NoSuchElementException`
- Valid Parentheses: returning `true` without verifying `stack.isEmpty()` at the end — unmatched openers pass incorrectly
- Super Reduced String: using nested loops O(n²) — single-pass stack handles chain reactions naturally
- Super Reduced String: forgetting to return `"Empty String"` when the stack is empty at the end

🔥 **Interview Tips:**
- Valid Parentheses is one of the most common entry-level questions — solve it in under 2 minutes
- The `stack.isEmpty()` check at the end is the line most candidates forget under pressure — state it explicitly
- For Super Reduced String: explain why the stack handles chain reactions: "removing `'aa'` exposes new adjacents — the stack top always holds the last unmatched character, so chains resolve naturally"
- Follow-ups: Remove Minimum Invalid Parentheses · Longest Valid Parentheses · Expression Evaluation · Remove All Adjacent Duplicates II (k occurrences)

---

### 🔟 Dynamic Programming on Strings

> **Core Idea:** When a string problem involves a choice at each character (match, skip, or repeat), define a 2D DP state `dp(i, j)` = "does `s[i:]` match `p[j:]`?". For regex `*`: two branches — skip the pair entirely (`dp(i, j+2)`) or use it to match the current character and advance only `i` (`dp(i+1, j)`). Memoize to avoid exponential recomputation.

**Trigger keywords:** "pattern matching with rules", "`*` or `.` wildcards", "choices at each step (take/skip/repeat)", "full string match required"

| Problem | Platform | Difficulty |
|---------|----------|------------|
| [Regular Expression Matching](https://leetcode.com/problems/regular-expression-matching/) | LC #10 | 🔴 Hard |

**Key Template — Top-Down DP with Memoization:**
```java
Map<String, Boolean> memo = new HashMap<>();

public boolean isMatch(String s, String p) {
    return dp(s, p, 0, 0);
}

private boolean dp(String s, String p, int i, int j) {
    String key = i + "," + j;
    if (memo.containsKey(key)) return memo.get(key);
    if (j == p.length()) return i == s.length();  // pattern exhausted

    boolean firstMatch = (i < s.length()) &&
        (p.charAt(j) == s.charAt(i) || p.charAt(j) == '.');

    boolean result;
    if (j + 1 < p.length() && p.charAt(j + 1) == '*') {
        result = dp(s, p, i, j + 2)                          // zero occurrences: skip pair
              || (firstMatch && dp(s, p, i + 1, j));         // one+ occurrences: advance s only
    } else {
        result = firstMatch && dp(s, p, i + 1, j + 1);       // normal match: advance both
    }
    memo.put(key, result);
    return result;
}
```

**States to trace through for clarity:** `s = "aab"`, `p = "c*a*b"` — trace the `*` zero-occurrence branch skipping `"c*"` and `"a*"`.

⚠️ **Common Mistakes:**
- Not handling the `*` zero-occurrence branch (`dp(i, j+2)`) — the pattern can skip the `x*` pair entirely
- Missing memoization — leads to exponential time O(2^(m+n)) instead of O(m×n)
- Confusing full match (entire `s` must match) with substring match (partial is OK)
- Not checking `firstMatch` before the "use `*`" branch — `*` can only repeat a matching character

🔥 **Interview Tips:**
- Define your state out loud first: "`dp(i, j)` = does `s[i:]` match `p[j:]`?" — this alone demonstrates strong problem framing
- The two `*` branches are the core of the problem — state them explicitly: "zero occurrences: skip the pair. One or more: advance `s`, stay on `p`"
- If asked for bottom-up DP: build the 2D table from the ends of both strings backwards
- Solving this cleanly puts you in the top 5–10% of candidates — most people skip it or attempt brute force

---
pattern tip for counting valleys

🧠 Pattern Tip

👉 When you see:

“Track movement up/down”
“Count events based on state”

💡 Trigger:

Simulation with state variable

⚙️ Approach (README-ready)
Initialize level = 0
Traverse path:
'U' → level++
'D' → level--
If level becomes 0 after 'U' → valley completed
🎯 Key Insight

👉 A valley is counted when:

you return to sea level from below

⚠️ Common Mistakes
❌ Counting valley start instead of end
❌ Not tracking level correctly
❌ Using extra data structures unnecessarily
🚀 Interview Tip

This problem teaches:

Track state transitions, not just values

That idea appears in:

stock profit problems
bracket matching
path simulations

---
pattern tip for time conversion 

🧠 Pattern Tip

👉 When you see:

“Convert one format to another”
“Special edge cases like 12 AM / 12 PM”

💡 Trigger:

String Parsing + Conditional Handling

⚙️ Approach (README-ready)
Extract:
hour
AM/PM suffix
remaining time
Apply rules:
12 AM → 00
12 PM → 12
PM (except 12) → add 12
Rebuild final string
🎯 Key Insight

👉 The only tricky part is:

12 AM and 12 PM

That’s where most mistakes happen.

⚠️ Common Mistakes
❌ Forgetting leading zero (01 vs 1)
❌ Mishandling 12 AM
❌ Adding 12 to 12 PM incorrectly
🚀 Interview Tip

This problem teaches:

Even simple logic problems can fail because of formatting details

That matters a lot in interviews and coding platforms.

---
pattern tip for caesar cipher 

🧠 Pattern Tip

👉 When you see:

“Shift characters”
“Rotate alphabet”
“Wrap around z → a”

💡 Trigger:

Character arithmetic + modulo

⚙️ Approach (README-ready)
Reduce shift value:
k = k % 26
Traverse each character:
if lowercase → rotate within 'a' to 'z'
if uppercase → rotate within 'A' to 'Z'
else keep unchanged
🎯 Key Insight

👉 Convert letters into 0–25 positions, shift them, then convert back.

That’s the entire trick.

⚠️ Common Mistakes
❌ Forgetting k % 26
❌ Not handling uppercase separately
❌ Modifying special characters unnecessarily
❌ Wrong wrap-around logic
🚀 Interview Tip

This problem teaches a useful pattern:

When letters wrap cyclically,
think modulo arithmetic

That applies to:

cipher problems
circular arrays
rotational indexing problems
🧠 FINAL VERDICT

😎 Iron Man: Clean character math
⚡ Thor: Strong wrap-around handling
🕷️ Spidey: % 26 saved the day again

---
pattern tip for longest valid parentheses

🧠 Pattern Tip

👉 When you see:

“Longest valid bracket substring”
“Need boundary tracking”
“Matching parentheses with indices”

💡 Trigger:

Stack of indices

⚙️ Approach (README-ready)
Push -1 initially as base index
Traverse string:
if '(' → push index
if ')' → pop stack
If stack becomes empty:
push current index as new invalid boundary
Else:
valid length = i - stack.peek()
Track maximum length
🎯 Key Insight

👉 Store indices, not characters.

Because:

we need substring length, not just matching.

⚠️ Common Mistakes
❌ Using stack of characters instead of indices
❌ Forgetting initial -1
❌ Not resetting boundary when stack becomes empty
🚀 Interview Tip

This problem teaches a very important trick:

Sometimes stack is not for values —
it’s for positions

That appears in:

parentheses problems
histogram problems
monotonic stack problems
🧠 FINAL VERDICT

😎 Iron Man: Excellent stack logic
⚡ Thor: Strong boundary handling
🕷️ Spidey: That -1 base trick is chef’s kiss

---
pattern tip for roman to integer

🧠 Pattern Tip

👉 When you see:

“Special subtraction/addition rules”
“Character-based number system”

💡 Trigger:

Traverse + adjust based on previous/current relation

⚙️ Approach (README-ready)
Convert each Roman character to integer
Traverse left to right
If current value is greater than previous:
subtract previous contribution twice
Else:
add normally
🎯 Key Insight

👉 Roman numerals usually add,
but when a smaller numeral comes before a larger one:

it should be subtracted

That’s the whole trick.

⚠️ Common Mistakes
❌ Only doing normal addition
❌ Incorrect subtractive handling
❌ Forgetting that previous value was already added
🚀 Interview Tip

This problem teaches an important parsing habit:

Sometimes the current character depends on the previous one

That idea appears in:

decoding problems
expression parsing
compression / token parsing
🧠 FINAL VERDICT

😎 Iron Man: Excellent bug fix and strong logic
⚡ Thor: Clean greedy parsing
🕷️ Spidey: -2 * prevVal = beautiful recovery move


---
pattern tip for integer to roman

🧠 Pattern Tip

👉 When you see:

“Build representation from value”
“Use largest valid chunk first”

💡 Trigger:

Greedy construction

⚙️ Approach (README-ready)
Store Roman numeral values and symbols in descending order
Traverse the values:
while current value can fit into number:
append symbol
subtract value
Continue until number becomes 0
🎯 Key Insight

👉 Roman numerals are built from fixed valid pieces

So:

always take the largest valid Roman chunk first

⚠️ Common Mistakes
❌ Forgetting subtractive cases like IV, IX, CM
❌ Trying to manually build each digit without mapping
❌ Wrong order of Roman values
🚀 Interview Tip

This is a classic greedy problem.

It teaches:

If the representation system has valid blocks,
try consuming the largest block first.

That appears in:

coin change style problems
interval greedy
encoding problems
🧠 FINAL VERDICT

😎 Iron Man: Clean greedy construction
⚡ Thor: Strong handling of subtractive forms
🕷️ Spidey: Roman boss fight cleared


---

## 🏢 Company Pattern Mapping

| Company | Primary Patterns | High-Frequency Problems |
|---------|-----------------|------------------------|
| **Amazon** | Sliding Window, HashMap, Stack | Longest Substring, Group Anagrams, Valid Parentheses |
| **Google** | DP, String Matching, Sliding Window | Regex Matching, Min Window Substring, Longest Palindrome |
| **Microsoft** | Two Pointers, Stack, Parsing | Valid Palindrome, Valid Parentheses, atoi |
| **Meta** | Two Pointers, Sliding Window, Anagram patterns | Reverse Vowels, Find All Anagrams, Permutation in String |
| **Adobe** | Parsing, Stack, Simulation | Valid Number, Super Reduced String, atoi |

---

## 🔁 Revision Strategy

| Mode | When to Use | How |
|------|-------------|-----|
| 📖 **Learn** | First time seeing a pattern | Read approach + template → solve all problems in that group |
| 🔁 **Revise** | Day before interview | Read only pattern triggers + key templates — skip explanations |
| ⚡ **Interview** | During the interview | Cheat sheet only — identify pattern in ≤ 30 sec, then code the template |

**Daily target:** 2–3 problems per day, one pattern group at a time. Don't mix patterns in the same session.

**Weekly review:** Re-attempt problems marked hard without notes. Timed: 20 minutes per problem.

---

## 📊 Pattern Difficulty Distribution

```
Easy   ████████░░░░░░░░  ~30%  (build speed and baseline fluency)
Medium ████████████░░░░  ~50%  (core placement interview problems)
Hard   ████░░░░░░░░░░░░  ~20%  (differentiation — top-tier companies)
```

---

> 🚀 **Strings = Pattern Recognition. The same 10 patterns repeat across 30+ problems.**
>
> ⚡ **Speed = Pattern + Practice. Spot the trigger → recall the template → code with confidence.**

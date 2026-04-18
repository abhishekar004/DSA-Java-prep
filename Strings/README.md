# ⚔️ STRINGS MASTERY — DSA PLACEMENT ARSENAL

```
╔══════════════════════════════════════════════════════════════════════════╗
║  "If you identify the pattern in 30 seconds, you solve it in 5 minutes" ║
║                                                                          ║
║         PATTERN × PRACTICE = PLACEMENT                                  ║
╚══════════════════════════════════════════════════════════════════════════╝
```

> 🎯 **Mission:** Recognize any string problem's pattern in ≤30 seconds.  
> 🔥 **Weapon:** 10 patterns. 30+ problems. Zero panic.  
> 🏆 **Target:** Product-based company — SDE-1/SDE-2 offer.

---

## 📁 Repository Structure

```
strings/
├── README.md                           ← YOU ARE HERE
│
├── TwoPointers/
│   ├── ReverseString.java              ✅
│   ├── ValidPalindrome.java            ✅
│   └── ReverseVowelsOfAString.java     ✅
│
├── TraverseFromEnd/
│   ├── LengthOfLastWord.java           ✅
│   └── ReverseWordsInAString.java      ✅
│
├── SlidingWindow/
│   ├── LongestSubstringWithoutRepeatingCharacters.java  ✅
│   └── MinimumWindowSubString.java     ✅
│
├── FixedWindow/
│   ├── PermutationsInString.java       ✅
│   ├── FindAllAnagramsInAString.java   ✅
│   └── SubstringWithConcatenationOfAllWords.java  ✅
│
├── HashMapGrouping/
│   └── GroupAnagrams.java              ✅
│
├── StringMatching/
│   └── FindTheIndexOfFirstOccurance.java  ✅
│
├── ExpandAroundCenter/
│   └── LongestPalindromicSubstring.java   ✅
│
├── Simulation/
│   ├── StringToInteger.java            ✅
│   ├── ValidNumber.java                ✅
│   └── CountingValleys.java            ✅
│
├── Stack/
│   ├── ValidParentheses.java           ✅
│   ├── SuperReducedString.java         ✅
│   └── LongestValidParentheses.java    ✅
│
├── DynamicProgramming/
│   └── RegularExpression.java          ✅
│
├── StringManipulation/
│   ├── TimeConversion.java             ✅
│   └── CaesarCipher.java               ✅
│
└── Greedy/
    ├── RomanToInteger.java             ✅
    └── IntegerToRoman.java             ✅
```

---

## 📊 War Dashboard

```
OVERALL PROGRESS
████████████░░░░░░░░  24 / 30+  [~66%]  🔥 KEEP GRINDING

┌─────────────────────────────────┬────────┬────────┬──────────────────┐
│ Pattern                         │ Solved │ Target │ Status           │
├─────────────────────────────────┼────────┼────────┼──────────────────┤
│ Two Pointers                    │   3    │   5    │ 🟡 In Progress   │
│ Traverse from End               │   2    │   3    │ 🟡 In Progress   │
│ Sliding Window (Variable)       │   2    │   5    │ 🟡 In Progress   │
│ Fixed-Size Sliding Window       │   3    │   5    │ 🟡 In Progress   │
│ HashMap Grouping                │   1    │   3    │ 🔴 Needs Work    │
│ String Matching                 │   1    │   3    │ 🔴 Needs Work    │
│ Expand Around Center            │   1    │   3    │ 🔴 Needs Work    │
│ Simulation / Parsing            │   2    │   4    │ 🔴 Needs Work    │
│ Stack                           │   2    │   4    │ 🟡 In Progress   │
│ Dynamic Programming             │   1    │   3    │ 🔴 Needs Work    │
└─────────────────────────────────┴────────┴────────┴──────────────────┘
```

### 🏁 Completion Goals
- ✅ Master all **10 core string patterns**
- ⬜ Solve **30+ string problems**
- ⬜ Crack **product-based company** interview

---

## ⚡ PATTERN RECOGNITION — MASTER CHEAT SHEET

> 🧠 **Read this before every mock. Identify the pattern FIRST — then open your editor.**

```
╔══════════════════════════════════════════════════════════════════════════════════╗
║                      🔍 WHAT YOU SEE → 💡 WHAT YOU USE                         ║
╠══════════════════════════════════════════════════════════════════════════════════╣
║  Reverse in-place / Check palindrome / Swap specific chars    → Two Pointers    ║
║  Last word / Trailing spaces / Reverse words without split()  → Traverse End    ║
║  Longest/shortest window / No repeat / At most K distinct     → Sliding Window  ║
║  Permutation exists / All anagrams / Fixed pattern length     → Fixed Window    ║
║  Group by same letters / Canonical form / Bucket strings      → HashMap Group   ║
║  Find first occurrence / Needle in haystack                   → String Match    ║
║  Longest palindrome substring / Expand from i                 → EAC             ║
║  String → number / Validate format / Sign + overflow          → Simulation      ║
║  Balanced brackets / Remove adjacent dupes / Chain collapse   → Stack           ║
║  Wildcard matching / Choices at each char / Full string match → DP              ║
╚══════════════════════════════════════════════════════════════════════════════════╝
```

| Trigger Phrase (in the problem) | Pattern |
|----------------------------------|---------|
| `"reverse in-place"` / `"no extra space"` | Two Pointers (swap from ends) |
| `"check palindrome"` / `"ignore special chars"` | Two Pointers + skip invalid |
| `"reverse only vowels"` / `"swap specific elements"` | Two Pointers + skip unwanted |
| `"last word"` / `"trailing spaces"` / `"no split()"` | Traverse from End |
| `"longest substring"` / `"no repeating characters"` | Sliding Window (variable) |
| `"smallest window containing all chars"` | Sliding Window + Frequency Map |
| `"permutation exists"` / `"all anagram positions"` | Fixed-Size Window + `int[26]` |
| `"concatenation of all words"` | Fixed Window (chunked by `wordLen`) |
| `"group strings by same characters"` | HashMap Grouping (signature key) |
| `"find first occurrence"` / `"strStr"` | String Matching (`i <= n-m` bound) |
| `"longest palindrome substring"` | Expand Around Center |
| `"string to integer"` / `"handle sign/overflow"` | Simulation / Parsing |
| `"validate number format"` / `"multiple rules per char"` | State Tracking (boolean flags) |
| `"balanced brackets"` / `"matching pairs"` | Stack (LIFO) |
| `"remove adjacent duplicates"` / `"chain reactions"` | Stack (push-pop) |
| `"pattern with * or . wildcards"` / `"full match"` | DP (2D memoization) |
| `"track up/down movement"` / `"count state changes"` | Simulation (state variable) |
| `"shift characters"` / `"rotate alphabet"` / `"wrap around"` | Character arithmetic + mod |
| `"repeating string pattern"` / `"compare expected vs actual"` | Modulo-based matching |
| `"build number from Roman"` / `"subtraction rule"` | Greedy traversal |

---

## 🧩 PATTERNS — DEEP DIVE

---

### 1️⃣ TWO POINTERS ON STRINGS

```
PATTERN TYPE:   In-place comparison / swap from both ends
TIME:           O(n)
SPACE:          O(1)
DIFFICULTY:     🟢 Easy — but follow-ups can be Medium
```

**Core Idea:** One pointer at start, one at end. Compare or swap, move inward until they meet.  
For palindrome checks → skip non-alphanumeric chars.  
For vowel reversal → skip non-vowels and swap only at valid targets.

**Trigger keywords:** `"reverse in-place"` · `"check palindrome"` · `"ignore special chars"` · `"swap only specific elements"` · `"no extra space"`

| Problem | Platform | Difficulty | Link |
|---------|----------|------------|------|
| Reverse String | LC #344 | 🟢 Easy | [→](https://leetcode.com/problems/reverse-string/) |
| Valid Palindrome | LC #125 | 🟢 Easy | [→](https://leetcode.com/problems/valid-palindrome/) |
| Reverse Vowels of a String | LC #345 | 🟢 Easy | [→](https://leetcode.com/problems/reverse-vowels-of-a-string/) |

**Template — Reverse String:**
```java
int left = 0, right = s.length - 1;
while (left < right) {
    char temp = s[left];
    s[left++] = s[right];
    s[right--] = temp;
}
```

**Template — Valid Palindrome (skip non-alphanumeric):**
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

**Template — Reverse Vowels:**
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

> ⚠️ **Landmines:**
> - Missing uppercase vowels in the Set → `'A','E','I','O','U'` must be present
> - Returning `true` early before fully traversing in Valid Palindrome
> - Forgetting `left++` AND `right--` after each swap
> - Creating new array in Reverse String — violates the in-place constraint

> 🔥 **Interview Edge:**
> - Valid Palindrome is a warm-up → expect follow-up: **Valid Palindrome II** (allow one deletion)
> - "Can you avoid a Set?" → `"aeiouAEIOU".indexOf(c) >= 0` works
> - Pattern hint: any time you compare or swap from both ends *simultaneously* → two pointers

---

### 2️⃣ TRAVERSE FROM END

```
PATTERN TYPE:   Backward traversal to avoid split() overhead
TIME:           O(n)
SPACE:          O(1) or O(n) for output
DIFFICULTY:     🟢–🟠 Easy to Medium
```

**Core Idea:** Start from the last character. Skip trailing spaces, then extract backwards. Avoids `split()` which chokes on multiple spaces and creates extra arrays.

**Trigger keywords:** `"last word"` · `"ignore trailing spaces"` · `"reverse words"` · `"remove extra spaces"` · `"avoid split()"`

| Problem | Platform | Difficulty | Link |
|---------|----------|------------|------|
| Length of Last Word | LC #58 | 🟢 Easy | [→](https://leetcode.com/problems/length-of-last-word/) |
| Reverse Words in a String | LC #151 | 🟠 Medium | [→](https://leetcode.com/problems/reverse-words-in-a-string/) |

**Template — Length of Last Word:**
```java
int i = s.length() - 1, count = 0;
while (i >= 0 && s.charAt(i) == ' ') i--;               // skip trailing spaces
while (i >= 0 && s.charAt(i) != ' ') { count++; i--; }  // count the word
return count;
```

**Template — Reverse Words (extract from end, no split):**
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

> ⚠️ **Landmines:**
> - `split(" ")` → produces empty strings `""` between consecutive spaces
> - `split("\\s+")` handles spaces but still O(n) extra space — mention the trade-off
> - Adding space *before* the first word or *after* the last word
> - Wrong bounds: `s.substring(j + 1, i + 1)` is `[j+1, i]` inclusive — draw it out

> 🔥 **Interview Edge:**
> - If using `split("\\s+")`, explicitly say it handles multiple spaces — shows awareness
> - Follow-up: "In-place?" → reverse entire string → reverse each word individually → O(1) space

---

### 3️⃣ SLIDING WINDOW — VARIABLE SIZE

```
PATTERN TYPE:   Dynamic window with expand/contract
TIME:           O(n)
SPACE:          O(k) — where k is charset size
DIFFICULTY:     🟠 Medium / 🔴 Hard
```

**Core Idea:** Expand `right` to grow; shrink from `left` when invalid. Always use `while` (not `if`) to shrink. Update result *inside* the valid window, not after leaving it.

**Trigger keywords:** `"longest/shortest substring"` · `"no repeating characters"` · `"contains all chars of t"` · `"at most K distinct"` · `"frequency matters"`

| Problem | Platform | Difficulty | Link |
|---------|----------|------------|------|
| Longest Substring Without Repeating Characters | LC #3 | 🟠 Medium | [→](https://leetcode.com/problems/longest-substring-without-repeating-characters/) |
| Minimum Window Substring | LC #76 | 🔴 Hard | [→](https://leetcode.com/problems/minimum-window-substring/) |

**Template — Longest Substring Without Repeating Characters:**
```java
Map<Character, Integer> freq = new HashMap<>();
int left = 0, maxLen = 0;
for (int right = 0; right < s.length(); right++) {
    freq.merge(s.charAt(right), 1, Integer::sum);
    while (freq.get(s.charAt(right)) > 1) {             // window invalid → shrink
        freq.merge(s.charAt(left), -1, Integer::sum);
        left++;
    }
    maxLen = Math.max(maxLen, right - left + 1);
}
return maxLen;
```

**Template — Minimum Window Substring:**
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

    while (formed == required) {                         // valid → try to shrink
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

> ⚠️ **Landmines:**
> - `if` instead of `while` to shrink → window may still be invalid
> - `Set` instead of frequency map → can't handle repeated chars in `t`
> - Recording minimum *after* shrinking → missed the valid state
> - Window length is `right - left + 1`, NOT `right - left`

> 🔥 **Interview Edge:**
> - LC #3 is top-10 most asked — code from memory in under 3 minutes
> - Walk through the `formed == required` condition out loud — interviewers love the reasoning
> - Follow-up: "Only lowercase?" → swap `HashMap` with `int[26]` for constant-factor win
> - This pattern extends directly to: Permutation in String · Find All Anagrams · Longest Repeating Char Replacement

---

### 4️⃣ FIXED-SIZE SLIDING WINDOW + FREQUENCY MAP

```
PATTERN TYPE:   Constant-size window, slide one step at a time
TIME:           O(n)
SPACE:          O(1) — int[26] is constant
DIFFICULTY:     🟠 Medium / 🔴 Hard
```

**Core Idea:** Window size is fixed (= pattern length). Add the new right char, remove the old left char. Compare `int[26]` arrays with `Arrays.equals` — O(26) = O(1). For Concatenation, window moves by `wordLen` chunks across all `wordLen` offsets.

**Trigger keywords:** `"permutation of pattern"` · `"all anagrams"` · `"fixed window"` · `"concatenation of all words"` · `"word-chunk sliding"`

| Problem | Platform | Difficulty | Link |
|---------|----------|------------|------|
| Permutation in String | LC #567 | 🟠 Medium | [→](https://leetcode.com/problems/permutation-in-string/) |
| Find All Anagrams in a String | LC #438 | 🟠 Medium | [→](https://leetcode.com/problems/find-all-anagrams-in-a-string/) |
| Substring with Concatenation of All Words | LC #30 | 🔴 Hard | [→](https://leetcode.com/problems/substring-with-concatenation-of-all-words/) |

**Template — Permutation in String / Find All Anagrams:**
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

**Template — Substring with Concatenation of All Words:**
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
            while (window.get(word) > need.get(word)) {    // excess → shrink left
                String lw = s.substring(left, left + wordLen);
                window.merge(lw, -1, Integer::sum);
                count--; left += wordLen;
            }
            if (count == totalWords) result.add(left);
        } else {
            window.clear(); count = 0; left = right + wordLen; // invalid → reset
        }
    }
}
return result;
```

> ⚠️ **Landmines:**
> - Sorting every window → O(n × m log m) instead of O(n)
> - Forgetting to remove the left char as window slides
> - Moving 1 char at a time in Concatenation → misses valid alignments
> - Not trying all `wordLen` starting offsets
> - Using a Set for word list → breaks on duplicate words

> 🔥 **Interview Edge:**
> - State explicitly: "`Arrays.equals` on size-26 array is O(26) = O(1)"
> - LC #567 and LC #438 are literally the same problem — one returns `bool`, one returns indices
> - Concatenation key insight: *"All words are same length, so I treat each chunk as a unit and slide by `wordLen`"* — say this before coding
> - Progression: Permutation in String → Find All Anagrams → Minimum Window Substring

---

### 5️⃣ HASHMAP GROUPING — SIGNATURE KEY

```
PATTERN TYPE:   Canonical form → bucket by key
TIME:           O(n × m log m) sorted / O(n × m) freq signature
SPACE:          O(n × m)
DIFFICULTY:     🟠 Medium
```

**Core Idea:** Build a unique signature per string — sorted chars or frequency count string — use it as HashMap key. All strings with same signature are anagrams. Use `computeIfAbsent` to group.

**Trigger keywords:** `"group similar strings"` · `"same letters different order"` · `"anagram grouping"` · `"normalize and bucket"`

| Problem | Platform | Difficulty | Link |
|---------|----------|------------|------|
| Group Anagrams | LC #49 | 🟠 Medium | [→](https://leetcode.com/problems/group-anagrams/) |

**Template — Sorted Key (simpler):**
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

**Template — Frequency Signature Key (faster, O(m) per string):**
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

> ⚠️ **Landmines:**
> - Using `int[]` directly as map key → arrays use reference equality, not value equality
> - `map.put(key, new ArrayList<>())` instead of `computeIfAbsent` → overwrites existing groups
> - Frequency signature without delimiter → `"12"` is ambiguous: `[1,2]` or `[12,0]`? Always use `'#'`
> - Not knowing the faster alternative exists

> 🔥 **Interview Edge:**
> - Always offer both approaches: "Sorted key is simpler but O(m log m); frequency signature is O(m)"
> - `computeIfAbsent` is idiomatic Java for "get or create" — use it over manual null-check
> - Generalizes: wherever order doesn't matter, compute canonical form and group by it
> - Follow-up: "Strings with uppercase or digits?" → extend freq array or use `HashMap<Character, Integer>`

---

### 6️⃣ STRING MATCHING — BOUNDED LOOP

```
PATTERN TYPE:   Slide needle across haystack with safe bounds
TIME:           O(n × m) naive / O(n) KMP
SPACE:          O(1)
DIFFICULTY:     🟢 Easy — but bound is critical
```

**Core Idea:** Slide needle one index at a time. Critical rule: loop only while full pattern can still fit — `i <= n - m`, not `i < n`. At each start, compare char by char and return on full match.

**Trigger keywords:** `"find first occurrence"` · `"index of substring"` · `"pattern in string"` · `"strStr"`

| Problem | Platform | Difficulty | Link |
|---------|----------|------------|------|
| Find the Index of First Occurrence | LC #28 | 🟢 Easy | [→](https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/) |

**Template:**
```java
int n = haystack.length(), m = needle.length();
if (m == 0) return 0;                    // edge case: empty needle
for (int i = 0; i <= n - m; i++) {      // ← CRITICAL: n - m, not n
    int j = 0;
    while (j < m && haystack.charAt(i + j) == needle.charAt(j)) j++;
    if (j == m) return i;               // full match found
}
return -1;
```

> ⚠️ **Landmines:**
> - `i < n` instead of `i <= n - m` → `StringIndexOutOfBoundsException` at the edge
> - Missing case where `needle.length() > haystack.length()` (returns -1 since `n - m < 0`)
> - Forgetting empty needle edge case — confirm convention with interviewer

> 🔥 **Interview Edge:**
> - The `n - m` bound is the most common off-by-one mistake in string matching — fixing proactively signals precision
> - Always ask: "Can needle be empty?" — different platforms have different conventions
> - Follow-up O(n) solution: **KMP algorithm** — name it and describe: "failure function avoids restarting from scratch"

---

### 7️⃣ EXPAND AROUND CENTER

```
PATTERN TYPE:   Grow palindrome outward from each center
TIME:           O(n²)
SPACE:          O(1)
DIFFICULTY:     🟠 Medium
```

**Core Idea:** Every palindrome has a center. Expand outward while characters match. Handle TWO cases: odd-length (center at `i`) and even-length (center between `i` and `i+1`). O(n²) time, O(1) space — accepted in 95%+ of interviews.

**Trigger keywords:** `"longest palindrome substring"` · `"palindrome centered at index"` · `"expand from center"`

| Problem | Platform | Difficulty | Link |
|---------|----------|------------|------|
| Longest Palindromic Substring | LC #5 | 🟠 Medium | [→](https://leetcode.com/problems/longest-palindromic-substring/) |

**Template:**
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
    // left/right are one step too far after the loop
    return s.substring(left + 1, right);
}
```

> ⚠️ **Landmines:**
> - Handling only odd-length palindromes → misses all even-length ones like `"abba"`, `"cbbd"`
> - Wrong bounds after expand: use `left + 1` to `right` exclusive — not `right + 1`
> - Brute force O(n³): checking all substrings and validating each → never do this
> - Returning length instead of substring when problem asks for the actual string

> 🔥 **Interview Edge:**
> - Always handle both odd AND even cases explicitly — forgetting even = losing the problem
> - State complexity upfront: *"O(n²) time, O(1) space — optimal for most interviews. Manacher's gives O(n) if needed"*
> - Follow-up: **Count All Palindromic Substrings** (LC #647) → same logic, count instead of max
> - Follow-up O(n): **Manacher's Algorithm** — virtual center trick; naming + describing it is usually sufficient

---

### 8️⃣ SIMULATION / PARSING

```
PATTERN TYPE:   Step-by-step rule execution with state tracking
TIME:           O(n)
SPACE:          O(1)
DIFFICULTY:     🟠 Medium / 🔴 Hard
```

**Core Idea:** Parse with explicit ordered rules. For `atoi`: skip spaces → detect sign → parse digits → check overflow *before* updating. For Valid Number: one pass, boolean flags per state. Key: reset `seenDigit = false` after `e/E`.

**Trigger keywords:** `"convert string to number"` · `"validate format"` · `"handle sign/spaces/overflow"` · `"multiple rules per character"`

| Problem | Platform | Difficulty | Link |
|---------|----------|------------|------|
| String to Integer (atoi) | LC #8 | 🟠 Medium | [→](https://leetcode.com/problems/string-to-integer-atoi/) |
| Valid Number | LC #65 | 🔴 Hard | [→](https://leetcode.com/problems/valid-number/) |
| Counting Valleys | HackerRank | 🟢 Easy | [→](https://www.hackerrank.com/challenges/counting-valleys/problem) |

**Template — atoi:**
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
    if (result > (Integer.MAX_VALUE - digit) / 10)      // ← check BEFORE update
        return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
    result = result * 10 + digit;
}
return sign * result;
```

**Template — Valid Number (flag-based):**
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

**Edge cases for Valid Number:** `"."` · `"1."` · `".1"` · `"1e2"` · `"1e+2"` · `"+.8"` · `"1e"` · `"e3"`

**Template — Counting Valleys (state variable):**
```java
int level = 0, valleys = 0;
for (char c : path.toCharArray()) {
    if (c == 'U') level++;
    else          level--;
    if (level == 0 && c == 'D') valleys++;  // returned to sea level from below
}
return valleys;
```

> ⚠️ **Landmines:**
> - Overflow check *after* `result = result * 10 + digit` → too late, already overflowed
> - NOT resetting `seenDigit = false` after `e/E` → `"1e"` incorrectly returns `true`
> - Allowing sign in the middle: `"1+2"` must be rejected
> - Counting valley start instead of end (count when returning to level 0, not when going below)

> 🔥 **Interview Edge:**
> - For `atoi`: walk each step out loud — "skip spaces → detect sign → parse digits → overflow check before update"
> - Overflow formula: `result > (MAX - digit) / 10` — derive live by rearranging `result * 10 + digit > MAX`
> - Valid Number is Hard due to edge cases, not the algorithm — list all edge cases first
> - State machine pattern: track up/down transitions → stock profit, bracket matching, path simulations

---

### 9️⃣ STACK

```
PATTERN TYPE:   LIFO matching / adjacent deduplication
TIME:           O(n)
SPACE:          O(n)
DIFFICULTY:     🟢–🔴 Easy to Hard
```

**Core Idea:** Push openers, pop and verify on closers; stack must be empty at end. For adjacent deduplication: if top matches current char, pop instead of push — chain reactions are handled automatically.

**Trigger keywords:** `"matching pairs"` · `"balanced brackets"` · `"remove adjacent duplicates"` · `"reduce until stable"` · `"chain removal"` · `"boundary tracking"`

| Problem | Platform | Difficulty | Link |
|---------|----------|------------|------|
| Valid Parentheses | LC #20 | 🟢 Easy | [→](https://leetcode.com/problems/valid-parentheses/) |
| Super Reduced String | HackerRank | 🟢 Easy | [→](https://www.hackerrank.com/challenges/reduced-string/problem) |
| Longest Valid Parentheses | LC #32 | 🔴 Hard | [→](https://leetcode.com/problems/longest-valid-parentheses/) |

**Template — Valid Parentheses:**
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

**Template — Super Reduced String (adjacent duplicate removal):**
```java
StringBuilder stack = new StringBuilder();
for (char c : s.toCharArray()) {
    if (stack.length() > 0 && stack.charAt(stack.length() - 1) == c)
        stack.deleteCharAt(stack.length() - 1);  // duplicate → pop
    else
        stack.append(c);                          // no duplicate → push
}
return stack.length() == 0 ? "Empty String" : stack.toString();
```

**Template — Longest Valid Parentheses (index stack):**
```java
Deque<Integer> stack = new ArrayDeque<>();
stack.push(-1);                                  // base boundary index
int maxLen = 0;
for (int i = 0; i < s.length(); i++) {
    if (s.charAt(i) == '(') {
        stack.push(i);                           // push index of '('
    } else {
        stack.pop();
        if (stack.isEmpty()) stack.push(i);      // new invalid boundary
        else maxLen = Math.max(maxLen, i - stack.peek());
    }
}
return maxLen;
```

> ⚠️ **Landmines:**
> - Not checking `isEmpty()` before `pop()` → `NoSuchElementException`
> - Returning `true` without verifying `stack.isEmpty()` at end → unmatched openers pass
> - Super Reduced: nested loops O(n²) → single-pass stack handles chains in O(n)
> - Longest Valid: using stack of chars instead of indices → can't compute length
> - Forgetting initial `-1` in Longest Valid → first valid run has no anchor

> 🔥 **Interview Edge:**
> - Valid Parentheses in under 2 minutes — the `stack.isEmpty()` at the end is what candidates forget under pressure
> - Super Reduced: *"Removing `'aa'` exposes new adjacents — the stack top always holds the last unmatched char, so chains resolve naturally"*
> - Longest Valid Parentheses key insight: *"Store indices, not characters — we need length, not matching"*
> - `-1` base trick in Longest Valid = chef's kiss 🤌
> - Follow-ups: Remove Minimum Invalid Parentheses · Expression Evaluation · Remove All Adjacent Duplicates II (k occurrences)

---

### 🔟 DYNAMIC PROGRAMMING ON STRINGS

```
PATTERN TYPE:   2D DP state over two string indices
TIME:           O(m × n)
SPACE:          O(m × n) or O(n) optimized
DIFFICULTY:     🔴 Hard
```

**Core Idea:** When a string problem has choices at each character (match, skip, repeat), define `dp(i, j)` = "does `s[i:]` match `p[j:]`?". For `*`: two branches — skip pair entirely (`dp(i, j+2)`) OR use it to match current char and advance only `i` (`dp(i+1, j)`). Memoize.

**Trigger keywords:** `"pattern matching with rules"` · `"* or . wildcards"` · `"choices at each char"` · `"full string match required"`

| Problem | Platform | Difficulty | Link |
|---------|----------|------------|------|
| Regular Expression Matching | LC #10 | 🔴 Hard | [→](https://leetcode.com/problems/regular-expression-matching/) |

**Template — Top-Down DP with Memoization:**
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
        result = dp(s, p, i, j + 2)                          // zero: skip pair
              || (firstMatch && dp(s, p, i + 1, j));         // one+: advance s only
    } else {
        result = firstMatch && dp(s, p, i + 1, j + 1);       // normal: advance both
    }
    memo.put(key, result);
    return result;
}
```

**Trace this to build intuition:** `s = "aab"`, `p = "c*a*b"` → `*` zero-occurrence branch skips `"c*"` and `"a*"`

> ⚠️ **Landmines:**
> - Missing `*` zero-occurrence branch (`dp(i, j+2)`) → pattern can never skip `x*` pair
> - No memoization → exponential O(2^(m+n)) instead of O(m×n)
> - Confusing full match vs substring match
> - Not checking `firstMatch` before the "use `*`" branch → `*` can only repeat a match

> 🔥 **Interview Edge:**
> - Define state out loud first: *"`dp(i, j)` = does `s[i:]` match `p[j:]`?"* — this alone shows strong problem framing
> - Two `*` branches explicitly: *"Zero occurrences: skip the pair. One or more: advance `s`, stay on `p`"*
> - Bottom-up DP: build 2D table from the ends of both strings backwards
> - Solving this cleanly puts you in **top 5–10% of candidates** — most skip it or brute-force it

---

### 1️⃣1️⃣ STRING MANIPULATION + CHARACTER ARITHMETIC

```
PATTERN TYPE:   Format conversion / character-level math
TIME:           O(n)
SPACE:          O(n) for output
DIFFICULTY:     🟢 Easy (but edge-case heavy)
```

**Core Idea:** Convert characters to 0–25 positions, apply arithmetic/rules, convert back. For format conversion, handle special edge cases explicitly before the general rule.

| Problem | Platform | Pattern | Link |
|---------|----------|---------|------|
| Time Conversion | HackerRank | String Parsing + Conditional | [→](https://www.hackerrank.com/challenges/time-conversion/problem) |
| Caesar Cipher | HackerRank | Character Arithmetic + Modulo | [→](https://www.hackerrank.com/challenges/caesar-cipher-1/problem) |

**Template — Time Conversion:**
```java
// Extract parts
int hour = Integer.parseInt(s.substring(0, 2));
String rest = s.substring(2, 8);   // ":MM:SS"
String period = s.substring(8);    // "AM" or "PM"

// Apply rules (handle 12 AM/PM edge cases first)
if (period.equals("AM") && hour == 12) hour = 0;
else if (period.equals("PM") && hour != 12) hour += 12;

return String.format("%02d%s", hour, rest);  // %02d ensures leading zero
```

**Template — Caesar Cipher:**
```java
k = k % 26;   // reduce large shifts
StringBuilder result = new StringBuilder();
for (char c : s.toCharArray()) {
    if (Character.isLowerCase(c))
        result.append((char) ('a' + (c - 'a' + k) % 26));
    else if (Character.isUpperCase(c))
        result.append((char) ('A' + (c - 'A' + k) % 26));
    else
        result.append(c);   // special chars unchanged
}
return result.toString();
```

> ⚠️ **Landmines:**
> - Caesar: forgetting `k % 26` → wrong output for `k >= 26`
> - Caesar: not handling uppercase separately → wrong wrapping
> - Caesar: modifying special characters → violates constraint
> - Time: forgetting `%02d` format → `"01:00:00"` becomes `"1:00:00"`
> - Time: `12 AM → 00` and `12 PM → 12` are the ONLY special cases — get these right

> 🔥 **Interview Edge:**
> - Caesar Cipher teaches cyclical rotation: *"Convert to 0–25, shift, mod, convert back"* — this exact idea appears in circular arrays and rotational indexing
> - Time Conversion teaches: *"Even simple logic fails on formatting details"* — signal attention to edge cases

---

### 1️⃣2️⃣ GREEDY CONSTRUCTION

```
PATTERN TYPE:   Consume largest valid chunk greedily
TIME:           O(n)
SPACE:          O(n) for output
DIFFICULTY:     🟢 Easy / 🟠 Medium
```

**Core Idea:** When the representation has valid fixed blocks, always take the largest valid one first. For Roman numerals: build lookup table in descending order, consume while value fits.

| Problem | Platform | Difficulty | Link |
|---------|----------|------------|------|
| Roman to Integer | LC #13 | 🟢 Easy | [→](https://leetcode.com/problems/roman-to-integer/) |
| Integer to Roman | LC #12 | 🟠 Medium | [→](https://leetcode.com/problems/integer-to-roman/) |

**Template — Roman to Integer:**
```java
Map<Character, Integer> map = Map.of(
    'I',1, 'V',5, 'X',10, 'L',50, 'C',100, 'D',500, 'M',1000
);
int result = 0, prev = 0;
for (int i = s.length() - 1; i >= 0; i--) {
    int curr = map.get(s.charAt(i));
    result += (curr < prev) ? -curr : curr;  // subtract if smaller precedes larger
    prev = curr;
}
return result;
```

**Template — Integer to Roman:**
```java
int[] values  = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
String[] syms = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
StringBuilder result = new StringBuilder();
for (int i = 0; i < values.length; i++) {
    while (num >= values[i]) {              // consume as many times as value fits
        result.append(syms[i]);
        num -= values[i];
    }
}
return result.toString();
```

> ⚠️ **Landmines:**
> - Roman to Int: only adding → misses subtractive cases like IV, IX, CM
> - Roman to Int: previous was already added — recovery is `-2 * prev + curr`... or just traverse right-to-left
> - Integer to Roman: forgetting subtractive forms (IV=4, IX=9, XL=40, XC=90, CD=400, CM=900)
> - Wrong order in values array → greedy fails

> 🔥 **Interview Edge:**
> - Roman to Int right-to-left traversal eliminates the awkward lookahead entirely
> - Integer to Roman is classic greedy: *"If representation has valid blocks, consume the largest first"* → applies to coin change style problems too

---

### 🌐 BONUS: MODULO-BASED PATTERN MATCHING

```
PATTERN TYPE:   Cyclic string validation without string construction
TIME:           O(n)
SPACE:          O(1)
```

**Core Idea:** Don't build the full expected string. Use `i % pattern_length` to get the expected character at each position.

**Template — Mars Exploration / Cyclic Comparison:**
```java
String pattern = "SOS";
int count = 0;
for (int i = 0; i < s.length(); i++) {
    if (s.charAt(i) != pattern.charAt(i % pattern.length())) count++;
}
return count;
```

> 🔥 **Key insight:** `pattern[i % k]` generalizes to any cyclic string problem, rotation check, and pattern repetition validation.

---

## 🏢 Company Pattern Intelligence

```
┌─────────────┬──────────────────────────────────┬────────────────────────────────────────────┐
│ Company     │ Primary Patterns                 │ High-Frequency Problems                    │
├─────────────┼──────────────────────────────────┼────────────────────────────────────────────┤
│ 🛒 Amazon   │ Sliding Window, HashMap, Stack   │ Longest Substring, Group Anagrams, Valid ∂ │
│ 🔍 Google   │ DP, String Matching, Sliding Win │ Regex Matching, Min Window, Longest Palindrome │
│ 🪟 Microsoft │ Two Pointers, Stack, Parsing     │ Valid Palindrome, Valid Parentheses, atoi  │
│ 📘 Meta     │ Two Pointers, Sliding Win, Anagram│ Reverse Vowels, Find All Anagrams, Perm   │
│ 🎨 Adobe    │ Parsing, Stack, Simulation       │ Valid Number, Super Reduced, atoi          │
└─────────────┴──────────────────────────────────┴────────────────────────────────────────────┘
```

---

## 🔁 Revision Battle Plan

| Mode | When | Execution |
|------|------|-----------|
| 📖 **Learn** | First encounter | Read approach + template → solve all problems in that group |
| 🔁 **Revise** | Night before interview | Pattern triggers + key templates ONLY — skip explanations |
| ⚡ **Crunch** | Day of interview | Cheat sheet only — pattern in ≤30s → template → code |

**Daily target:** 2–3 problems · one pattern at a time · never mix patterns in same session

**Weekly review:** Re-attempt hard problems without notes · Timed: 20 min/problem

---

## 📊 Difficulty Distribution

```
Distribution (30+ problems target):

Easy    ████████░░░░░░░░░░░░  ~30%  Build speed and baseline fluency
Medium  ████████████░░░░░░░░  ~50%  Core placement interview range
Hard    ████░░░░░░░░░░░░░░░░  ~20%  Differentiation — top-tier companies
```

---

## 🧠 The 10-Pattern Quick-Fire Reference

```
1.  TWO POINTERS         →  Reverse / Palindrome check / Swap specific chars
2.  TRAVERSE FROM END    →  Last word / Reverse words / No split()
3.  SLIDING WINDOW       →  Longest/shortest substring / Frequency control
4.  FIXED WINDOW         →  Permutation / All anagrams / Concatenation
5.  HASHMAP GROUPING     →  Group anagrams / Canonical key / Bucket by signature
6.  STRING MATCHING      →  First occurrence / i <= n-m bound / Strstr
7.  EXPAND AROUND CENTER →  Longest palindrome / Odd + Even cases
8.  SIMULATION           →  atoi / Valid number / Counting valleys / State flags
9.  STACK                →  Balanced brackets / Adjacent dedupe / Index boundaries
10. DP ON STRINGS        →  Wildcard matching / 2D dp(i,j) / Choices at each char
```

---

> 🔥 **String problems are pattern problems in disguise.**
>
> 💪 **The moment you see the trigger, you already know the template.**
>
> ⚡ **Spot. Template. Code. Win.**

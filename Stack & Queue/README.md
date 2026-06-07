LeetCode 20 — Valid Parentheses
🧠 Pattern Tip

👉 When you see:

Matching pairs
Nested structures
Open and close symbols
"Valid parentheses/brackets/tags"

💡 Trigger:

Stack (LIFO)

⚙️ Approach (README-ready)
Create an empty stack.
Traverse the string character by character.
If current character is an opening bracket:
Push it into the stack.
If current character is a closing bracket:
If stack is empty → return false.
Pop the top element.
Check whether it matches the current closing bracket.
After traversal:
Stack must be empty for a valid string.
🎯 Key Insight

👉 The most recently opened bracket must be closed first.

({[]})

Order of opening:

(
{
[

Order of closing:

]
}
)

This is:

Last Opened
First Closed

which means:

STACK
⚠️ Common Mistakes

❌ Forgetting to check:

stack.isEmpty()

before popping

❌ Returning true immediately after finding a match

Example:

(() 

Still has unmatched brackets.

❌ Using only counters

Counters work for:

()

but fail for:

([)]

Need Stack.

❌ Forgetting final check

return stack.isEmpty();

Without this:

(((

would incorrectly pass.

🚀 Interview Tip

👉 Whenever you hear:

Matching
Nested
Balanced
Recent Open Element

Immediately think:

STACK

👉 Modern Java prefers:

Deque<Character> stack = new ArrayDeque<>();

instead of:

Stack<Character>

because:

Faster
Cleaner
Recommended by Java docs
🧩 Problem Solving Pattern

Ask yourself:

Do I need the most recent unmatched element?

If YES:

Use Stack

Examples:

Valid Parentheses
Browser History
Undo Feature
Expression Evaluation
Next Greater Element
Daily Temperatures

🧠 FINAL VERDICT

😎 Iron Man: Excellent stack implementation. Already optimal at O(n) time and O(n) space. Only minor modernization is replacing Stack with ArrayDeque.

⚡ Thor: Strong handling of edge cases:

Empty stack check ✅
Mismatch detection ✅
Final stack validation ✅

🕷️ Spidey: The hidden clue was "most recently opened bracket." Once you spot that, Stack becomes the obvious choice.

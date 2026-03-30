import java.util.*;

/**
 * Problem: Substring with Concatenation of All Words - LeetCode 30
 * 
 * Given a string s and an array of words, return all starting indices
 * of substring(s) in s that is a concatenation of each word exactly once
 * and without any intervening characters.
 * 
 * Approach:
 * - All words have same length, so process string in aligned chunks
 * - Use sliding window for each possible offset [0 to wordLen-1]
 * - Maintain frequency map of current window and compare with target frequency
 * 
 * Pattern: Sliding Window (Fixed Chunk Size + HashMap)
 * Time Complexity: O(n)
 * Space Complexity: O(k)
 */

class SubstringWithConcatenation {

    public List<Integer> findSubstring(String s, String[] words) {

        List<Integer> result = new ArrayList<>();

        if (s == null || s.length() == 0 || words == null || words.length == 0) {
            return result;
        }

        int wordLen = words[0].length();
        int wordCount = words.length;

        Map<String, Integer> targetFreq = new HashMap<>();
        for (String word : words) {
            targetFreq.put(word, targetFreq.getOrDefault(word, 0) + 1);
        }

        // Try all possible starting offsets
        for (int offset = 0; offset < wordLen; offset++) {

            int left = offset;
            int count = 0;
            Map<String, Integer> windowFreq = new HashMap<>();

            for (int right = offset; right + wordLen <= s.length(); right += wordLen) {

                String word = s.substring(right, right + wordLen);

                if (targetFreq.containsKey(word)) {

                    windowFreq.put(word, windowFreq.getOrDefault(word, 0) + 1);
                    count++;

                    // Shrink window if word appears too many times
                    while (windowFreq.get(word) > targetFreq.get(word)) {
                        String leftWord = s.substring(left, left + wordLen);
                        windowFreq.put(leftWord, windowFreq.get(leftWord) - 1);
                        left += wordLen;
                        count--;
                    }

                    // Valid window found
                    if (count == wordCount) {
                        result.add(left);

                        String leftWord = s.substring(left, left + wordLen);
                        windowFreq.put(leftWord, windowFreq.get(leftWord) - 1);
                        left += wordLen;
                        count--;
                    }

                } else {
                    // Reset window if invalid word found
                    windowFreq.clear();
                    count = 0;
                    left = right + wordLen;
                }
            }
        }

        return result;
    }
}

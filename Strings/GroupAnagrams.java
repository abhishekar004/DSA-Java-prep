import java.util.*;

/**
 * Problem: Group Anagrams - LeetCode 49
 * 
 * Group strings that are anagrams of each other.
 * 
 * Approach:
 * - Use HashMap where key = frequency signature of each word
 * - Two words are anagrams if they have the same character counts
 * 
 * Example:
 * "eat" -> #1#0#0#0#1...#1...
 * "tea" -> same signature
 * 
 * Pattern: Hashing / Frequency Signature
 * Time Complexity: O(n * k)
 * Space Complexity: O(n * k)
 */

class GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {

            int[] count = new int[26];

            for (char ch : str.toCharArray()) {
                count[ch - 'a']++;
            }

            StringBuilder keyBuilder = new StringBuilder();

            for (int num : count) {
                keyBuilder.append("#").append(num);
            }

            String key = keyBuilder.toString();

            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(str);
        }

        return new ArrayList<>(map.values());
    }
}

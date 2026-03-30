/**
 * Problem: Reverse Vowels of a String - LeetCode 345
 * 
 * Given a string, reverse only the vowels.
 * 
 * Approach:
 * - Use two pointers (i, j)
 * - Move pointers until vowels are found
 * - Swap vowels and continue
 * 
 * Pattern: Two Pointers (Selective Swap)
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

class ReverseVowels {

    public String reverseVowels(String s) {

        int i = 0;
        int j = s.length() - 1;

        char[] arr = s.toCharArray();

        while (i < j) {

            while (i < j && !isVowel(arr[i])) i++;
            while (i < j && !isVowel(arr[j])) j--;

            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }

        return new String(arr);
    }

    private boolean isVowel(char ch) {
        return "aeiouAEIOU".indexOf(ch) != -1;
    }
}

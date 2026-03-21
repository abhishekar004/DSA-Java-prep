/*
GeeksforGeeks - Palindromic Array

Difficulty: Easy
Topic: Arrays, Number Manipulation

Problem:
Check if all elements in the array are palindrome numbers.

Approach:
1. Traverse array
2. For each number, check if it is palindrome
3. If any number is not palindrome → return false

Time Complexity: O(n * digits)
Space Complexity: O(1)
*/

class PalindromicArray {

    public static boolean isPalinArray(int[] arr) {

        for (int num : arr) {
            if (!isPalindrome(num)) {
                return false;
            }
        }

        return true;
    }

    private static boolean isPalindrome(int num) {

        int original = num;
        int reverse = 0;

        while (num > 0) {
            reverse = reverse * 10 + num % 10;
            num = num / 10;
        }

        return reverse == original;
    }
}

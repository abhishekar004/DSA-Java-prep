/**
 * Problem: Integer to Roman - LeetCode 12
 * 
 * Convert an integer to its Roman numeral representation.
 * 
 * Approach:
 * - Use greedy strategy
 * - Always subtract the largest Roman value possible
 * - Append corresponding Roman symbol
 * 
 * Pattern: Greedy / String Construction
 * Time Complexity: O(1)
 * Space Complexity: O(1) (excluding output)
 */

class IntegerToRoman {

    public String intToRoman(int num) {

        int[] values = {
            1000, 900, 500, 400,
            100, 90, 50, 40,
            10, 9, 5, 4, 1
        };

        String[] romans = {
            "M", "CM", "D", "CD",
            "C", "XC", "L", "XL",
            "X", "IX", "V", "IV", "I"
        };

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < values.length; i++) {
            while (num >= values[i]) {
                result.append(romans[i]);
                num -= values[i];
            }
        }

        return result.toString();
    }
}

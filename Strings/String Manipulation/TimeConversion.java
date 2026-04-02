/**
 * Problem: Time Conversion - HackerRank
 * 
 * Convert 12-hour AM/PM time format to 24-hour military time.
 * 
 * Approach:
 * - Extract hour and AM/PM part
 * - Handle:
 *   - 12 AM -> 00
 *   - 12 PM -> 12
 *   - PM (except 12) -> add 12
 * - Keep remaining minutes and seconds unchanged
 * 
 * Pattern: String Manipulation / Conditional Logic
 * Time Complexity: O(1)
 * Space Complexity: O(1)
 */

class TimeConversion {

    public static String timeConversion(String s) {

        String period = s.substring(8);   // AM or PM
        int hour = Integer.parseInt(s.substring(0, 2));
        String rest = s.substring(2, 8);  // :mm:ss

        if (period.equals("AM")) {
            if (hour == 12) {
                return "00" + rest;
            } else {
                return String.format("%02d", hour) + rest;
            }
        } else {
            if (hour != 12) {
                hour += 12;
            }
            return String.format("%02d", hour) + rest;
        }
    }
}

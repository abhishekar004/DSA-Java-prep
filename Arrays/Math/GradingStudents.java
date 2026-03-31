import java.util.*;

/**
 * Problem: Grading Students - HackerRank
 * 
 * If a student's grade is less than 38, no rounding occurs.
 * Otherwise, round up to the next multiple of 5
 * if the difference is less than 3.
 * 
 * Pattern: Math / Conditional Logic
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

class GradingStudents {

    public static List<Integer> gradingStudents(List<Integer> grades) {

        List<Integer> result = new ArrayList<>();

        for (int grade : grades) {

            if (grade < 38) {
                result.add(grade);
                continue;
            }

            int nextMultiple = ((grade / 5) + 1) * 5;

            if (nextMultiple - grade < 3) {
                result.add(nextMultiple);
            } else {
                result.add(grade);
            }
        }

        return result;
    }
}

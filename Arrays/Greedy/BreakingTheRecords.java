/*
HackerRank - Breaking the Records

Difficulty: Easy
Topic: Arrays, Greedy (Min/Max Tracking)

Problem:
Count how many times Maria breaks her highest and lowest score records.

Approach:
1. Initialize min & max with first score
2. Traverse array
3. Update counters when record breaks

Time Complexity: O(n)
Space Complexity: O(1)
*/

import java.util.*;

class BreakingRecords {

    public static List<Integer> breakingRecords(List<Integer> scores) {

        int minScore = scores.get(0);
        int maxScore = scores.get(0);

        int minBreak = 0;
        int maxBreak = 0;

        for (int i = 1; i < scores.size(); i++) {

            int score = scores.get(i);

            if (score > maxScore) {
                maxScore = score;
                maxBreak++;
            }

            if (score < minScore) {
                minScore = score;
                minBreak++;
            }
        }

        return Arrays.asList(maxBreak, minBreak);
    }
}

/*
HackerRank - Sock Merchant

Difficulty: Easy
Topic: HashMap, Frequency Counting

Problem:
Count the number of matching pairs of socks.

Approach:
1. Count frequency of each color
2. Every time frequency becomes even → one pair is formed

Time Complexity: O(n)
Space Complexity: O(n)
*/

import java.util.*;

class SockMerchant {

    public static int sockMerchant(int n, List<Integer> ar) {

        HashMap<Integer, Integer> map = new HashMap<>();
        int pairs = 0;

        for (int num : ar) {

            map.put(num, map.getOrDefault(num, 0) + 1);

            if (map.get(num) % 2 == 0) {
                pairs++;
            }
        }

        return pairs;
    }
}

/*
LeetCode 121 - Best Time to Buy and Sell Stock

Problem:
You are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing:
- one day to buy one stock
- a different day in the future to sell that stock.

Return the maximum profit you can achieve.
If no profit is possible, return 0.

Example:
Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation:
Buy at price = 1
Sell at price = 6
Profit = 6 - 1 = 5

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public int maxProfit(int[] prices) {

        int minPrice = prices[0];   // lowest price seen so far
        int maxProfit = 0;          // maximum profit

        for (int price : prices) {

            // update minimum price
            minPrice = Math.min(minPrice, price);

            // calculate profit if sold today
            int profit = price - minPrice;

            // update maximum profit
            maxProfit = Math.max(maxProfit, profit);
        }

        return maxProfit;
    }
}

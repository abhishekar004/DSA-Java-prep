/**
 * Problem: Bill Division - HackerRank
 * 
 * Anna did not eat item at index k.
 * Brian charged her amount b.
 * 
 * Print:
 * - "Bon Appetit" if charged correctly
 * - Otherwise print the extra amount charged
 * 
 * Pattern: Array + Basic Math
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class BillDivision {

    public static void bonAppetit(List<Integer> bill, int k, int b) {

        int total = 0;

        for (int price : bill) {
            total += price;
        }

        int fairShare = (total - bill.get(k)) / 2;

        if (fairShare == b) {
            System.out.println("Bon Appetit");
        } else {
            System.out.println(b - fairShare);
        }
    }
}

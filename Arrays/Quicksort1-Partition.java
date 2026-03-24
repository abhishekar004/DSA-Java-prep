/**
 * Problem: QuickSort 1 - Partition (HackerRank)
 * 
 * Given an array, partition it around a pivot (first element):
 * - Elements < pivot → left
 * - Elements >= pivot → right
 * 
 * Return combined list: left + pivot + right
 * 
 * Note: This is NOT full QuickSort, only one partition step.
 * 
 * Pattern: Partitioning / Divide Step of QuickSort
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

class QuickSortPartition {

    public static List<Integer> quickSort(List<Integer> arr) {

        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();

        int pivot = arr.get(0);

        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i) < pivot) {
                left.add(arr.get(i));
            } else {
                right.add(arr.get(i));
            }
        }

        List<Integer> result = new ArrayList<>();

        result.addAll(left);
        result.add(pivot);
        result.addAll(right);

        return result;
    }
}

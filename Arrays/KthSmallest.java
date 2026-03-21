/*
GeeksforGeeks - Kth Smallest Element

Difficulty: Medium
Topic: Heap (Priority Queue)

Problem:
Find the kth smallest element in an array.

Approach 1 (Sorting):
Sort the array and return arr[k-1]

Time Complexity: O(n log n)
Space Complexity: O(1)

Approach 2 (Optimal - Max Heap):
1. Maintain a max heap of size k
2. Add elements to heap
3. If size exceeds k → remove max
4. Top of heap = kth smallest element

Time Complexity: O(n log k)
Space Complexity: O(k)
*/

import java.util.*;

class KthSmallest {

    public int kthSmallest(int[] arr, int k) {

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        for (int num : arr) {

            maxHeap.add(num);

            if (maxHeap.size() > k) {
                maxHeap.poll();
            }
        }

        return maxHeap.peek();
    }
}

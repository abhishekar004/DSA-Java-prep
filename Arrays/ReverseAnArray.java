/*
GFG - Reverse an Array

Topic: Arrays, Two Pointers
Difficulty: Easy

Problem:
Reverse the given array in-place.

Approach:
Use two pointers:
- left → start of array
- right → end of array

Swap elements until they meet.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class ReverseArray {

    public void reverseArray(int[] arr) {

        int left = 0;
        int right = arr.length - 1;

        while(left < right){

            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }
}

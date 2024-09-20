/*
 Given an integer array nums and an integer k, return the kth largest element in the array.

Note that it is the kth largest element in the sorted order, not the kth distinct element.

Can you solve it without sorting?
 */

 class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        
        //Added first k elements to the heap
        for (int i = 0; i < k; i++) {
            heap.add(nums[i]);
        }
        
        //Process the rest of the array
        for (int i = k; i < nums.length; i++) {
            if (heap.peek() < nums[i]) {
                heap.poll();  // Remove the smallest element
                heap.add(nums[i]);  // Add the current element
            }
        }
        
        return heap.peek();  // The kth largest element
    }
}
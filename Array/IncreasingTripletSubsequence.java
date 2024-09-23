/*
 Given an integer array nums, return true if there exists a triple of indices (i, j, k) such that i < j < k and nums[i] < nums[j] < nums[k]. 
 If no such indices exists, return false.
 */

 class Solution {
    public boolean increasingTriplet(int[] nums) {
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] <= first)
                first = nums[i];
            else if(nums[i] <= second)
                second = nums[i];
            else
                return true;
        }
        
        return false;
    }
}
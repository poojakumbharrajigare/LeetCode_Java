/*
Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).

Return the running sum of nums.
 */

 class Solution {
    public int[] runningSum(int[] nums) {
        int[] result = new int[nums.length];
        int sum = nums[0];
        result[0] = sum;

        for (int index = 1; index < nums.length; index++) 
        {
            sum += nums[index];
            result[index] = sum;
        }

        return result;
    }
}
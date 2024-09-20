/*
You are given an integer array nums. The unique elements of an array are the elements that appear exactly once in the array.

Return the sum of all the unique elements of nums.
 */

class Solution {
    public int sumOfUnique(int[] nums) {
        int[] map = new int[101]; 
        int sum = 0;

        for (int num : nums) 
        {
            map[num]++;

            if (map[num] == 1) 
            {
                sum += num;
            } 
            else if (map[num] == 2) 
            {
                sum -= num;
            }
        }

        return sum;
    }
}
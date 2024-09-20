/*
 Given an integer array nums, return the third distinct maximum number in this array. 
 If the third maximum does not exist, return the maximum number.
 */

 class Solution {
    public int thirdMax(int[] nums) {
        Integer firstMax = null, secondMax = null, thirdMax = null;

        for (int item : nums) 
        {
            if ((firstMax != null && firstMax == item) || 
                (secondMax != null && secondMax == item) || 
                (thirdMax != null && thirdMax == item)) 
            {
                continue;
            }

            if (firstMax == null || item > firstMax) 
            {
                thirdMax = secondMax;
                secondMax = firstMax;
                firstMax = item;
            } 
            else if (secondMax == null || item > secondMax) 
            {
                thirdMax = secondMax;
                secondMax = item;
            } else if (thirdMax == null || item > thirdMax) 
            {
                thirdMax = item;
            }
        }

        return thirdMax != null ? thirdMax : firstMax;
    }
}
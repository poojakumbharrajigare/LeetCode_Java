/*
 You are given an integer array nums. You are initially positioned at the array's first index, 
 and each element in the array represents your maximum jump length at that position.

Return true if you can reach the last index, or false otherwise.
 */

class Solution {
    public boolean canJump(int[] nums) {
        int currentIndex = 0;
        int nextIndex = 0;

        for (int i = 0; i < nums.length; i++) {
            nextIndex = Math.max(nextIndex, i + nums[i]);

            if (i == currentIndex) {
                currentIndex = nextIndex;
                if (currentIndex >= nums.length - 1)
                    return true;
            }
        }

        return false;
    }
}
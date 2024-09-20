/*
 Given an integer array nums and an integer k, 
 return true if there are two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.
 */

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> mapping = new HashMap<>();

        for (int i = 0; i < nums.length; i++) 
        {
            if (mapping.containsKey(nums[i])) 
            {
                if (Math.abs(mapping.get(nums[i]) - i) <= k) 
                {
                    return true;
                }
                mapping.put(nums[i], i);
            } 
            else 
            {
                mapping.put(nums[i], i);
            }
        }

        return false;
    }
}
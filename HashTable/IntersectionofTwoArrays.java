/*
Given two integer arrays nums1 and nums2, return an array of their intersection
Each element in the result must be unique and you may return the result in any order.
 */

 class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> result = new HashSet<>();

        for (int item : nums1) 
        {
            set1.add(item);
        }

        for (int item : nums2) 
        {
            if (set1.contains(item)) 
            {
                result.add(item);
            }
        }

        int[] resultArray = new int[result.size()];
        int i = 0;
        for (int num : result) 
        {
            resultArray[i++] = num;
        }

        return resultArray;
    }
}
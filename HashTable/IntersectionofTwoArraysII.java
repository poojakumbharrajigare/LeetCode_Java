/*
 Given two integer arrays nums1 and nums2, return an array of their intersection. 
 Each element in the result must appear as many times as it shows in both arrays and you may return the result in any order.
 */

 class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        for (int item : nums1) 
        {
            map.put(item, map.getOrDefault(item, 0) + 1);
        }

        for (int item : nums2) 
        {
            if (map.containsKey(item)) 
            {
                result.add(item);
                map.put(item, map.get(item) - 1);
                if (map.get(item) == 0) 
                {
                    map.remove(item);
                }
            }
        }

        int[] resultArray = new int[result.size()];
        for (int i = 0; i < result.size(); i++) 
        {
            resultArray[i] = result.get(i);
        }

        return resultArray;
    }
}
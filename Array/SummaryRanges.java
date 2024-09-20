/*
You are given a sorted unique integer array nums.

A range [a,b] is the set of all integers from a to b (inclusive).

Return the smallest sorted list of ranges that cover all the numbers in the array exactly. That is, each element of nums is covered by exactly one of the ranges, and there is no integer x such that x is in one of the ranges but not in nums.

Each range [a,b] in the list should be output as:

"a->b" if a != b
"a" if a == b
 */

 class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        int startIndex = 0;

        for (int i = 0; i < nums.length; i++) 
        {
            if (i != nums.length - 1 && nums[i + 1] == nums[i] + 1) 
            {
                continue;
            }

            String range;
            if (startIndex == i) 
            {
                range = Integer.toString(nums[startIndex]);
            } 
            else 
            {
                range = nums[startIndex] + "->" + nums[i];
            }

            result.add(range);
            startIndex = i + 1;
        }

        return result;
    }
}
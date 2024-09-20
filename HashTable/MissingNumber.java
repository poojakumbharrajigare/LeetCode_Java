/*
 Given an array nums containing n distinct numbers in the range [0, n], 
 return the only number in the range that is missing from the array.
 */

 class Solution {
    public int missingNumber(int[] nums) {
        /*
        Complexity
        Time complexity: O(n)
        Space complexity: O(1)
        */

        int n = nums.length;
        // Calculate the expected sum of consecutive integers from 0 to n
        int expectedSum = n * (n + 1) / 2;

        int actualSum = 0;
        for (int num : nums) 
        {
            actualSum += num;
        }

        return expectedSum - actualSum;

        /*
        Alternative solution using HashSet
        Time complexity: O(n)
        Space complexity: O(n)

        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) 
        {
            set.add(num);
        }

        for (int number = 0; number <= nums.length; number++) 
        {
            if (!set.contains(number))
            {
                return number;
            }
        }

        return 0;
        */
    }
}
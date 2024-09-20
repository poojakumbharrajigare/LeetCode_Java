/*
Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".
 */

 class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) 
        {
            return "";
        }

        if (strs.length == 1) 
        {
            return strs[0];
        }

        int min = strs[0].length();
        for (int i = 1; i < strs.length; i++) 
        {
            if (min > strs[i].length()) 
            {
                min = strs[i].length();
            }
        }

        int prefixIndex = 0;
        StringBuilder result = new StringBuilder();

        while (prefixIndex < min) 
        {
            for (int i = 1; i < strs.length; i++) 
            {
                if (strs[0].charAt(prefixIndex) != strs[i].charAt(prefixIndex)) 
                {
                    return result.toString();
                }
            }

            result.append(strs[0].charAt(prefixIndex));
            prefixIndex++;
        }

        return result.toString();
    }
}
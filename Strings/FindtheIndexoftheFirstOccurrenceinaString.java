/*
 Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
 */

 class Solution {
    public int strStr(String haystack, String needle) {
        if (haystack.equals(needle)) 
        {
            return 0;
        }

        for (int i = 0; i <= haystack.length() - needle.length(); i++) 
        {
            int j = 0;
            for (; j < needle.length(); j++) 
            {
                if (needle.charAt(j) != haystack.charAt(i + j)) 
                {
                    break;
                }
            }

            if (j == needle.length()) 
            {
                return i; 
            }
        }

        return -1;  
    }
}
/*
Given two strings s and t, return true if s is a subsequence of t, or false otherwise.

A subsequence of a string is a new string that is formed from the original string 
by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. 
(i.e., "ace" is a subsequence of "abcde" while "aec" is not).

*/

class Solution {
    public boolean isSubsequence(String s, String t) {
        if (s.equals("")) 
        {
            return true;
        }

        if (t.length() == s.length()) 
        {
            return s.equals(t);
        }

        boolean isSubsequence = false;
        int index = 0;

        for (int i = 0; i < t.length(); i++) 
        {
            if (t.charAt(i) == s.charAt(index)) 
            {
                index++;
            }

            if (index == s.length()) 
            {
                isSubsequence = true;
                break;
            }
        }

        return isSubsequence;
    }
}
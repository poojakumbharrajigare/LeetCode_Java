/*
 Given a string s, return the longest palindromic substring in s.
 */

 class Solution {
    public String longestPalindrome(String s) {
        int maxLength = 0;
        String maxLengthStr = "";

        if (s.length() == 1) 
        {
            return s;
        }

        for (int i = 0; i < s.length(); i++) 
        {
            // Odd length palindrome
            int L = i, R = i;
            while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) 
            {
                if (R - L + 1 > maxLength) 
                {
                    maxLength = R - L + 1;
                    maxLengthStr = s.substring(L, R + 1); 
                }

                L--;
                R++;
            }

            // Even length palindrome
            L = i; 
            R = i + 1;
            while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) 
            {
                if (R - L + 1 > maxLength) 
                {
                    maxLength = R - L + 1;
                    maxLengthStr = s.substring(L, R + 1);
                }
                
                L--;
                R++;
            }
        }

        return maxLengthStr;
    }
}
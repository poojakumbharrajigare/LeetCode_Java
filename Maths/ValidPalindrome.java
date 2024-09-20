/*
A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise.
 */

class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder alphaNumericString = new StringBuilder();

        for (char c : s.toCharArray()) 
        {
            if (Character.isLetterOrDigit(c)) 
            {
                alphaNumericString.append(Character.toLowerCase(c));
            }
        }

        for (int i = 0; i < alphaNumericString.length() / 2; i++)
        {
            if (alphaNumericString.charAt(i) != alphaNumericString.charAt(alphaNumericString.length() - i - 1)) 
            {
                return false;
            }
        }

        return true;
    }
}
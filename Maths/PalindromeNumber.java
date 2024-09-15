/*
Given an integer x, return true if x is a palindrome, and false otherwise.
*/

class Solution {
    public boolean isPalindrome(int x) {
        String number = Integer.toString(x);
        boolean result = true;

        for (int index = 0; index < number.length() / 2; index++) 
        {
            if (number.charAt(index) == number.charAt(number.length() - 1 - index)) 
            {
                continue;
            } 
            else 
            {
                result = false;
                break; 
            }
        }

        return result;
    }
}
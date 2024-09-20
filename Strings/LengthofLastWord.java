/*
Given a string s consisting of words and spaces, return the length of the last word in the string.

A word is a maximal substring consisting of non-space characters only.
 */

class Solution {
    public int lengthOfLastWord(String s) {
        int length = 0;
        s = s.trim(); 
        int index = s.length() - 1;

        while (index >= 0 && s.charAt(index) != ' ') 
        {
            length++;
            index--;
        }

        return length;
    }
}
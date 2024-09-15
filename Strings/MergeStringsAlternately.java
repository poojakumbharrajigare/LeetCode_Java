/*
You are given two strings word1 and word2. 
Merge the strings by adding letters in alternating order, starting with word1. 
If a string is longer than the other, append the additional letters onto the end of the merged string.

Return the merged string.
*/

class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder result = new StringBuilder();
        int word1Index = 0;
        int word2Index = 0;

        while (word1Index < word1.length() || word2Index < word2.length()) 
        {
            String first = word1Index < word1.length() ? String.valueOf(word1.charAt(word1Index++)) : "";
            String second = word2Index < word2.length() ? String.valueOf(word2.charAt(word2Index++)) : "";
            result.append(first);
            result.append(second);
        }

        return result.toString();
    }
}
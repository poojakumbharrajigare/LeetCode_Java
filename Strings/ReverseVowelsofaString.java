/*
Given a string s, reverse only all the vowels in the string and return it.

The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.
*/

class Solution {
    public String reverseVowels(String s) {
        String vowels = "aeiouAEIOU";
        int left = 0;
        int right = s.length() - 1;
        char[] sArray = s.toCharArray();

        while (left < right) 
        {
            if (!vowels.contains(String.valueOf(sArray[left]))) 
            {
                left++;
                continue;
            }

            if (!vowels.contains(String.valueOf(sArray[right]))) 
            {
                right--;
                continue;
            }
            
            char temp = sArray[left];
            sArray[left] = sArray[right];
            sArray[right] = temp;
            
            left++;
            right--;
        }

        return new String(sArray);
    }
}
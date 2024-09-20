/*
Given two strings ransomNote and magazine, 
return true if ransomNote can be constructed by using the letters from magazine and false otherwise.

Each letter in magazine can only be used once in ransomNote.
 */

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length()) 
        {
            return false;
        }

        HashMap<Character, Integer> magazineCharCount = new HashMap<>();

        for (char c : magazine.toCharArray()) 
        {
            magazineCharCount.put(c, magazineCharCount.getOrDefault(c, 0) + 1);
        }

        for (char c : ransomNote.toCharArray()) 
        {
            if (magazineCharCount.containsKey(c) && magazineCharCount.get(c) > 0) 
            {
                magazineCharCount.put(c, magazineCharCount.get(c) - 1);
            } 
            else 
            {
                return false;
            }
        }

        return true;
    }
}
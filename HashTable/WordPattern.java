/*
Given a pattern and a string s, find if s follows the same pattern.

Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in s. 
Specifically:

Each letter in pattern maps to exactly one unique word in s.
Each unique word in s maps to exactly one letter in pattern.
No two letters map to the same word, and no two words map to the same letter.
*/

import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] wordArray = s.split(" ");
        Map<Character, String> map = new HashMap<>();

        if (wordArray.length != pattern.length()) {
            return false;
        }

        for (int i = 0; i < pattern.length(); i++) {
            char currentChar = pattern.charAt(i);

            if (map.containsKey(currentChar)) {
                if (!wordArray[i].equals(map.get(currentChar))) {
                    return false;
                }
            } else {
                if (map.containsValue(wordArray[i])) {
                    return false;
                }

                map.put(currentChar, wordArray[i]);
            }
        }

        return true;
    }
}

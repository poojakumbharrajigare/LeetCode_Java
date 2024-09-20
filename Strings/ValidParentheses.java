/*
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.
 */

 class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');

        if (s == null || s.length() % 2 != 0) 
        {
            return false;
        }

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) 
        {
            char c = s.charAt(i);
            
            if (map.containsKey(c)) 
            {
                char top = stack.isEmpty() ? ' ' : stack.pop();
                
                if (top != map.get(c)) 
                {
                    return false;
                }
            } 
            else 
            {
                stack.push(c);
            }
        }

        return stack.isEmpty();
    }
}
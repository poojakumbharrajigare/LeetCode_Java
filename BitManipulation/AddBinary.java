/*
Given two binary strings a and b, return their sum as a binary string.
*/

class Solution {
    public String addBinary(String a, String b) {
     StringBuilder result = new StringBuilder();
        int carry = 0;
        int aIndex = a.length() - 1;
        int bIndex = b.length() - 1;

        while (aIndex >= 0 || bIndex >= 0 || carry > 0) 
        {
            int number1 = aIndex >= 0 ? a.charAt(aIndex--) - '0' : 0;
            int number2 = bIndex >= 0 ? b.charAt(bIndex--) - '0' : 0;

            int sum = number1 + number2 + carry;
            result.insert(0, sum % 2);  // Insert the remainder at the start
            carry = sum / 2;  // Update carry for next iteration
        }

        return result.toString();
    }
}
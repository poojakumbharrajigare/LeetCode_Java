/*
Given two non-negative integers, num1 and num2 represented as string, return the sum of num1 and num2 as a string.

You must solve the problem without using any built-in library for handling large integers (such as BigInteger). 
You must also not convert the inputs to integers directly.
*/

class Solution {
    public String addStrings(String num1, String num2) {
        int num1Index = num1.length() - 1;
        int num2Index = num2.length() - 1;
        int carry = 0;
        StringBuilder sb = new StringBuilder();

        while (num1Index >= 0 || num2Index >= 0 || carry != 0) 
        {
            int a = num1Index >= 0 ? num1.charAt(num1Index) - '0' : 0;
            int b = num2Index >= 0 ? num2.charAt(num2Index) - '0' : 0;
            num1Index--;
            num2Index--;

            int sum = a + b + carry;
            sb.insert(0, sum % 10);
            carry = sum / 10;
        }

        return sb.toString();
    }
}
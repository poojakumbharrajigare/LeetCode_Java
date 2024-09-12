/*
For two strings s and t, we say "t divides s" if and only if s = t + t + t + ... + t + t 
(i.e., t is concatenated with itself one or more times).

Given two strings str1 and str2, return the largest string x such that x divides both str1 and str2.
*/

class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if (!str1.concat(str2).equals(str2.concat(str1))) {
            return "";
        }

        int gcdLen = gcd(str1.length(), str2.length());
        
        return str1.substring(0, gcdLen);
    }

    private int gcd(int n1, int n2) {
        while (n1 != 0 && n2 != 0) {
            if (n1 > n2) {
                n1 %= n2;
            } else {
                n2 %= n1;
            }
        }

        return n1 != 0 ? n1 : n2;
    }
}
/*
Write an algorithm to determine if a number n is happy.

A happy number is a number defined by the following process:

Starting with any positive integer, replace the number by the sum of the squares of its digits.
Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
Those numbers for which this process ends in 1 are happy.
Return true if n is a happy number, and false if not.
*/

import java.util.HashSet;

public class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        int newNumber = 0;

        while (n != 1) 
        {
            newNumber = 0;

            while (n > 0) 
            {
                int digit = n % 10;
                n = n / 10;
                newNumber += digit * digit;
            }

            if (set.contains(newNumber)) 
            {
                return false;
            }

            set.add(newNumber);
            n = newNumber;
        }

        return true;
    }
}
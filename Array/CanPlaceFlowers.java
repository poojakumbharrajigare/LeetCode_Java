/*
You have a long flowerbed in which some of the plots are planted, and some are not. 
However, flowers cannot be planted in adjacent plots.

Given an integer array flowerbed containing 0's and 1's, where 0 means empty and 1 means not empty, and an integer n, 
return true if n new flowers can be planted in the flowerbed without violating the no-adjacent-flowers rule and false otherwise.
*/

class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int previous = 0;
        int next = 0;

        for (int i = 0; i < flowerbed.length; i++) {
            if (i != flowerbed.length - 1) {
                next = flowerbed[i + 1];
            } else {
                next = 0; // Ensure next is 0 for the last element
            }

            if (flowerbed[i] == 0 && previous == 0 && next == 0) {
                n--;
                flowerbed[i] = 1;
            }

            previous = flowerbed[i];
        }

        return n <= 0;
    }
}
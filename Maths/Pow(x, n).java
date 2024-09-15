/*
Implement pow(x, n), which calculates x raised to the power n (i.e., xn).
*/

class Solution {
    public double myPow(double x, int n) {
        if (n == 0)
            return 1;

        if (n == Integer.MIN_VALUE) 
        {
            n = -(n + 1); // Make n positive, adjusting for overflow
            x = 1.0 / x;
            return x * x * myPow(x * x, n / 2);
        }

        if (n < 0) 
        {
            x = 1.0 / x;
            n = -n;
        }

        if (n % 2 == 0) 
        {
            double result = myPow(x, n / 2);
            return result * result;
        }
        else 
        {
            double result = myPow(x, (n - 1) / 2);
            return result * result * x;
        }
    }
}
package com.zd.leetcode;

/**
 * @author zhengdai
 * @date 2020年04月01日
 */
public class Solution29 {
    public int divide(int dividend, int divisor) {
        if (dividend == 0) {
            return 0;
        }
        if (divisor == 1) {
            return dividend;
        }
        if (divisor == -1) {
            if (dividend > Integer.MIN_VALUE) {
                return -dividend;
            }
            return Integer.MAX_VALUE;
        }
        long a = dividend;
        long b = divisor;
        int sign = 1;
        boolean isNegative = (a > 0 && b < 0) || (a < 0 && b > 0);
        if (isNegative) {
            sign = -1;
        }
        a = a > 0 ? a: -a;
        b = b > 0 ? b : -b;
        long res = div(a, b);
        if (sign > 0) {
            return (int) res;
        }
        return (int) -res;
    }

    private int div(long a, long b) {
        if (a < b) {
            return 0;
        }
        int count = 1;
        long tb = b;
        while ((tb + tb) <= a) {
            count = count + count;
            tb = tb + tb;
        }
        return count + div(a - tb, b);
    }
}

package com.zd.leetcode;

/**
 * @author zhengdai
 * @date 2020年03月16日
 */
public class Solution7 {
    public int reverse(int x) {
        int re = 0;
        int max1 = Integer.MAX_VALUE / 10, max2 = Integer.MAX_VALUE % 10;
        int min1 = Integer.MIN_VALUE / 10, min2 = Integer.MIN_VALUE % 10;
        while (x != 0) {
            int k = x % 10;
            x = x / 10;
            if (re > max1 || (re == max1 && k > max2)) {
                return 0;
            }
            if (re < min1 || (re == min1 / 10 && k < min2)) {
                return 0;
            }
            re = re * 10 + k;
        }
        return re;
    }
}

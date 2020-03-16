package com.zd.leetcode;

/**
 * @author zhengdai
 * @date 2020年03月16日
 */
public class Solution8 {
    public int myAtoi(String str) {
        str = str.trim();
        int len = str.length();
        if (len == 0) {
            return 0;
        }
        int max1 = Integer.MAX_VALUE / 10, max2 = Integer.MAX_VALUE % 10;
        int min1 = Integer.MIN_VALUE / 10, min2 = Integer. MIN_VALUE % 10;
        int re = 0;
        int flag = 1;
        int i = 0;
        char c = str.charAt(i);
        if (c == '+' || c == '-') {
            i = 1;
            if (c == '-') {
                flag = -1;
            }
        }
        for (; i < len; ++i) {
            int num = str.charAt(i) - '0';
            if (num > 9 || num < 0) {
                return re;
            }
            num = flag * num;
            if (re > max1 || (re == max1 && num > max2)) {
                return Integer.MAX_VALUE;
            }
            if (re < min1 || (re == min1 && num < min2)) {
                return Integer.MIN_VALUE;
            }
            re = re * 10 + num;
        }
        return re;
    }
}

package com.zd.leetcode;

/**
 * @author zhengdai
 * @date 2020年03月16日
 */
public class Solution9 {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        long re = 0;
        int i = x;
        while (i != 0) {
            int k = i % 10;
            i = i / 10;
            re = re * 10 + k;
        }
        return re == x;
    }

    public boolean isPalindrome2(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        int re = 0;
        while (x > re) {
            int k = x % 10;
            re = re * 10 + k;
            x = x / 10;
        }
        return x == re || x == re / 10;
    }

    public boolean isPalindrome3(int x) {
        if (x < 0) {
            return false;
        }
        int div = 1;
        while (x / div >= 10) {
            div *= 10;
        }
        while (x > 0) {
            int left = x / div;
            int right = x % 10;
            if (left != right) {
                return false;
            }
            x = (x % div) / 10;
            div /= 100;
        }
        return true;
    }
}

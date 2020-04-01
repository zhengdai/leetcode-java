package com.zd.leetcode;

/**
 * @author zhengdai
 * @date 2020年03月30日
 */
public class Solution28 {
    public int strStr(String haystack, String needle) {
        if ("".equals(needle)) {
            return 0;
        }
        if ("".equals(haystack)) {
            return -1;
        }
        int[] next = getNexts(needle);
        int n = haystack.length();
        int m = needle.length();
        int j = 0;
        for (int i = 0; i < n; ++i) {
            while (j > 0 && haystack.charAt(i) != needle.charAt(j)) {
                j = next[j - 1] + 1;
            }
            if (haystack.charAt(i) == needle.charAt(j)) {
                ++j;
            }
            if (j == m) {
                return i - m + 1;
            }
        }
        return -1;
    }

    private int[] getNexts(String needle) {
        int len = needle.length();
        int[] next = new int[len];
        next[0] = -1;
        int k = -1;
        for (int i = 1; i < len; ++i) {
            while (k != -1 && needle.charAt(k + 1) != needle.charAt(i)) {
                k = next[k];
            }
            if (needle.charAt(k + 1) == needle.charAt(i)) {
                ++k;
            }
            next[i] = k;
        }
        return next;
    }

    public int strStr2(String haystack, String needle) {
        int n = haystack.length();
        int m = needle.length();
        for (int start = 0; start < n - m + 1; ++start) {
            if (haystack.substring(start, start + m).equals(needle)) {
                return start;
            }
        }
        return -1;
    }

    public int strStr3(String haystack, String needle) {
        int n = haystack.length();
        int m = needle.length();
        if (m == 0) {
            return 0;
        }
        int pn = 0;
        while (pn < n - m + 1) {
            while (pn < n - m + 1 && haystack.charAt(pn) != needle.charAt(0)) {
                ++pn;
            }
            int curLen = 0;
            int pl = 0;
            while (pl < m && pn < n && haystack.charAt(pn) == needle.charAt(pl)) {
                pn++;
                pl++;
                ++curLen;
            }
            if (curLen == m) {
                return pn - m;
            }
            pn = pn - curLen + 1;
        }
        return -1;
    }

    public int strStr4(String haystack, String needle) {
        int m = needle.length();
        int n = haystack.length();
        if (m > n) {
            return -1;
        }
        int a = 26;
        long modulus = (long) Math.pow(2, 31);
        long h = 0, ref_h = 0;
        for (int i = 0; i < m; ++i) {
            h = (h * a + chatToInt(i, haystack)) % modulus;
            ref_h = (ref_h * a + chatToInt(i, needle)) % modulus;
        }
        if (h == ref_h) {
            return 0;
        }
        long am = 1;
        for (int i = 1; i <= m; ++i) {
            am = am * a % modulus;
        }
        for (int start = 1; start < n - m + 1; ++start) {
            h = (h * a - chatToInt(start - 1, haystack) * am + chatToInt(start + m - 1, haystack)) % modulus;
            if (h == ref_h) {
                return start;
            }
        }
        return -1;
    }

    private int chatToInt(int idx, String s) {
        return s.charAt(idx) - 'a';
    }
}

package com.zd.leetcode;

/**
 * @author zhengdai
 * @date 2020年03月09日
 */
public class Solution3 {
    public int lengthOfLongestSubstring(String s) {
        int len = s.length();
        if (len == 0) {
            return 0;
        }
        // dp[i]表示以第i个字符结尾的最长子串的长度
        int[] dp = new int[len];
        dp[0] = 1;
        for (int i = 1; i < len; ++i) {
            char c = s.charAt(i);
            dp[i] = 1;
            int j = i - 1;
            int maxLen = dp[i - 1];
            while (j > i - 1 - maxLen && c != s.charAt(j)) {
                dp[i]++;
                j--;
            }
        }
        int max = dp[0];
        for (int i = 1; i < len; ++i) {
            if (dp[i] > max) {
                max = dp[i];
            }
        }
        return max;
    }
}

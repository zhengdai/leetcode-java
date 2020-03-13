package com.zd.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zhengdai
 * @date 2020年03月09日
 */
public class Solution3 {
    // 原始版本
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

    // 优化版本
    public int lengthOfLongestSubstring2(String s) {
        int len = s.length();
        if (len == 0) {
            return 0;
        }
        int pre = 1;
        int current;
        int max = pre;
        for (int i = 1; i < len; ++i) {
            char c = s.charAt(i);
            current = 1;
            int j = i - 1;
            while (j > i -1 - pre && c != s.charAt(j)) {
                current++;
                j--;
            }
            if (current > max) {
                max = current;
            }
            pre = current;
        }
        return max;
    }

    // 滑动窗口版本
    public int lengthOfLongestSubstring3(String s) {
        int len = s.length();
        if (len == 0) {
            return 0;
        }
        Map<Character, Integer> map = new HashMap<>();
        int max = 0;
        int left = 0;
        for (int i = 0; i < len; ++i) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                left = Math.max(left, map.get(c) + 1);
            }
            map.put(c, i);
            max = Math.max(max, i - left + 1);
        }
        return max;
    }
}

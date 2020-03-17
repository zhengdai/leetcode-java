package com.zd.leetcode;

/**
 * @author zhengdai
 * @date 2020年03月16日
 */
public class Solution10 {
    public boolean isMatch(String s, String p) {
        int rows = s.length() + 1;
        int cols = p.length() + 1;
        boolean[][] dp = new boolean[rows][cols];
        dp[0][0] = true;
        for (int j = 1; j < cols; ++j) {
            if (p.charAt(j - 1) == '*' && dp[0][j - 2]) {
                dp[0][j] = true;
            }
        }
        for (int i = 1; i < rows; ++i) {
            for (int j = 1; j < cols; ++j) {
                char sc = s.charAt(i - 1);
                char pc = p.charAt(j - 1);
                if (sc == pc) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    if (pc == '.') {
                        dp[i][j] = dp[i - 1][j - 1];
                    } else if (pc == '*') {
                        if (j >= 2) {
                            char last = p.charAt(j - 2);
                            if (last == sc || last == '.') {
                                dp[i][j] = dp[i - 1][j] || dp[i][j - 1];
                            }
                            dp[i][j] = dp[i][j] || dp[i][j - 2];
                        }
                    } else {
                        dp[i][j] = false;
                    }
                }
            }
        }
        return dp[rows - 1][cols - 1];
    }
}

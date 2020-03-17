package com.zd.leetcode;

/**
 * @author zhengdai
 * @date 2020年03月17日
 */
public class Solution14 {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        int curPos = 0;
        boolean stop = false;
        while (curPos < strs[0].length()) {
            char c = strs[0].charAt(curPos);
            for (int i = 1; i < strs.length; ++i) {
                if (curPos >= strs[i].length() || strs[i].charAt(curPos) != c) {
                    stop = true;
                    break;
                }
            }
            if (stop) {
                break;
            }
            curPos++;
        }
        return strs[0].substring(0, curPos);
    }

    public String longestCommonPrefix2(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        String ans = strs[0];
        for (int i = 1; i < strs.length; ++i) {
            int j = 0;
            for (; j < ans.length() && j < strs[i].length(); ++j) {
                if (ans.charAt(j) != strs[i].charAt(j)) {
                    break;
                }
            }
            ans = ans.substring(0, j);
            if ("".equals(ans)) {
                return ans;
            }
        }
        return ans;
    }
}

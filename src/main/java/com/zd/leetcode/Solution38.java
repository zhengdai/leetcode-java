package com.zd.leetcode;

/**
 * @author zhengdai
 * @date 2020年04月29日
 */
public class Solution38 {
    public String countAndSay(int n) {
        if (n == 1) {
            return "1";
        } else {
            StringBuilder sb = new StringBuilder();
            String s = countAndSay(n - 1);
            char pre = 0;
            int count = 0;
            for (int i = 0; i < s.length(); ++i) {
                char c = s.charAt(i);
                if (i == 0) {
                    count++;
                } else {
                    if (c == pre) {
                        count++;
                    } else {
                        sb.append(count);
                        sb.append(pre);
                        count = 1;
                    }
                }
                pre = c;
            }
            sb.append(count);
            sb.append(pre);
            return sb.toString();
        }
    }
}

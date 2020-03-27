package com.zd.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhengdai
 * @date 2020年03月26日
 */
public class Solution22 {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backtrack("", 0, 0, result, n);
        return result;
    }

    private void backtrack(String cur, int open, int close, List<String> result, int max) {
        if (cur.length() == max * 2) {
            result.add(cur);
            return;
        }
        if (open < max) {
            backtrack(cur + "(", open + 1, close, result, max);
        }
        if (close < open) {
            backtrack(cur + ")", open, close + 1, result, max);
        }
    }

    public List<String> generateParenthesis2(int n) {
        List<String> result = new ArrayList<>();
        backtrack2("", n, n, result);
        return result;
    }

    private void backtrack2(String cur, int left, int right, List<String> result) {
        if (left == 0 && right == 0) {
            result.add(cur);
            return;
        }
        if (left > 0) {
            backtrack2(cur + "(", left - 1, right, result);
        }
        if (right > left) {
            backtrack2(cur + ")", left, right - 1, result);
        }
    }

    public List<String> generateParenthesis3(int n) {
        List<String> result = new ArrayList<>();
        if (n == 0) {
            result.add("");
        } else {
            for (int c = 0; c < n; ++c) {
                for (String left: generateParenthesis2(c)) {
                    for (String right: generateParenthesis2(n - 1 - c)) {
                        result.add("(" + left + ")" + right);
                    }
                }
            }
        }
        return result;
    }
}

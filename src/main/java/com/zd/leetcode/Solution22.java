package com.zd.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

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

    public static class Node {
        Node(String cur, int left, int right) {
            this.cur = cur;
            this.left = left;
            this.right = right;
        }
        String cur;
        int left;
        int right;
    }

    public List<String> generateParenthesis4(int n) {
        List<String> result = new ArrayList<>();
        Stack<Node> stack = new Stack<>();
        stack.push(new Node("", n, n));
        while (!stack.isEmpty()) {
            Node node = stack.pop();
            if (node.left == 0 && node.right == 0) {
                result.add(node.cur);
                continue;
            }
            if (node.left > 0) {
                stack.push(new Node(node.cur + "(", node.left - 1, node.right));
            }
            if (node.right > node.left) {
                stack.push(new Node(node.cur + ")", node.left, node.right - 1));
            }
        }
        return result;
    }

    public List<String> generateParenthesis5(int n) {
        List<List<String>> dps = new ArrayList<>(n + 1);
        dps.add(Collections.singletonList(""));
        for (int i = 1; i <= n; ++i) {
            List<String> cur = new ArrayList<>();
            for (int j = 0; j < i; ++j) {
                List<String> str1 = dps.get(j);
                List<String> str2= dps.get(i - 1 - j);
                for (String s1: str1) {
                    for (String s2: str2) {
                        cur.add("(" + s1 + ")" + s2);
                    }
                }
            }
            dps.add(cur);
        }
        return dps.get(n);
    }
}

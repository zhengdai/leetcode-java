package com.zd.leetcode;

import java.util.Stack;

/**
 * @author zhengdai
 * @date 2020年04月02日
 */
public class Solution32 {
    public int longestValidParentheses(String s) {
        int n = s.length();
        int max = 0;
        int[] dp = new int[n];
        for (int i = 1; i < n; ++i) {
            if (s.charAt(i) == ')') {
                if (s.charAt(i - 1) == '(') {
                    dp[i] = (i > 2 ? dp[i - 2] : 0) + 2;
                } else if (i - dp[i - 1] > 0 && s.charAt(i - dp[i - 1] - 1) == '(') {
                    dp[i] = dp[i - 1] + (i - dp[i - 1] >= 2 ? dp[i - dp[i - 1] - 2] : 0) + 2;
                }
                if (dp[i] > max) {
                    max = dp[i];
                }
            }
        }
        return max;
    }

    /*
    1、First of All，栈底永远保存着当前有效子串的前一个字符的下标，像个守门员一样守在那里，所以一开始要将-1放入栈中。
    2、遇到左括号就入栈；
    3、遇到右括号就将栈顶元素出栈。此时，如果剩下的栈内不为空，则说明弹出的这个栈顶元素是一个左括号，讲真，因为栈底有保险。
    4、如果栈顶元素出栈后为空，则说明弹出的那个栈顶元素就是之前的“有效子串前一位的字符下标”，守门员都没了，所以此时应该使用当前的右括号的下标入栈，更新这个“有效子串前一位的字符下标”。
    */
    public int longestValidParentheses2(String s) {
        int max = 0;
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        for (int i = 0; i < s.length(); ++i) {
            if (s.charAt(i) == '(') {
                stack.push(i);
            } else {
                stack.pop();
                if (stack.empty()) {
                    stack.push(i);
                } else {
                    max = Math.max(max, i - stack.peek());
                }
            }
        }
        return max;
    }

    /*
    利用两个计数器 left 和 right。首先，从左到右遍历字符串，对于遇到的每个‘(’，增加 left 计算器，否则增加 right 计数器。每当 left 计数器与 right 计数器相等时，计算当前有效字符串的长度，并且记录最长匹配串的长度。如果 right 计数器比 left 计数器大，将 left 和 right 置零。

    然后从右往左，执行一次类似的操作。如果 left 计数器比 right 计数器大，将 left 和 right 置零。

    一个问题是：为什么一定要从两个方向分别遍历？从一个方向遍历不可以嘛？

    原因：整个括号串中，要么只多余左括号，要么只多余右括号，要么 **多余的右括号必定在多余的左括号的左侧**。

    ))[匹配长度为 2])))[匹配长度为 4]))..((([匹配长度为 8]([匹配长度为 6]((
    **当从左到右遍历时，它只能找到「多余的左括号左侧」的有效子串，而「多余的左括号右侧」的有效子串无法找到**。

    ))[匹配长度为 2])))[匹配长度为 4]))...[(((包含多余的左括号的子串]
    **当从右到左遍历时，只能找到「多余的右括号右侧」的有效子串，而「多余的右括号左侧」的有效子串无法找到**。

    [包含多余的右括号的子串))]...((([匹配长度为 8]([匹配长度为 6]((
    因此，解法四就相当于：**将整个字符串，按照“多余的右括号”和“多余的左括号”之间的分界线，分为左右两部分。然后从左到右和从右到左，分别统计这两部分中所有的有效括号串的长度。**

    ))[左半部分]))..((([右半部分]((
    总结：如果从左向右遍历，每当右括号多了的时候，栈就会为空，此时就可以统计之前的有效括号的长度。但是如果是左括号多了，那直到最后也不会栈空，此时也就无法统计中间是否存在有效括号了。因此，从左向右遍历时，一旦遇到右半部分「第一个多余的左括号」，那这个位置后面的串就都无法统计了。
     */
    public int longestValidParentheses3(String s) {
        int left = 0;
        int right = 0;
        int max = 0;
        for (int i = 0; i < s.length(); ++i) {
            if (s.charAt(i) == '(') {
                left++;
            } else {
                right++;
            }
            if (left == right) {
                max = Math.max(max, 2 * right);
            } else if (right > left) {
                left = right = 0;
            }
        }
        left = right = 0;
        for (int i = s.length() - 1; i >= 0; --i) {
            if (s.charAt(i) == '(') {
                left++;
            } else {
                right++;
            }
            if (left == right) {
                max = Math.max(max, 2 * left);
            } else if (left >= right) {
                left = right = 0;
            }
        }
        return max;
    }
}

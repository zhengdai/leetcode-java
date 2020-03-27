package com.zd.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @author zhengdai
 * @date 2020年03月26日
 */
public class Solution20 {
    private static Map<Character, Character> charMap = new HashMap<Character, Character>(){{
        put('}', '{');
        put(']', '[');
        put(')', '(');
    }};

    public boolean isValid(String s) {
        if ((s.length() & 1) == 1) {
            return false;
        }
        Stack<Character> stack = new Stack<>();
        for (char c: s.toCharArray()) {
            if (charMap.containsKey(c)) {
                if (stack.isEmpty()) {
                    return false;
                }
                char po = stack.pop();
                if (charMap.get(c) != po) {
                    return false;
                }
            } else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }
}

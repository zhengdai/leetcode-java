package com.zd.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhengdai
 * @date 2020年03月20日
 */
public class Solution17 {
    private static String[] map =  new String[]{"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    private List<String> results;

    public List<String> letterCombinations(String digits) {
        results = new ArrayList<>();
        if ("".equals(digits)) {
            return results;
        }
        find(digits, 0, new StringBuilder());
        return results;
    }

    private void find(String digits, int idx, StringBuilder sb) {
        if (idx == digits.length()) {
            results.add(sb.toString());
            return;
        }
        char c = digits.charAt(idx);
        int index = c - '2';
        String letters = map[index];
        for (int i = 0; i < letters.length(); ++i) {
            find(digits, idx + 1, sb.append(letters.charAt(i)));
            sb.deleteCharAt(sb.length()-1);
        }
    }
}

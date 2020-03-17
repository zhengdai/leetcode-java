package com.zd.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zhengdai
 * @date 2020年03月17日
 */
public class Solution13 {
    private static final Map<String, Integer> MAP = new HashMap<String, Integer>(){{
        put("M", 1000);
        put("CM", 900);
        put("D", 500);
        put("CD", 400);
        put("C", 100);
        put("XC", 90);
        put("L", 50);
        put("XL", 40);
        put("X", 10);
        put("IX", 9);
        put("V", 5);
        put("IV", 4);
        put("I", 1);
    }};

    private static final Map<Character, Integer> CHARACTER_INTEGER_MAP = new HashMap<Character, Integer>(){{
        put('M', 1000);
        put('D', 500);
        put('C', 100);
        put('L', 50);
        put('X', 10);
        put('V', 5);
        put('I', 1);
    }};

    public int romanToInt(String s) {
        int num = 0;
        int i = 0;
        String key;
        while (i < s.length()) {
            if (i + 1 < s.length() && MAP.containsKey(s.substring(i, i + 2))) {
                key = s.substring(i, i + 2);
                i += 2;
            } else {
                key = s.substring(i, i + 1);
                i++;
            }
            num += MAP.get(key);
        }
        return num;
    }

    public int romanToInt2(String s) {
        int sum = 0;
        int pre = CHARACTER_INTEGER_MAP.get(s.charAt(0));
        int cur;
        for (int i = 1; i < s.length(); ++i) {
            cur = CHARACTER_INTEGER_MAP.get(s.charAt(i));
            if (pre < cur) {
                sum -= pre;
            } else {
                sum += pre;
            }
            pre = cur;
        }
        sum += pre;
        return sum;
    }
}

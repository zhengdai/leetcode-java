package com.zd.leetcode;

/**
 * @author zhengdai
 * @date 2020年03月17日
 * 字符          数值
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 * I 可以放在 V (5) 和 X (10) 的左边，来表示 4 和 9。
 * X 可以放在 L (50) 和 C (100) 的左边，来表示 40 和 90。 
 * C 可以放在 D (500) 和 M (1000) 的左边，来表示 400 和 900。
 *
 */
public class Solution12 {
    public String intToRoman(int num) {
        int[] romans = new int[]{1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romanStrs = new String[]{"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder sb = new StringBuilder();
        int idx = 0;
        while (idx < romans.length) {
            while (num >= romans[idx]) {
                sb.append(romanStrs[idx]);
                num -= romans[idx];
            }
            idx++;
        }
        return sb.toString();
    }
}

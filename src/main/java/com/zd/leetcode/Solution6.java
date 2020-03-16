package com.zd.leetcode;

/**
 * @author zhengdai
 * @date 2020年03月13日
 */
public class Solution6 {
    /*
    2n-2为一个周期
第0行  0
第1行  1  2n - 3
第2行  2  2n - 4
第i行   i  2n - i - 2
第n - 1行  n - 1
     */

    public String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }
        StringBuilder[] rows = new StringBuilder[numRows];
        for (int i = 0; i < s.length(); ++i) {
            int row = calRow(i, numRows);
            if (rows[row] == null) {
                rows[row] = new StringBuilder();
            }
            rows[row].append(s.charAt(i));
        }
        StringBuilder sum = new StringBuilder();
        for (StringBuilder row: rows) {
            if (row != null) {
                sum.append(row);
            }
        }
        return sum.toString();
    }

    private int calRow(int i, int n) {
        int idx = i % (2 * n - 2);
        if (idx <= n - 1) {
            return idx;
        } else {
            return 2 * n - 2 - idx;
        }
    }

    public String convert2(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }
        StringBuilder[] rows = new StringBuilder[numRows];
        int step = -1;
        int curRow = 0;
        for (int i = 0; i < s.length(); ++i) {
            if (rows[curRow] == null) {
                rows[curRow] = new StringBuilder();
            }
            rows[curRow].append(s.charAt(i));
            if (i % (numRows - 1) == 0) {
                step = -step;
            }
            curRow += step;
        }
        StringBuilder sum = new StringBuilder();
        for (StringBuilder row: rows) {
            if (row != null) {
                sum.append(row);
            }
        }
        return sum.toString();
    }

    public String convert3(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }
        StringBuilder sb = new StringBuilder();
        int len = s.length();
        int cycleLen = 2 * numRows - 2;
        for (int i = 0; i < numRows; ++i) {
            for (int j = 0; j + i < len; j += cycleLen) {
                sb.append(s.charAt(j + i));
                if (i != 0 && i != numRows - 1 && j + cycleLen - i < len) {
                    sb.append(s.charAt(j + cycleLen - i));
                }
            }
        }
        return sb.toString();
    }
}

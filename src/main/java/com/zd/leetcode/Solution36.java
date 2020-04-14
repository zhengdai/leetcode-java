package com.zd.leetcode;

/**
 * @author zhengdai
 * @date 2020年04月08日
 */
public class Solution36 {
    public boolean isValidSudoku(char[][] board) {
        int nr = board.length;
        int nc = board[0].length;
        boolean[][] row = new boolean[nr][9];
        boolean[][] col = new boolean[nc][9];
        boolean[][] box = new boolean[9][9];
        for (int i = 0; i < nr; ++i) {
            for (int j = 0; j < nc; ++j) {
                int boxIndex = i / 3 * 3 + j / 3;
                if (board[i][j] != '.') {
                    int num = board[i][j] - '1';
                    if (row[i][num] || col[j][num] || box[boxIndex][num]) {
                        return false;
                    }
                    row[i][num] = true;
                    col[j][num] = true;
                    box[boxIndex][num] = true;
                }
            }
        }
        return true;
    }
}

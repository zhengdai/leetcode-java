package com.zd.leetcode;

/**
 * @author zhengdai
 * @date 2020年04月14日
 */
public class Solution37 {

    int n = 3;

    int N = n * n;

    boolean[][] rows = new boolean[N][N];
    boolean[][] columns = new boolean[N][N];
    boolean[][] boxes = new boolean[N][N];

    char[][] board;

    boolean solved = false;

    public boolean canPlace(int d, int row, int col) {
        int idx = (row / n) * n + col / n;
        return !rows[row][d] && !columns[col][d] && !boxes[idx][d];
    }

    public void placeNumber(int d, int row, int col) {
        int idx = (row / n) * n + col / n;
        rows[row][d] = true;
        columns[col][d] = true;
        boxes[idx][d] = true;
        board[row][col] = (char)(d + '1');
    }

    public void removeNumber(int d, int row, int col) {
        int idx = (row / n) * n + col / n;
        rows[row][d] = false;
        columns[col][d] = false;
        boxes[idx][d] = false;
        board[row][col] = '.';
    }

    public void init() {
        for (int i = 0; i < board.length; ++i) {
            for (int j = 0; j < board[0].length; ++j) {
                if (board[i][j] != '.') {
                    int d = board[i][j] - '1';
                    placeNumber(d, i, j);
                }
            }
        }
    }

    public void placeNextNumbers(int row, int col) {
        if (col == N - 1 && row == N - 1) {
            solved = true;
            return;
        }
        if (col == N - 1) {
            backtrack(row + 1, 0);
            return;
        }
        backtrack(row, col + 1);
    }

    public void backtrack(int row, int col) {
        if (board[row][col] == '.') {
            for (int d = 0; d < N; ++d) {
                if (canPlace(d, row, col)) {
                    placeNumber(d, row, col);
                    placeNextNumbers(row, col);
                    if (!solved) {
                        removeNumber(d, row, col);
                    }
                }
            }
        } else {
            placeNextNumbers(row, col);
        }
    }

    public void solveSudoku(char[][] board) {
        this.board = board;
        init();
        backtrack(0, 0);
    }
}

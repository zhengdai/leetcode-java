package com.zd.leetcode;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

/**
 * @author zhengdai
 * @date 2020年04月14日
 */
public class Solution37Test {
    private static Solution37 solution37;

    @BeforeAll
    static void initAll() {
        solution37 = new Solution37();
    }

    @Test
    @DisplayName("solve sudoku")
    public void testSolveSudoku() {
        char[][] board = new char[][]{
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };
        solution37.solveSudoku(board);
        System.out.println(solution37.solved);
        for (char[] row: board) {
            System.out.println(Arrays.toString(row));
        }
    }
}

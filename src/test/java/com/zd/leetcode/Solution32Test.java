package com.zd.leetcode;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author zhengdai
 * @date 2020年04月02日
 */
public class Solution32Test {
    private static Solution32 solution32;

    @BeforeAll
    static void initAll() {
        solution32 = new Solution32();
    }

    @Test
    @DisplayName("longest valid parentheses")
    public void testLongestValidParentheses() {
        assertEquals(2, solution32.longestValidParentheses("())"));
        assertEquals(4, solution32.longestValidParentheses(")()())"));
    }

    @Test
    @DisplayName("longest valid parentheses2")
    public void testLongestValidParentheses2() {
        assertEquals(2, solution32.longestValidParentheses2("())"));
        assertEquals(4, solution32.longestValidParentheses2(")()())"));
    }

    @Test
    @DisplayName("longest valid parentheses3")
    public void testLongestValidParentheses3() {
        assertEquals(2, solution32.longestValidParentheses3("())"));
        assertEquals(4, solution32.longestValidParentheses3(")()())"));
    }
}

package com.zd.leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author zhengdai
 * @date 2020年03月16日
 */
public class Solution8Test {
    private static Solution8 solution8;

    @BeforeAll
    static void initAll() {
        solution8 = new Solution8();
    }

    @Test
    @DisplayName("my atoi")
    public void testMyAtoi() {
        assertEquals(42, solution8.myAtoi("42"));
        assertEquals(-42, solution8.myAtoi("   -42"));
        assertEquals(4193, solution8.myAtoi("4193 with words"));
        assertEquals(0, solution8.myAtoi("words and 987"));
        assertEquals(-2147483648, solution8.myAtoi("-91283472332"));
    }
}

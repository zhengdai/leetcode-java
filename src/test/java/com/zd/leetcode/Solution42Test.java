package com.zd.leetcode;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author zhengdai
 * @date 2020年04月29日
 */
public class Solution42Test {
    private static Solution42 solution42;

    @BeforeAll
    static void initAll() {
        solution42 = new Solution42();
    }

    @Test
    @DisplayName("test trap")
    public void testTrap() {
        assertEquals(6, solution42.trap(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}));
    }
}

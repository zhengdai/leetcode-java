package com.zd.leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author zhengdai
 * @date 2020年03月17日
 */
public class Solution11Test {
    private static Solution11 solution11;

    @BeforeAll
    static void initAll() {
        solution11 = new Solution11();
    }

    @Test
    @DisplayName("max area")
    public void testMaxArea() {
        assertEquals(49, solution11.maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
    }

    @Test
    @DisplayName("max area2")
    public void testMaxArea2() {
        assertEquals(49, solution11.maxArea2(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
    }
}

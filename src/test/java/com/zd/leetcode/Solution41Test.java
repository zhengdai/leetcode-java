package com.zd.leetcode;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author zhengdai
 * @date 2020年04月29日
 */
public class Solution41Test {
    private static Solution41 solution41;

    @BeforeAll
    static void initAll() {
        solution41 = new Solution41();
    }

    @Test
    @DisplayName("test first missing positive")
    public void testFirstMissingPositive() {
        assertEquals(3, solution41.firstMissingPositive(new int[]{1, 2, 0}));
        assertEquals(2, solution41.firstMissingPositive(new int[]{3, 4, -1, 1}));
        assertEquals(1, solution41.firstMissingPositive(new int[]{7, 8, 9, 11, 12}));
    }
}

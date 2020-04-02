package com.zd.leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author zhengdai
 * @date 2020年04月02日
 */
public class Solution33Test {
    private static Solution33 solution33;

    @BeforeAll
    static void initAll() {
        solution33 = new Solution33();
    }

    @Test
    @DisplayName("search")
    public void testSearch() {
        assertEquals(4, solution33.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 0));
        assertEquals(-1, solution33.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 3));
    }
}

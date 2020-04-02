package com.zd.leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author zhengdai
 * @date 2020年04月02日
 */
public class Solution34Test {
    private static Solution34 solution34;

    @BeforeAll
    static void initAll() {
        solution34 = new Solution34();
    }

    @Test
    @DisplayName("search range")
    public void testSearchRange() {
        int[] nums = new int[]{5, 7, 7, 8, 8, 10};
        int[] result1 = solution34.searchRange(nums, 8);
        int[] result2 = solution34.searchRange(nums, 6);
        assertEquals(3, result1[0]);
        assertEquals(4, result1[1]);
        assertEquals(-1, result2[0]);
        assertEquals(-1, result2[1]);
    }
}

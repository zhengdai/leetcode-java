package com.zd.leetcode;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author zhengdai
 * @date 2020年03月30日
 */
public class Solution26Test {
    private static Solution26 solution26;

    @BeforeAll
    static void initAll() {
        solution26 = new Solution26();
    }

    @Test
    @DisplayName("remove duplicates")
    public void testRemoveDuplicates() {
        assertEquals(2, solution26.removeDuplicates(new int[]{1, 1, 2}));
        assertEquals(5, solution26.removeDuplicates(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4}));
    }
}

package com.zd.leetcode;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author zhengdai
 * @date 2020年04月03日
 */
public class Solution35Test {
    private static Solution35 solution35;

    @BeforeAll
    static void initAll() {
        solution35 = new Solution35();
    }

    @Test
    @DisplayName("search insert")
    public void testSearchInsert() {
        int[] arr = new int[]{1, 3, 5, 6};
        assertEquals(2, solution35.searchInsert(arr, 5));
        assertEquals(1, solution35.searchInsert(arr, 2));
        assertEquals(4, solution35.searchInsert(arr, 7));
        assertEquals(0, solution35.searchInsert(arr, 0));
    }
}

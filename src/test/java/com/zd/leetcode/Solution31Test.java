package com.zd.leetcode;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author zhengdai
 * @date 2020年04月01日
 */
public class Solution31Test {
    private static Solution31 solution31;

    @BeforeAll
    static void initAll() {
        solution31 = new Solution31();
    }

    @Test
    @DisplayName("next permutation")
    public void testNextPermutation() {
        int[] a = new int[]{1, 2, 3};
        solution31.nextPermutation(a);
        assertEquals(3, a[1]);
        assertEquals(2, a[2]);
    }
}

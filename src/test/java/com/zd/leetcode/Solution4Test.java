package com.zd.leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author zhengdai
 * @date 2020年03月11日
 */
public class Solution4Test {
    private static Solution4 solution4;

    @BeforeAll
    static void initAll() {
        solution4 = new Solution4();
    }

    @Test
    @DisplayName("find median sorted arrays")
    public void testFindMedianSortedArrays() {
        assertEquals(2.0, solution4.findMedianSortedArrays(new int[]{1, 3}, new int[]{2}));
        assertEquals(2.5, solution4.findMedianSortedArrays(new int[]{1, 2}, new int[]{3, 4}));
    }

    @Test
    @DisplayName("find median sorted arrays2")
    public void testFindMedianSortedArrays2() {
        assertEquals(2.0, solution4.findMedianSortedArrays2(new int[]{1, 3}, new int[]{2}));
        assertEquals(2.5, solution4.findMedianSortedArrays2(new int[]{1, 2}, new int[]{3, 4}));
    }

    @Test
    @DisplayName("find median sorted arrays3")
    public void testFindMedianSortedArrays3() {
        assertEquals(2.0, solution4.findMedianSortedArrays3(new int[]{1, 3}, new int[]{2}));
        assertEquals(2.5, solution4.findMedianSortedArrays3(new int[]{1, 2}, new int[]{3, 4}));
    }
}

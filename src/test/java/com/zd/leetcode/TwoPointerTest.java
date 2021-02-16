package com.zd.leetcode;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TwoPointerTest {
    private static TwoPointer twoPointer;

    @BeforeAll
    static void initAll() {
        twoPointer = new TwoPointer();
    }

    @Test
    @DisplayName("search target sum")
    public void testSearchTargetSum() {
        assertArrayEquals(new int[]{1, 3}, twoPointer.search(new int[]{1, 2, 3, 4, 6}, 6), "测试不通过");
        assertArrayEquals(new int[]{0, 2}, twoPointer.search(new int[]{2, 5, 9, 11}, 11), "测试不通过");
    }

    @Test
    @DisplayName("remove duplicate")
    public void testRemoveDuplicate() {
        assertEquals(4, twoPointer.remove(new int[]{2, 3, 3, 3, 6, 9, 9}));
        assertEquals(2, twoPointer.remove(new int[]{2, 2, 2, 11}));
    }

    @Test
    @DisplayName("make squares")
    public void testMakeSquares() {
        assertArrayEquals(new int[]{0, 1, 4, 4, 9}, twoPointer.makeSquares(new int[]{-2, -1, 0, 2, 3}), "测试不通过");
        assertArrayEquals(new int[]{0, 1, 1, 4, 9}, twoPointer.makeSquares(new int[]{-3, -1, 0, 1, 2}), "测试不通过");
    }
}

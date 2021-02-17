package com.zd.leetcode;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.hasItems;

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

    @Test
    @DisplayName("search triplets")
    public void testSearchTriplets() {
        System.out.println(twoPointer.searchTriplets(new int[]{-3, 0, 1, 2, -1, 1, -2}));
        System.out.println(twoPointer.searchTriplets(new int[]{-5, 2, -1, -2, 3}));
    }

    @Test
    @DisplayName("search triplet")
    public void testSearchTriplet() {
        assertEquals(1, twoPointer.searchTriplet(new int[]{-2, 0, 1, 2}, 2));
        assertEquals(0, twoPointer.searchTriplet(new int[]{-3, -1, 1, 2}, 1));
        assertEquals(3, twoPointer.searchTriplet(new int[]{1, 0, 1, 1}, 100));
    }

    @Test
    @DisplayName("search triplets")
    public void testSearchMinTriplets() {
        assertEquals(2, twoPointer.searchTriplets(new int[]{-1, 0, 2, 3}, 3));
        assertEquals(4, twoPointer.searchTriplets(new int[]{-1, 4, 2, 1, 3}, 5));
    }
}

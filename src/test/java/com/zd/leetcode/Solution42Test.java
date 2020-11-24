package com.zd.leetcode;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author zhengdai
 * @date 2020年04月29日
 */
public class Solution42Test {
    private static Solution42 solution42;

    @BeforeAll
    static void initAll() {
        solution42 = new Solution42();
    }

    @Test
    @DisplayName("test trap")
    public void testTrap() {
        assertEquals(6, solution42.trap(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}));
    }

    @Test
    @DisplayName("test trap1")
    public void testTrap1() {
        assertEquals(6, solution42.trap1(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}));
    }

    @Test
    @DisplayName("test trap2")
    public void testTrap2() {
        assertEquals(6, solution42.trap2(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}));
    }

    @Test
    @DisplayName("test trap3")
    public void testTrap3() {
        assertEquals(6, solution42.trap3(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}));
    }

    @Test
    @DisplayName("test trapWithRow")
    public void testTrapWithRow() {
        assertEquals(6, solution42.trapWithRow(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}));
    }

}

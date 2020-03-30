package com.zd.leetcode;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author zhengdai
 * @date 2020年03月30日
 */
public class Solution27Test {
    private static Solution27 solution27;

    @BeforeAll
    static void initAll() {
        solution27 = new Solution27();
    }

    @Test
    @DisplayName("remove element")
    public void testRemoveElement() {
        assertEquals(2, solution27.removeElement(new int[]{3, 2, 2, 3}, 3));
        assertEquals(5, solution27.removeElement(new int[]{0, 1, 2, 2, 3, 0, 4, 2}, 2));
    }
}

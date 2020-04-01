package com.zd.leetcode;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author zhengdai
 * @date 2020年04月01日
 */
public class Solution29Test {
    private static Solution29 solution29;

    @BeforeAll
    static void initAll() {
        solution29 = new Solution29();
    }

    @Test
    @DisplayName("divide")
    public void testStrStr() {
        assertEquals(3, solution29.divide(10, 3));
        assertEquals(-2, solution29.divide(7, -3));
        assertEquals(Integer.MAX_VALUE, solution29.divide(Integer.MIN_VALUE , -1));
        assertEquals(Integer.MIN_VALUE, solution29.divide(Integer.MIN_VALUE , 1));
        assertEquals(Integer.MIN_VALUE / 2, solution29.divide(Integer.MIN_VALUE , 2));
    }
}

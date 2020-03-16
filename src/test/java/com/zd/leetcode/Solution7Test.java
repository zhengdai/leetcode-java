package com.zd.leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author zhengdai
 * @date 2020年03月16日
 */
public class Solution7Test {
    private static Solution7 solution7;

    @BeforeAll
    static void initAll() {
        solution7 = new Solution7();
    }

    @Test
    @DisplayName("convert")
    public void testConvert() {
        assertEquals(321, solution7.reverse(123));
        assertEquals(-321, solution7.reverse(-123));
        assertEquals(21, solution7.reverse(120));
    }
}

package com.zd.leetcode;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author zhengdai
 * @date 2020年04月29日
 */
public class Solution38Test {
    private static Solution38 solution38;

    @BeforeAll
    static void initAll() {
        solution38 = new Solution38();
    }

    @Test
    @DisplayName("test count and say")
    public void testCountAndSay() {
        assertEquals("11", solution38.countAndSay(2));
        assertEquals("21", solution38.countAndSay(3));
        assertEquals("1211", solution38.countAndSay(4));
        assertEquals("111221", solution38.countAndSay(5));
    }
}

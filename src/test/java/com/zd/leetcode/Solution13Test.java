package com.zd.leetcode;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author zhengdai
 * @date 2020年03月17日
 */
public class Solution13Test {
    private static Solution13 solution13;

    @BeforeAll
    static void initAll() {
        solution13 = new Solution13();
    }

    @Test
    @DisplayName("roman to int")
    public void testRomanToInt() {
        assertEquals(3, solution13.romanToInt("III"));
        assertEquals(4, solution13.romanToInt("IV"));
        assertEquals(9, solution13.romanToInt("IX"));
        assertEquals(58, solution13.romanToInt("LVIII"));
        assertEquals(1994, solution13.romanToInt("MCMXCIV"));
    }

    @Test
    @DisplayName("roman to int2")
    public void testRomanToInt2() {
        assertEquals(3, solution13.romanToInt2("III"));
        assertEquals(4, solution13.romanToInt2("IV"));
        assertEquals(9, solution13.romanToInt2("IX"));
        assertEquals(58, solution13.romanToInt2("LVIII"));
        assertEquals(1994, solution13.romanToInt2("MCMXCIV"));
    }
}

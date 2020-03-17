package com.zd.leetcode;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
/**
 * @author zhengdai
 * @date 2020年03月17日
 */
public class Solution12Test {
    private static Solution12 solution12;

    @BeforeAll
    static void initAll() {
        solution12 = new Solution12();
    }

    @Test
    @DisplayName("int to roman")
    public void testIntToRomana() {
        assertEquals("III", solution12.intToRoman(3));
        assertEquals("IV", solution12.intToRoman(4));
        assertEquals("IX", solution12.intToRoman(9));
        assertEquals("LVIII", solution12.intToRoman(58));
        assertEquals("MCMXCIV", solution12.intToRoman(1994));
    }
}
